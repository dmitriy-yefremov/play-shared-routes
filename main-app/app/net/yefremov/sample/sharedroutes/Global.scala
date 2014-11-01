package net.yefremov.sample.sharedroutes

import net.yefremov.sample.sharedroutes.bar.{BarControllerApi, BarController}
import net.yefremov.sample.sharedroutes.foo.{FooController, FooControllerApi}
import play.api.GlobalSettings

object Global extends GlobalSettings {

  val Foo = classOf[FooControllerApi]
  val Bar = classOf[BarControllerApi]

  override def getControllerInstance[T](controllerClass: Class[T]): T = {
    println(s"Creating controller for $controllerClass")
    controllerClass match {
      case Foo => FooController.asInstanceOf[T]
      case Bar => BarController.asInstanceOf[T]
    }
  }



}
