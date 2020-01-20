
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[RegisterForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registerForm: Form[RegisterForm]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""
"""),_display_(/*2.2*/main("Register")/*2.18*/{_display_(Seq[Any](format.raw/*2.19*/("""
"""),_display_(/*3.2*/helper/*3.8*/.form(routes.LoginController.register())/*3.48*/{_display_(Seq[Any](format.raw/*3.49*/("""

"""),format.raw/*5.1*/("""<link rel="stylesheet" href=""""),_display_(/*5.31*/routes/*5.37*/.Assets.versioned("stylesheets/abc.css")),format.raw/*5.77*/(""""/>
<div class="wrapper fadeInDown">
    <div id="formContent">
        <!-- Tabs Titles -->
        <h2 class="active"> Sign Up </h2>

        <form>
            <input type="text" class="fadeIn second" name="username" placeholder="Name" value=""""),_display_(/*12.97*/registerForm("username")/*12.121*/.value),format.raw/*12.127*/("""">
            <input type="text" class="fadeIn third" name="password" placeholder="Password" value=""""),_display_(/*13.100*/registerForm("password")/*13.124*/.value),format.raw/*13.130*/("""">
            <input type="text" class="fadeIn third" name="confirmPassword" placeholder="Confirm Password" value=""""),_display_(/*14.115*/registerForm("confirmPassword")/*14.146*/.value),format.raw/*14.152*/("""">
            <input type="submit" class="fadeIn fourth">
        </form>


    </div>
</div>













""")))}),format.raw/*34.2*/("""
""")))}))
      }
    }
  }

  def render(registerForm:Form[RegisterForm]): play.twirl.api.HtmlFormat.Appendable = apply(registerForm)

  def f:((Form[RegisterForm]) => play.twirl.api.HtmlFormat.Appendable) = (registerForm) => apply(registerForm)

  def ref: this.type = this

}


}

/**/
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Sun Jan 19 20:28:46 IST 2020
                  SOURCE: C:/Users/kesha/Desktop/play-java-starter-example/app/views/register.scala.html
                  HASH: 5aef0c4c4cc0503475362c756abc8492001dd992
                  MATRIX: 763->1|892->35|920->38|944->54|982->55|1010->58|1023->64|1071->104|1109->105|1139->109|1195->139|1209->145|1269->185|1550->439|1584->463|1612->469|1743->572|1777->596|1805->602|1951->720|1992->751|2020->757|2179->886
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|36->5|36->5|36->5|36->5|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|65->34
                  -- GENERATED --
              */
          