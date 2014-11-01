package net.yefremov.sample.sharedroutes.foo

import play.api.mvc.{AnyContent, Action}

trait FooControllerApi {

  def helloFoo(): Action[AnyContent]

}
