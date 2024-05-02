@Library('shared-library') _

pipeline {

    agent any

    parameters {
        choice(choices: Constants.ORGANIZATION_TYPE_NAMES, description: 'Organization type', name: 'org_type')
        string(name: 'saas_id', description: 'SaaS ID')
        booleanParam(defaultValue: true, name: 'continueOnError', description: 'Should the entire job fail when a single stage fails?')
        extendedChoice(defaultValue: 'United States', multiSelectDelimiter: ',', name: 'country', propertyFile: '/var/jenkins_home/countries.txt', propertyKey: 'Countries', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_SINGLE_SELECT', visibleItemCount: 5)
        stashedFile(name: 'image')
    }

    stages {
        stage('setup') {
            steps {
                script {
                    env.CHECK = 1 != 1
                }
            }
        }
        stage('will run') {
            steps {
                script {
                    echo env.CHECK
                    if (env.CHECK) {
                        echo "1 == 1"
                    }
                }
                unstash('image')
                sh 'mv image $image_FILENAME'
            }
        }


        stage('last') {
            when {
                expression {
                    env.CHECK
                }
            }
            steps {
                echo "Hello World!"
            }
        }
    }
}
