
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[EstudianteEntity,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(estudiante: EstudianteEntity):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.32*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Welcome to Play")/*12.25*/ {_display_(Seq[Any](format.raw/*12.27*/("""

    """),format.raw/*18.8*/("""

    """),format.raw/*20.5*/("""<p>"""),_display_(/*20.9*/estudiante/*20.19*/.getNombre),format.raw/*20.29*/("""</p>


""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(estudiante:EstudianteEntity): play.twirl.api.HtmlFormat.Appendable = apply(estudiante)

  def f:((EstudianteEntity) => play.twirl.api.HtmlFormat.Appendable) = (estudiante) => apply(estudiante)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Feb 11 16:53:32 COT 2017
                  SOURCE: C:/Temp/Monithor-master/app/views/index.scala.html
                  HASH: 294ee3e4b7a6f47840e3848c79cce07f8c95e924
                  MATRIX: 844->95|969->125|998->321|1026->323|1058->346|1098->348|1131->524|1164->530|1194->534|1213->544|1244->554|1282->562
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|40->18|42->20|42->20|42->20|42->20|45->23
                  -- GENERATED --
              */
          