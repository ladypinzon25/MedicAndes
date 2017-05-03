
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object citasMobile_Scope0 {
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

class citasMobile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[CitaEntity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(citas:List[CitaEntity]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""
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

  <link rel="shortcut icon" href=""""),_display_(/*25.36*/routes/*25.42*/.Assets.versioned("imagesM/favicon.png")),format.raw/*25.82*/("""">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.cyan-light_blue.min.css">
  <link rel="stylesheet" href=""""),_display_(/*29.33*/routes/*29.39*/.Assets.versioned("cssM/styles.css")),format.raw/*29.75*/("""">
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
  """),format.raw/*40.3*/("""</style>
</head>
<body>
<div class="demo-layout mdl-layout mdl-js-layout mdl-layout--fixed-drawer mdl-layout--fixed-header">
  <header class="demo-header mdl-layout__header mdl-color--grey-100 mdl-color-text--grey-600">
    <div class="mdl-layout__header-row">
      <span class="mdl-layout-title">Citas</span>
      <div class="mdl-layout-spacer"></div>
    </div>
  </header>
  <div class="demo-drawer mdl-layout__drawer mdl-color--blue-grey-900 mdl-color-text--blue-grey-50">
    <header class="demo-drawer-header">
      <img src=""""),_display_(/*52.18*/routes/*52.24*/.Assets.versioned("imagesM/user.jpg")),format.raw/*52.61*/("""" class="demo-avatar">
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
      <div class="demo-cards mdl-cell mdl-cell--4-col mdl-cell--8-col-tablet mdl-grid mdl-grid--no-spacing">
        """),_display_(/*77.10*/for(citaActual <- citas) yield /*77.34*/{_display_(Seq[Any](format.raw/*77.35*/("""
          """),format.raw/*78.11*/("""<!--Card Element-->
        <div class="demo-updates mdl-card mdl-shadow--2dp mdl-cell mdl-cell--4-col mdl-cell--4-col-tablet mdl-cell--12-col-desktop">
          <div class="mdl-card__title mdl-card--expand mdl-color--teal-300">

              <h1 class="mdl-card__title-text inlineWords">"""),_display_(/*82.61*/citaActual/*82.71*/.getPaciente().getGrupoSanguineo()),format.raw/*82.105*/("""</h1>
              <h6 class="mdl-card__title-name inlineWords">"""),_display_(/*83.61*/citaActual/*83.71*/.getPaciente().getNombre()),format.raw/*83.97*/("""</h6>
              <h4 class="mdl-card__title-text">"""),_display_(/*84.49*/citaActual/*84.59*/.getDia()),format.raw/*84.68*/("""</h4>

          </div>
          <div class="mdl-card__supporting-text mdl-color-text--grey-600">
            """),_display_(/*88.14*/if(citaActual.getDiagnostico()==null)/*88.51*/{_display_(Seq[Any](format.raw/*88.52*/("""--""")))}/*88.55*/else/*88.59*/{_display_(_display_(/*88.61*/citaActual/*88.71*/.getDiagnostico()))}),format.raw/*88.89*/("""
          """),format.raw/*89.11*/("""</div>
        </div>
      <div class="demo-separator mdl-cell--1-col"></div>
        """)))}),format.raw/*92.10*/("""

      """),format.raw/*94.7*/("""</div>
    </div>
  </main>
</div>
<script src="https://code.getmdl.io/1.3.0/material.min.js"></script>
</body>
</html>
"""))
      }
    }
  }

  def render(citas:List[CitaEntity]): play.twirl.api.HtmlFormat.Appendable = apply(citas)

  def f:((List[CitaEntity]) => play.twirl.api.HtmlFormat.Appendable) = (citas) => apply(citas)

  def ref: this.type = this

}


}

/**/
object citasMobile extends citasMobile_Scope0.citasMobile
              /*
                  -- GENERATED --
                  DATE: Wed May 03 10:12:25 COT 2017
                  SOURCE: C:/Users/Camilo/Documents/GitHub/MedicAndes/app/views/citasMobile.scala.html
                  HASH: 6b1bec3bd78ebc3b85a5d92514db083895950c2e
                  MATRIX: 767->1|886->25|914->27|2077->1163|2092->1169|2153->1209|2550->1579|2565->1585|2622->1621|2682->1653|2711->1654|2746->1662|2929->1818|2957->1819|2988->1823|3563->2371|3578->2377|3636->2414|5524->4275|5564->4299|5603->4300|5643->4312|5965->4607|5984->4617|6040->4651|6134->4718|6153->4728|6200->4754|6282->4809|6301->4819|6331->4828|6474->4944|6520->4981|6559->4982|6581->4985|6594->4989|6624->4991|6643->5001|6684->5019|6724->5031|6846->5122|6883->5132
                  LINES: 27->1|32->1|33->2|56->25|56->25|56->25|60->29|60->29|60->29|62->31|62->31|63->32|70->39|70->39|71->40|83->52|83->52|83->52|108->77|108->77|108->77|109->78|113->82|113->82|113->82|114->83|114->83|114->83|115->84|115->84|115->84|119->88|119->88|119->88|119->88|119->88|119->88|119->88|119->88|120->89|123->92|125->94
                  -- GENERATED --
              */
          