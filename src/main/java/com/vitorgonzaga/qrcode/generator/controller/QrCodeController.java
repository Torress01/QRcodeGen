package com.vitorgonzaga.qrcode.generator.controller;

import com.vitorgonzaga.qrcode.generator.dto.QrCodeGenerateRequest;
import com.vitorgonzaga.qrcode.generator.dto.QrcodeGenerateResponse;
import com.vitorgonzaga.qrcode.generator.service.QrCodeGeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QrCodeController {

    private final QrCodeGeneratorService qrCodeGeneratorService;

    public QrCodeController(QrCodeGeneratorService qrCodeGeneratorService) {
        this.qrCodeGeneratorService = qrCodeGeneratorService;
    }


    @PostMapping
    public ResponseEntity<QrcodeGenerateResponse> generate(@RequestBody QrCodeGenerateRequest request) {
        try {
            QrcodeGenerateResponse response = this.qrCodeGeneratorService.generateAndUploadQrCode(request.text());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.internalServerError().build();
        }

    }

}
