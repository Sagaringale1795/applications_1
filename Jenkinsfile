pipeline {
  agent any
  tools {
    maven 'Maven3'
    jdk 'jdk17'
  }

  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }

    stage('Build & Unit Test') {
      steps {
        sh 'mvn clean package -DskipTests=false'
      }
    }

    stage('Build Docker Images') {
      steps {
        sh 'docker compose build'
      }
    }

    stage('Deploy Containers') {
      steps {
        sh 'docker compose down --remove-orphans || true'
        sh 'docker compose up -d'
      }
    }
  }

  post {
    always {
      archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
    }
  }
}
