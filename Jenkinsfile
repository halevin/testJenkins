pipeline {
	agent {
      docker {
           image 'maven:3-alpine' 
           args '-v /root/.m2:/root/.m2' 
       }
    }    
	stages {
	 stage('Git') {
       steps {
       git(url: 'https://github.com/halevin/testJenkins', branch: 'master', credentialsId: 'halevin')
       }
     }
	stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}