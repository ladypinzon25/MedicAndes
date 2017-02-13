
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Temp/MedicAndes/conf/routes
// @DATE:Sun Feb 12 18:34:59 COT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:16
  HomeController_2: controllers.HomeController,
  // @LINE:18
  CountController_1: controllers.CountController,
  // @LINE:20
  AsyncController_3: controllers.AsyncController,
  // @LINE:23
  Assets_5: controllers.Assets,
  // @LINE:28
  MedicoController_6: controllers.MedicoController,
  // @LINE:34
  PacienteController_0: controllers.PacienteController,
  // @LINE:41
  CitaController_4: controllers.CitaController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:16
    HomeController_2: controllers.HomeController,
    // @LINE:18
    CountController_1: controllers.CountController,
    // @LINE:20
    AsyncController_3: controllers.AsyncController,
    // @LINE:23
    Assets_5: controllers.Assets,
    // @LINE:28
    MedicoController_6: controllers.MedicoController,
    // @LINE:34
    PacienteController_0: controllers.PacienteController,
    // @LINE:41
    CitaController_4: controllers.CitaController
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_5, MedicoController_6, PacienteController_0, CitaController_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_5, MedicoController_6, PacienteController_0, CitaController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index2"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medicos""", """controllers.MedicoController.getMedicos"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico/""" + "$" + """id<[^/]+>""", """controllers.MedicoController.getMedico(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico""", """controllers.MedicoController.createMedico"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico/""" + "$" + """id<[^/]+>""", """controllers.MedicoController.updateMedico(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pacientes""", """controllers.PacienteController.getPacientes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.getPaciente(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente""", """controllers.PacienteController.createPaciente"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.updatePaciente(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """citas""", """controllers.CitaController.getCitas"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cita/""" + "$" + """id<[^/]+>""", """controllers.CitaController.getCita(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cita""", """controllers.CitaController.createCita"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cita/""" + "$" + """id<[^/]+>""", """controllers.CitaController.updateCita(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """idP<[^/]+>&""" + "$" + """idM<[^/]+>/cita""", """controllers.CitaController.createCitaPaciente(idP:Long, idM:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.updatePaciente(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/citas""", """controllers.PacienteController.updatePaciente(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:16
  private[this] lazy val controllers_HomeController_index20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index20_invoker = createInvoker(
    HomeController_2.index2,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index2",
      Nil,
      "GET",
      """ Routes
 This file defines all application routes (Higher priority routes first)
 ~~~~
#######################################################################################################################

                                               ###    ########  ####
                                              ## ##   ##     ##  ##
                                             ##   ##  ##     ##  ##
                                            ##     ## ########   ##
                                            ######### ##         ##
                                            ##     ## ##         ##
                                            ##     ## ##        ####

#######################################################################################################################
 An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:28
  private[this] lazy val controllers_MedicoController_getMedicos4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicos")))
  )
  private[this] lazy val controllers_MedicoController_getMedicos4_invoker = createInvoker(
    MedicoController_6.getMedicos,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicoController",
      "getMedicos",
      Nil,
      "GET",
      """Controlador de medico""",
      this.prefix + """medicos"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_MedicoController_getMedico5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_getMedico5_invoker = createInvoker(
    MedicoController_6.getMedico(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicoController",
      "getMedico",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """medico/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_MedicoController_createMedico6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico")))
  )
  private[this] lazy val controllers_MedicoController_createMedico6_invoker = createInvoker(
    MedicoController_6.createMedico,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicoController",
      "createMedico",
      Nil,
      "POST",
      """""",
      this.prefix + """medico"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_MedicoController_updateMedico7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_updateMedico7_invoker = createInvoker(
    MedicoController_6.updateMedico(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MedicoController",
      "updateMedico",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """medico/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_PacienteController_getPacientes8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pacientes")))
  )
  private[this] lazy val controllers_PacienteController_getPacientes8_invoker = createInvoker(
    PacienteController_0.getPacientes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "getPacientes",
      Nil,
      "GET",
      """Controlador de paciente""",
      this.prefix + """pacientes"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_PacienteController_getPaciente9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_getPaciente9_invoker = createInvoker(
    PacienteController_0.getPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "getPaciente",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_PacienteController_createPaciente10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente")))
  )
  private[this] lazy val controllers_PacienteController_createPaciente10_invoker = createInvoker(
    PacienteController_0.createPaciente,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "createPaciente",
      Nil,
      "POST",
      """""",
      this.prefix + """paciente"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_PacienteController_updatePaciente11_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente11_invoker = createInvoker(
    PacienteController_0.updatePaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "updatePaciente",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_CitaController_getCitas12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("citas")))
  )
  private[this] lazy val controllers_CitaController_getCitas12_invoker = createInvoker(
    CitaController_4.getCitas,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "getCitas",
      Nil,
      "GET",
      """Controlador de citas""",
      this.prefix + """citas"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_CitaController_getCita13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CitaController_getCita13_invoker = createInvoker(
    CitaController_4.getCita(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "getCita",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """cita/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_CitaController_createCita14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita")))
  )
  private[this] lazy val controllers_CitaController_createCita14_invoker = createInvoker(
    CitaController_4.createCita,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "createCita",
      Nil,
      "POST",
      """""",
      this.prefix + """cita"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_CitaController_updateCita15_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CitaController_updateCita15_invoker = createInvoker(
    CitaController_4.updateCita(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "updateCita",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """cita/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_CitaController_createCitaPaciente16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("idP", """[^/]+""",true), StaticPart("&"), DynamicPart("idM", """[^/]+""",true), StaticPart("/cita")))
  )
  private[this] lazy val controllers_CitaController_createCitaPaciente16_invoker = createInvoker(
    CitaController_4.createCitaPaciente(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "createCitaPaciente",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """paciente/""" + "$" + """idP<[^/]+>&""" + "$" + """idM<[^/]+>/cita"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_PacienteController_updatePaciente17_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente17_invoker = createInvoker(
    PacienteController_0.updatePaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "updatePaciente",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_PacienteController_updatePaciente18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/citas")))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente18_invoker = createInvoker(
    PacienteController_0.updatePaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "updatePaciente",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/citas"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:16
    case controllers_HomeController_index20_route(params) =>
      call { 
        controllers_HomeController_index20_invoker.call(HomeController_2.index2)
      }
  
    // @LINE:18
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:20
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:23
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_5.versioned(path, file))
      }
  
    // @LINE:28
    case controllers_MedicoController_getMedicos4_route(params) =>
      call { 
        controllers_MedicoController_getMedicos4_invoker.call(MedicoController_6.getMedicos)
      }
  
    // @LINE:29
    case controllers_MedicoController_getMedico5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_getMedico5_invoker.call(MedicoController_6.getMedico(id))
      }
  
    // @LINE:30
    case controllers_MedicoController_createMedico6_route(params) =>
      call { 
        controllers_MedicoController_createMedico6_invoker.call(MedicoController_6.createMedico)
      }
  
    // @LINE:31
    case controllers_MedicoController_updateMedico7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_updateMedico7_invoker.call(MedicoController_6.updateMedico(id))
      }
  
    // @LINE:34
    case controllers_PacienteController_getPacientes8_route(params) =>
      call { 
        controllers_PacienteController_getPacientes8_invoker.call(PacienteController_0.getPacientes)
      }
  
    // @LINE:35
    case controllers_PacienteController_getPaciente9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_getPaciente9_invoker.call(PacienteController_0.getPaciente(id))
      }
  
    // @LINE:36
    case controllers_PacienteController_createPaciente10_route(params) =>
      call { 
        controllers_PacienteController_createPaciente10_invoker.call(PacienteController_0.createPaciente)
      }
  
    // @LINE:37
    case controllers_PacienteController_updatePaciente11_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente11_invoker.call(PacienteController_0.updatePaciente(id))
      }
  
    // @LINE:41
    case controllers_CitaController_getCitas12_route(params) =>
      call { 
        controllers_CitaController_getCitas12_invoker.call(CitaController_4.getCitas)
      }
  
    // @LINE:42
    case controllers_CitaController_getCita13_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getCita13_invoker.call(CitaController_4.getCita(id))
      }
  
    // @LINE:43
    case controllers_CitaController_createCita14_route(params) =>
      call { 
        controllers_CitaController_createCita14_invoker.call(CitaController_4.createCita)
      }
  
    // @LINE:44
    case controllers_CitaController_updateCita15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_updateCita15_invoker.call(CitaController_4.updateCita(id))
      }
  
    // @LINE:46
    case controllers_CitaController_createCitaPaciente16_route(params) =>
      call(params.fromPath[Long]("idP", None), params.fromPath[Long]("idM", None)) { (idP, idM) =>
        controllers_CitaController_createCitaPaciente16_invoker.call(CitaController_4.createCitaPaciente(idP, idM))
      }
  
    // @LINE:47
    case controllers_PacienteController_updatePaciente17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente17_invoker.call(PacienteController_0.updatePaciente(id))
      }
  
    // @LINE:48
    case controllers_PacienteController_updatePaciente18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente18_invoker.call(PacienteController_0.updatePaciente(id))
      }
  }
}
