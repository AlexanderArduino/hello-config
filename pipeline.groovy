pipeline {
    agent any
    stages {
        stage("Stage 1") {
            steps {
                println "stages me"
                println "================From Git==================="
            }
        }
    }
}