def call(String url, String branch){
  echo "Code Clone Stage"
  git url: "${url}", credentialsId:"githubcreds", branch: "${branch}"
  echo "Code cloning successfull"
}
