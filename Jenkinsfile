pipeline {
    agent any  // Ejecutar en cualquier agente disponible

    environment {
        SONARQUBE_NAME = 'SonarQubeCICD'  // Nombre del servidor SonarQube en Jenkins
    }

    stages {
        // 1️⃣ Descargar código desde GitHub
        stage('Checkout') {
            steps {
                git 'https://github.com/gmendoza-alvarado/flow-CICD.git'
            }
        }

        // 2️⃣ Compilar el proyecto con Maven
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        // 3️⃣ Análisis de calidad de código con SonarQube
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv(SONARQUBE_NAME) {  // Usa la configuración de SonarQube en Jenkins
                    sh 'mvn sonar:sonar'
                }
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline ejecutado correctamente'
        }
        failure {
            echo '❌ Hubo un error en el pipeline'
        }
    }
}