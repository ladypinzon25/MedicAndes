
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Temp/MedicAndes/conf/routes
// @DATE:Mon Feb 13 19:33:36 COT 2017


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
