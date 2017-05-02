
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mensajes_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class mensajes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[PacienteEntity,MedicoEntity,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(paciente: PacienteEntity)(medico: MedicoEntity):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""
"""),_display_(/*2.2*/index2/*2.8*/ {_display_(Seq[Any](format.raw/*2.10*/("""
    """),format.raw/*3.5*/("""<!-- start: Content -->
    <div id="content" class="span10">


        <ul class="breadcrumb">
            <li>
                <a href="index.html">Pacientes</a>
                <i class="icon-angle-right"></i>
                <p id ="nMedico" hidden>"""),_display_(/*11.42*/medico/*11.48*/.getId),format.raw/*11.54*/("""</p>
            </li>
            <li>
                <a href="../historial/"""),_display_(/*14.40*/paciente/*14.48*/.getId),format.raw/*14.54*/("""">"""),_display_(/*14.57*/paciente/*14.65*/.getNombre),format.raw/*14.75*/("""</a>
                <i class="icon-angle-right"></i>
            </li>
            <li>
                <a href="#">Mensajes</a>
                <i class="icon-angle-right"></i>
                <p id ="idPaciente" hidden>"""),_display_(/*20.45*/paciente/*20.53*/.getId),format.raw/*20.59*/("""</p>
            </li>
        </ul>

        """),format.raw/*24.32*/("""
        """),format.raw/*25.9*/("""<div class="row-fluid sortable ui-sortable">
            <div class="row-fluid sortable">
                <div class="box span6">
                    <div class="box-header">
                        <h2><i class="halflings-icon white align-justify"></i><span class="break"></span>Mensajes</h2>
                        <div class="box-icon">
                            <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                            <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                            <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
                        </div>
                    </div>
                    <div class="box-content">
                    <div class="titleMenssage">
                        <h4 class="modal-title">Enviar mensaje a """),_display_(/*38.67*/paciente/*38.75*/.getNombre),format.raw/*38.85*/("""</h4>
                    </div>

                        <form>

                            <label for="fname">Mensaje
                                <input type="text" id="nMensaje" name="fname">
                            </label>
                            <label for="fname">Dieta
                                <input type="text" id="nDieta" name="fname">
                            </label>
                            <label for="fname">Actividad fisica
                                <input type="text" id="nActividad" name="fname">
                            </label>
                            <label for="fname">Medicamentos
                                <input type="text" id="nMedicamento" name="fname">
                            </label>

                        </form>

                        <button  class="btn btn-primary" data-dismiss="modal" onclick="enviarMensaje()">Enviar mensaje</button>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    </div>
                </div>

            </div>
        </div> <!--/.fluid-container-->
    </div>



        <!-- Modal -->
    <div id="myModal" class="modal fade" role="dialog">
        <div class="modal-dialog">

                <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Modificar marcapasos de """),_display_(/*80.70*/paciente/*80.78*/.getNombre),format.raw/*80.88*/("""</h4>
                </div>
                <div class="modal-body">
                    <form>
                        <label for="fname">Ingrese el nuevo ritmo cardiaco</label>
                        <input type="text" id="nFrec" name="fname">

                    </form>

                    <button  class="btn btn-primary" data-dismiss="modal" onclick="editarMarcapasos()">Editar frencuencia</button>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
            </div>

        </div>
    </div>


""")))}))
      }
    }
  }

  def render(paciente:PacienteEntity,medico:MedicoEntity): play.twirl.api.HtmlFormat.Appendable = apply(paciente)(medico)

  def f:((PacienteEntity) => (MedicoEntity) => play.twirl.api.HtmlFormat.Appendable) = (paciente) => (medico) => apply(paciente)(medico)

  def ref: this.type = this

}


}

/**/
object mensajes extends mensajes_Scope0.mensajes
              /*
                  -- GENERATED --
                  DATE: Mon May 01 22:46:29 COT 2017
                  SOURCE: C:/Users/Camilo/Documents/GitHub/MedicAndes/app/views/mensajes.scala.html
                  HASH: 138c3530ee9ddf0bf30819dfbe1f2263d1270f43
                  MATRIX: 772->1|915->49|943->52|956->58|995->60|1027->66|1316->328|1331->334|1358->340|1467->422|1484->430|1511->436|1541->439|1558->447|1589->457|1845->686|1862->694|1889->700|1967->773|2004->783|2930->1682|2947->1690|2978->1700|4679->3374|4696->3382|4727->3392
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|42->11|42->11|42->11|45->14|45->14|45->14|45->14|45->14|45->14|51->20|51->20|51->20|55->24|56->25|69->38|69->38|69->38|111->80|111->80|111->80
                  -- GENERATED --
              */
          