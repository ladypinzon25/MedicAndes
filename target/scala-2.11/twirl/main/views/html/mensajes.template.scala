
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

class mensajes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[PacienteEntity,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(paciente: PacienteEntity):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""
"""),_display_(/*2.2*/index2/*2.8*/ {_display_(Seq[Any](format.raw/*2.10*/("""
    """),format.raw/*3.5*/("""<!-- start: Content -->
    <div id="content" class="span10">


        <ul class="breadcrumb">
            <li>
                <a href="index.html">Pacientes</a>
                <i class="icon-angle-right"></i>
            </li>
            <li>
                <a href="../historial/"""),_display_(/*13.40*/paciente/*13.48*/.getId),format.raw/*13.54*/("""">"""),_display_(/*13.57*/paciente/*13.65*/.getNombre),format.raw/*13.75*/("""</a>
                <i class="icon-angle-right"></i>
            </li>
            <li>
                <a href="#">Mensajes</a>
                <i class="icon-angle-right"></i>
                <p id ="idPaciente" hidden>"""),_display_(/*19.45*/paciente/*19.53*/.getId),format.raw/*19.59*/("""</p>
            </li>
        </ul>

        """),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""<div class="row-fluid sortable ui-sortable">
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
                        <h4 class="modal-title">Enviar mensaje a """),_display_(/*37.67*/paciente/*37.75*/.getNombre),format.raw/*37.85*/("""</h4>
                    </div>

                        <form>
                            """),format.raw/*41.57*/("""
                                """),format.raw/*42.88*/("""
                            """),format.raw/*43.41*/("""
                            """),format.raw/*44.29*/("""<label for="fname">Mensaje
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
                    <h4 class="modal-title">Modificar marcapasos de """),_display_(/*81.70*/paciente/*81.78*/.getNombre),format.raw/*81.88*/("""</h4>
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

  def render(paciente:PacienteEntity): play.twirl.api.HtmlFormat.Appendable = apply(paciente)

  def f:((PacienteEntity) => play.twirl.api.HtmlFormat.Appendable) = (paciente) => apply(paciente)

  def ref: this.type = this

}


}

/**/
object mensajes extends mensajes_Scope0.mensajes
              /*
                  -- GENERATED --
                  DATE: Sun Apr 30 17:52:23 COT 2017
                  SOURCE: C:/Temp/Nueva carpeta (2)/MedicAndes-master/app/views/mensajes.scala.html
                  HASH: 769580e66e9a50b4fe452e217b87329619264a50
                  MATRIX: 759->1|880->27|908->30|921->36|960->38|992->44|1316->341|1333->349|1360->355|1390->358|1407->366|1438->376|1694->605|1711->613|1738->619|1816->692|1853->702|2779->1601|2796->1609|2827->1619|2952->1744|3014->1833|3072->1875|3130->1905|4732->3480|4749->3488|4780->3498
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|44->13|44->13|44->13|50->19|50->19|50->19|54->23|55->24|68->37|68->37|68->37|72->41|73->42|74->43|75->44|112->81|112->81|112->81
                  -- GENERATED --
              */
          