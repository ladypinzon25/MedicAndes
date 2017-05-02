
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Temp/MedicAndes/conf/routes
// @DATE:Mon May 01 15:57:50 COT 2017

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
  // @LINE:20
  CitaController_10: controllers.CitaController,
  // @LINE:24
  PacienteController_2: controllers.PacienteController,
  // @LINE:26
  CountController_3: controllers.CountController,
  // @LINE:28
  AsyncController_5: controllers.AsyncController,
  // @LINE:31
  Assets_12: controllers.Assets,
  // @LINE:34
  MobileController_8: controllers.MobileController,
  // @LINE:40
  MedicoController_13: controllers.MedicoController,
  // @LINE:53
  ConsejoController_0: controllers.ConsejoController,
  // @LINE:70
  LecturaController_11: controllers.LecturaController,
  // @LINE:72
  EmergenciaController_6: controllers.EmergenciaController,
  // @LINE:74
  MarcapasosController_7: controllers.MarcapasosController,
  // @LINE:76
  HistorialController_1: controllers.HistorialController,
  // @LINE:81
  UserController_9: controllers.UserController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:16
    HomeController_4: controllers.HomeController,
    // @LINE:20
    CitaController_10: controllers.CitaController,
    // @LINE:24
    PacienteController_2: controllers.PacienteController,
    // @LINE:26
    CountController_3: controllers.CountController,
    // @LINE:28
    AsyncController_5: controllers.AsyncController,
    // @LINE:31
    Assets_12: controllers.Assets,
    // @LINE:34
    MobileController_8: controllers.MobileController,
    // @LINE:40
    MedicoController_13: controllers.MedicoController,
    // @LINE:53
    ConsejoController_0: controllers.ConsejoController,
    // @LINE:70
    LecturaController_11: controllers.LecturaController,
    // @LINE:72
    EmergenciaController_6: controllers.EmergenciaController,
    // @LINE:74
    MarcapasosController_7: controllers.MarcapasosController,
    // @LINE:76
    HistorialController_1: controllers.HistorialController,
    // @LINE:81
    UserController_9: controllers.UserController
  ) = this(errorHandler, HomeController_4, CitaController_10, PacienteController_2, CountController_3, AsyncController_5, Assets_12, MobileController_8, MedicoController_13, ConsejoController_0, LecturaController_11, EmergenciaController_6, MarcapasosController_7, HistorialController_1, UserController_9, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, CitaController_10, PacienteController_2, CountController_3, AsyncController_5, Assets_12, MobileController_8, MedicoController_13, ConsejoController_0, LecturaController_11, EmergenciaController_6, MarcapasosController_7, HistorialController_1, UserController_9, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """app/home""", """controllers.HomeController.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """app/pacientes""", """controllers.HomeController.pacientes"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """app/citas""", """controllers.HomeController.citas"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """app/agendarCita/""" + "$" + """idPaciente<[^/]+>&""" + "$" + """idMedico<[^/]+>""", """controllers.CitaController.createCita2(idPaciente:Long, idMedico:Long)"""),
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
  private[this] lazy val controllers_HomeController_citas3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("app/citas")))
  )
  private[this] lazy val controllers_HomeController_citas3_invoker = createInvoker(
    HomeController_4.citas,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "citas",
      Nil,
      "GET",
      """""",
      this.prefix + """app/citas"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_CitaController_createCita24_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("app/agendarCita/"), DynamicPart("idPaciente", """[^/]+""",true), StaticPart("&"), DynamicPart("idMedico", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CitaController_createCita24_invoker = createInvoker(
    CitaController_10.createCita2(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CitaController",
      "createCita2",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      """""",
      this.prefix + """app/agendarCita/""" + "$" + """idPaciente<[^/]+>&""" + "$" + """idMedico<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_historial5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("app/historial/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_historial5_invoker = createInvoker(
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

  // @LINE:22
  private[this] lazy val controllers_HomeController_marcapasos6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("app/marcapasos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_marcapasos6_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_HomeController_mensajes7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("app/mensajes/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_mensajes7_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_PacienteController_enviarMensajePaciente8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mensajes/"), DynamicPart("idM", """[^/]+""",true), StaticPart("&"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_enviarMensajePaciente8_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_CountController_count9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count9_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_AsyncController_message10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message10_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_MobileController_mobilePacientes12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobile/pacientes")))
  )
  private[this] lazy val controllers_MobileController_mobilePacientes12_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_MobileController_mobileCitas13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mobile/citas")))
  )
  private[this] lazy val controllers_MobileController_mobileCitas13_invoker = createInvoker(
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

  // @LINE:40
  private[this] lazy val controllers_MedicoController_getMedicos14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medicos")))
  )
  private[this] lazy val controllers_MedicoController_getMedicos14_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_MedicoController_getMedico15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_getMedico15_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_MedicoController_createMedico16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico")))
  )
  private[this] lazy val controllers_MedicoController_createMedico16_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_MedicoController_updateMedico17_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("medico/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MedicoController_updateMedico17_invoker = createInvoker(
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

  // @LINE:46
  private[this] lazy val controllers_PacienteController_getPacientes18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pacientes/tk="), DynamicPart("tk", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_getPacientes18_invoker = createInvoker(
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

  // @LINE:47
  private[this] lazy val controllers_PacienteController_getPaciente19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/tk="), DynamicPart("tk", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_getPaciente19_invoker = createInvoker(
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

  // @LINE:48
  private[this] lazy val controllers_CitaController_getLecturasRango20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/historialRangoFechas/"), DynamicPart("inicio", """[^/]+""",true), StaticPart("&"), DynamicPart("fin", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CitaController_getLecturasRango20_invoker = createInvoker(
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

  // @LINE:49
  private[this] lazy val controllers_PacienteController_createPaciente21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente")))
  )
  private[this] lazy val controllers_PacienteController_createPaciente21_invoker = createInvoker(
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

  // @LINE:50
  private[this] lazy val controllers_PacienteController_updatePaciente22_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente22_invoker = createInvoker(
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

  // @LINE:51
  private[this] lazy val controllers_PacienteController_deletePaciente23_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_deletePaciente23_invoker = createInvoker(
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

  // @LINE:52
  private[this] lazy val controllers_PacienteController_getPacientes224_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pacientes")))
  )
  private[this] lazy val controllers_PacienteController_getPacientes224_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_ConsejoController_getConsejos25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejos/")))
  )
  private[this] lazy val controllers_ConsejoController_getConsejos25_invoker = createInvoker(
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

  // @LINE:54
  private[this] lazy val controllers_ConsejoController_createConsejo26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejos/crear")))
  )
  private[this] lazy val controllers_ConsejoController_createConsejo26_invoker = createInvoker(
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

  // @LINE:56
  private[this] lazy val controllers_CitaController_getCitas27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("citas")))
  )
  private[this] lazy val controllers_CitaController_getCitas27_invoker = createInvoker(
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

  // @LINE:57
  private[this] lazy val controllers_CitaController_getCita28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita")))
  )
  private[this] lazy val controllers_CitaController_getCita28_invoker = createInvoker(
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

  // @LINE:58
  private[this] lazy val controllers_CitaController_getCitasPaciente29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/citas")))
  )
  private[this] lazy val controllers_CitaController_getCitasPaciente29_invoker = createInvoker(
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

  // @LINE:59
  private[this] lazy val controllers_CitaController_getHistorialPaciente30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/historial")))
  )
  private[this] lazy val controllers_CitaController_getHistorialPaciente30_invoker = createInvoker(
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

  // @LINE:60
  private[this] lazy val controllers_CitaController_getExamenesPaciente31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/examenes")))
  )
  private[this] lazy val controllers_CitaController_getExamenesPaciente31_invoker = createInvoker(
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

  // @LINE:61
  private[this] lazy val controllers_CitaController_getLecturasPaciente32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/lecturas")))
  )
  private[this] lazy val controllers_CitaController_getLecturasPaciente32_invoker = createInvoker(
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

  // @LINE:62
  private[this] lazy val controllers_CitaController_getEmergenciasPaciente33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/emergencias")))
  )
  private[this] lazy val controllers_CitaController_getEmergenciasPaciente33_invoker = createInvoker(
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

  // @LINE:63
  private[this] lazy val controllers_CitaController_getConsejosPaciente34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/consejos")))
  )
  private[this] lazy val controllers_CitaController_getConsejosPaciente34_invoker = createInvoker(
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

  // @LINE:64
  private[this] lazy val controllers_CitaController_getMarcapasosPaciente35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/marcapasos")))
  )
  private[this] lazy val controllers_CitaController_getMarcapasosPaciente35_invoker = createInvoker(
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

  // @LINE:66
  private[this] lazy val controllers_CitaController_createCita36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita")))
  )
  private[this] lazy val controllers_CitaController_createCita36_invoker = createInvoker(
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

  // @LINE:67
  private[this] lazy val controllers_CitaController_updateCita37_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CitaController_updateCita37_invoker = createInvoker(
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

  // @LINE:69
  private[this] lazy val controllers_CitaController_createCitaPaciente38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita/"), DynamicPart("idP", """[^/]+""",true), StaticPart("&"), DynamicPart("idM", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CitaController_createCitaPaciente38_invoker = createInvoker(
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

  // @LINE:70
  private[this] lazy val controllers_LecturaController_createLecturaCifrada39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lectura/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LecturaController_createLecturaCifrada39_invoker = createInvoker(
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

  // @LINE:71
  private[this] lazy val controllers_LecturaController_createLecturaPaciente40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lecturaPruebas/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LecturaController_createLecturaPaciente40_invoker = createInvoker(
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

  // @LINE:72
  private[this] lazy val controllers_EmergenciaController_createEmergenciaPaciente41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emergencia/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmergenciaController_createEmergenciaPaciente41_invoker = createInvoker(
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

  // @LINE:73
  private[this] lazy val controllers_ConsejoController_createConsejoPaciente42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejo/"), DynamicPart("idP", """[^/]+""",true), StaticPart("&"), DynamicPart("idM", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConsejoController_createConsejoPaciente42_invoker = createInvoker(
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

  // @LINE:74
  private[this] lazy val controllers_MarcapasosController_createMarcapasosPaciente43_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marcapasos/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarcapasosController_createMarcapasosPaciente43_invoker = createInvoker(
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

  // @LINE:75
  private[this] lazy val controllers_PacienteController_updatePaciente44_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente44_invoker = createInvoker(
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

  // @LINE:76
  private[this] lazy val controllers_HistorialController_updateHistorial45_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("historial/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HistorialController_updateHistorial45_invoker = createInvoker(
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

  // @LINE:77
  private[this] lazy val controllers_MarcapasosController_updateMarcapasos46_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marcapasos/"), DynamicPart("idP", """[^/]+""",true), StaticPart("&"), DynamicPart("idM", """[^/]+""",true), StaticPart("/tk="), DynamicPart("tk", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarcapasosController_updateMarcapasos46_invoker = createInvoker(
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

  // @LINE:78
  private[this] lazy val controllers_PacienteController_updatePaciente47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/citas")))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente47_invoker = createInvoker(
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

  // @LINE:79
  private[this] lazy val controllers_MarcapasosController_updateMarcapasos248_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marcapasos2/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarcapasosController_updateMarcapasos248_invoker = createInvoker(
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

  // @LINE:81
  private[this] lazy val controllers_UserController_login49_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/")))
  )
  private[this] lazy val controllers_UserController_login49_invoker = createInvoker(
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
    case controllers_HomeController_citas3_route(params) =>
      call { 
        controllers_HomeController_citas3_invoker.call(HomeController_4.citas)
      }
  
    // @LINE:20
    case controllers_CitaController_createCita24_route(params) =>
      call(params.fromPath[Long]("idPaciente", None), params.fromPath[Long]("idMedico", None)) { (idPaciente, idMedico) =>
        controllers_CitaController_createCita24_invoker.call(CitaController_10.createCita2(idPaciente, idMedico))
      }
  
    // @LINE:21
    case controllers_HomeController_historial5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_historial5_invoker.call(HomeController_4.historial(id))
      }
  
    // @LINE:22
    case controllers_HomeController_marcapasos6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_marcapasos6_invoker.call(HomeController_4.marcapasos(id))
      }
  
    // @LINE:23
    case controllers_HomeController_mensajes7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_mensajes7_invoker.call(HomeController_4.mensajes(id))
      }
  
    // @LINE:24
    case controllers_PacienteController_enviarMensajePaciente8_route(params) =>
      call(params.fromPath[Long]("idM", None), params.fromPath[Long]("idP", None)) { (idM, idP) =>
        controllers_PacienteController_enviarMensajePaciente8_invoker.call(PacienteController_2.enviarMensajePaciente(idM, idP))
      }
  
    // @LINE:26
    case controllers_CountController_count9_route(params) =>
      call { 
        controllers_CountController_count9_invoker.call(CountController_3.count)
      }
  
    // @LINE:28
    case controllers_AsyncController_message10_route(params) =>
      call { 
        controllers_AsyncController_message10_invoker.call(AsyncController_5.message)
      }
  
    // @LINE:31
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_12.versioned(path, file))
      }
  
    // @LINE:34
    case controllers_MobileController_mobilePacientes12_route(params) =>
      call { 
        controllers_MobileController_mobilePacientes12_invoker.call(MobileController_8.mobilePacientes)
      }
  
    // @LINE:35
    case controllers_MobileController_mobileCitas13_route(params) =>
      call { 
        controllers_MobileController_mobileCitas13_invoker.call(MobileController_8.mobileCitas)
      }
  
    // @LINE:40
    case controllers_MedicoController_getMedicos14_route(params) =>
      call { 
        controllers_MedicoController_getMedicos14_invoker.call(MedicoController_13.getMedicos)
      }
  
    // @LINE:41
    case controllers_MedicoController_getMedico15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_getMedico15_invoker.call(MedicoController_13.getMedico(id))
      }
  
    // @LINE:42
    case controllers_MedicoController_createMedico16_route(params) =>
      call { 
        controllers_MedicoController_createMedico16_invoker.call(MedicoController_13.createMedico)
      }
  
    // @LINE:43
    case controllers_MedicoController_updateMedico17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_updateMedico17_invoker.call(MedicoController_13.updateMedico(id))
      }
  
    // @LINE:46
    case controllers_PacienteController_getPacientes18_route(params) =>
      call(params.fromPath[String]("tk", None)) { (tk) =>
        controllers_PacienteController_getPacientes18_invoker.call(PacienteController_2.getPacientes(tk))
      }
  
    // @LINE:47
    case controllers_PacienteController_getPaciente19_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("tk", None)) { (id, tk) =>
        controllers_PacienteController_getPaciente19_invoker.call(PacienteController_2.getPaciente(id, tk))
      }
  
    // @LINE:48
    case controllers_CitaController_getLecturasRango20_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("inicio", None), params.fromPath[String]("fin", None)) { (id, inicio, fin) =>
        controllers_CitaController_getLecturasRango20_invoker.call(CitaController_10.getLecturasRango(id, inicio, fin))
      }
  
    // @LINE:49
    case controllers_PacienteController_createPaciente21_route(params) =>
      call { 
        controllers_PacienteController_createPaciente21_invoker.call(PacienteController_2.createPaciente)
      }
  
    // @LINE:50
    case controllers_PacienteController_updatePaciente22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente22_invoker.call(PacienteController_2.updatePaciente(id))
      }
  
    // @LINE:51
    case controllers_PacienteController_deletePaciente23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_deletePaciente23_invoker.call(PacienteController_2.deletePaciente(id))
      }
  
    // @LINE:52
    case controllers_PacienteController_getPacientes224_route(params) =>
      call { 
        controllers_PacienteController_getPacientes224_invoker.call(PacienteController_2.getPacientes2)
      }
  
    // @LINE:53
    case controllers_ConsejoController_getConsejos25_route(params) =>
      call { 
        controllers_ConsejoController_getConsejos25_invoker.call(ConsejoController_0.getConsejos)
      }
  
    // @LINE:54
    case controllers_ConsejoController_createConsejo26_route(params) =>
      call { 
        controllers_ConsejoController_createConsejo26_invoker.call(ConsejoController_0.createConsejo)
      }
  
    // @LINE:56
    case controllers_CitaController_getCitas27_route(params) =>
      call { 
        controllers_CitaController_getCitas27_invoker.call(CitaController_10.getCitas)
      }
  
    // @LINE:57
    case controllers_CitaController_getCita28_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CitaController_getCita28_invoker.call(CitaController_10.getCita(id))
      }
  
    // @LINE:58
    case controllers_CitaController_getCitasPaciente29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getCitasPaciente29_invoker.call(CitaController_10.getCitasPaciente(id))
      }
  
    // @LINE:59
    case controllers_CitaController_getHistorialPaciente30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getHistorialPaciente30_invoker.call(CitaController_10.getHistorialPaciente(id))
      }
  
    // @LINE:60
    case controllers_CitaController_getExamenesPaciente31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getExamenesPaciente31_invoker.call(CitaController_10.getExamenesPaciente(id))
      }
  
    // @LINE:61
    case controllers_CitaController_getLecturasPaciente32_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getLecturasPaciente32_invoker.call(CitaController_10.getLecturasPaciente(id))
      }
  
    // @LINE:62
    case controllers_CitaController_getEmergenciasPaciente33_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getEmergenciasPaciente33_invoker.call(CitaController_10.getEmergenciasPaciente(id))
      }
  
    // @LINE:63
    case controllers_CitaController_getConsejosPaciente34_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getConsejosPaciente34_invoker.call(CitaController_10.getConsejosPaciente(id))
      }
  
    // @LINE:64
    case controllers_CitaController_getMarcapasosPaciente35_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getMarcapasosPaciente35_invoker.call(CitaController_10.getMarcapasosPaciente(id))
      }
  
    // @LINE:66
    case controllers_CitaController_createCita36_route(params) =>
      call { 
        controllers_CitaController_createCita36_invoker.call(CitaController_10.createCita)
      }
  
    // @LINE:67
    case controllers_CitaController_updateCita37_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_updateCita37_invoker.call(CitaController_10.updateCita(id))
      }
  
    // @LINE:69
    case controllers_CitaController_createCitaPaciente38_route(params) =>
      call(params.fromPath[Long]("idP", None), params.fromPath[Long]("idM", None)) { (idP, idM) =>
        controllers_CitaController_createCitaPaciente38_invoker.call(CitaController_10.createCitaPaciente(idP, idM))
      }
  
    // @LINE:70
    case controllers_LecturaController_createLecturaCifrada39_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_LecturaController_createLecturaCifrada39_invoker.call(LecturaController_11.createLecturaCifrada(idP))
      }
  
    // @LINE:71
    case controllers_LecturaController_createLecturaPaciente40_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_LecturaController_createLecturaPaciente40_invoker.call(LecturaController_11.createLecturaPaciente(idP))
      }
  
    // @LINE:72
    case controllers_EmergenciaController_createEmergenciaPaciente41_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_EmergenciaController_createEmergenciaPaciente41_invoker.call(EmergenciaController_6.createEmergenciaPaciente(idP))
      }
  
    // @LINE:73
    case controllers_ConsejoController_createConsejoPaciente42_route(params) =>
      call(params.fromPath[Long]("idP", None), params.fromPath[Long]("idM", None)) { (idP, idM) =>
        controllers_ConsejoController_createConsejoPaciente42_invoker.call(ConsejoController_0.createConsejoPaciente(idP, idM))
      }
  
    // @LINE:74
    case controllers_MarcapasosController_createMarcapasosPaciente43_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_MarcapasosController_createMarcapasosPaciente43_invoker.call(MarcapasosController_7.createMarcapasosPaciente(idP))
      }
  
    // @LINE:75
    case controllers_PacienteController_updatePaciente44_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente44_invoker.call(PacienteController_2.updatePaciente(id))
      }
  
    // @LINE:76
    case controllers_HistorialController_updateHistorial45_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HistorialController_updateHistorial45_invoker.call(HistorialController_1.updateHistorial(id))
      }
  
    // @LINE:77
    case controllers_MarcapasosController_updateMarcapasos46_route(params) =>
      call(params.fromPath[Long]("idP", None), params.fromPath[Long]("idM", None), params.fromPath[String]("tk", None)) { (idP, idM, tk) =>
        controllers_MarcapasosController_updateMarcapasos46_invoker.call(MarcapasosController_7.updateMarcapasos(idP, idM, tk))
      }
  
    // @LINE:78
    case controllers_PacienteController_updatePaciente47_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente47_invoker.call(PacienteController_2.updatePaciente(id))
      }
  
    // @LINE:79
    case controllers_MarcapasosController_updateMarcapasos248_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_MarcapasosController_updateMarcapasos248_invoker.call(MarcapasosController_7.updateMarcapasos2(idP))
      }
  
    // @LINE:81
    case controllers_UserController_login49_route(params) =>
      call { 
        controllers_UserController_login49_invoker.call(UserController_9.login())
      }
  }
}
