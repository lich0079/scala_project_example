# iteye_blog_backup
scala project init flow:


sbt
np name:projectname
eclipse
import exist project into eclipse

add dependcy into eclipse

reload
eclipse with-source=true



plugins/xx.bt
addSbtPlugin("me.lessis" % "np" % "0.2.0")

resolvers += Resolver.url("sbt-plugin-releases",
  url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(
    Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "3.0.0")