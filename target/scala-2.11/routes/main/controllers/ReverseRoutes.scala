
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Temp/Nueva carpeta (2)/MedicAndes-master/conf/routes
// @DATE:Sun Apr 30 17:52:21 COT 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:16
package controllers {

  // @LINE:29
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:24
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:68
  class ReverseMarcapasosController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def updateMarcapasos(idP:Long, idM:Long, tk:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "marcapasos/" + implicitly[PathBindable[Long]].unbind("idP", idP) + "&" + implicitly[PathBindable[Long]].unbind("idM", idM) + "/tk=" + implicitly[PathBindable[String]].unbind("tk", dynamicString(tk)))
    }
  
    // @LINE:73
    def updateMarcapasos2(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "marcapasos2/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
    // @LINE:68
    def createMarcapasosPaciente(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "marcapasos/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
  }

  // @LINE:22
  class ReversePacienteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:45
    def deletePaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:44
    def updatePaciente(id:Long): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:44
        case (id)  =>
          import ReverseRouteContext.empty
          Call("PUT", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
      
      }
    
    }
  
    // @LINE:40
    def getPacientes(tk:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pacientes/tk=" + implicitly[PathBindable[String]].unbind("tk", dynamicString(tk)))
    }
  
    // @LINE:46
    def getPacientes2(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pacientes")
    }
  
    // @LINE:22
    def enviarMensajePaciente(idM:Long, idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mensajes/" + implicitly[PathBindable[Long]].unbind("idM", idM) + "&" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
    // @LINE:43
    def createPaciente(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "paciente")
    }
  
    // @LINE:41
    def getPaciente(id:Long, tk:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/tk=" + implicitly[PathBindable[String]].unbind("tk", dynamicString(tk)))
    }
  
  }

  // @LINE:75
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:75
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/")
    }
  
  }

  // @LINE:16
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def mensajes(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "app/mensajes/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:18
    def pacientes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "app/pacientes")
    }
  
    // @LINE:19
    def historial(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "app/historial/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:17
    def home(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "app/home")
    }
  
    // @LINE:20
    def marcapasos(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "app/marcapasos/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:16
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:42
  class ReverseCitaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def createCitaPaciente(idP:Long, idM:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "cita/" + implicitly[PathBindable[Long]].unbind("idP", idP) + "&" + implicitly[PathBindable[Long]].unbind("idM", idM))
    }
  
    // @LINE:55
    def getLecturasPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/lecturas")
    }
  
    // @LINE:60
    def createCita(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "cita")
    }
  
    // @LINE:56
    def getEmergenciasPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/emergencias")
    }
  
    // @LINE:54
    def getExamenesPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/examenes")
    }
  
    // @LINE:42
    def getLecturasRango(id:Long, inicio:String, fin:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/historialRangoFechas/" + implicitly[PathBindable[String]].unbind("inicio", dynamicString(inicio)) + "&" + implicitly[PathBindable[String]].unbind("fin", dynamicString(fin)))
    }
  
    // @LINE:58
    def getMarcapasosPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/marcapasos")
    }
  
    // @LINE:51
    def getCita(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cita" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:53
    def getHistorialPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/historial")
    }
  
    // @LINE:61
    def updateCita(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "cita/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:57
    def getConsejosPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/consejos")
    }
  
    // @LINE:50
    def getCitas(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "citas")
    }
  
    // @LINE:52
    def getCitasPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/citas")
    }
  
  }

  // @LINE:26
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:66
  class ReverseEmergenciaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def createEmergenciaPaciente(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "emergencia/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
  }

  // @LINE:70
  class ReverseHistorialController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def updateHistorial(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "historial/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:47
  class ReverseConsejoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def getConsejos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "consejos/")
    }
  
    // @LINE:67
    def createConsejoPaciente(idP:Long, idM:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "consejo/" + implicitly[PathBindable[Long]].unbind("idP", idP) + "&" + implicitly[PathBindable[Long]].unbind("idM", idM))
    }
  
    // @LINE:48
    def createConsejo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "consejos/crear")
    }
  
  }

  // @LINE:64
  class ReverseLecturaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:64
    def createLecturaCifrada(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "lectura/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
    // @LINE:65
    def createLecturaPaciente(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "lecturaPruebas/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
  }

  // @LINE:34
  class ReverseMedicoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def getMedicos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medicos")
    }
  
    // @LINE:37
    def updateMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "medico/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:35
    def getMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medico/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:36
    def createMedico(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "medico")
    }
  
  }


}
