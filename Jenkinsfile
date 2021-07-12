pipeline {
    agent any

    options {
        disableConcurrentBuilds()
    }

    stages {
        stage('Build') {
            steps {
                withMaven(maven:'maven3.8.1') {
                    sh "mvn clean package"
                }
            }
        }
        stage('Deploy') {
            steps {
                step($class: 'AWSEBDeploymentBuilder',
                credentialId:'aws-ssh-key',
                awsRegion:'eu-north-1',
                applicationName:'TestApp',
                environmentName:'Testapp-env',
                rootObject:'target/test-service-0.0.1-SNAPSHOT.jar',
                versionLabelFormat:'Jenkins-Build-${BUILD_ID}')
            }
        }
    }
}
