package com.vitorgonzaga.qrcode.generator.ports;

public interface StoragePort {
    String uploadFile(byte[] fileData, String FileName, String contentType);

}