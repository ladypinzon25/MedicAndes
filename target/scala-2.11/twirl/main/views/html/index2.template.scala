
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index2_Scope0 {
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

class index2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[MedicoEntity,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(medico: MedicoEntity):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.24*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Welcome to Play")/*12.25*/ {_display_(Seq[Any](format.raw/*12.27*/("""

    """),format.raw/*18.8*/("""

    """),format.raw/*20.5*/("""<p>"""),_display_(/*20.9*/medico/*20.15*/.getNombre),format.raw/*20.25*/("""</p>


""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(medico:MedicoEntity): play.twirl.api.HtmlFormat.Appendable = apply(medico)

  def f:((MedicoEntity) => play.twirl.api.HtmlFormat.Appendable) = (medico) => apply(medico)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index2 extends index2_Scope0.index2
              /*
                  -- GENERATED --
                  DATE: Sat Feb 11 20:13:17 COT 2017
                  SOURCE: C:/Temp/MedicAndes/app/views/index2.scala.html
                  HASH: d01447e811357c76e3d8af9d571f14db37a5cac1
                  MATRIX: 842->95|959->117|988->313|1016->315|1048->338|1088->340|1121->516|1154->522|1184->526|1199->532|1230->542|1268->550
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->18|42->20|42->20|42->20|42->20|45->23
                  -- GENERATED --
              */
          