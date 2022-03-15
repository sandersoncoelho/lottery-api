pipeline {
    agent any
    
    triggers {
        pollSCM 'H * * * *'
    }
    
    stages {
        stage('Clone sources') {
            steps {
                git 'https://github.com/sandersoncoelho/lottery-api.git'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew assemble'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh './gradlew docker'
            }
        }
        stage('Run Docker Image') {
            steps {
                sh './gradlew dockerRun'
            }
        }
    }
}
