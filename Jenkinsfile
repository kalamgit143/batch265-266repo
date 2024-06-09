pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the Git repository
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                // Build the project using Maven
                sh 'mvn clean package'
            }
        }
        
        stage('Run Tests') {
            steps {
                // Run tests with TestNG
                sh 'mvn test -P run-suite-xml -DsuiteXmlFile=testng1.xml'
            }
            post {
                always {
                    // Archive the test results
                    archiveArtifacts(allowEmptyArchive: true, artifacts: 'target/surefire-reports/index.html')
                }
            }
        }
    }
    
    post {
        failure {
            // Send an email notification in case of build/test failures 
            emailext subject: 'Smoke Test Failure',
                     body: '''Hi Manager,
                              Please check the build logs for details.
                              Regards, NAG''',
                     to: 'magnitiait@gmail.com',
                     attachLog: true
        }
    }
}
