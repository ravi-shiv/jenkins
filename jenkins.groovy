pipeline {
    agent any

    stages {
        stage('Normal Stage') {
            steps {
                echo "This is a Normal stage"
                echo "Stage Completed"
            }
        }

        stage('Parallel Stage') {
            parallel {
                stage('Parallel Stage1') {
                    steps {
                        sh 'echo "parallel stage1 completed"'
                    }
                }
                stage('Parallel Stage2') {
                    steps {
                        sh 'echo "parallel stage2 completed"'
                    }
                }
            }
        }

stage('Sequential Stage') {
            stages {
                    stage('Seq Stage1') {
                        steps {
                                sh 'echo "Seq stage1 completed"'
                            }
                    stages {
                    stage('Seq Stage2') {
                            steps {
                                sh 'echo "Seq stage2 completed"'
                            }
                        }
                    }
                }
            }
        }
   
    }
}