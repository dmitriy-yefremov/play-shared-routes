package net.yefremov.sample.sharedroutes.bar

import play.api.mvc.{AnyContent, Action, Controller}

object BarController extends BarControllerApi with Controller {

  override def helloBar(): Action[AnyContent] = Action { implicit request =>
    val link = net.yefremov.sample.sharedroutes.foo.routes.FooControllerApi.helloFoo().url
    Ok(s"Hi, I'm Bar. Here is a link to my friend Foo: $link")
  }
}
