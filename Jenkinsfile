pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'Clarusway_Way to Reinvent Yourself'
                sh 'git clone https://github.com/muslumhanozturk/test.git'
                sh 'echo Integrating Jenkins Pipeline with GitHub Webhook using Jenkinsfile'
            }
        }
    }

    post {
        success {
            slackSend channel: '#keypair-wallet', color: 'good', message: "Build başarıyla tamamlandı: ${currentBuild.fullDisplayName}"
        }
        failure {
            slackSend channel: '#keypair-wallet', color: 'danger', message: "Build başarısız oldu: ${currentBuild.fullDisplayName}"
        }
    }
}

