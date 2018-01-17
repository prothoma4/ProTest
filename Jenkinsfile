pipeline {
	
    agent any
    stages {
		
        stage('compile') {
            steps {
                bat 'mvn clean install'
            }
        }
        
        stage('deploy to CF') {
            steps {
			
               bat 'C://"Program Files/Cloud Foundry"//cf login -a https://api.run.pivotal.io -u prothoma4@gmail.com -p Soupro@21 --skip-ssl-validation'
           	   bat 'C://"Program Files/Cloud Foundry"//cf target -o  prothoma4-org -s development'
        	   bat 'C://"Program Files/Cloud Foundry"//cf push calcapp -f manifest.yml'
           
            }
        }
    }
}

