
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Temp/MedicAndes/conf/routes
// @DATE:Mon Feb 13 19:33:36 COT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:16
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:60
  class ReverseMarcapasosController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def updateMarcapasos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarcapasosController.updateMarcapasos",
      """
        function(idP0,idM1) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "marcapasos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0) + "&" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idM", idM1)})
        }
      """
    )
  
    // @LINE:60
    def createMarcapasosPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarcapasosController.createMarcapasosPaciente",
      """
        function(idP0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "marcapasos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0)})
        }
      """
    )
  
  }

  // @LINE:34
  class ReversePacienteController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def deletePaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.deletePaciente",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:38
    def updatePaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.updatePaciente",
      """
        function(id0) {
        
          if (true) {
            return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
          }
        
        }
      """
    )
  
    // @LINE:37
    def createPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.createPaciente",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente"})
        }
      """
    )
  
    // @LINE:35
    def getPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.getPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:34
    def getPacientes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacienteController.getPacientes",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pacientes"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def index2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:36
  class ReverseCitaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def createCitaPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.createCitaPaciente",
      """
        function(idP0,idM1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cita/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0) + "&" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idM", idM1)})
        }
      """
    )
  
    // @LINE:48
    def getLecturasPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getLecturasPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/lecturas"})
        }
      """
    )
  
    // @LINE:53
    def createCita: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.createCita",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cita"})
        }
      """
    )
  
    // @LINE:49
    def getEmergenciasPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getEmergenciasPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/emergencias"})
        }
      """
    )
  
    // @LINE:47
    def getExamenesPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getExamenesPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/examenes"})
        }
      """
    )
  
    // @LINE:36
    def getLecturasRango: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getLecturasRango",
      """
        function(id0,inicio1,fin2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/historialRangoFechas/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("inicio", encodeURIComponent(inicio1)) + "&" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("fin", encodeURIComponent(fin2))})
        }
      """
    )
  
    // @LINE:51
    def getMarcapasosPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getMarcapasosPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/marcapasos"})
        }
      """
    )
  
    // @LINE:44
    def getCita: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getCita",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cita" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:46
    def getHistorialPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getHistorialPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/historial"})
        }
      """
    )
  
    // @LINE:54
    def updateCita: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.updateCita",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "cita/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:50
    def getConsejosPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getConsejosPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/consejos"})
        }
      """
    )
  
    // @LINE:43
    def getCitas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getCitas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "citas"})
        }
      """
    )
  
    // @LINE:45
    def getCitasPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CitaController.getCitasPaciente",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paciente/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + "/citas"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:58
  class ReverseEmergenciaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def createEmergenciaPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmergenciaController.createEmergenciaPaciente",
      """
        function(idP0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "emergencia/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0)})
        }
      """
    )
  
  }

  // @LINE:62
  class ReverseHistorialController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def updateHistorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HistorialController.updateHistorial",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "historial/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:59
  class ReverseConsejoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def createConsejoPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ConsejoController.createConsejoPaciente",
      """
        function(idP0,idM1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "consejo/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0) + "&" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idM", idM1)})
        }
      """
    )
  
  }

  // @LINE:57
  class ReverseLecturaController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def createLecturaPaciente: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LecturaController.createLecturaPaciente",
      """
        function(idP0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "lectura/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("idP", idP0)})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseMedicoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def getMedicos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.getMedicos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medicos"})
        }
      """
    )
  
    // @LINE:31
    def updateMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.updateMedico",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "medico/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:29
    def getMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.getMedico",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medico/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:30
    def createMedico: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MedicoController.createMedico",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "medico"})
        }
      """
    )
  
  }


}
