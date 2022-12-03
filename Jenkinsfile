pipeline {
  agent {label 'QA environment'}
  tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }
   
   stages{
   
   	stage('Deploy to QA'){
   			steps{
   				bat "mvn deploy:deploy-file -Durl=https://localhost:8081/repository/java-app/ -Dfile=CrudProject.jar -DgroupId=com.mindtree -DartifactId=CrudProject -Dpackaging=jar -Dversion=0.0.1-SNAPSHOT -DrepositoryId=Somesh"
   			}
   	
   	
   	}
   
   
   }
   
   
   
   
   
   
   
   }
