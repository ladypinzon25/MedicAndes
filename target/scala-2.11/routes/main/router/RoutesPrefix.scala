
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Temp/Nueva carpeta (2)/MedicAndes-master/conf/routes
// @DATE:Sun Apr 30 17:52:21 COT 2017


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
