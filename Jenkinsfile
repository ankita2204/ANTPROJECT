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
        }


}
