node() {
    def registryProjet='registry.hub.docker.com/ejemaster/mathprojet' 
 
 def IMAGE="${registryProjet}:image-${env.BUILD_ID}"
 def mvn_version= 'maven'
 def dockerHome = 'mydocker'
     
       stage ('Clone Projet'){
           
           git 'https://github.com/ejemaster/mathprojet2.git'
       } 
  stage('Text') {
    println 'Vorbereitung für Parallele Testing'
  }

  stage('Build and Test') {
   parallel (
 "Build-maven Package" : { stage("maven Package"){ withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
  sh 'mvn -DskipTests=true package '
}
 }
 },
 
 "Build- Test" : { stage("Maven Test -Junit Test") { withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
  sh 'mvn test '
}
}
 } 
)


  }
  def  img = stage ('Build der Image -Docker Image') {withEnv(["PATH+DOCKER=${tool dockerHome}/bin"]){
  
     docker.build("$IMAGE", ".")
 }
 }
      stage('Test image') {withEnv(["PATH+DOCKER=${tool dockerHome}/bin"]){
       

     sh "docker run  ejemaster/mathprojet"
        
    }
	}
      stage('Push- Push der Image auf Dockerhub') {docker.withTool(dockerHome){
          //docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
           //withDockerRegistry([credentialsId: 'docker-hub', url: "https://registry.hub.docker.com"]) {
         docker.withRegistry('https://registry.hub.docker.com', 'docker-hub'){
          img.push("${env.BUILD_ID}")
          img.push("latest")
          }
      }
      }
	  
    stage('Remove Unused docker image'){withEnv(["PATH+DOCKER=${tool dockerHome}/bin"]) {
     
        sh " docker rmi -f ejemaster/mathprojet"
      
    }
	
  
}
}
