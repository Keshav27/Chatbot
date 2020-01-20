
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/kesha/Desktop/play-java-starter-example/conf/routes
// @DATE:Fri Jan 17 09:31:40 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
