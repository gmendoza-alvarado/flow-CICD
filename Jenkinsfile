
pipeline {
    agent any  // Define el agente donde se ejecutará el pipeline, en este caso cualquier nodo disponible.

    environment {
        DOCKER_IMAGE = 'mi-repo-docker/mi-app'
        SONARQUBE_URL = 'http://localhost:9000'  // URL de SonarQube (ajusta si está en un servidor distinto)
    }

    stages {
        // Etapa 1: Checkout (obtener el código del repositorio)
        stage('Checkout') {
            steps {
                git 'https://github.com/gmendoza-alvarado/flow-CICD.git'  // Clona el repositorio
            }
        }


        // Etapa 2: Build (compilación)
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'  // Construye el proyecto con Maven, omitiendo las pruebas
            }
        }

        // Etapa 3: SonarQube Analysis (análisis de calidad de código)
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQubeCICD') {  // Usa la configuración de SonarQube preconfigurada en Jenkins
                    sh 'mvn sonar:sonar'  // Ejecuta el análisis de SonarQube con Maven
                }
            }
        }

        // Etapa 4: Docker Build & Push (construcción y subida de la imagen Docker)
        stage('Docker Build & Push') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE .'  // Construye la imagen Docker
                sh 'docker push $DOCKER_IMAGE'  // Sube la imagen Docker al registro
            }
        }

        // Etapa 5: Deploy to Kubernetes (despliegue a Kubernetes)
        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f k8s/deployment.yaml'  // Despliega la aplicación usando Kubernetes
            }
        }
    }

    post {
        success {
            echo 'Pipeline ejecutado exitosamente!'
        }
        failure {
            echo 'El pipeline falló.'
        }
    }
}