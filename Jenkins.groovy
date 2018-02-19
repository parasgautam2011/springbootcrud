

node {
  git url: 'https://github.com/parasgautam2011/springbootcrud.git'
  def mvnHome = tool 'M2'
  sh "${mvnHome}/bin/mvn -B -Dmaven.test.failure.ignore verify"
  step([$class: 'JUnitResultArchiver', testResults:
'**/target/foobar/TEST-*.xml'])
}
