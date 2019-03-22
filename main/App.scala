package com.scala
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import scala.tools.nsc.MainGenericRunner;

/**
 * example to test using the scala REPL after running main
 */
object App {

  def main(args: Array[String]) {


    try {

     println("TIME FOR STUFF")

     val doc = Jsoup.parse("<html><head><title>My title</title></head>"
                  + "<body>Body content</body></html>");
	
     val title = doc.title()
     val body = doc.body().text()

     // Now run the MainGenericRunner to get your repl
     MainGenericRunner.main(args)
     // After the repl exits, then exit the scala script
     System.exit(0)  
     

    } catch {
      case e : Throwable => e.printStackTrace
    }

  }
}
