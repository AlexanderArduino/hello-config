def boolean flag



pipeline {
    agent any
    stages {
        stage("Stage 1") {
            steps {
                flag = params.STAGE2
                println "stages me"
                println "================From Git==================="
            }
        }
        stage("Stage 2") {
            when {
                flag = true
            }
            steps {
                println "stages me"
                println "================Stage 2==================="
                steps.println("Что то там такое")
            }
        }
    }
}