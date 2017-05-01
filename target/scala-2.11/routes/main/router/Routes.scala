
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Camilo/Documents/GitHub/MedicAndes/conf/routes
// @DATE:Sun Apr 30 19:12:19 COT 2017

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
  HomeController_4: controllers.HomeController,
  // @LINE:22
  PacienteController_2: controllers.PacienteController,
  // @LINE:24
  CountController_3: controllers.CountController,
  // @LINE:26
  AsyncController_5: controllers.AsyncController,
  // @LINE:29
  Assets_12: controllers.Assets,
  // @LINE:32
  MobileController_8: controllers.MobileController,
  // @LINE:38
  MedicoController_13: controllers.MedicoController,
  // @LINE:46
  CitaController_10: controllers.CitaController,
  // @LINE:51
  ConsejoController_0: controllers.ConsejoController,
  // @LINE:68
  LecturaController_11: controllers.LecturaController,
  // @LINE:70
  EmergenciaController_6: controllers.EmergenciaController,
  // @LINE:72
  MarcapasosController_7: controllers.MarcapasosController,
  // @LINE:74
  HistorialController_1: controllers.HistorialController,
  // @LINE:79
  UserController_9: controllers.UserController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:16
    HomeController_4: controllers.HomeController,
    // @LINE:22
    PacienteController_2: controllers.PacienteController,
    // @LINE:24
    CountController_3: controllers.CountController,
    // @LINE:26
    AsyncController_5: controllers.AsyncController,
    // @LINE:29
    Assets_12: controllers.Assets,
    // @LINE:32
    MobileController_8: controllers.MobileController,
    // @LINE:38
    MedicoController_13: controllers.MedicoController,
    // @LINE:46
    CitaController_10: controllers.CitaController,
    // @LINE:51
    ConsejoController_0: controllers.ConsejoController,
    // @LINE:68
    LecturaController_11: controllers.LecturaController,
    // @LINE:70
    EmergenciaController_6: controllers.EmergenciaController,
    // @LINE:72
    MarcapasosController_7: controllers.MarcapasosController,
    // @LINE:74
    HistorialController_1: controllers.HistorialController,
    // @LINE:79
    UserController_9: controllers.UserController
  ) = this(errorHandler, HomeController_4, PacienteController_2, CountController_3, AsyncController_5, Assets_12, MobileController_8, MedicoController_13, CitaController_10, ConsejoController_0, LecturaController_11, EmergenciaController_6, MarcapasosController_7, HistorialController_1, UserController_9, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, PacienteController_2, CountController_3, AsyncController_5, Assets_12, MobileController_8, MedicoController_13, CitaController_10, ConsejoController_0, LecturaController_11, EmergenciaController_6, MarcapasosController_7, HistorialController_1, UserController_9, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """app/home""", """controllers.HomeController.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """app/pacientes""", """controllers.HomeController.pacientes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """app/historial/""" + "$" + """id<[^/]+>""", """controllers.HomeController.historial(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """app/marcapasos/""" + "$" + """id<[^/]+>""", """controllers.HomeController.marcapasos(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """app/mensajes/""" + "$" + """id<[^/]+>""", """controllers.HomeController.mensajes(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mensajes/""" + "$" + """idM<[^/]+>&""" + "$" + """idP<[^/]+>""", """controllers.PacienteController.enviarMensajePaciente(idM:Long, idP:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobile/pacientes""", """controllers.MobileController.mobilePacientes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mobile/citas""", """controllers.MobileController.mobileCitas"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medicos""", """controllers.MedicoController.getMedicos"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico/""" + "$" + """id<[^/]+>""", """controllers.MedicoController.getMedico(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico""", """controllers.MedicoController.createMedico"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """medico/""" + "$" + """id<[^/]+>""", """controllers.MedicoController.updateMedico(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pacientes/tk=""" + "$" + """tk<[^/]+>""", """controllers.PacienteController.getPacientes(tk:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/tk=""" + "$" + """tk<[^/]+>""", """controllers.PacienteController.getPaciente(id:Long, tk:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/historialRangoFechas/""" + "$" + """inicio<[^/]+>&""" + "$" + """fin<[^/]+>""", """controllers.CitaController.getLecturasRango(id:Long, inicio:String, fin:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente""", """controllers.PacienteController.createPaciente"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.updatePaciente(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.deletePaciente(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pacientes""", """controllers.PacienteController.getPacientes2"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consejos/""", """controllers.ConsejoController.getConsejos"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consejos/crear""", """controllers.ConsejoController.createConsejo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """citas""", """controllers.CitaController.getCitas"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cita""", """controllers.CitaController.getCita(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/citas""", """controllers.CitaController.getCitasPaciente(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/historial""", """controllers.CitaController.getHistorialPaciente(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/examenes""", """controllers.CitaController.getExamenesPaciente(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/lecturas""", """controllers.CitaController.getLecturasPaciente(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/emergencias""", """controllers.CitaController.getEmergenciasPaciente(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/consejos""", """controllers.CitaController.getConsejosPaciente(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/marcapasos""", """controllers.CitaController.getMarcapasosPaciente(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cita""", """controllers.CitaController.createCita"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cita/""" + "$" + """id<[^/]+>""", """controllers.CitaController.updateCita(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cita/""" + "$" + """idP<[^/]+>&""" + "$" + """idM<[^/]+>""", """controllers.CitaController.createCitaPaciente(idP:Long, idM:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lectura/""" + "$" + """idP<[^/]+>""", """controllers.LecturaController.createLecturaCifrada(idP:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lecturaPruebas/""" + "$" + """idP<[^/]+>""", """controllers.LecturaController.createLecturaPaciente(idP:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emergencia/""" + "$" + """idP<[^/]+>""", """controllers.EmergenciaController.createEmergenciaPaciente(idP:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consejo/""" + "$" + """idP<[^/]+>&""" + "$" + """idM<[^/]+>""", """controllers.ConsejoController.createConsejoPaciente(idP:Long, idM:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """marcapasos/""" + "$" + """idP<[^/]+>""", """controllers.MarcapasosController.createMarcapasosPaciente(idP:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.updatePaciente(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """historial/""" + "$" + """id<[^/]+>""", """controllers.HistorialController.updateHistorial(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """marcapasos/""" + "$" + """idP<[^/]+>&""" + "$" + """idM<[^/]+>/tk=""" + "$" + """tk<[^/]+>""", """controllers.MarcapasosController.updateMarcapasos(idP:Long, idM:Long, tk:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/citas""", """controllers.PacienteController.updatePaciente(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """marcapasos2/""" + "$" + """idP<[^/]+>""", """controllers.MarcapasosController.updateMarcapasos2(idP:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/""", """controllers.UserController.login()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:16
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_4.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
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

  // @LINE:17
  private[this] lazy val controllers_HomeController_home1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("app/home")))
  )
  private[this] lazy val controllers_HomeController_home1_invoker = createInvoker(
    HomeController_4.home,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "home",
      Nil,
      "GET",
      """""",
      this.prefix + """app/home"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_pacientes2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("app/pacientes")))
  )
  private[this] lazy val controllers_HomeController_pacientes2_invoker = createInvoker(
    HomeController_4.pacientes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "pacientes",
      Nil,
      "GET",
      """""",
      this.prefix + """app/pacientes"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_historial3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("app/historial/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_historial3_invoker = createInvoker(
    HomeController_4.historial(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "historial",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """app/historial/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_marcapasos4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("app/marcapasos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_marcapasos4_invoker = createInvoker(
    HomeController_4.marcapasos(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "marcapasos",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """app/marcapasos/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_mensajes5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("app/mensajes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_mensajes5_invoker = createInvoker(
    HomeController_4.mensajes(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "mensajes",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """app/mensajes/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_PacienteController_enviarMensajePaciente6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mensajes/"), DynamicPart("idM", """[^/]+""",true), StaticPart("&"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_enviarMensajePaciente6_invoker = createInvoker(
    PacienteController_2.enviarMensajePaciente(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "enviarMensajePaciente",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """mensajes/""" + "$" + """idM<[^/]+>&""" + "$" + """idP<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_CountController_count7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count7_invoker = createInvoker(
    CountController_3.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injectioni""",
      this.prefix + """count"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_AsyncController_message8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message8_invoker = createInvoker(
    AsyncController_5.message,
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

  // @LINE:29
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_12.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:32
  private[this] lazy val controllers_MobileController_mobilePacientes10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobile/pacientes")))
  )
  private[this] lazy val controllers_MobileController_mobilePacientes10_invoker = createInvoker(
    MobileController_8.mobilePacientes,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MobileController",
      "mobilePacientes",
      Nil,
      "GET",
      """Mobile""",
      this.prefix + """mobile/pacientes"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_MobileController_mobileCitas11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobile/citas")))
  )
  private[this] lazy val controllers_MobileController_mobileCitas11_invoker = createInvoker(
    MobileController_8.mobileCitas,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MobileController",
      "mobileCitas",
      Nil,
      "GET",
      """""",
      this.prefix + """mobile/citas"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_MedicoController_getMedicos12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicos")))
  )
  private[this] lazy val controllers_MedicoController_getMedicos12_invoker = createInvoker(
    MedicoController_13.getMedicos,
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

  // @LINE:39
  private[this] lazy val controllers_MedicoController_getMedico13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_getMedico13_invoker = createInvoker(
    MedicoController_13.getMedico(fakeValue[Long]),
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

  // @LINE:40
  private[this] lazy val controllers_MedicoController_createMedico14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico")))
  )
  private[this] lazy val controllers_MedicoController_createMedico14_invoker = createInvoker(
    MedicoController_13.createMedico,
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

  // @LINE:41
  private[this] lazy val controllers_MedicoController_updateMedico15_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_updateMedico15_invoker = createInvoker(
    MedicoController_13.updateMedico(fakeValue[Long]),
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

  // @LINE:44
  private[this] lazy val controllers_PacienteController_getPacientes16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pacientes/tk="), DynamicPart("tk", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_getPacientes16_invoker = createInvoker(
    PacienteController_2.getPacientes(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "getPacientes",
      Seq(classOf[String]),
      "GET",
      """Controlador de paciente""",
      this.prefix + """pacientes/tk=""" + "$" + """tk<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_PacienteController_getPaciente17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tk="), DynamicPart("tk", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_getPaciente17_invoker = createInvoker(
    PacienteController_2.getPaciente(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "getPaciente",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/tk=""" + "$" + """tk<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_CitaController_getLecturasRango18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/historialRangoFechas/"), DynamicPart("inicio", """[^/]+""",true), StaticPart("&"), DynamicPart("fin", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CitaController_getLecturasRango18_invoker = createInvoker(
    CitaController_10.getLecturasRango(fakeValue[Long], fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "getLecturasRango",
      Seq(classOf[Long], classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/historialRangoFechas/""" + "$" + """inicio<[^/]+>&""" + "$" + """fin<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_PacienteController_createPaciente19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente")))
  )
  private[this] lazy val controllers_PacienteController_createPaciente19_invoker = createInvoker(
    PacienteController_2.createPaciente,
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

  // @LINE:48
  private[this] lazy val controllers_PacienteController_updatePaciente20_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente20_invoker = createInvoker(
    PacienteController_2.updatePaciente(fakeValue[Long]),
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

  // @LINE:49
  private[this] lazy val controllers_PacienteController_deletePaciente21_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_deletePaciente21_invoker = createInvoker(
    PacienteController_2.deletePaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "deletePaciente",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_PacienteController_getPacientes222_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pacientes")))
  )
  private[this] lazy val controllers_PacienteController_getPacientes222_invoker = createInvoker(
    PacienteController_2.getPacientes2,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacienteController",
      "getPacientes2",
      Nil,
      "GET",
      """""",
      this.prefix + """pacientes"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_ConsejoController_getConsejos23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejos/")))
  )
  private[this] lazy val controllers_ConsejoController_getConsejos23_invoker = createInvoker(
    ConsejoController_0.getConsejos,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConsejoController",
      "getConsejos",
      Nil,
      "GET",
      """""",
      this.prefix + """consejos/"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_ConsejoController_createConsejo24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejos/crear")))
  )
  private[this] lazy val controllers_ConsejoController_createConsejo24_invoker = createInvoker(
    ConsejoController_0.createConsejo,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConsejoController",
      "createConsejo",
      Nil,
      "POST",
      """""",
      this.prefix + """consejos/crear"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_CitaController_getCitas25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("citas")))
  )
  private[this] lazy val controllers_CitaController_getCitas25_invoker = createInvoker(
    CitaController_10.getCitas,
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

  // @LINE:55
  private[this] lazy val controllers_CitaController_getCita26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita")))
  )
  private[this] lazy val controllers_CitaController_getCita26_invoker = createInvoker(
    CitaController_10.getCita(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "getCita",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """cita"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_CitaController_getCitasPaciente27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/citas")))
  )
  private[this] lazy val controllers_CitaController_getCitasPaciente27_invoker = createInvoker(
    CitaController_10.getCitasPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "getCitasPaciente",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/citas"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_CitaController_getHistorialPaciente28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/historial")))
  )
  private[this] lazy val controllers_CitaController_getHistorialPaciente28_invoker = createInvoker(
    CitaController_10.getHistorialPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "getHistorialPaciente",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/historial"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_CitaController_getExamenesPaciente29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/examenes")))
  )
  private[this] lazy val controllers_CitaController_getExamenesPaciente29_invoker = createInvoker(
    CitaController_10.getExamenesPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "getExamenesPaciente",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/examenes"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_CitaController_getLecturasPaciente30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/lecturas")))
  )
  private[this] lazy val controllers_CitaController_getLecturasPaciente30_invoker = createInvoker(
    CitaController_10.getLecturasPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "getLecturasPaciente",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/lecturas"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_CitaController_getEmergenciasPaciente31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/emergencias")))
  )
  private[this] lazy val controllers_CitaController_getEmergenciasPaciente31_invoker = createInvoker(
    CitaController_10.getEmergenciasPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "getEmergenciasPaciente",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/emergencias"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_CitaController_getConsejosPaciente32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/consejos")))
  )
  private[this] lazy val controllers_CitaController_getConsejosPaciente32_invoker = createInvoker(
    CitaController_10.getConsejosPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "getConsejosPaciente",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/consejos"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_CitaController_getMarcapasosPaciente33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/marcapasos")))
  )
  private[this] lazy val controllers_CitaController_getMarcapasosPaciente33_invoker = createInvoker(
    CitaController_10.getMarcapasosPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "getMarcapasosPaciente",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """paciente/""" + "$" + """id<[^/]+>/marcapasos"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_CitaController_createCita34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita")))
  )
  private[this] lazy val controllers_CitaController_createCita34_invoker = createInvoker(
    CitaController_10.createCita,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "createCita",
      Nil,
      "POST",
      """GET     /pacientes/:id/cita/:idCita    controllers.PacienteController.getPacientes""",
      this.prefix + """cita"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_CitaController_updateCita35_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CitaController_updateCita35_invoker = createInvoker(
    CitaController_10.updateCita(fakeValue[Long]),
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

  // @LINE:67
  private[this] lazy val controllers_CitaController_createCitaPaciente36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita/"), DynamicPart("idP", """[^/]+""",true), StaticPart("&"), DynamicPart("idM", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CitaController_createCitaPaciente36_invoker = createInvoker(
    CitaController_10.createCitaPaciente(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "createCitaPaciente",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """cita/""" + "$" + """idP<[^/]+>&""" + "$" + """idM<[^/]+>"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_LecturaController_createLecturaCifrada37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lectura/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LecturaController_createLecturaCifrada37_invoker = createInvoker(
    LecturaController_11.createLecturaCifrada(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LecturaController",
      "createLecturaCifrada",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """lectura/""" + "$" + """idP<[^/]+>"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_LecturaController_createLecturaPaciente38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lecturaPruebas/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LecturaController_createLecturaPaciente38_invoker = createInvoker(
    LecturaController_11.createLecturaPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LecturaController",
      "createLecturaPaciente",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """lecturaPruebas/""" + "$" + """idP<[^/]+>"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_EmergenciaController_createEmergenciaPaciente39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emergencia/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmergenciaController_createEmergenciaPaciente39_invoker = createInvoker(
    EmergenciaController_6.createEmergenciaPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EmergenciaController",
      "createEmergenciaPaciente",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """emergencia/""" + "$" + """idP<[^/]+>"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_ConsejoController_createConsejoPaciente40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejo/"), DynamicPart("idP", """[^/]+""",true), StaticPart("&"), DynamicPart("idM", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConsejoController_createConsejoPaciente40_invoker = createInvoker(
    ConsejoController_0.createConsejoPaciente(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ConsejoController",
      "createConsejoPaciente",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """consejo/""" + "$" + """idP<[^/]+>&""" + "$" + """idM<[^/]+>"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_MarcapasosController_createMarcapasosPaciente41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marcapasos/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarcapasosController_createMarcapasosPaciente41_invoker = createInvoker(
    MarcapasosController_7.createMarcapasosPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarcapasosController",
      "createMarcapasosPaciente",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """marcapasos/""" + "$" + """idP<[^/]+>"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_PacienteController_updatePaciente42_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente42_invoker = createInvoker(
    PacienteController_2.updatePaciente(fakeValue[Long]),
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

  // @LINE:74
  private[this] lazy val controllers_HistorialController_updateHistorial43_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("historial/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HistorialController_updateHistorial43_invoker = createInvoker(
    HistorialController_1.updateHistorial(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HistorialController",
      "updateHistorial",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """historial/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_MarcapasosController_updateMarcapasos44_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marcapasos/"), DynamicPart("idP", """[^/]+""",true), StaticPart("&"), DynamicPart("idM", """[^/]+""",true), StaticPart("/tk="), DynamicPart("tk", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarcapasosController_updateMarcapasos44_invoker = createInvoker(
    MarcapasosController_7.updateMarcapasos(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarcapasosController",
      "updateMarcapasos",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "PUT",
      """""",
      this.prefix + """marcapasos/""" + "$" + """idP<[^/]+>&""" + "$" + """idM<[^/]+>/tk=""" + "$" + """tk<[^/]+>"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_PacienteController_updatePaciente45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/citas")))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente45_invoker = createInvoker(
    PacienteController_2.updatePaciente(fakeValue[Long]),
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

  // @LINE:77
  private[this] lazy val controllers_MarcapasosController_updateMarcapasos246_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marcapasos2/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarcapasosController_updateMarcapasos246_invoker = createInvoker(
    MarcapasosController_7.updateMarcapasos2(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarcapasosController",
      "updateMarcapasos2",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """marcapasos2/""" + "$" + """idP<[^/]+>"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_UserController_login47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/")))
  )
  private[this] lazy val controllers_UserController_login47_invoker = createInvoker(
    UserController_9.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login/"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:16
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_4.index)
      }
  
    // @LINE:17
    case controllers_HomeController_home1_route(params) =>
      call { 
        controllers_HomeController_home1_invoker.call(HomeController_4.home)
      }
  
    // @LINE:18
    case controllers_HomeController_pacientes2_route(params) =>
      call { 
        controllers_HomeController_pacientes2_invoker.call(HomeController_4.pacientes)
      }
  
    // @LINE:19
    case controllers_HomeController_historial3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_historial3_invoker.call(HomeController_4.historial(id))
      }
  
    // @LINE:20
    case controllers_HomeController_marcapasos4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_marcapasos4_invoker.call(HomeController_4.marcapasos(id))
      }
  
    // @LINE:21
    case controllers_HomeController_mensajes5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_mensajes5_invoker.call(HomeController_4.mensajes(id))
      }
  
    // @LINE:22
    case controllers_PacienteController_enviarMensajePaciente6_route(params) =>
      call(params.fromPath[Long]("idM", None), params.fromPath[Long]("idP", None)) { (idM, idP) =>
        controllers_PacienteController_enviarMensajePaciente6_invoker.call(PacienteController_2.enviarMensajePaciente(idM, idP))
      }
  
    // @LINE:24
    case controllers_CountController_count7_route(params) =>
      call { 
        controllers_CountController_count7_invoker.call(CountController_3.count)
      }
  
    // @LINE:26
    case controllers_AsyncController_message8_route(params) =>
      call { 
        controllers_AsyncController_message8_invoker.call(AsyncController_5.message)
      }
  
    // @LINE:29
    case controllers_Assets_versioned9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_12.versioned(path, file))
      }
  
    // @LINE:32
    case controllers_MobileController_mobilePacientes10_route(params) =>
      call { 
        controllers_MobileController_mobilePacientes10_invoker.call(MobileController_8.mobilePacientes)
      }
  
    // @LINE:33
    case controllers_MobileController_mobileCitas11_route(params) =>
      call { 
        controllers_MobileController_mobileCitas11_invoker.call(MobileController_8.mobileCitas)
      }
  
    // @LINE:38
    case controllers_MedicoController_getMedicos12_route(params) =>
      call { 
        controllers_MedicoController_getMedicos12_invoker.call(MedicoController_13.getMedicos)
      }
  
    // @LINE:39
    case controllers_MedicoController_getMedico13_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_getMedico13_invoker.call(MedicoController_13.getMedico(id))
      }
  
    // @LINE:40
    case controllers_MedicoController_createMedico14_route(params) =>
      call { 
        controllers_MedicoController_createMedico14_invoker.call(MedicoController_13.createMedico)
      }
  
    // @LINE:41
    case controllers_MedicoController_updateMedico15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_updateMedico15_invoker.call(MedicoController_13.updateMedico(id))
      }
  
    // @LINE:44
    case controllers_PacienteController_getPacientes16_route(params) =>
      call(params.fromPath[String]("tk", None)) { (tk) =>
        controllers_PacienteController_getPacientes16_invoker.call(PacienteController_2.getPacientes(tk))
      }
  
    // @LINE:45
    case controllers_PacienteController_getPaciente17_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("tk", None)) { (id, tk) =>
        controllers_PacienteController_getPaciente17_invoker.call(PacienteController_2.getPaciente(id, tk))
      }
  
    // @LINE:46
    case controllers_CitaController_getLecturasRango18_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("inicio", None), params.fromPath[String]("fin", None)) { (id, inicio, fin) =>
        controllers_CitaController_getLecturasRango18_invoker.call(CitaController_10.getLecturasRango(id, inicio, fin))
      }
  
    // @LINE:47
    case controllers_PacienteController_createPaciente19_route(params) =>
      call { 
        controllers_PacienteController_createPaciente19_invoker.call(PacienteController_2.createPaciente)
      }
  
    // @LINE:48
    case controllers_PacienteController_updatePaciente20_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente20_invoker.call(PacienteController_2.updatePaciente(id))
      }
  
    // @LINE:49
    case controllers_PacienteController_deletePaciente21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_deletePaciente21_invoker.call(PacienteController_2.deletePaciente(id))
      }
  
    // @LINE:50
    case controllers_PacienteController_getPacientes222_route(params) =>
      call { 
        controllers_PacienteController_getPacientes222_invoker.call(PacienteController_2.getPacientes2)
      }
  
    // @LINE:51
    case controllers_ConsejoController_getConsejos23_route(params) =>
      call { 
        controllers_ConsejoController_getConsejos23_invoker.call(ConsejoController_0.getConsejos)
      }
  
    // @LINE:52
    case controllers_ConsejoController_createConsejo24_route(params) =>
      call { 
        controllers_ConsejoController_createConsejo24_invoker.call(ConsejoController_0.createConsejo)
      }
  
    // @LINE:54
    case controllers_CitaController_getCitas25_route(params) =>
      call { 
        controllers_CitaController_getCitas25_invoker.call(CitaController_10.getCitas)
      }
  
    // @LINE:55
    case controllers_CitaController_getCita26_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CitaController_getCita26_invoker.call(CitaController_10.getCita(id))
      }
  
    // @LINE:56
    case controllers_CitaController_getCitasPaciente27_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getCitasPaciente27_invoker.call(CitaController_10.getCitasPaciente(id))
      }
  
    // @LINE:57
    case controllers_CitaController_getHistorialPaciente28_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getHistorialPaciente28_invoker.call(CitaController_10.getHistorialPaciente(id))
      }
  
    // @LINE:58
    case controllers_CitaController_getExamenesPaciente29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getExamenesPaciente29_invoker.call(CitaController_10.getExamenesPaciente(id))
      }
  
    // @LINE:59
    case controllers_CitaController_getLecturasPaciente30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getLecturasPaciente30_invoker.call(CitaController_10.getLecturasPaciente(id))
      }
  
    // @LINE:60
    case controllers_CitaController_getEmergenciasPaciente31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getEmergenciasPaciente31_invoker.call(CitaController_10.getEmergenciasPaciente(id))
      }
  
    // @LINE:61
    case controllers_CitaController_getConsejosPaciente32_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getConsejosPaciente32_invoker.call(CitaController_10.getConsejosPaciente(id))
      }
  
    // @LINE:62
    case controllers_CitaController_getMarcapasosPaciente33_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getMarcapasosPaciente33_invoker.call(CitaController_10.getMarcapasosPaciente(id))
      }
  
    // @LINE:64
    case controllers_CitaController_createCita34_route(params) =>
      call { 
        controllers_CitaController_createCita34_invoker.call(CitaController_10.createCita)
      }
  
    // @LINE:65
    case controllers_CitaController_updateCita35_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_updateCita35_invoker.call(CitaController_10.updateCita(id))
      }
  
    // @LINE:67
    case controllers_CitaController_createCitaPaciente36_route(params) =>
      call(params.fromPath[Long]("idP", None), params.fromPath[Long]("idM", None)) { (idP, idM) =>
        controllers_CitaController_createCitaPaciente36_invoker.call(CitaController_10.createCitaPaciente(idP, idM))
      }
  
    // @LINE:68
    case controllers_LecturaController_createLecturaCifrada37_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_LecturaController_createLecturaCifrada37_invoker.call(LecturaController_11.createLecturaCifrada(idP))
      }
  
    // @LINE:69
    case controllers_LecturaController_createLecturaPaciente38_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_LecturaController_createLecturaPaciente38_invoker.call(LecturaController_11.createLecturaPaciente(idP))
      }
  
    // @LINE:70
    case controllers_EmergenciaController_createEmergenciaPaciente39_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_EmergenciaController_createEmergenciaPaciente39_invoker.call(EmergenciaController_6.createEmergenciaPaciente(idP))
      }
  
    // @LINE:71
    case controllers_ConsejoController_createConsejoPaciente40_route(params) =>
      call(params.fromPath[Long]("idP", None), params.fromPath[Long]("idM", None)) { (idP, idM) =>
        controllers_ConsejoController_createConsejoPaciente40_invoker.call(ConsejoController_0.createConsejoPaciente(idP, idM))
      }
  
    // @LINE:72
    case controllers_MarcapasosController_createMarcapasosPaciente41_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_MarcapasosController_createMarcapasosPaciente41_invoker.call(MarcapasosController_7.createMarcapasosPaciente(idP))
      }
  
    // @LINE:73
    case controllers_PacienteController_updatePaciente42_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente42_invoker.call(PacienteController_2.updatePaciente(id))
      }
  
    // @LINE:74
    case controllers_HistorialController_updateHistorial43_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HistorialController_updateHistorial43_invoker.call(HistorialController_1.updateHistorial(id))
      }
  
    // @LINE:75
    case controllers_MarcapasosController_updateMarcapasos44_route(params) =>
      call(params.fromPath[Long]("idP", None), params.fromPath[Long]("idM", None), params.fromPath[String]("tk", None)) { (idP, idM, tk) =>
        controllers_MarcapasosController_updateMarcapasos44_invoker.call(MarcapasosController_7.updateMarcapasos(idP, idM, tk))
      }
  
    // @LINE:76
    case controllers_PacienteController_updatePaciente45_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente45_invoker.call(PacienteController_2.updatePaciente(id))
      }
  
    // @LINE:77
    case controllers_MarcapasosController_updateMarcapasos246_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_MarcapasosController_updateMarcapasos246_invoker.call(MarcapasosController_7.updateMarcapasos2(idP))
      }
  
    // @LINE:79
    case controllers_UserController_login47_route(params) =>
      call { 
        controllers_UserController_login47_invoker.call(UserController_9.login())
      }
  }
}
