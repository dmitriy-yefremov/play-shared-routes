package net.yefremov.sample.sharedroutes.foo

import play.api.mvc.{AnyContent, Action}

/**
 * This trait defines the shareable public interface of FooController.
 * All methods that need to be linked from other modules should be exposed here.
 */
trait FooControllerApi {

  def helloFoo(name: String): Action[AnyContent]

}
