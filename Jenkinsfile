pipeline {
  agent {label 'QA environment'}
  tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }
    triggers {
    	upstream 'CrudPipeline, '
    }
   
   stages{
   
   	stage('Deploy to QA'){
   			steps{
   				bat "mvn deploy"
   			}
   	
   	
   	}
   
   
   }
   
   
   
   
   
   
   
   }
