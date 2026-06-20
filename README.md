🚀 Vulnerable Java Demo (Jenkins + SonarQube)

This project is a simple intentionally vulnerable Java application created for demonstrating:

CI/CD using Jenkins
Static code analysis using SonarQube
DevSecOps pipeline concepts
📂 Project Structure
vulnerable-java-demo/
├── src/main/java/com/demo/App.java
├── pom.xml
├── sonar-project.properties
└── README.md
⚠️ Vulnerabilities Included

This project intentionally contains:

🔴 SQL Injection
🔴 Hardcoded Credentials
🟠 Insecure Coding Practices

👉 Purpose: To demonstrate how tools like SonarQube detect issues.

🛠️ Prerequisites

Make sure you have:

Java 11 or 17
Maven
Jenkins installed
SonarQube running
⚙️ How to Run Locally
git clone https://github.com/YOUR-USERNAME/vulnerable-java-demo.git
cd vulnerable-java-demo
mvn clean install
🔍 SonarQube Scan (Manual)
mvn sonar:sonar \
-Dsonar.host.url=http://localhost:9000 \
-Dsonar.login=YOUR_TOKEN
🤖 Jenkins Pipeline

Example pipeline:

pipeline {
    agent any

    tools {
        maven 'Maven-3.8'
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/YOUR-USERNAME/vulnerable-java-demo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('SonarQube Scan') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh 'mvn sonar:sonar'
                }
            }
        }
    }
}
📊 Expected Output

After running the pipeline:

SonarQube will detect:
Vulnerabilities
Code Smells
Security Hotspots
🎯 Learning Objectives

By using this project, you will learn:

CI/CD pipeline creation
Integration of Jenkins with SonarQube
Static code analysis
DevSecOps basics
⚠️ Disclaimer

This project is intentionally vulnerable and should be used only for educational purposes.

💡 Author

Created by Sairam for teaching Application Security & DevSecOps 🚀
