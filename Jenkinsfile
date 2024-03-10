pipeline {

    agent any

    parameters {
        string(defaultValue: 'ottechops-site-collection-1', name: 'collection_name', description: 'Server name')
        booleanParam(defaultValue: true, name: 'continueOnError', description: 'Should the entire job fail when a single stage fails?')
        extendedChoice(defaultValue: 'United States', multiSelectDelimiter: ',', name: 'country', propertyFile: '/var/jenkins_home/countries.txt', propertyKey: 'Countries', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_SINGLE_SELECT', visibleItemCount: 5)
    }

    stages {
        stage('will fail') {
            steps {
                script {
                    boolean onError = params.continueOnError == true
                    catchError(buildResult: params.continueOnError ? 'SUCCESS' : 'FAILURE', stageResult: 'FAILURE') {  
                        sh 'echo "${onError}" "${collection_name}"'
                    }
                }
            }
        }

        stage('will run anyways') {
            steps {
                sh 'echo "${country}"'
            }
        }
    }
}
