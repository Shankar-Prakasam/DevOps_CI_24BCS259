
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Shankar-Prakasam/DevOps_CI_24BCS259.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn -B -DskipTests compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn -B test'
            }
        }

        stage('Result') {
            steps {
                echo 'Restaurant Ordering and Billing System CI completed.'
            }
        }
    }
}