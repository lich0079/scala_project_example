package iteye_blog_backup

import scalaj.http._
import scala.xml.XML

object Collector {

  
  def collectUrl(blogUrl: String) = {
    val response: HttpResponse[String] = Http(blogUrl).proxy("161.92.51.225", 8080).asString
    println(response.getClass)
  }
}