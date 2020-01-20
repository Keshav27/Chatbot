
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object chatbot_Scope0 {
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

class chatbot extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Form[MessageForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String, messageForm : Form[MessageForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""
"""),_display_(/*2.2*/main("ChatBot")/*2.17*/ {_display_(Seq[Any](format.raw/*2.19*/("""
"""),format.raw/*3.1*/("""<head>
    <title>Chat - Customer Module</title>
    <link rel="stylesheet" href=""""),_display_(/*5.35*/routes/*5.41*/.Assets.versioned("stylesheets/style.css")),format.raw/*5.83*/(""""/>
</head>


<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("javascripts/jquery-3.2.1.min.js")),format.raw/*9.73*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*10.15*/routes/*10.21*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*10.70*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*11.15*/routes/*11.21*/.Assets.versioned("javascripts/custom.js")),format.raw/*11.63*/("""" type="text/javascript"></script>


<body>
<div id="wrapper">
    <div id="menu">
        <p class="welcome">Welcome, <b>"""),_display_(/*17.41*/username),format.raw/*17.49*/("""</b></p>
        <p class="logout"><a id="exit" href=""""),_display_(/*18.47*/controllers/*18.58*/.routes.LoginController.logout(username)),format.raw/*18.98*/("""">Exit Chat</a></p>
        <div style="clear:both"></div>
    </div>

    <div id="chatbox"></div>

    """),_display_(/*24.6*/helper/*24.12*/.form(action = routes.ChatMessageController.saveMessage(username), 'id->"messageSendForm")/*24.102*/ {_display_(Seq[Any](format.raw/*24.104*/("""
        """),_display_(/*25.10*/helper/*25.16*/.inputText(messageForm("message"),'class -> "form-control")),format.raw/*25.75*/("""
    """)))}),format.raw/*26.6*/("""

    """),format.raw/*28.5*/("""<button class="btn btn-primary" onclick="sendPostRequest('messageSendForm', '"""),_display_(/*28.83*/username),format.raw/*28.91*/("""', 'chatbox')">Send</button>

</div>
</body>
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(username:String,messageForm:Form[MessageForm]): play.twirl.api.HtmlFormat.Appendable = apply(username,messageForm)

  def f:((String,Form[MessageForm]) => play.twirl.api.HtmlFormat.Appendable) = (username,messageForm) => apply(username,messageForm)

  def ref: this.type = this

}


}

/**/
object chatbot extends chatbot_Scope0.chatbot
              /*
                  -- GENERATED --
                  DATE: Fri Jan 17 11:24:48 IST 2020
                  SOURCE: C:/Users/kesha/Desktop/play-java-starter-example/app/views/chatbot.scala.html
                  HASH: 4a967db8cf7019f5b550da6e60338a6e4b161181
                  MATRIX: 767->1|913->52|941->55|964->70|1003->72|1031->74|1142->159|1156->165|1218->207|1276->239|1290->245|1362->297|1439->347|1454->353|1524->402|1601->452|1616->458|1679->500|1835->629|1864->637|1947->693|1967->704|2028->744|2166->856|2181->862|2281->952|2322->954|2360->965|2375->971|2455->1030|2492->1037|2527->1045|2632->1123|2661->1131|2741->1181
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|48->17|48->17|49->18|49->18|49->18|55->24|55->24|55->24|55->24|56->25|56->25|56->25|57->26|59->28|59->28|59->28|63->32
                  -- GENERATED --
              */
          