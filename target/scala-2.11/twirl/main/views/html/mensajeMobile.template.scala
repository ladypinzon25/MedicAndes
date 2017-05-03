
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mensajeMobile_Scope0 {
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

class mensajeMobile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[PacienteEntity,MedicoEntity,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(paciente: PacienteEntity)(medico: MedicoEntity):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.50*/("""
"""),format.raw/*2.1*/("""<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="A front-end template that helps you build fast, modern mobile web apps.">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>Material Design Lite</title>

      <!-- Add to homescreen for Chrome on Android -->
    <meta name="mobile-web-app-capable" content="yes">
    <link rel="icon" sizes="192x192" href="imagesM/android-desktop.png">

      <!-- Add to homescreen for Safari on iOS -->
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="Material Design Lite">
    <link rel="apple-touch-icon-precomposed" href="imagesM/ios-desktop.png">

      <!-- Tile icon for Win8 (144x144 + tile color) -->
    <meta name="msapplication-TileImage" content="imagesM/touch/ms-touch-icon-144x144-precomposed.png">
    <meta name="msapplication-TileColor" content="#3372DF">

    <link rel="shortcut icon" href=""""),_display_(/*25.38*/routes/*25.44*/.Assets.versioned("imagesM/favicon.png")),format.raw/*25.84*/("""">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.cyan-light_blue.min.css">
    <link rel="stylesheet" href=""""),_display_(/*29.35*/routes/*29.41*/.Assets.versioned("cssM/styles.css")),format.raw/*29.77*/("""">
    <style>
    #view-source """),format.raw/*31.18*/("""{"""),format.raw/*31.19*/("""
      """),format.raw/*32.7*/("""position: fixed;
      display: block;
      right: 0;
      bottom: 0;
      margin-right: 40px;
      margin-bottom: 40px;
      z-index: 900;
    """),format.raw/*39.5*/("""}"""),format.raw/*39.6*/("""
    """),format.raw/*40.5*/("""</style>
  </head>
  <body>
    <div class="demo-layout mdl-layout mdl-js-layout mdl-layout--fixed-drawer mdl-layout--fixed-header">
      <header class="demo-header mdl-layout__header mdl-color--grey-100 mdl-color-text--grey-600">
        <div class="mdl-layout__header-row">
          <span class="mdl-layout-title">Consejos</span>
          <div class="mdl-layout-spacer"></div>
        </div>
      </header>
      <div class="demo-drawer mdl-layout__drawer mdl-color--blue-grey-900 mdl-color-text--blue-grey-50">
        <header class="demo-drawer-header">
          <img src=""""),_display_(/*52.22*/routes/*52.28*/.Assets.versioned("imagesM/user.jpg")),format.raw/*52.65*/("""" class="demo-avatar">
          <div class="demo-avatar-dropdown">
            <span>hello#example.com</span>
            <div class="mdl-layout-spacer"></div>
            <button id="accbtn" class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon">
              <i class="material-icons" role="presentation">arrow_drop_down</i>
              <span class="visuallyhidden">Accounts</span>
            </button>
            <ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect" for="accbtn">
              <li class="mdl-menu__item" ><i class="material-icons">remove</i><a href="/mobile" style="text-decoration: none; color:#000000;">Log out</a></li>
            </ul>
          </div>
        </header>
        <nav class="demo-navigation mdl-navigation mdl-color--blue-grey-800">
          <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">home</i>Home</a>
          <a class="mdl-navigation__link" href="citas"><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">event</i>Citas</a>
          <a class="mdl-navigation__link" href="pacientes"><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">people</i>Pacientes</a>
          <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">settings</i>Configuración</a>
          <div class="mdl-layout-spacer"></div>
            <!--<a class="mdl-navigation__link" href=""><i class="mdl-color-text&#45;&#45;blue-grey-400 material-icons" role="presentation">help_outline</i><span class="visuallyhidden">Help</span></a>-->
        </nav>
      </div>
      <main class="mdl-layout__content mdl-color--grey-100">
        <div class="mdl-grid demo-content">
          <a class="mdl-button mdl-js-button mdl-button--raised mdl-button--accent mdl-button--colored mdl-color-text--white" href="/mobile/paciente/"""),_display_(/*76.151*/paciente/*76.159*/.getId()),format.raw/*76.167*/("""">
            < Regresar
          </a>
          <p id="nMedico" hidden="">"""),_display_(/*79.38*/medico/*79.44*/.getId()),format.raw/*79.52*/("""</p>
          <p id="idPaciente" hidden="">"""),_display_(/*80.41*/paciente/*80.49*/.getId),format.raw/*80.55*/("""</p>
          <div class="demo-separator mdl-cell--2-col"></div>
          <div class="demo-cards mdl-cell mdl-cell--4-col mdl-cell--8-col-tablet mdl-grid mdl-grid--no-spacing">
            <form class="col s12">
              <div class="row">
                <div class="input-field col s6">
                  Mensaje: <input type="text" id="nMensaje" name="fname">
                </div>
              </div>
              <div class="demo-separator mdl-cell--2-col"></div>
              <button class=" mdl-button mdl-js-button mdl-button--raised mdl-button--accent mdl-button--colored mdl-color-text--white" onclick="enviarMensaje()">Enviar</button>
            </form>
          </div>
        </div>
      </main>
    </div>
    <script src="https://code.getmdl.io/1.3.0/material.min.js"></script>
    <script src=""""),_display_(/*97.19*/routes/*97.25*/.Assets.versioned("js2/jquery-1.9.1.min.js")),format.raw/*97.69*/(""""></script>
    <script src=""""),_display_(/*98.19*/routes/*98.25*/.Assets.versioned("jsM/mobile.js")),format.raw/*98.59*/(""""></script>
  </body>
</html>"""))
      }
    }
  }

  def render(paciente:PacienteEntity,medico:MedicoEntity): play.twirl.api.HtmlFormat.Appendable = apply(paciente)(medico)

  def f:((PacienteEntity) => (MedicoEntity) => play.twirl.api.HtmlFormat.Appendable) = (paciente) => (medico) => apply(paciente)(medico)

  def ref: this.type = this

}


}

/**/
object mensajeMobile extends mensajeMobile_Scope0.mensajeMobile
              /*
                  -- GENERATED --
                  DATE: Wed May 03 12:30:59 COT 2017
                  SOURCE: C:/Users/Camilo/Documents/GitHub/MedicAndes/app/views/mensajeMobile.scala.html
                  HASH: 3decd6cf7541ccce4143f93f73ca69d34f3346c6
                  MATRIX: 782->1|925->49|953->51|2158->1229|2173->1235|2234->1275|2639->1653|2654->1659|2711->1695|2773->1729|2802->1730|2837->1738|3020->1894|3048->1895|3081->1901|3703->2496|3718->2502|3776->2539|5790->4525|5808->4533|5838->4541|5946->4622|5961->4628|5990->4636|6063->4682|6080->4690|6107->4696|6975->5537|6990->5543|7055->5587|7113->5618|7128->5624|7183->5658
                  LINES: 27->1|32->1|33->2|56->25|56->25|56->25|60->29|60->29|60->29|62->31|62->31|63->32|70->39|70->39|71->40|83->52|83->52|83->52|107->76|107->76|107->76|110->79|110->79|110->79|111->80|111->80|111->80|128->97|128->97|128->97|129->98|129->98|129->98
                  -- GENERATED --
              */
          