@Library('shared-library') _

pipeline {

    agent any

    parameters {
        choice(choices: Constants.ORGANIZATION_TYPE_NAMES, description: 'Organization type', name: 'org_type')
        string(name: 'saas_id', description: 'SaaS ID')
        booleanParam(defaultValue: true, name: 'continueOnError', description: 'Should the entire job fail when a single stage fails?')
        extendedChoice(defaultValue: 'United States', multiSelectDelimiter: ',', name: 'country', propertyFile: '/var/jenkins_home/countries.txt', propertyKey: 'Countries', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_SINGLE_SELECT', visibleItemCount: 5)
        file(name: "FILE", description: "Please upload a file")
    }

    stages {
        stage('will run') {
            steps {
                script {
                    echo FILE
                    if (saas_id.isEmpty() && Constants.ORGANIZATION_TYPES_REQUIRE_SAAS_ID.contains(org_type)) {
                        error "${org_type} can't be created"
                    }
                }
            }
        }
    }
}
