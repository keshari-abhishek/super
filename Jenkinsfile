pipeline {
    agent any

    tools {
        maven 'Maven'   // Name as configured in Global Tool Config
        jdk 'JDK17'     // Use same name as configured in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/keshari-abhishek/super.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Run your Spring Boot app locally
                sh 'nohup java -jar target/*.jar > app.log 2>&1 &'
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
