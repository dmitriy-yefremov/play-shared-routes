package net.yefremov.sample.sharedroutes.foo

import play.api.mvc.{Action, AnyContent, Controller}

object FooController extends FooControllerApi with Controller {

  override def helloFoo(): Action[AnyContent] = Action { implicit request =>
    val link = net.yefremov.sample.sharedroutes.bar.routes.BarControllerApi.helloBar().url
    Ok(s"Hi, I'm Foo. Here is a link to my friend Bar: $link")
  }
}
