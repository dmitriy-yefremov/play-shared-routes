package net.yefremov.sample.sharedroutes

import net.yefremov.sample.sharedroutes.bar.{BarControllerApi, BarController}
import net.yefremov.sample.sharedroutes.foo.{FooController, FooControllerApi}
import play.api.GlobalSettings
import play.api.mvc.Controller

object Global extends GlobalSettings {

  /**
   * Map containing mapping from API traits to their implementations.
   */
  private val controllerMapping = Map[Class[_], Controller](
    classOf[FooControllerApi] -> FooController,
    classOf[BarControllerApi] -> BarController
  )

  override def getControllerInstance[T](controllerClass: Class[T]): T = {
    controllerMapping(controllerClass).asInstanceOf[T]
  }

}
