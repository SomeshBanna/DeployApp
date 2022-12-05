pipeline {
  agent {label 'QA environment'}
  triggers {
    	upstream 'CrudPipeline, '
    }
   
  tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }
    
   stages{
   
   	stage('Deploy to QA'){
   			steps{
   				bat "mvn deploy"
   			}
   	
   	
   	}
   
   
   }
   
   
   
   
   
   
   
   }
