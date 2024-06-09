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
                bat 'mvn clean package'
            }
        }
        
        stage('Run Tests') {
            steps {
                // Run tests with TestNG
                bat 'mvn test -P run-suite-xml -DsuiteXmlFile=testng1.xml'
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
        always {
            // Send an email notification in all cases
            emailext subject: 'Jenkins Job Notification',
                     body: '''Hi Manager,
                              The Jenkins job has completed. Please check the build logs for details.
                              Regards, NAG''',
                     to: 'magnitiait@gmail.com',
                     attachLog: true
        }
    }
}
