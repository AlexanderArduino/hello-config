import groovy.transform.Field


@Field def flag




pipeline {
    agent any
    stages {
        stage("Stage 1") {
            steps {
                script{
                    flag = params.STAGE2
                    println "Stage 1"
                    println "================Stage 1==================="
                    println "flag = ${flag}"
                }
            }
        }
        stage("Stage 2") {
            when {
                expression { return flag }
            }
            steps {
                script {
                    println "Stage 2"
                    println "================Stage 2==================="
                }
            }
        }
        stage("Stage 3") {
            steps {
                script {
                    println "stage 3"
                    println "================stage 3==================="
                    println "================stage 3==================="

                }
            }
        }
    }
}