
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object marcapasos_Scope0 {
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

class marcapasos extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[PacienteEntity,play.twirl.api.HtmlFormat.Appendable] {

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
                <a href="#">Marcapasos</a>
                <i class="icon-angle-right"></i>
                <p id ="idPaciente" hidden>"""),_display_(/*19.45*/paciente/*19.53*/.getId),format.raw/*19.59*/("""</p>
            </li>
        </ul>

        """),format.raw/*23.32*/("""
        """),format.raw/*24.9*/("""<div class="row-fluid sortable ui-sortable">
            <div class="row-fluid sortable">
                <div class="box span6">
                    <div class="box-header">
                        <h2><i class="halflings-icon white align-justify"></i><span class="break"></span>Marcapasos</h2>
                        <div class="box-icon">
                            <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                            <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                            <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
                        </div>
                    </div>

                    <div class="box-content">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>RitmoCardiaco</th>
                                    <th>Modificar</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td class="center">"""),_display_(/*46.57*/paciente/*46.65*/.getMarcapasos.getRitmoCardiaco),format.raw/*46.96*/("""</td>
                                    <td class="center">
                                        <a class="btn btn-info btn-lg" data-toggle="modal" href="#myModal">
                                            <i class="halflings-icon white edit"></i>
                                        </a>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
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
                    <h4 class="modal-title">Modificar marcapasos de """),_display_(/*72.70*/paciente/*72.78*/.getNombre),format.raw/*72.88*/("""</h4>
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
object marcapasos extends marcapasos_Scope0.marcapasos
              /*
                  -- GENERATED --
                  DATE: Sun Apr 30 18:21:07 COT 2017
                  SOURCE: C:/Users/Camilo/Documents/GitHub/MedicAndes/app/views/marcapasos.scala.html
                  HASH: 6b6409fef4dc95bbdc02662da91baa613f07a525
                  MATRIX: 763->1|884->27|912->30|925->36|964->38|996->44|1320->341|1337->349|1364->355|1394->358|1411->366|1442->376|1700->607|1717->615|1744->621|1822->694|1859->704|3120->1938|3137->1946|3189->1977|4204->2965|4221->2973|4252->2983
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|44->13|44->13|44->13|50->19|50->19|50->19|54->23|55->24|77->46|77->46|77->46|103->72|103->72|103->72
                  -- GENERATED --
              */
          