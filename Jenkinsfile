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
           docker image build -t ant-app .
           docker tag ant-testinng ankita2204/ant-app
           docker push ant-testinng ankita2204/ant-app
           """
        }
}
        }


}
