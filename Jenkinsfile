pipeline {
  agent any
  stages {
    stage('error') {
      steps {
        git(url: 'https://github.com/halevin/testJenkins', branch: 'master', credentialsId: 'halevin')
      }
    }
  }
}