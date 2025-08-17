pipeline {
    agent any

    tools {
        maven 'maven'   // Name as configured in Global Tool Config
        jdk 'jdk17'     // Use same name as configured in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/keshari-abhishek/super.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Run your Spring Boot app locally
                //bat 'nohup java -jar target/*.jar > app.log 2>&1 &'
                bat 'start /B java -jar target\\super-0.0.1-SNAPSHOT.jar > app.log 2>&1'                
            }
        }
    }
    post {
        success {
            echo '✅ Build and Deploy Successful!'
        }
        failure {
            echo '❌ Build Failed!'
        }
    }
}
