node {
    // Get Artifactory server instance, defined in the Artifactory Plugin administration page.
   
    def buildInfo

  

    stage('Maven build') {
        buildInfo = rtMaven.run pom: 'maven-example/pom.xml', goals: 'clean install'
    }

    
}
