
package views.html.Home

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object welcome_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class welcome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String, lastName:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <p> welcome """),_display_(/*9.18*/name),format.raw/*9.22*/(""" """),_display_(/*9.24*/lastName),format.raw/*9.32*/("""</p>
</body>
</html>"""))
      }
    }
  }

  def render(name:String,lastName:String): play.twirl.api.HtmlFormat.Appendable = apply(name,lastName)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (name,lastName) => apply(name,lastName)

  def ref: this.type = this

}


}

/**/
object welcome extends welcome_Scope0.welcome
              /*
                  -- GENERATED --
                  DATE: Fri Jan 17 09:31:43 IST 2020
                  SOURCE: C:/Users/kesha/Desktop/play-java-starter-example/app/views/Home/welcome.scala.html
                  HASH: 45fd9bab0e8b7a204a1d8fbfaec0e6d3d013fdc3
                  MATRIX: 761->1|887->32|915->34|1072->165|1096->169|1124->171|1152->179
                  LINES: 27->1|32->1|33->2|40->9|40->9|40->9|40->9
                  -- GENERATED --
              */
          