package net.yefremov.sample.sharedroutes.bar

import play.api.mvc.{AnyContent, Action}

/**
 * This trait defines the shareable public interface of BarController.
 * All methods that need to be linked from other modules should be exposed here.
 */
trait BarControllerApi {

   def helloBar(name: String): Action[AnyContent]

 }
