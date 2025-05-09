# 📍 QR Code Generator API

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1-green)
![AWS S3](https://img.shields.io/badge/AWS_S3-✔-orange)
![Docker](https://img.shields.io/badge/Docker-✔-lightblue)

Uma API robusta para geração e armazenamento de QR Codes na AWS S3, desenvolvida com Java Spring Boot e Docker.

## ✨ Funcionalidades Principais

- ✅ Geração dinâmica de QR Codes a partir de URLs/texto
- ✅ Armazenamento automático na AWS S3
- ✅ Retorno de link público para o QR Code gerado
- ✅ Pronta para deploy com Docker
- ✅ Arquitetura limpa e desacoplada

## 🚀 Como Usar

### Pré-requisitos
- Java 21
- Docker
- Conta AWS (opcional para produção)

### Executando Localmente
```bash
# Clone o projeto
git clone https://github.com/seu-usuario/qrcode-generator.git

# Execute com Docker
docker build -t qrcode-generator .
docker run -p 8080:8080 qrcode-generator
```

### Endpoint
```http
POST /qrcode
Content-Type: application/json

{
  "text": "https://exemplo.com"
}
```

Resposta:
```json
{
  "url": "https://seu-bucket.s3.regiao.amazonaws.com/qrcode.png"
}
```

## 🏗️ Estrutura do Projeto
```
src/
├── main/
│   ├── java/
│   │   └── com/vitorgonzaga/qrcode/
│   │       ├── controller/       # Endpoints API
│   │       ├── service/          # Lógica de negócio
│   │       ├── infrastructure/   # Adaptadores AWS
│   │       └── Application.java  # Inicialização
└── resources/                    # Configurações
```

## 🌐 Integração com AWS
Configure suas variáveis de ambiente:
```env
AWS_ACCESS_KEY_ID=SUA_CHAVE
AWS_SECRET_ACCESS_KEY=SUA_CHAVE_SECRETA
AWS_S3_BUCKET=seu-bucket
AWS_REGION=us-east-1
```
