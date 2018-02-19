// Maven location
def mvnHome = tool name: 'maven 3_3_9', type: 'hudson.tasks.Maven$MavenInstallation'
env.MAVEN_HOME = mvnHome

// Begin Compile
stage concurrency: 1, name: 'compile'
sh '''${MAVEN_HOME}/bin/mvn clean compile'''
