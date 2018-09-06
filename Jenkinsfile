pipeline{
	agent any
	stages{
     	stage ('build')
		{
		steps {
		withAnt(installation: 'Ant1') {
		sh 'ant -f build.xml'
	  	sh 'java -jar dist/Main.jar 10'		
						}
			}
		}
	stage ('Build Docker Image '){  
	steps{ 
        sh """
           docker image build -t my-ant-app .
           docker tag my-ant-app ankita0422/my-ant-app
           docker push ankita0422/my-ant-app
           """
	}	
		}
	stage ('Deploy') {
		steps{
			sh """
			docker container run --name demo ankita0422/my-ant-app
			"""
		}
	}
        }
}
