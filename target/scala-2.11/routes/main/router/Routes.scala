
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Temp/MedicAndes/conf/routes
// @DATE:Mon Feb 13 19:33:36 COT 2017

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
  // @LINE:18
  CountController_3: controllers.CountController,
  // @LINE:20
  AsyncController_5: controllers.AsyncController,
  // @LINE:23
  Assets_10: controllers.Assets,
  // @LINE:28
  MedicoController_11: controllers.MedicoController,
  // @LINE:34
  PacienteController_2: controllers.PacienteController,
  // @LINE:36
  CitaController_8: controllers.CitaController,
  // @LINE:57
  LecturaController_9: controllers.LecturaController,
  // @LINE:58
  EmergenciaController_6: controllers.EmergenciaController,
  // @LINE:59
  ConsejoController_0: controllers.ConsejoController,
  // @LINE:60
  MarcapasosController_7: controllers.MarcapasosController,
  // @LINE:62
  HistorialController_1: controllers.HistorialController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:16
    HomeController_4: controllers.HomeController,
    // @LINE:18
    CountController_3: controllers.CountController,
    // @LINE:20
    AsyncController_5: controllers.AsyncController,
    // @LINE:23
    Assets_10: controllers.Assets,
    // @LINE:28
    MedicoController_11: controllers.MedicoController,
    // @LINE:34
    PacienteController_2: controllers.PacienteController,
    // @LINE:36
    CitaController_8: controllers.CitaController,
    // @LINE:57
    LecturaController_9: controllers.LecturaController,
    // @LINE:58
    EmergenciaController_6: controllers.EmergenciaController,
    // @LINE:59
    ConsejoController_0: controllers.ConsejoController,
    // @LINE:60
    MarcapasosController_7: controllers.MarcapasosController,
    // @LINE:62
    HistorialController_1: controllers.HistorialController
  ) = this(errorHandler, HomeController_4, CountController_3, AsyncController_5, Assets_10, MedicoController_11, PacienteController_2, CitaController_8, LecturaController_9, EmergenciaController_6, ConsejoController_0, MarcapasosController_7, HistorialController_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, CountController_3, AsyncController_5, Assets_10, MedicoController_11, PacienteController_2, CitaController_8, LecturaController_9, EmergenciaController_6, ConsejoController_0, MarcapasosController_7, HistorialController_1, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>/historialRangoFechas/""" + "$" + """inicio<[^/]+>&""" + "$" + """fin<[^/]+>""", """controllers.CitaController.getLecturasRango(id:Long, inicio:String, fin:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente""", """controllers.PacienteController.createPaciente"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.updatePaciente(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.deletePaciente(id:Long)"""),
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lectura/""" + "$" + """idP<[^/]+>""", """controllers.LecturaController.createLecturaPaciente(idP:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emergencia/""" + "$" + """idP<[^/]+>""", """controllers.EmergenciaController.createEmergenciaPaciente(idP:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """consejo/""" + "$" + """idP<[^/]+>&""" + "$" + """idM<[^/]+>""", """controllers.ConsejoController.createConsejoPaciente(idP:Long, idM:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """marcapasos/""" + "$" + """idP<[^/]+>""", """controllers.MarcapasosController.createMarcapasosPaciente(idP:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paciente/""" + "$" + """id<[^/]+>""", """controllers.PacienteController.updatePaciente(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """historial/""" + "$" + """id<[^/]+>""", """controllers.HistorialController.updateHistorial(id:Long)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """marcapasos/""" + "$" + """idP<[^/]+>&""" + "$" + """idM<[^/]+>""", """controllers.MarcapasosController.updateMarcapasos(idP:Long, idM:Long)"""),
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
    HomeController_4.index2,
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
    CountController_3.count,
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

  // @LINE:23
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_10.versioned(fakeValue[String], fakeValue[Asset]),
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
    MedicoController_11.getMedicos,
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
    MedicoController_11.getMedico(fakeValue[Long]),
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
    MedicoController_11.createMedico,
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
    MedicoController_11.updateMedico(fakeValue[Long]),
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
    PacienteController_2.getPacientes,
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
    PacienteController_2.getPaciente(fakeValue[Long]),
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
  private[this] lazy val controllers_CitaController_getLecturasRango10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/historialRangoFechas/"), DynamicPart("inicio", """[^/]+""",true), StaticPart("&"), DynamicPart("fin", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CitaController_getLecturasRango10_invoker = createInvoker(
    CitaController_8.getLecturasRango(fakeValue[Long], fakeValue[String], fakeValue[String]),
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

  // @LINE:37
  private[this] lazy val controllers_PacienteController_createPaciente11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente")))
  )
  private[this] lazy val controllers_PacienteController_createPaciente11_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_PacienteController_updatePaciente12_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente12_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_PacienteController_deletePaciente13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_deletePaciente13_invoker = createInvoker(
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

  // @LINE:43
  private[this] lazy val controllers_CitaController_getCitas14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("citas")))
  )
  private[this] lazy val controllers_CitaController_getCitas14_invoker = createInvoker(
    CitaController_8.getCitas,
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

  // @LINE:44
  private[this] lazy val controllers_CitaController_getCita15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita")))
  )
  private[this] lazy val controllers_CitaController_getCita15_invoker = createInvoker(
    CitaController_8.getCita(fakeValue[Long]),
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

  // @LINE:45
  private[this] lazy val controllers_CitaController_getCitasPaciente16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/citas")))
  )
  private[this] lazy val controllers_CitaController_getCitasPaciente16_invoker = createInvoker(
    CitaController_8.getCitasPaciente(fakeValue[Long]),
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

  // @LINE:46
  private[this] lazy val controllers_CitaController_getHistorialPaciente17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/historial")))
  )
  private[this] lazy val controllers_CitaController_getHistorialPaciente17_invoker = createInvoker(
    CitaController_8.getHistorialPaciente(fakeValue[Long]),
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

  // @LINE:47
  private[this] lazy val controllers_CitaController_getExamenesPaciente18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/examenes")))
  )
  private[this] lazy val controllers_CitaController_getExamenesPaciente18_invoker = createInvoker(
    CitaController_8.getExamenesPaciente(fakeValue[Long]),
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

  // @LINE:48
  private[this] lazy val controllers_CitaController_getLecturasPaciente19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/lecturas")))
  )
  private[this] lazy val controllers_CitaController_getLecturasPaciente19_invoker = createInvoker(
    CitaController_8.getLecturasPaciente(fakeValue[Long]),
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

  // @LINE:49
  private[this] lazy val controllers_CitaController_getEmergenciasPaciente20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/emergencias")))
  )
  private[this] lazy val controllers_CitaController_getEmergenciasPaciente20_invoker = createInvoker(
    CitaController_8.getEmergenciasPaciente(fakeValue[Long]),
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

  // @LINE:50
  private[this] lazy val controllers_CitaController_getConsejosPaciente21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/consejos")))
  )
  private[this] lazy val controllers_CitaController_getConsejosPaciente21_invoker = createInvoker(
    CitaController_8.getConsejosPaciente(fakeValue[Long]),
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

  // @LINE:51
  private[this] lazy val controllers_CitaController_getMarcapasosPaciente22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/marcapasos")))
  )
  private[this] lazy val controllers_CitaController_getMarcapasosPaciente22_invoker = createInvoker(
    CitaController_8.getMarcapasosPaciente(fakeValue[Long]),
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

  // @LINE:53
  private[this] lazy val controllers_CitaController_createCita23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita")))
  )
  private[this] lazy val controllers_CitaController_createCita23_invoker = createInvoker(
    CitaController_8.createCita,
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

  // @LINE:54
  private[this] lazy val controllers_CitaController_updateCita24_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CitaController_updateCita24_invoker = createInvoker(
    CitaController_8.updateCita(fakeValue[Long]),
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

  // @LINE:56
  private[this] lazy val controllers_CitaController_createCitaPaciente25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cita/"), DynamicPart("idP", """[^/]+""",true), StaticPart("&"), DynamicPart("idM", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CitaController_createCitaPaciente25_invoker = createInvoker(
    CitaController_8.createCitaPaciente(fakeValue[Long], fakeValue[Long]),
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

  // @LINE:57
  private[this] lazy val controllers_LecturaController_createLecturaPaciente26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lectura/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_LecturaController_createLecturaPaciente26_invoker = createInvoker(
    LecturaController_9.createLecturaPaciente(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LecturaController",
      "createLecturaPaciente",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """lectura/""" + "$" + """idP<[^/]+>"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_EmergenciaController_createEmergenciaPaciente27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emergencia/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EmergenciaController_createEmergenciaPaciente27_invoker = createInvoker(
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

  // @LINE:59
  private[this] lazy val controllers_ConsejoController_createConsejoPaciente28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("consejo/"), DynamicPart("idP", """[^/]+""",true), StaticPart("&"), DynamicPart("idM", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ConsejoController_createConsejoPaciente28_invoker = createInvoker(
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

  // @LINE:60
  private[this] lazy val controllers_MarcapasosController_createMarcapasosPaciente29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marcapasos/"), DynamicPart("idP", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarcapasosController_createMarcapasosPaciente29_invoker = createInvoker(
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

  // @LINE:61
  private[this] lazy val controllers_PacienteController_updatePaciente30_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente30_invoker = createInvoker(
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

  // @LINE:62
  private[this] lazy val controllers_HistorialController_updateHistorial31_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("historial/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HistorialController_updateHistorial31_invoker = createInvoker(
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

  // @LINE:63
  private[this] lazy val controllers_MarcapasosController_updateMarcapasos32_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("marcapasos/"), DynamicPart("idP", """[^/]+""",true), StaticPart("&"), DynamicPart("idM", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarcapasosController_updateMarcapasos32_invoker = createInvoker(
    MarcapasosController_7.updateMarcapasos(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarcapasosController",
      "updateMarcapasos",
      Seq(classOf[Long], classOf[Long]),
      "PUT",
      """""",
      this.prefix + """marcapasos/""" + "$" + """idP<[^/]+>&""" + "$" + """idM<[^/]+>"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_PacienteController_updatePaciente33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paciente/"), DynamicPart("id", """[^/]+""",true), StaticPart("/citas")))
  )
  private[this] lazy val controllers_PacienteController_updatePaciente33_invoker = createInvoker(
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:16
    case controllers_HomeController_index20_route(params) =>
      call { 
        controllers_HomeController_index20_invoker.call(HomeController_4.index2)
      }
  
    // @LINE:18
    case controllers_CountController_count1_route(params) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_3.count)
      }
  
    // @LINE:20
    case controllers_AsyncController_message2_route(params) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_5.message)
      }
  
    // @LINE:23
    case controllers_Assets_versioned3_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_10.versioned(path, file))
      }
  
    // @LINE:28
    case controllers_MedicoController_getMedicos4_route(params) =>
      call { 
        controllers_MedicoController_getMedicos4_invoker.call(MedicoController_11.getMedicos)
      }
  
    // @LINE:29
    case controllers_MedicoController_getMedico5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_getMedico5_invoker.call(MedicoController_11.getMedico(id))
      }
  
    // @LINE:30
    case controllers_MedicoController_createMedico6_route(params) =>
      call { 
        controllers_MedicoController_createMedico6_invoker.call(MedicoController_11.createMedico)
      }
  
    // @LINE:31
    case controllers_MedicoController_updateMedico7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_MedicoController_updateMedico7_invoker.call(MedicoController_11.updateMedico(id))
      }
  
    // @LINE:34
    case controllers_PacienteController_getPacientes8_route(params) =>
      call { 
        controllers_PacienteController_getPacientes8_invoker.call(PacienteController_2.getPacientes)
      }
  
    // @LINE:35
    case controllers_PacienteController_getPaciente9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_getPaciente9_invoker.call(PacienteController_2.getPaciente(id))
      }
  
    // @LINE:36
    case controllers_CitaController_getLecturasRango10_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[String]("inicio", None), params.fromPath[String]("fin", None)) { (id, inicio, fin) =>
        controllers_CitaController_getLecturasRango10_invoker.call(CitaController_8.getLecturasRango(id, inicio, fin))
      }
  
    // @LINE:37
    case controllers_PacienteController_createPaciente11_route(params) =>
      call { 
        controllers_PacienteController_createPaciente11_invoker.call(PacienteController_2.createPaciente)
      }
  
    // @LINE:38
    case controllers_PacienteController_updatePaciente12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente12_invoker.call(PacienteController_2.updatePaciente(id))
      }
  
    // @LINE:39
    case controllers_PacienteController_deletePaciente13_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_deletePaciente13_invoker.call(PacienteController_2.deletePaciente(id))
      }
  
    // @LINE:43
    case controllers_CitaController_getCitas14_route(params) =>
      call { 
        controllers_CitaController_getCitas14_invoker.call(CitaController_8.getCitas)
      }
  
    // @LINE:44
    case controllers_CitaController_getCita15_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_CitaController_getCita15_invoker.call(CitaController_8.getCita(id))
      }
  
    // @LINE:45
    case controllers_CitaController_getCitasPaciente16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getCitasPaciente16_invoker.call(CitaController_8.getCitasPaciente(id))
      }
  
    // @LINE:46
    case controllers_CitaController_getHistorialPaciente17_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getHistorialPaciente17_invoker.call(CitaController_8.getHistorialPaciente(id))
      }
  
    // @LINE:47
    case controllers_CitaController_getExamenesPaciente18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getExamenesPaciente18_invoker.call(CitaController_8.getExamenesPaciente(id))
      }
  
    // @LINE:48
    case controllers_CitaController_getLecturasPaciente19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getLecturasPaciente19_invoker.call(CitaController_8.getLecturasPaciente(id))
      }
  
    // @LINE:49
    case controllers_CitaController_getEmergenciasPaciente20_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getEmergenciasPaciente20_invoker.call(CitaController_8.getEmergenciasPaciente(id))
      }
  
    // @LINE:50
    case controllers_CitaController_getConsejosPaciente21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getConsejosPaciente21_invoker.call(CitaController_8.getConsejosPaciente(id))
      }
  
    // @LINE:51
    case controllers_CitaController_getMarcapasosPaciente22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_getMarcapasosPaciente22_invoker.call(CitaController_8.getMarcapasosPaciente(id))
      }
  
    // @LINE:53
    case controllers_CitaController_createCita23_route(params) =>
      call { 
        controllers_CitaController_createCita23_invoker.call(CitaController_8.createCita)
      }
  
    // @LINE:54
    case controllers_CitaController_updateCita24_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CitaController_updateCita24_invoker.call(CitaController_8.updateCita(id))
      }
  
    // @LINE:56
    case controllers_CitaController_createCitaPaciente25_route(params) =>
      call(params.fromPath[Long]("idP", None), params.fromPath[Long]("idM", None)) { (idP, idM) =>
        controllers_CitaController_createCitaPaciente25_invoker.call(CitaController_8.createCitaPaciente(idP, idM))
      }
  
    // @LINE:57
    case controllers_LecturaController_createLecturaPaciente26_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_LecturaController_createLecturaPaciente26_invoker.call(LecturaController_9.createLecturaPaciente(idP))
      }
  
    // @LINE:58
    case controllers_EmergenciaController_createEmergenciaPaciente27_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_EmergenciaController_createEmergenciaPaciente27_invoker.call(EmergenciaController_6.createEmergenciaPaciente(idP))
      }
  
    // @LINE:59
    case controllers_ConsejoController_createConsejoPaciente28_route(params) =>
      call(params.fromPath[Long]("idP", None), params.fromPath[Long]("idM", None)) { (idP, idM) =>
        controllers_ConsejoController_createConsejoPaciente28_invoker.call(ConsejoController_0.createConsejoPaciente(idP, idM))
      }
  
    // @LINE:60
    case controllers_MarcapasosController_createMarcapasosPaciente29_route(params) =>
      call(params.fromPath[Long]("idP", None)) { (idP) =>
        controllers_MarcapasosController_createMarcapasosPaciente29_invoker.call(MarcapasosController_7.createMarcapasosPaciente(idP))
      }
  
    // @LINE:61
    case controllers_PacienteController_updatePaciente30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente30_invoker.call(PacienteController_2.updatePaciente(id))
      }
  
    // @LINE:62
    case controllers_HistorialController_updateHistorial31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HistorialController_updateHistorial31_invoker.call(HistorialController_1.updateHistorial(id))
      }
  
    // @LINE:63
    case controllers_MarcapasosController_updateMarcapasos32_route(params) =>
      call(params.fromPath[Long]("idP", None), params.fromPath[Long]("idM", None)) { (idP, idM) =>
        controllers_MarcapasosController_updateMarcapasos32_invoker.call(MarcapasosController_7.updateMarcapasos(idP, idM))
      }
  
    // @LINE:64
    case controllers_PacienteController_updatePaciente33_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PacienteController_updatePaciente33_invoker.call(PacienteController_2.updatePaciente(id))
      }
  }
}
