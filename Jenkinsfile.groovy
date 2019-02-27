pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'node build/build.js'    
            }
        }
        stage('Test') {
            steps {
                echo 'npm run unit && npm run e2e'
            }
        }
        stage('lint') {
            steps {
                echo 'eslint --ext .js,.vue src test/unit test/e2e/specs'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}


// "test": "npm run unit && npm run e2e",

// "lint": "eslint --ext .js,.vue src test/unit test/e2e/specs",

// "build": "node build/build.js"