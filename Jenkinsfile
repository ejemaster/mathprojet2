node() {
    def registryProjet='registry.hub.docker.com/ejemaster/mathprojet' 
 
 def IMAGE="${registryProjet}:image-${env.BUILD_ID}"
     
       stage ('Clone Projet'){
           
           git 'https://github.com/ejemaster/mathprojet.git'
       } 
  stage('Text') {
    println 'Vorbereitung für Parallele Testing'
  }

  stage('Build and Test') {
   parallel (
 "Build-maven Package" : { stage("maven Package") {sh 'mvn package'} },
 
 
 "Build- Test" : { stage("Maven Test -Junit Test") { sh 'mvn test'}}
 
)
  }
  def  img = stage ('Build der Image -Docker Image') {
     docker.build("$IMAGE", ".")
 }
      stage('Test image') {
       

     sh "docker run  ejemaster/mathprojet"
        
    }
      stage('Push- Push der Image auf Dockerhub'){
          docker.withRegistry('https://registry.hub.docker.com', 'docker-hub'){
          img.push("${env.BUILD_ID}")
          img.push("latest")
          }
      }
    stage('Remove Unused docker image') {
     
        sh " docker rmi -f ejemaster/mathprojet"
      
    }
  
}
