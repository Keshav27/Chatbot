
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/kesha/Desktop/play-java-starter-example/conf/routes
// @DATE:Fri Jan 17 09:31:40 IST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseChatMessageController ChatMessageController = new controllers.ReverseChatMessageController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTestingController TestingController = new controllers.ReverseTestingController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseChatMessageController ChatMessageController = new controllers.javascript.ReverseChatMessageController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTestingController TestingController = new controllers.javascript.ReverseTestingController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
