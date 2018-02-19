// Maven location
def mvnHome = tool name: 'maven 3_5_0', type: 'hudson.tasks.Maven$MavenInstallation'
env.MAVEN_HOME = M2_HOME

// Begin Compile
stage concurrency: 1, name: 'compile'
sh '''${MAVEN_HOME}/bin/mvn clean compile'''
