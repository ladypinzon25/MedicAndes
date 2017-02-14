
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Temp/MedicAndes/conf/routes
// @DATE:Mon Feb 13 19:33:36 COT 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:16
package controllers {

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:18
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:60
  class ReverseMarcapasosController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def updateMarcapasos(idP:Long, idM:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "marcapasos/" + implicitly[PathBindable[Long]].unbind("idP", idP) + "&" + implicitly[PathBindable[Long]].unbind("idM", idM))
    }
  
    // @LINE:60
    def createMarcapasosPaciente(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "marcapasos/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
  }

  // @LINE:34
  class ReversePacienteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def deletePaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:38
    def updatePaciente(id:Long): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:38
        case (id)  =>
          import ReverseRouteContext.empty
          Call("PUT", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
      
      }
    
    }
  
    // @LINE:37
    def createPaciente(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "paciente")
    }
  
    // @LINE:35
    def getPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:34
    def getPacientes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pacientes")
    }
  
  }

  // @LINE:16
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def index2(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:36
  class ReverseCitaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def createCitaPaciente(idP:Long, idM:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "cita/" + implicitly[PathBindable[Long]].unbind("idP", idP) + "&" + implicitly[PathBindable[Long]].unbind("idM", idM))
    }
  
    // @LINE:48
    def getLecturasPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/lecturas")
    }
  
    // @LINE:53
    def createCita(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "cita")
    }
  
    // @LINE:49
    def getEmergenciasPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/emergencias")
    }
  
    // @LINE:47
    def getExamenesPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/examenes")
    }
  
    // @LINE:36
    def getLecturasRango(id:Long, inicio:String, fin:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/historialRangoFechas/" + implicitly[PathBindable[String]].unbind("inicio", dynamicString(inicio)) + "&" + implicitly[PathBindable[String]].unbind("fin", dynamicString(fin)))
    }
  
    // @LINE:51
    def getMarcapasosPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/marcapasos")
    }
  
    // @LINE:44
    def getCita(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cita" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:46
    def getHistorialPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/historial")
    }
  
    // @LINE:54
    def updateCita(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "cita/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:50
    def getConsejosPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/consejos")
    }
  
    // @LINE:43
    def getCitas(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "citas")
    }
  
    // @LINE:45
    def getCitasPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/citas")
    }
  
  }

  // @LINE:20
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:58
  class ReverseEmergenciaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def createEmergenciaPaciente(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "emergencia/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
  }

  // @LINE:62
  class ReverseHistorialController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def updateHistorial(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "historial/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:59
  class ReverseConsejoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def createConsejoPaciente(idP:Long, idM:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "consejo/" + implicitly[PathBindable[Long]].unbind("idP", idP) + "&" + implicitly[PathBindable[Long]].unbind("idM", idM))
    }
  
  }

  // @LINE:57
  class ReverseLecturaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def createLecturaPaciente(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "lectura/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
  }

  // @LINE:28
  class ReverseMedicoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def getMedicos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medicos")
    }
  
    // @LINE:31
    def updateMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "medico/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:29
    def getMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medico/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:30
    def createMedico(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "medico")
    }
  
  }


}
