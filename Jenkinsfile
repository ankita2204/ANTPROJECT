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
           sudo docker image build -t ant-app .
           sudo docker tag ant-app ankita2204/ant-app
           sudo docker push ankita2204/ant-app
           """
        }
}
        }


}
