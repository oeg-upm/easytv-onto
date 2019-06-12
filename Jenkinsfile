pipeline {
    agent any

    stages {
        stage('Build'){
            steps {
                sh 'make' (1)
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true (2)

            }

        }
        stage('Test') {
            steps {
                sh 'make check || true' (1)
                junit '**/target/*.xml' (2)

            }
        }

        stage('Deploy')
            when {
              expression {
                currentBuild.result == null || currentBuild.result == 'SUCCESS' (1)
              }

            }
            steps{
                sh 'make publish'
            }
        stage('Example') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
            }
        }

    }
}