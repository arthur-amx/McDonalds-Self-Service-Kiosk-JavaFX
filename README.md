# **McDonald's Self-Service Kiosk - `JavaFX`**

### **[ACESSE O CÓDIGO FONTE ->](https://github.com/arthur-amx/McDonalds-Self-Service-Kiosk-JavaFX)**

![Tela Inicial](./screens/TelaInicial.png)

---

## **1. Descrição do Projeto (System Overview)**

Este projeto é uma simulação imersiva de um **totem de autoatendimento**, inspirado na interface da multinacional McDonald's. Originalmente concebido em 2017 e refatorado para tecnologias modernas, o sistema opera como uma aplicação Desktop robusta.

O objetivo é demonstrar a arquitetura de uma aplicação comercial completa, integrando uma UI rica (JavaFX) com lógica de controle de acesso, fluxo de pedidos e integrações externas (E-mail, Facebook API e Pagamentos), oferecendo uma experiência fluida tanto para o cliente quanto para o administrador.

### **Galeria do Sistema**
<div style="display: flex; gap: 10px;">
  <img src="./screens/MenuUser.png" alt="Menu Cliente" width="30%">
  <img src="./screens/MenuAdmin.png" alt="Painel Admin" width="30%">
  <img src="./screens/Senha.png" alt="Pagamento" width="30%">
</div>

## **2. Pilha de Tecnologias (Core Stack)**

A arquitetura do sistema foi modernizada utilizando as seguintes tecnologias:

#### **Core & Interface**
![Java](https://img.shields.io/badge/Java_23-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![JavaFX](https://img.shields.io/badge/JavaFX_21-007396?style=for-the-badge&logo=java&logoColor=white)
![FXML](https://img.shields.io/badge/FXML-UI_Design-4285F4?style=for-the-badge&logo=html5&logoColor=white)

#### **Build & Dependências**
![Maven](https://img.shields.io/badge/Apache_Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)

#### **Integrações & Bibliotecas**
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![JavaMail](https://img.shields.io/badge/JavaMail-EA4335?style=for-the-badge&logo=gmail&logoColor=white)
![RestFB](https://img.shields.io/badge/RestFB_(Facebook)-1877F2?style=for-the-badge&logo=facebook&logoColor=white)
![PagSeguro](https://img.shields.io/badge/PagSeguro_API-B2D046?style=for-the-badge&logo=pagseguro&logoColor=black)

---

## **3. Estrutura de Diretórios (System Architecture)**

```text
McDonaldTablet/
├── src/
│   ├── main/
│   │   ├── java/app/            # Lógica de Negócio (Controllers, Models)
│   │   │   ├── Launcher.java    # Bootloader (Resolve dependências JavaFX)
│   │   │   └── Main.java        # Entry Point da Aplicação
│   │   └── resources/           # Assets Visuais
│   │       ├── viewFXML/        # Telas (Interface XML)
│   │       ├── imgs/            # Ícones e Imagens
│   │       └── styles/          # Estilização CSS
├── Telas/                       # Screenshots da Documentação
├── pom.xml                      # Gerenciador de Dependências Maven
└── README.md
```

## **4. Execução Local (Local Deployment)**

Para clonar e rodar este projeto em seu ambiente local, siga os passos abaixo.

**Pré-requisitos:**
*   Java JDK 21+
*   Maven
*   IntelliJ IDEA

**Passo 1: Clone o repositório**
```bash
git clone https://github.com/arthur-amx/McDonalds-Self-Service-Kiosk-JavaFX.git
cd McDonalds-Self-Service-Kiosk-JavaFX
```

**Passo 2: Instale as dependências**
O projeto utiliza Maven para gerenciar bibliotecas. Na raiz do projeto, execute:
```bash
mvn clean install
```

**Passo 3: Execute a Aplicação**
Para evitar conflitos de módulos do JavaFX, execute sempre através da classe lançadora:

**Via Terminal:**
```bash
mvn javafx:run
```

**Via IntelliJ:**
1. Navegue até `src/main/java/app/Launcher.java`.
2. Clique no ícone de **Play** verde ao lado da linha `public class Launcher`.
