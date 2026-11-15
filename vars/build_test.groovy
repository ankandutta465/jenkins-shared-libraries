def call(String projectFolder, String imageName){
  echo "Code Build Stage"
  dir("${projectFolder}"){
  sh "pwd | ls"
  sh "docker build -t "${imageName}" ."
  //    sh "docker run -d -p 8000:8000 node-todo:latest"
  }
