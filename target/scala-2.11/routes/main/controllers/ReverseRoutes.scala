
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Camilo/Documents/GitHub/MedicAndes/conf/routes
// @DATE:Thu May 11 13:35:04 COT 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:16
package controllers {

  // @LINE:31
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:31
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:34
  class ReverseMobileController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def mensajes(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobile/mensajes/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:39
    def mobileLPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobile/mpaciente/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:35
    def mobileCitas(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobile/citas")
    }
  
    // @LINE:34
    def mobilePacientes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobile/pacientes")
    }
  
    // @LINE:37
    def mobileIndex(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobile")
    }
  
    // @LINE:36
    def mobilePaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mobile/paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:26
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:77
  class ReverseMarcapasosController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:80
    def updateMarcapasos(idP:Long, idM:Long, tk:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "marcapasos/" + implicitly[PathBindable[Long]].unbind("idP", idP) + "&" + implicitly[PathBindable[Long]].unbind("idM", idM) + "/tk=" + implicitly[PathBindable[String]].unbind("tk", dynamicString(tk)))
    }
  
    // @LINE:82
    def updateMarcapasos2(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "marcapasos2/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
    // @LINE:77
    def createMarcapasosPaciente(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "marcapasos/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
  }

  // @LINE:24
  class ReversePacienteController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def deletePaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:53
    def updatePaciente(id:Long): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:53
        case (id)  =>
          import ReverseRouteContext.empty
          Call("PUT", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id))
      
      }
    
    }
  
    // @LINE:49
    def getPacientes(tk:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pacientes/tk=" + implicitly[PathBindable[String]].unbind("tk", dynamicString(tk)))
    }
  
    // @LINE:55
    def getPacientes2(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pacientes")
    }
  
    // @LINE:24
    def enviarMensajePaciente(idM:Long, idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "mensajes/" + implicitly[PathBindable[Long]].unbind("idM", idM) + "&" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
    // @LINE:52
    def createPaciente(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "paciente")
    }
  
    // @LINE:50
    def getPaciente(id:Long, tk:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/tk=" + implicitly[PathBindable[String]].unbind("tk", dynamicString(tk)))
    }
  
  }

  // @LINE:84
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
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

  
    // @LINE:23
    def mensajes(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "app/mensajes/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:18
    def pacientes(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "app/pacientes")
    }
  
    // @LINE:21
    def historial(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "app/historial/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:19
    def citas(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "app/citas")
    }
  
    // @LINE:17
    def home(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "app/home")
    }
  
    // @LINE:22
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

  // @LINE:20
  class ReverseCitaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def createCitaPaciente(idP:Long, idM:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "cita/" + implicitly[PathBindable[Long]].unbind("idP", idP) + "&" + implicitly[PathBindable[Long]].unbind("idM", idM))
    }
  
    // @LINE:64
    def getLecturasPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/lecturas")
    }
  
    // @LINE:69
    def createCita(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "cita")
    }
  
    // @LINE:65
    def getEmergenciasPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/emergencias")
    }
  
    // @LINE:63
    def getExamenesPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/examenes")
    }
  
    // @LINE:51
    def getLecturasRango(id:Long, inicio:String, fin:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/historialRangoFechas/" + implicitly[PathBindable[String]].unbind("inicio", dynamicString(inicio)) + "&" + implicitly[PathBindable[String]].unbind("fin", dynamicString(fin)))
    }
  
    // @LINE:67
    def getMarcapasosPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/marcapasos")
    }
  
    // @LINE:60
    def getCita(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cita" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:62
    def getHistorialPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/historial")
    }
  
    // @LINE:70
    def updateCita(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "cita/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:66
    def getConsejosPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/consejos")
    }
  
    // @LINE:59
    def getCitas(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "citas")
    }
  
    // @LINE:61
    def getCitasPaciente(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "paciente/" + implicitly[PathBindable[Long]].unbind("id", id) + "/citas")
    }
  
    // @LINE:20
    def createCita2(idPaciente:Long, idMedico:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "app/agendarCita/" + implicitly[PathBindable[Long]].unbind("idPaciente", idPaciente) + "&" + implicitly[PathBindable[Long]].unbind("idMedico", idMedico))
    }
  
  }

  // @LINE:28
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:75
  class ReverseEmergenciaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:75
    def createEmergenciaPaciente(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "emergencia/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
  }

  // @LINE:79
  class ReverseHistorialController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:79
    def updateHistorial(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "historial/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:56
  class ReverseConsejoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:56
    def getConsejos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "consejos/")
    }
  
    // @LINE:76
    def createConsejoPaciente(idP:Long, idM:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "consejo/" + implicitly[PathBindable[Long]].unbind("idP", idP) + "&" + implicitly[PathBindable[Long]].unbind("idM", idM))
    }
  
    // @LINE:57
    def createConsejo(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "consejos/crear")
    }
  
  }

  // @LINE:73
  class ReverseLecturaController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:73
    def createLecturaCifrada(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "lectura/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
    // @LINE:74
    def createLecturaPaciente(idP:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "lecturaPruebas/" + implicitly[PathBindable[Long]].unbind("idP", idP))
    }
  
  }

  // @LINE:43
  class ReverseMedicoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def getMedicos(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medicos")
    }
  
    // @LINE:46
    def updateMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "medico/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:44
    def getMedico(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "medico/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:45
    def createMedico(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "medico")
    }
  
  }


}
