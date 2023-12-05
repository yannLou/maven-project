pipeline {
  agent any
  tools {
    maven "localMaven"
  }
  stages {
    stage('Test') {
      steps {
        //sh 'mvn clean compile test'
        bat 'mvn clean compile test'
        echo "Testing is done"
      }
    }
    stage('Build and Send Results to Sonar') {
      steps {
         withSonarQubeEnv(installationName: 'sonarqube')
        {
       // sh 'mvn package'
        bat 'mvn -B -DskipTests clean package sonar:sonar -Dsonar.login=admin -Dsonar.password=Admin'
        }
      }
    }

    
 }
  }
