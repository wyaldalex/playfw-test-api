package controllers

import javax.inject._
import play.api._
import play.api.libs.json._
import play.api.mvc._

import models.Product

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

  //Implicits for deserialization
  implicit val todoFormat = Json.format[Product]

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def productListing() = Action { implicit request: Request[AnyContent] =>
    val products = models.ProductService.findAll()
    //Ok(views.html.productList(products))
    Ok(Json.toJson(products))
  }

  def productSpecificListing(count: Int) = Action { implicit request: Request[AnyContent] =>
    Ok(s"To be implemented $count")
  }

}

