
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[LoginForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(loginForm: Form[LoginForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.30*/("""
"""),_display_(/*3.2*/main("Login")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
"""),_display_(/*4.2*/helper/*4.8*/.form(routes.LoginController.login())/*4.45*/{_display_(Seq[Any](format.raw/*4.46*/("""

"""),format.raw/*6.1*/("""<link rel="stylesheet" href=""""),_display_(/*6.31*/routes/*6.37*/.Assets.versioned("stylesheets/abc.css")),format.raw/*6.77*/(""""/>
<div class="wrapper fadeInDown">
    <div id="formContent">
        <!-- Tabs Titles -->
        <h2 class="active"> Sign In </h2>
        <h2 class="inactive underlineHover"><a href=""""),_display_(/*11.55*/routes/*11.61*/.LoginController.preRegister()),format.raw/*11.91*/("""">Sign Up </a></h2>

        <form>
            <input type="text" class="fadeIn second" name="username" placeholder="Name" value=""""),_display_(/*14.97*/loginForm("username")/*14.118*/.value),format.raw/*14.124*/("""">
            <input type="text" class="fadeIn third" name="password" placeholder="Password" value=""""),_display_(/*15.100*/loginForm("password")/*15.121*/.value),format.raw/*15.127*/("""">
            <input type="submit" class="fadeIn fourth">
        </form>


    </div>
</div>













""")))}),format.raw/*35.2*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[LoginForm]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[LoginForm]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun Jan 19 20:21:33 IST 2020
                  SOURCE: C:/Users/kesha/Desktop/play-java-starter-example/app/views/login.scala.html
                  HASH: 65bf21d5ffe733040ba9c41e7a920a8cf6cc278b
                  MATRIX: 754->3|877->31|905->34|926->47|965->49|993->52|1006->58|1051->95|1089->96|1119->100|1175->130|1189->136|1249->176|1470->370|1485->376|1536->406|1698->541|1729->562|1757->568|1888->671|1919->692|1947->698|2106->827
                  LINES: 27->2|32->2|33->3|33->3|33->3|34->4|34->4|34->4|34->4|36->6|36->6|36->6|36->6|41->11|41->11|41->11|44->14|44->14|44->14|45->15|45->15|45->15|65->35
                  -- GENERATED --
              */
          