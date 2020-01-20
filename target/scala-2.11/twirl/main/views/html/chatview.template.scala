
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object chatview_Scope0 {
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

class chatview extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[ChatMessage],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(chatMessages : List[ChatMessage]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""

    """),_display_(/*3.6*/for(chatMessage <- chatMessages) yield /*3.38*/{_display_(Seq[Any](format.raw/*3.39*/("""
        """),format.raw/*4.9*/("""<div > <b>"""),_display_(/*4.20*/chatMessage/*4.31*/.getSenderName()),format.raw/*4.47*/("""</b>: """),_display_(/*4.54*/chatMessage/*4.65*/.getMessage()),format.raw/*4.78*/("""<br></div>
    """)))}),format.raw/*5.6*/("""
"""))
      }
    }
  }

  def render(chatMessages:List[ChatMessage]): play.twirl.api.HtmlFormat.Appendable = apply(chatMessages)

  def f:((List[ChatMessage]) => play.twirl.api.HtmlFormat.Appendable) = (chatMessages) => apply(chatMessages)

  def ref: this.type = this

}


}

/**/
object chatview extends chatview_Scope0.chatview
              /*
                  -- GENERATED --
                  DATE: Fri Jan 17 09:31:42 IST 2020
                  SOURCE: C:/Users/kesha/Desktop/play-java-starter-example/app/views/chatview.scala.html
                  HASH: 8c99617fb070841451b7474543927354b0fb212d
                  MATRIX: 762->1|891->35|923->42|970->74|1008->75|1043->84|1080->95|1099->106|1135->122|1168->129|1187->140|1220->153|1265->169
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|35->4|36->5
                  -- GENERATED --
              */
          