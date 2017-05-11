
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object consejosPaciente_Scope0 {
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

class consejosPaciente extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[PacienteEntity,List[ConsejoEntity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(paciente: PacienteEntity)(consejos:List[ConsejoEntity]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""
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
          <span class="mdl-layout-title">"""),_display_(/*46.43*/paciente/*46.51*/.getNombre()),format.raw/*46.63*/("""</span>
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
          <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">event</i>Citas</a>
          <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">people</i>Pacientes</a>
          <a class="mdl-navigation__link" href=""><i class="mdl-color-text--blue-grey-400 material-icons" role="presentation">settings</i>Configuración</a>
          <div class="mdl-layout-spacer"></div>
            <!--<a class="mdl-navigation__link" href=""><i class="mdl-color-text&#45;&#45;blue-grey-400 material-icons" role="presentation">help_outline</i><span class="visuallyhidden">Help</span></a>-->
        </nav>
      </div>
      <main class="mdl-layout__content mdl-color--grey-100">
        <div class="mdl-grid demo-content">
          <div class="demo-cards mdl-cell mdl-cell--4-col mdl-cell--8-col-tablet mdl-grid mdl-grid--no-spacing">
          """),_display_(/*77.12*/for(consejo <- consejos) yield /*77.36*/{_display_(Seq[Any](format.raw/*77.37*/("""
              """),format.raw/*78.15*/("""<!--Card Element-->
            <div class="demo-updates mdl-card mdl-shadow--2dp mdl-cell mdl-cell--4-col mdl-cell--4-col-tablet mdl-cell--12-col-desktop">
              <div class="mdl-card__title mdl-card--expand mdl-color--teal-300">

                <h1 class="mdl-card__title-text inlineWords">"""),_display_(/*82.63*/paciente/*82.71*/.getNombre()),format.raw/*82.83*/("""</h1>
                <h4 class="mdl-card__title-text">"""),_display_(/*83.51*/consejo/*83.58*/.getDia()),format.raw/*83.67*/("""</h4>

              </div>
              <div class="mdl-card__supporting-text mdl-color-text--grey-600">
                Mensaje: """),_display_(/*87.27*/if(consejo.getMensaje().equals(""))/*87.62*/{_display_(Seq[Any](format.raw/*87.63*/("""--""")))}/*87.66*/else/*87.70*/{_display_(_display_(/*87.72*/consejo/*87.79*/.getMensaje()))}),format.raw/*87.93*/("""
                """),format.raw/*88.17*/("""<br>
                Dieta: """),_display_(/*89.25*/if(consejo.getDieta().equals(""))/*89.58*/{_display_(Seq[Any](format.raw/*89.59*/("""--""")))}/*89.62*/else/*89.66*/{_display_(_display_(/*89.68*/consejo/*89.75*/.getDieta()))}),format.raw/*89.87*/("""
                """),format.raw/*90.17*/("""<br>
                Actividad Fisica: """),_display_(/*91.36*/if(consejo.getActividadFisica().equals(""))/*91.79*/{_display_(Seq[Any](format.raw/*91.80*/("""--""")))}/*91.83*/else/*91.87*/{_display_(_display_(/*91.89*/consejo/*91.96*/.getActividadFisica()))}),format.raw/*91.118*/("""
                """),format.raw/*92.17*/("""<br>
                Medicamentos: """),_display_(/*93.32*/if(consejo.getMedicamentos().equals(""))/*93.72*/{_display_(Seq[Any](format.raw/*93.73*/("""--""")))}/*93.76*/else/*93.80*/{_display_(_display_(/*93.82*/consejo/*93.89*/.getMedicamentos()))}),format.raw/*93.108*/("""
              """),format.raw/*94.15*/("""</div>
            </div>
            <div class="demo-separator mdl-cell--1-col"></div>
          """)))}),format.raw/*97.12*/("""

          """),format.raw/*99.11*/("""</div>
        </div>
      </main>
    </div>
    <script src="https://code.getmdl.io/1.3.0/material.min.js"></script>
  </body>
</html>"""))
      }
    }
  }

  def render(paciente:PacienteEntity,consejos:List[ConsejoEntity]): play.twirl.api.HtmlFormat.Appendable = apply(paciente)(consejos)

  def f:((PacienteEntity) => (List[ConsejoEntity]) => play.twirl.api.HtmlFormat.Appendable) = (paciente) => (consejos) => apply(paciente)(consejos)

  def ref: this.type = this

}


}

/**/
object consejosPaciente extends consejosPaciente_Scope0.consejosPaciente
              /*
                  -- GENERATED --
                  DATE: Thu May 11 13:47:14 COT 2017
                  SOURCE: C:/Users/Camilo/Documents/GitHub/MedicAndes/app/views/consejosPaciente.scala.html
                  HASH: e3ca9b7b715ebb467501ea64e5a96db80c8fb79f
                  MATRIX: 795->1|946->57|974->59|2179->1237|2194->1243|2255->1283|2660->1661|2675->1667|2732->1703|2794->1737|2823->1738|2858->1746|3041->1902|3069->1903|3102->1909|3454->2234|3471->2242|3504->2254|3794->2517|3809->2523|3867->2560|5841->4507|5881->4531|5920->4532|5964->4548|6296->4853|6313->4861|6346->4873|6430->4930|6446->4937|6476->4946|6640->5083|6684->5118|6723->5119|6745->5122|6758->5126|6788->5128|6804->5135|6841->5149|6887->5167|6944->5197|6986->5230|7025->5231|7047->5234|7060->5238|7090->5240|7106->5247|7141->5259|7187->5277|7255->5318|7307->5361|7346->5362|7368->5365|7381->5369|7411->5371|7427->5378|7473->5400|7519->5418|7583->5455|7632->5495|7671->5496|7693->5499|7706->5503|7736->5505|7752->5512|7795->5531|7839->5547|7973->5650|8015->5664
                  LINES: 27->1|32->1|33->2|56->25|56->25|56->25|60->29|60->29|60->29|62->31|62->31|63->32|70->39|70->39|71->40|77->46|77->46|77->46|83->52|83->52|83->52|108->77|108->77|108->77|109->78|113->82|113->82|113->82|114->83|114->83|114->83|118->87|118->87|118->87|118->87|118->87|118->87|118->87|118->87|119->88|120->89|120->89|120->89|120->89|120->89|120->89|120->89|120->89|121->90|122->91|122->91|122->91|122->91|122->91|122->91|122->91|122->91|123->92|124->93|124->93|124->93|124->93|124->93|124->93|124->93|124->93|125->94|128->97|130->99
                  -- GENERATED --
              */
          