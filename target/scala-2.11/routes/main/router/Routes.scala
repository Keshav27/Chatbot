
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/kesha/Desktop/play-java-starter-example/conf/routes
// @DATE:Fri Jan 17 09:31:40 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  TestingController_2: controllers.TestingController,
  // @LINE:8
  LoginController_1: controllers.LoginController,
  // @LINE:15
  ChatMessageController_3: controllers.ChatMessageController,
  // @LINE:21
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    TestingController_2: controllers.TestingController,
    // @LINE:8
    LoginController_1: controllers.LoginController,
    // @LINE:15
    ChatMessageController_3: controllers.ChatMessageController,
    // @LINE:21
    Assets_0: controllers.Assets
  ) = this(errorHandler, TestingController_2, LoginController_1, ChatMessageController_3, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, TestingController_2, LoginController_1, ChatMessageController_3, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """testing""", """controllers.TestingController.testing"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginform""", """controllers.LoginController.preLogin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerform""", """controllers.LoginController.preRegister"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout/""" + "$" + """username<[^/]+>""", """controllers.LoginController.logout(username:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.LoginController.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chat/""" + "$" + """userName<[^/]+>""", """controllers.ChatMessageController.showConversation(userName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getChat/""" + "$" + """userName<[^/]+>""", """controllers.ChatMessageController.getConversation(userName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chat/saveMessage/""" + "$" + """userName<[^/]+>""", """controllers.ChatMessageController.saveMessage(userName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_TestingController_testing0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("testing")))
  )
  private[this] lazy val controllers_TestingController_testing0_invoker = createInvoker(
    TestingController_2.testing,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestingController",
      "testing",
      Nil,
      "GET",
      """""",
      this.prefix + """testing"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_LoginController_preLogin1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginform")))
  )
  private[this] lazy val controllers_LoginController_preLogin1_invoker = createInvoker(
    LoginController_1.preLogin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "preLogin",
      Nil,
      "GET",
      """""",
      this.prefix + """loginform"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_LoginController_login2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login2_invoker = createInvoker(
    LoginController_1.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_LoginController_preRegister3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerform")))
  )
  private[this] lazy val controllers_LoginController_preRegister3_invoker = createInvoker(
    LoginController_1.preRegister,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "preRegister",
      Nil,
      "GET",
      """""",
      this.prefix + """registerform"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_LoginController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout/"), DynamicPart("username", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LoginController_logout4_invoker = createInvoker(
    LoginController_1.logout(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """logout/""" + "$" + """username<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_LoginController_register5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_LoginController_register5_invoker = createInvoker(
    LoginController_1.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "register",
      Nil,
      "POST",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ChatMessageController_showConversation6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chat/"), DynamicPart("userName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChatMessageController_showConversation6_invoker = createInvoker(
    ChatMessageController_3.showConversation(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatMessageController",
      "showConversation",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """chat/""" + "$" + """userName<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ChatMessageController_getConversation7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getChat/"), DynamicPart("userName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChatMessageController_getConversation7_invoker = createInvoker(
    ChatMessageController_3.getConversation(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatMessageController",
      "getConversation",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """getChat/""" + "$" + """userName<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ChatMessageController_saveMessage8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chat/saveMessage/"), DynamicPart("userName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ChatMessageController_saveMessage8_invoker = createInvoker(
    ChatMessageController_3.saveMessage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatMessageController",
      "saveMessage",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """chat/saveMessage/""" + "$" + """userName<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_TestingController_testing0_route(params) =>
      call { 
        controllers_TestingController_testing0_invoker.call(TestingController_2.testing)
      }
  
    // @LINE:8
    case controllers_LoginController_preLogin1_route(params) =>
      call { 
        controllers_LoginController_preLogin1_invoker.call(LoginController_1.preLogin)
      }
  
    // @LINE:9
    case controllers_LoginController_login2_route(params) =>
      call { 
        controllers_LoginController_login2_invoker.call(LoginController_1.login())
      }
  
    // @LINE:11
    case controllers_LoginController_preRegister3_route(params) =>
      call { 
        controllers_LoginController_preRegister3_invoker.call(LoginController_1.preRegister)
      }
  
    // @LINE:12
    case controllers_LoginController_logout4_route(params) =>
      call(params.fromPath[String]("username", None)) { (username) =>
        controllers_LoginController_logout4_invoker.call(LoginController_1.logout(username))
      }
  
    // @LINE:13
    case controllers_LoginController_register5_route(params) =>
      call { 
        controllers_LoginController_register5_invoker.call(LoginController_1.register())
      }
  
    // @LINE:15
    case controllers_ChatMessageController_showConversation6_route(params) =>
      call(params.fromPath[String]("userName", None)) { (userName) =>
        controllers_ChatMessageController_showConversation6_invoker.call(ChatMessageController_3.showConversation(userName))
      }
  
    // @LINE:16
    case controllers_ChatMessageController_getConversation7_route(params) =>
      call(params.fromPath[String]("userName", None)) { (userName) =>
        controllers_ChatMessageController_getConversation7_invoker.call(ChatMessageController_3.getConversation(userName))
      }
  
    // @LINE:18
    case controllers_ChatMessageController_saveMessage8_route(params) =>
      call(params.fromPath[String]("userName", None)) { (userName) =>
        controllers_ChatMessageController_saveMessage8_invoker.call(ChatMessageController_3.saveMessage(userName))
      }
  
    // @LINE:21
    case controllers_Assets_versioned9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
