pipeline{
	agent any
	stages{
     	stage ('build')
	{
	steps {
	step{
		withAnt(installation: 'Ant1') {
		sh 'ant -f build.xml'
		}
	  
		sh echo ' Project'
	  	sh 'java -jar dist/Main.jar 10'		
		}
	}
}
        }


}
