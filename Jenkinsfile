pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn clean compile test'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn Package'
      }
    }

  }
}
