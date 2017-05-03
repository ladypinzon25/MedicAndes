
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mediPacienteMobile_Scope0 {
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

class mediPacienteMobile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[PacienteEntity,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(paciente:PacienteEntity):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
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
    <style>
      .mdl-button--accent.mdl-button--accent.mdl-button--raised, .mdl-button--accent.mdl-button--accent.mdl-button--fab"""),format.raw/*42.120*/("""{"""),format.raw/*42.121*/("""
        """),format.raw/*43.9*/("""background: #ff6374;
        color: whitesmoke;
      """),format.raw/*45.7*/("""}"""),format.raw/*45.8*/("""
    """),format.raw/*46.5*/("""</style>
  </head>
  <body>
    <div class="demo-layout mdl-layout mdl-js-layout mdl-layout--fixed-drawer mdl-layout--fixed-header">
      <header class="demo-header mdl-layout__header mdl-color--grey-100 mdl-color-text--grey-600">
        <div class="mdl-layout__header-row">
          <span class="mdl-layout-title">"""),_display_(/*52.43*/paciente/*52.51*/.getNombre()),format.raw/*52.63*/("""</span>
          <div class="mdl-layout-spacer"></div>
        </div>
      </header>
      <div class="demo-drawer mdl-layout__drawer mdl-color--blue-grey-900 mdl-color-text--blue-grey-50">
        <header class="demo-drawer-header">
          <img src=""""),_display_(/*58.22*/routes/*58.28*/.Assets.versioned("imagesM/user.jpg")),format.raw/*58.65*/("""" class="demo-avatar">
          <div class="demo-avatar-dropdown">
            <span>hello#example.com</span>
            <div class="mdl-layout-spacer"></div>
            <button id="accbtn" class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--icon">
              <i class="material-icons" role="presentation">arrow_drop_down</i>
              <span class="visuallyhidden">Accounts</span>
            </button>
            <ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect" for="accbtn">
              <li class="mdl-menu__item">hello#example.com</li>
              <li class="mdl-menu__item">info#example.com</li>
              <li class="mdl-menu__item"><i class="material-icons">add</i>Add another account...</li>
            </ul>
          </div>
        </header>
        <nav class="demo-navigation mdl-navigation mdl-color--blue-grey-800">
          <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">home</i>Home</a>
          <a class="mdl-navigation__link" href="/mobile/citas"><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">event</i>Citas</a>
          <a class="mdl-navigation__link" href="/mobile/pacientes"><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">people</i>Pacientes</a>
          <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">settings</i>Configuración</a>
          <div class="mdl-layout-spacer"></div>
            <!--<a class="mdl-navigation__link" href=""><i class="mdl-color-text&#45;&#45;blue-grey-400 material-icons" role="presentation">help_outline</i><span class="visuallyhidden">Help</span></a>-->
        </nav>
      </div>
      <main class="pacientes mdl-layout__content mdl-color--grey-100">
        <div class="mdl-grid demo-content">
          <div class="demo-cards mdl-cell mdl-cell--4-col mdl-cell--4-col-tablet mdl-grid mdl-grid--no-spacing">

              <!-- Accent-colored raised button with ripple -->
            <a class=" mdl-button mdl-js-button mdl-button--raised mdl-button--accent" href="/mobile/pacientes">
              <h7><</h7> Regresar
            </a>
            <div class="demo-separator mdl-cell--2-col"></div>
            <div class="demo-separator mdl-cell--2-col"></div>
            <!--Card Element-->
            <div class="demo-updates mdl-card mdl-shadow--2dp mdl-cell mdl-cell--4-col mdl-cell--4-col-tablet mdl-cell--6-col-desktop">
              <div class="mdl-card__title mdl-card--expand mdl-color--teal-300">
                <div class="mdl-card__title mdl-card--expand">
                  <h3 class="patientName">
                    Cantidad emergencias:

                  </h3>
                </div>
                <br>
              </div>
              <div class="mdl-card__actions mdl-card--border">
              <h5 style="text-align:center"> """),_display_(/*104.47*/paciente/*104.55*/.getHistorialPaciente().getEmergencias().size()),format.raw/*104.102*/(""" """),format.raw/*104.103*/("""</h5>
              </div>
            </div>
            </div>
            <div class="demo-separator mdl-cell--1-col"></div>
          <div class="demo-updates mdl-card mdl-shadow--2dp mdl-cell mdl-cell--4-col mdl-cell--4-col-tablet mdl-cell--6-col-desktop">
            <div class="mdl-card__title mdl-card--expand mdl-color--teal-300">
              <div class="mdl-card__title mdl-card--expand">
                <h2 style="color:whitesmoke" class="historyName">
                  Alergias:
                </h2>
              </div>
            </div>
            <div class="mdl-card__actions mdl-card--border">
              <h5 style="text-align:center"> """),_display_(/*118.47*/paciente/*118.55*/.getHistorialPaciente().getAlergias()),format.raw/*118.92*/(""" """),format.raw/*118.93*/("""</h5>
            </div>
          </div>
          <div class="demo-separator mdl-cell--1-col"></div>
          <div class="demo-updates mdl-card mdl-shadow--2dp mdl-cell mdl-cell--4-col mdl-cell--4-col-tablet mdl-cell--6-col-desktop">
            <div class="mdl-card__title mdl-card--expand mdl-color--teal-300">
              <div class="mdl-card__title mdl-card--expand">
                <h2 style="color:whitesmoke" class="historyName">
                  Enfermedades:
                </h2>
              </div>
            </div>
            <div class="mdl-card__actions mdl-card--border">
              <h5 style="text-align:center"> """),_display_(/*131.47*/paciente/*131.55*/.getHistorialPaciente().getEnfermedades()),format.raw/*131.96*/(""" """),format.raw/*131.97*/("""</h5>
            </div>
          </div>


        </div>
      </main>
    </div>
    <script src="https://code.getmdl.io/1.3.0/material.min.js"></script>

  </body>
</html>"""))
      }
    }
  }

  def render(paciente:PacienteEntity): play.twirl.api.HtmlFormat.Appendable = apply(paciente)

  def f:((PacienteEntity) => play.twirl.api.HtmlFormat.Appendable) = (paciente) => apply(paciente)

  def ref: this.type = this

}


}

/**/
object mediPacienteMobile extends mediPacienteMobile_Scope0.mediPacienteMobile
              /*
                  -- GENERATED --
                  DATE: Tue May 02 23:58:46 COT 2017
                  SOURCE: C:/Users/Camilo/Documents/GitHub/MedicAndes/app/views/mediPacienteMobile.scala.html
                  HASH: b5a6ac30bfada04c54e66d89f343edf4f767e206
                  MATRIX: 779->1|899->26|927->28|2132->1206|2147->1212|2208->1252|2613->1630|2628->1636|2685->1672|2747->1706|2776->1707|2811->1715|2994->1871|3022->1872|3055->1878|3226->2020|3256->2021|3293->2031|3376->2087|3404->2088|3437->2094|3789->2419|3806->2427|3839->2439|4129->2702|4144->2708|4202->2745|7248->5763|7266->5771|7336->5818|7367->5819|8074->6498|8092->6506|8151->6543|8181->6544|8866->7201|8884->7209|8947->7250|8977->7251
                  LINES: 27->1|32->1|33->2|56->25|56->25|56->25|60->29|60->29|60->29|62->31|62->31|63->32|70->39|70->39|71->40|73->42|73->42|74->43|76->45|76->45|77->46|83->52|83->52|83->52|89->58|89->58|89->58|135->104|135->104|135->104|135->104|149->118|149->118|149->118|149->118|162->131|162->131|162->131|162->131
                  -- GENERATED --
              */
          