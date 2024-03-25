@Library('shared-library') _

pipeline {

    agent any

    parameters {
        choice(choices: Constants.ORGANIZATION_TYPE_NAMES, description: 'Organization type', name: 'org_type')
        string(defaultValue: 'ottechops-site-collection-1', name: 'collection_name', description: 'Server name')
        booleanParam(defaultValue: true, name: 'continueOnError', description: 'Should the entire job fail when a single stage fails?')
        extendedChoice(defaultValue: 'United States', multiSelectDelimiter: ',', name: 'country', propertyFile: '/var/jenkins_home/countries.txt', propertyKey: 'Countries', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_SINGLE_SELECT', visibleItemCount: 5)
    }

    stages {
        stage('will run') {
            steps {
                script {
                    if (Constants.ORGANIZATION_TYPES_REQUIRE_SAAS_ID.contains(org_type)) {
                        error "${params.org_type} can't be created"
                    }
                }
            }
        }
    }
}
