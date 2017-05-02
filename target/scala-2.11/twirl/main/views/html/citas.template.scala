
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object citas_Scope0 {
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

class citas extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[MedicoEntity,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(medico: MedicoEntity):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""
"""),_display_(/*2.2*/index2/*2.8*/ {_display_(Seq[Any](format.raw/*2.10*/("""
    """),format.raw/*3.5*/("""<!-- start: Content -->
    <div id="content" class="span10">


        <ul class="breadcrumb">
            <li>
                <i class="icon-home"></i>
                <a href="index.html">Home</a>
                <i class="icon-angle-right"></i>
                <p id ="nMedico" hidden>"""),_display_(/*12.42*/medico/*12.48*/.getId),format.raw/*12.54*/("""</p>
            </li>
            <li><a href="#">Calendar</a></li>
        </ul>
        <a id='hiddenButton'class="btn btn-info btn-lg hiddenElement" data-toggle="modal" href="#myModal">
            <i class="halflings-icon white edit"></i>
        </a>
        <div class="row-fluid sortable">
            <div class="box span12">
                <div class="box-header" data-original-title>
                    <h2><i class="halflings-icon white calendar"></i><span class="break"></span>Calendar</h2>
                </div>
                <div class="box-content">
                    <div id="external-events" class="span3 hidden-phone hidden-tablet">
                        <h4>Draggable Events</h4>
                        <div class="external-event badge">Default</div>
                        <div class="external-event badge badge-success">Completed</div>
                        <div class="external-event badge badge-warning">Warning</div>
                        <div class="external-event badge badge-important">Important</div>
                        <div class="external-event badge badge-info">Info</div>
                        <div class="external-event badge badge-inverse">Other</div>
                        <p>
                            <label for="drop-remove"><input type="checkbox" id="drop-remove" /> remove after drop</label>
                        </p>
                    </div>

                    <div id="calendar" class="span9"></div>

                    <div class="clearfix"></div>
                </div>
            </div>
        </div><!--/row-->


    </div> <!--/.fluid-container-->

        <!-- Modal -->
    <div id="myModal" class="modal fade" role="dialog">
        <div class="modal-dialog">

                <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Agendar cita</h4>
                </div>
                <div class="modal-body">
                    <form>
                        <label for="fname">Ingrese el id del paciente</label>
                        <input type="text" id="nIdPaciente" name="fname">

                    </form>

                    <button  class="btn btn-primary" data-dismiss="modal" onclick="agendarCita()">Aceptar</button>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
            </div>

        </div>
    </div>
""")))}),format.raw/*75.2*/("""

"""))
      }
    }
  }

  def render(medico:MedicoEntity): play.twirl.api.HtmlFormat.Appendable = apply(medico)

  def f:((MedicoEntity) => play.twirl.api.HtmlFormat.Appendable) = (medico) => apply(medico)

  def ref: this.type = this

}


}

/**/
object citas extends citas_Scope0.citas
              /*
                  -- GENERATED --
                  DATE: Mon May 01 22:46:27 COT 2017
                  SOURCE: C:/Users/Camilo/Documents/GitHub/MedicAndes/app/views/citas.scala.html
                  HASH: e99641f0b297b40579d854fdf43efa53ad96b865
                  MATRIX: 751->1|868->23|896->26|909->32|948->34|980->40|1307->340|1322->346|1349->352|4094->3067
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|43->12|43->12|43->12|106->75
                  -- GENERATED --
              */
          