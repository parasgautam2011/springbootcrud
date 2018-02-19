// Maven location
//def mvnHome = tool name: 'maven 3_5_0', type: 'hudson.tasks.Maven$MavenInstallation'
//env.MAVEN_HOME = M2_HOME

// Begin Compile
stage concurrency: 1, name: 'compile'
sh '''$C:/Users/Paras/apache-maven-3.5.0/bin/mvn clean compile'''
