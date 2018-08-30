pipeline{

	stages{
     	 stage ('build'){
	steps {
		withAnt(installation: 'Ant1') {
		sh 'ant -f build.xml'
		}
  
	  sh echo ' Project'
	  sh java -jar dist/Main.jar 10		
       }
      }
#    stage ('Build Image and Push to Dockerhub'){  
#     steps{ 
#        sh """
     #      sudo docker image build -t JavaApp .
     #      sudo docker tag JavaApp Ankitas/JavaApp
     #      sudo docker push Ankitas/JavaApp
     #      """
#        }


}
