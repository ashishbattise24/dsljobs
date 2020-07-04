job('Mynewjobself') { 
  description( "My self job ${new date()}, from scm")


scm {
     git(https://github.com/ashishbattise24/dsljobs.git, 'master')
}

triggers { 

     scm('* * * * *')
}
steps {

   maven(clean package, 'maven-samples/single-module/pom.xml')
}
publishers{
  archiveArtifacts '**/*.jar'

}
}
