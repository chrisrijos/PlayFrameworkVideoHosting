package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    
    var z = Array("Home")
    Ok(views.html.index(z(0)))
  }

}

