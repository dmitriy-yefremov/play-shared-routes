package net.yefremov.sample.sharedroutes.bar

import play.api.mvc.{AnyContent, Action, Controller}

/**
 * Controller extends the API trait.
 */
object BarController extends BarControllerApi with Controller {

  override def helloBar(name: String): Action[AnyContent] = Action { implicit request =>
    val link = net.yefremov.sample.sharedroutes.foo.routes.FooControllerApi.helloFoo(name).url
    Ok(s"Hi $name, I'm Bar. Here is a link to my friend Foo: $link")
  }
}
