job('Mynewjobself-new') { 
  description("My self job ${new Date()}, from scm")
  scm {
     git("https://github.com/ashishbattise24/dsljobs.git", 'master')
  }

  triggers { 
    scm('* * * * *')
  }
  steps {
    maven('clean package', 'maven-samples/single-module/pom.xml')
  }
  publishers{
      archiveArtifacts '**/*.jar'

  }
}
