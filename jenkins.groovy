pipeline
{
    agent any 

        stages
        {
            stage('build') 
            {
                steps
                {
                    echo "Code Build"
                }
            }
            stage('Deploy') 
            {
                steps 
                {
                    echo "Code Deploy"
                }
            }       

        }



    stages 
    {
        stage('Parallel Stage')
        {
            parallel 
            {
                stage('Parallel Stage1') 
                {
                    steps 
                    {
                        echo "This is Parallel Stage1"
                    }
                }
                stage('Parallel Stage2') 
                {
                    steps 
                    {
                        echo "This is Parallel Stage2"
                    }
                }
            }
        }
    }




    stages 
    {
        stage('Sequential Stage') 
        {
            stages 
            {
                stage('Seq Stage 1') 
                {
                    steps 
                    {
                        echo "This is Sequential Stage 1"
                    }
                }
                stage('Sequential Stage 2 ') 
                {
                    steps 
                    {
                        echo "This is Sequential Stage 1"
                    }
                }
            }
        }
    }

    stages 
    {
        stage('Normal Stage') 
        {
            steps 
            {
                echo "This is a Normal stage"
                echo "Stage Completed"
            }
        }

        stage('Parallel Stage') 
        {
            parallel 
            {
                stage('Parallel Stage1') 
                {
                    steps 
                    {
                        sh 'echo "parallel stage1 completed"'
                    }
                }
                stage('Parallel Stage2') 
                {
                    steps 
                    {
                        sh 'echo "parallel stage2 completed"'
                    }
                }
            }
        }
    }


stage('Sequential Stage') 
    {
            stages 
            {

                    stage('Seq Stage1') 
                    {
                        steps 
                        {
                                sh 'echo "Seq stage1 completed"'
                        }
                    stages 
                     {
                     stage('Seq Stage2') 
                        {
                            steps 
                            {
                                sh 'echo "Seq stage2 completed"'
                            }
                        }
                     }
                    }
            
            }
        
   
    }
}
