package net.yefremov.sample.sharedroutes.bar

import play.api.mvc.{AnyContent, Action}

trait BarControllerApi {

   def helloBar(): Action[AnyContent]

 }
