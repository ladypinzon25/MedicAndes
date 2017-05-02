
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object pacientes_Scope0 {
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

class pacientes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[MedicoEntity,List[PacienteEntity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(medico: MedicoEntity)(pacientes:List[PacienteEntity]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.56*/("""
"""),_display_(/*2.2*/index2/*2.8*/ {_display_(Seq[Any](format.raw/*2.10*/("""
    """),format.raw/*3.5*/("""<!-- start: Content -->
    <div id="content" class="span10">


        <ul class="breadcrumb">
            <li>
                <a href="#">Pacientes</a>
                <i class="icon-angle-right"></i>
            </li>
        </ul>

        <div class="row-fluid sortable">
            <div class="box span12">
                <div class="box-header" data-original-title>
                    <h2><i class="halflings-icon white user"></i><span class="break"></span>Pacientes</h2>
                    <div class="box-icon">
                        <a href="#" class="btn-setting"><i class="halflings-icon white wrench"></i></a>
                        <a href="#" class="btn-minimize"><i class="halflings-icon white chevron-up"></i></a>
                        <a href="#" class="btn-close"><i class="halflings-icon white remove"></i></a>
                    </div>
                </div>
                <div class="box-content">
                    <table class="table table-striped table-bordered bootstrap-datatable datatable">
                        <thead>
                            <tr>
                                <th>Nombre</th>
                                <th>Historial</th>
                                <th>Marcapasos</th>
                                <th>Enviar mensaje</th>
                                <th>estado</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>

                        """),_display_(/*38.26*/for(pacienteActual <- pacientes) yield /*38.58*/ {_display_(Seq[Any](format.raw/*38.60*/("""
                            """),format.raw/*39.29*/("""<tr>
                                <td>"""),_display_(/*40.38*/pacienteActual/*40.52*/.getNombre),format.raw/*40.62*/("""</td>

                                <td class="center">
                                    <a class="label label-success" href="./historial/"""),_display_(/*43.87*/pacienteActual/*43.101*/.getId),format.raw/*43.107*/("""">Abrir historial</a>
                                </td>
                                <td class="center">
                                <a class="label label-success" href="./marcapasos/"""),_display_(/*46.84*/pacienteActual/*46.98*/.getId),format.raw/*46.104*/("""">Marcapasos</a>
                                </td>
                                <td class="center">
                                    <a class="label label-success" href="./mensajes/"""),_display_(/*49.86*/pacienteActual/*49.100*/.getId),format.raw/*49.106*/("""">Enviar mensaje</a>
                                </td>
                                <td class="center">
                                    <span class="label label-success">Bien</span>
                                </td>
                                <td class="center">
                                    <a class="btn btn-success" href="#">
                                        <i class="halflings-icon white zoom-in"></i>
                                    </a>
                                    <a class="btn btn-info" href="#">
                                        <i class="halflings-icon white edit"></i>
                                    </a>
                                    <a class="btn btn-danger" href="#">
                                        <i class="halflings-icon white trash"></i>
                                    </a>
                                </td>
                            </tr>
                        """)))}),format.raw/*66.26*/("""

                        """),format.raw/*68.25*/("""</tbody>
                    </table>
                    <div class="pagination pagination-centered">
                        <ul>
                            <li><a href="#">Prev</a></li>
                            <li class="active">
                                <a href="#">1</a>
                            </li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">Next</a></li>
                        </ul>
                    </div>
                </div>
            </div><!--/span-->
        </div><!--/row-->




    </div> <!--/.fluid-container-->


""")))}))
      }
    }
  }

  def render(medico:MedicoEntity,pacientes:List[PacienteEntity]): play.twirl.api.HtmlFormat.Appendable = apply(medico)(pacientes)

  def f:((MedicoEntity) => (List[PacienteEntity]) => play.twirl.api.HtmlFormat.Appendable) = (medico) => (pacientes) => apply(medico)(pacientes)

  def ref: this.type = this

}


}

/**/
object pacientes extends pacientes_Scope0.pacientes
              /*
                  -- GENERATED --
                  DATE: Mon May 01 22:46:29 COT 2017
                  SOURCE: C:/Users/Camilo/Documents/GitHub/MedicAndes/app/views/pacientes.scala.html
                  HASH: a1731d71327eb68623e204707ebe20d63ed7a52f
                  MATRIX: 780->1|929->55|957->58|970->64|1009->66|1041->72|2632->1636|2680->1668|2720->1670|2778->1700|2848->1743|2871->1757|2902->1767|3077->1915|3101->1929|3129->1935|3354->2133|3377->2147|3405->2153|3627->2348|3651->2362|3679->2368|4695->3353|4751->3381
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|69->38|69->38|69->38|70->39|71->40|71->40|71->40|74->43|74->43|74->43|77->46|77->46|77->46|80->49|80->49|80->49|97->66|99->68
                  -- GENERATED --
              */
          