import groovy.transform.Field


@Field def flag




pipeline {
    agent any
    stages {
        stage("Stage 1") {
            steps {
                flag = params.STAGE2
                println "Stage 1"
                println "================Stage 1==================="
            }
        }
        stage("Stage 2") {
            when {
                !flag
            }
            steps {
                println "Stage 2"
                println "================Stage 2==================="
            }
        }
        stage("Stage 3") {
            steps {
                println "stage 3"
                println "================stage 3==================="
            }
        }
    }
}