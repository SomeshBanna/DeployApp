pipeline {
  agent {label 'QA environment'}
  
  tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }
    
   stages{
   	
   	stage('Upstream job'){
   		steps {
   			triggers {
    	upstream 'CrudPipeline, '
    }
   }
   }
   
   	stage('Deploy to QA'){
   			steps{
   				bat "mvn deploy"
   			}
   	
   	
   	}
   
   
   }
   
   
   
   
   
   
   
   }
