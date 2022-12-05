pipeline {
  agent {label 'QA environment'}
  	triggers{
  		cron('0 10 * * *')
  		upstream(upstreamProjects:"CrudPipeline",threshold:hudson.model.Result.SUCCESS)
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
