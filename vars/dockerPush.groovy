def call(){
  dir("/var/jenkins_home/workspace/django-todo-delivery/node-todo-cicd-master"){
                withCredentials([usernamePassword(
                    credentialsId:"dockerHubCreds",
                    usernameVariable:"dockerHubUser", 
                    passwordVariable:"dockerHubPass")]){
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker image tag node-todo:latest ${env.dockerHubUser}/node-todo:latest"
                sh "docker push ${env.dockerHubUser}/node-todo:latest"
                }
                }
  }
