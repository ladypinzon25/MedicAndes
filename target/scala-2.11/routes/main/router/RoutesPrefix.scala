
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Camilo/Documents/GitHub/MedicAndes/conf/routes
// @DATE:Tue May 02 22:44:08 COT 2017


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
