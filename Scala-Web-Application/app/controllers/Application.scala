package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  val db : DBConnector = new DBConnector

  def index = Action {
    Ok(views.html.index(db.connect()))
  }

  def hello(name : String) = Action {
    Ok(views.html.hello(name))
  }
}
