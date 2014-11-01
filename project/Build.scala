import sbt._
import Keys._
import play.Project._
 
object ApplicationBuild extends Build {
 
  val appVersion      = "1.0-SNAPSHOT"
 
  val routes = play.Project("routes", appVersion, path = file("routes"))

  val moduleFoo = play.Project("module-foo", appVersion, path = file("module-foo"))
    .dependsOn(routes)
    .aggregate(routes)
  
  val moduleBar = play.Project("module-bar", appVersion, path = file("module-bar"))
    .dependsOn(routes)
    .aggregate(routes) 
 
  val main = play.Project("main-app", appVersion, path = file("main-app"))
    .dependsOn(moduleFoo, moduleBar)
    .aggregate(moduleFoo, moduleBar)

  override val rootProject = Some(main)
 
}
