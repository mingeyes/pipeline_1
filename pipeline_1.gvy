pipeline {
    agent any
    
    environment {
        PROJECT_NAME = 'corpus_service'
        APPLICATION_ACTIVE = 'dev'
        HOME_DIR = 'home/mingchun'
    } 

    stages{
        stage('Checkout') {
            steps {    
                cleanWs()
                echo " This is pipeline_1 "
                echo "project_name=${PROJECT_NAME} activate=${APPLICATION_ACTIVE} home_dir=${HOME_DIR} "
            }
        }
        stage('Build') {
            steps {
                echo " build... "
                
                     
            }
        }
        stage('Deploy') {
            steps {
                echo " Deploy... "    
            }
        }
    }
}
