
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[MedicoEntity,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(medico: MedicoEntity):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/index2/*3.8*/{_display_(Seq[Any](format.raw/*3.9*/("""
    """),format.raw/*4.5*/("""<!-- start: Content -->
    <div id="content" class="span10 homeHTML">


        <ul class="breadcrumb">
            <li>
                <i class="icon-home"></i>
                <a href="index.html">Home</a>
                <i class="icon-angle-right"></i>
            </li>

        </ul>

        <div class="row-fluid sortable">
            <div class="span12 bienvenido">
                <h1>Bienvenido</h1>
                <h3>Doctor """),_display_(/*20.29*/medico/*20.35*/.getNombre),format.raw/*20.45*/(""" """),format.raw/*20.46*/("""</h3>
            </div><!--/span-->

        </div><!--/row-->

    </div><!--/.fluid-container-->
""")))}))
      }
    }
  }

  def render(medico:MedicoEntity): play.twirl.api.HtmlFormat.Appendable = apply(medico)

  def f:((MedicoEntity) => play.twirl.api.HtmlFormat.Appendable) = (medico) => apply(medico)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Mon May 01 09:02:10 COT 2017
                  SOURCE: C:/Temp/MedicAndes/app/views/home.scala.html
                  HASH: 6304a51e2c7194a78faba57e888150d34097a420
                  MATRIX: 749->1|866->23|896->28|909->34|946->35|978->41|1463->499|1478->505|1509->515|1538->516
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|51->20|51->20|51->20|51->20
                  -- GENERATED --
              */
          