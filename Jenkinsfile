pipeline {
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