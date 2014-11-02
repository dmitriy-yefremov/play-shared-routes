package net.yefremov.sample.sharedroutes.foo

import play.api.mvc.{Action, AnyContent, Controller}

/**
 * Controller extends the API trait.
 */
object FooController extends FooControllerApi with Controller {

  override def helloFoo(name: String): Action[AnyContent] = Action { implicit request =>
    val link = net.yefremov.sample.sharedroutes.bar.routes.BarControllerApi.helloBar(name).url
    Ok(s"Hi $name, I'm Foo. Here is a link to my friend Bar: $link")
  }
}
