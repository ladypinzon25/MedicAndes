
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object historial_Scope0 {
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

class historial extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[PacienteEntity,play.twirl.api.HtmlFormat.Appendable] {

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
                <a href="#">"""),_display_(/*13.30*/paciente/*13.38*/.getNombre),format.raw/*13.48*/("""</a>
                <i class="icon-angle-right"></i>
            </li>
            <li>
                <a href="#">Historial</a>
                <i class="icon-angle-right"></i>
            </li>
        </ul>

        """),format.raw/*22.33*/("""
"""),format.raw/*23.1*/("""<div class="row-fluid sortable ui-sortable">
        <div class="row-fluid sortable">
            <div class="box span6">
                <div class="box-header">
                    <h2><i class="halflings-icon white align-justify"></i><span class="break"></span>Emergencias</h2>
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
                                <th>Fecha</th>
                                <th>Estado</th>
                                <th>Ubicacion</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*45.26*/for(emergencia<-paciente.getHistorialPaciente.getEmergencias) yield /*45.87*/ {_display_(Seq[Any](format.raw/*45.89*/("""
                            """),format.raw/*46.29*/("""<tr>
                                <td class="center">"""),_display_(/*47.53*/emergencia/*47.63*/.getFecha),format.raw/*47.72*/("""</td>
                                <td class="center">"""),_display_(/*48.53*/emergencia/*48.63*/.getEstado),format.raw/*48.73*/("""</td>
                                <td class="center">"""),_display_(/*49.53*/emergencia/*49.63*/.getUbicacion),format.raw/*49.76*/("""</td>
                            </tr>
                        """)))}),format.raw/*51.26*/("""

                        """),format.raw/*53.25*/("""</tbody>
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
            </div>

            """),format.raw/*70.36*/("""

            """),format.raw/*72.13*/("""<div class="box span6">
                <div class="box-header">
                    <h2><i class="halflings-icon white align-justify"></i><span class="break"></span>Lecturas</h2>
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
                                <th>Fecha</th>
                                <th>Frecuencia cardiaca</th>
                                <th>Presion sanguinea</th>
                                <th>Nivel de estres</th>
                                <th>Estado</th>
                            </tr>
                        </thead>
                        <tbody>
                            """),_display_(/*93.30*/for(lectura<-paciente.getHistorialPaciente.getLecturasHistorial) yield /*93.94*/ {_display_(Seq[Any](format.raw/*93.96*/("""
                                """),format.raw/*94.33*/("""<tr>
                                    <td class="center">"""),_display_(/*95.57*/lectura/*95.64*/.getFecha),format.raw/*95.73*/("""</td>
                                    <td class="center">"""),_display_(/*96.57*/lectura/*96.64*/.getFrecuenciaCardiaca),format.raw/*96.86*/("""</td>
                                    <td class="center">"""),_display_(/*97.57*/lectura/*97.64*/.getPresionSanguinea),format.raw/*97.84*/("""</td>
                                    <td class="center">"""),_display_(/*98.57*/lectura/*98.64*/.getNivelEstres),format.raw/*98.79*/("""</td>
                                    <td class="center">"""),_display_(/*99.57*/lectura/*99.64*/.getEstado),format.raw/*99.74*/("""</td>
                                </tr>
                            """)))}),format.raw/*101.30*/("""

                        """),format.raw/*103.25*/("""</tbody>
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
            </div>
        </div>
            """),format.raw/*120.36*/("""
        """),format.raw/*121.9*/("""<div class="row-fluid sortable ui-sortable">
            <div class="box span6">
                <div class="box-header">
                    <h2><i class="halflings-icon white align-justify"></i><span class="break"></span>Examenes</h2>
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
                                <th>Fecha</th>
                                <th>Tipo</th>
                                <th>Resultado</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*141.26*/for(examen<-paciente.getHistorialPaciente.getExamenesHistorial) yield /*141.89*/ {_display_(Seq[Any](format.raw/*141.91*/("""
                            """),format.raw/*142.29*/("""<tr>
                                <td class="center">"""),_display_(/*143.53*/examen/*143.59*/.getFecha),format.raw/*143.68*/("""</td>
                                <td class="center">"""),_display_(/*144.53*/examen/*144.59*/.getTipo),format.raw/*144.67*/("""</td>
                                <td class="center">"""),_display_(/*145.53*/examen/*145.59*/.getResultado),format.raw/*145.72*/("""</td>
                            </tr>
                        """)))}),format.raw/*147.26*/("""
                        """),format.raw/*148.25*/("""</tbody>
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
            </div>


            """),format.raw/*166.33*/("""

            """),format.raw/*168.13*/("""<div class="box span6">
                <div class="box-header">
                    <h2><i class="halflings-icon white align-justify"></i><span class="break"></span>Citas</h2>
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
                                <th>Fecha</th>
                                <th>Diagnostico</th>
                            </tr>
                        </thead>
                        <tbody>
                        """),_display_(/*186.26*/for(cita<-paciente.getHistorialPaciente.getCitasHistorial) yield /*186.84*/ {_display_(Seq[Any](format.raw/*186.86*/("""
                            """),format.raw/*187.29*/("""<tr>
                                <td class="center">"""),_display_(/*188.53*/cita/*188.57*/.getFecha),format.raw/*188.66*/("""</td>
                                <td class="center">"""),_display_(/*189.53*/cita/*189.57*/.getDiagnostico),format.raw/*189.72*/("""</td>
                            </tr>
                        """)))}),format.raw/*191.26*/("""
                        """),format.raw/*192.25*/("""</tbody>
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
            </div>
        </div>
            """),format.raw/*209.51*/("""

            """),format.raw/*211.13*/("""<div class="box span6">
                <div class="box-header">
                    <h2><i class="halflings-icon white align-justify"></i><span class="break"></span>Afecciones</h2>
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
                                <th>Alergias</th>
                                <th>Enfermedades</th>
                            </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td class="center">"""),_display_(/*231.53*/paciente/*231.61*/.getHistorialPaciente.getAlergias),format.raw/*231.94*/("""</td>
                                <td class="center">"""),_display_(/*232.53*/paciente/*232.61*/.getHistorialPaciente.getEnfermedades),format.raw/*232.98*/("""</td>
                            </tr>

                        </tbody>
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
            </div>


        </div>
    </div> <!--/.fluid-container-->


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
object historial extends historial_Scope0.historial
              /*
                  -- GENERATED --
                  DATE: Sun Apr 30 18:21:05 COT 2017
                  SOURCE: C:/Users/Camilo/Documents/GitHub/MedicAndes/app/views/historial.scala.html
                  HASH: a03c80cd433b63f6ee23df819563301bcb6714c4
                  MATRIX: 761->1|882->27|910->30|923->36|962->38|994->44|1308->331|1325->339|1356->349|1614->603|1643->605|2801->1736|2878->1797|2918->1799|2976->1829|3061->1887|3080->1897|3110->1906|3196->1965|3215->1975|3246->1985|3332->2044|3351->2054|3385->2067|3483->2134|3539->2162|4241->2859|4285->2875|5470->4033|5550->4097|5590->4099|5652->4133|5741->4195|5757->4202|5787->4211|5877->4274|5893->4281|5936->4303|6026->4366|6042->4373|6083->4393|6173->4456|6189->4463|6225->4478|6315->4541|6331->4548|6362->4558|6469->4633|6526->4661|7243->5372|7281->5382|8391->6464|8471->6527|8512->6529|8571->6559|8657->6617|8673->6623|8704->6632|8791->6691|8807->6697|8837->6705|8924->6764|8940->6770|8975->6783|9074->6850|9129->6876|9834->7572|9879->7588|10883->8564|10958->8622|10999->8624|11058->8654|11144->8712|11158->8716|11189->8725|11276->8784|11290->8788|11327->8803|11426->8870|11481->8896|12198->9622|12243->9638|13319->10686|13337->10694|13392->10727|13479->10786|13497->10794|13556->10831
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|44->13|44->13|44->13|53->22|54->23|76->45|76->45|76->45|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|82->51|84->53|101->70|103->72|124->93|124->93|124->93|125->94|126->95|126->95|126->95|127->96|127->96|127->96|128->97|128->97|128->97|129->98|129->98|129->98|130->99|130->99|130->99|132->101|134->103|151->120|152->121|172->141|172->141|172->141|173->142|174->143|174->143|174->143|175->144|175->144|175->144|176->145|176->145|176->145|178->147|179->148|197->166|199->168|217->186|217->186|217->186|218->187|219->188|219->188|219->188|220->189|220->189|220->189|222->191|223->192|240->209|242->211|262->231|262->231|262->231|263->232|263->232|263->232
                  -- GENERATED --
              */
          