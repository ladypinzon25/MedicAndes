
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

class index2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a single argument, a String containing a
* message to display.
*/
  def apply/*5.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.17*/("""

"""),format.raw/*11.3*/("""
"""),format.raw/*12.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>

            <!-- start: Meta -->
        <meta charset="utf-8">
        <title>MEDICANDES</title>
        <meta name="description" content="Bootstrap Metro Dashboard">
        <meta name="author" content="Dennis Ji">
        <meta name="keyword" content="Metro, Metro UI, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
            <!-- end: Meta -->

            <!-- start: Mobile Specific -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- end: Mobile Specific -->

            <!-- start: CSS -->
        <link id="bootstrap-style" href=""""),_display_(/*29.43*/routes/*29.49*/.Assets.versioned("css2/bootstrap.min.css")),format.raw/*29.92*/("""" rel="stylesheet">
        <link href=""""),_display_(/*30.22*/routes/*30.28*/.Assets.versioned("css2/bootstrap-responsive.min.css")),format.raw/*30.82*/("""" rel="stylesheet">
        <link id="base-style" href=""""),_display_(/*31.38*/routes/*31.44*/.Assets.versioned("css2/style.css")),format.raw/*31.79*/("""" rel="stylesheet">
        <link id="base-style-responsive" href=""""),_display_(/*32.49*/routes/*32.55*/.Assets.versioned("css2/style-responsive.css")),format.raw/*32.101*/("""" rel="stylesheet">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
            <!-- end: CSS -->



            <!-- start: Favicon -->
        <link rel="shortcut icon" href=""""),_display_(/*39.42*/routes/*39.48*/.Assets.versioned("img2/favicon.ico")),format.raw/*39.85*/("""">
            <!-- end: Favicon -->

        <link href=""""),_display_(/*42.22*/routes/*42.28*/.Assets.versioned("css2/myStyles.css")),format.raw/*42.66*/("""" rel="stylesheet">


    </head>

    <body>
            <!-- start: Header -->
        <div class="navbar">
            <div class="navbar-inner">
                <div class="container-fluid">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>
                    <a class="brand" href="index.html"><img src=""""),_display_(/*57.67*/routes/*57.73*/.Assets.versioned("img2/logo.png")),format.raw/*57.107*/("""" alt="logo" class="img-responsive logo myLogo"></a>

                        <!-- start: Header Menu -->


                </div>
            </div>
        </div>
            <!-- start: Header -->

        <div class="container-fluid-full">
            <div class="row-fluid">

                    <!-- start: Main Menu -->
                <div id="sidebar-left" class="span2">
                    <div class="nav-collapse sidebar-nav">
                        <ul class="nav nav-tabs nav-stacked main-menu">
                            <li><a href="../../../app/home"><i class="icon-edit"></i><span class="hidden-tablet"> Home</span></a></li>
                            <li><a href="../../../app/index.html"><i class="icon-bar-chart"></i><span class="hidden-tablet"> Perfil</span></a></li>
                            <li><a href="../../../app/citas"><i class="icon-envelope"></i><span class="hidden-tablet"> Citas</span></a></li>
                            <li><a href="../../../app/pacientes"><i class="icon-tasks"></i><span class="hidden-tablet"> Pacientes</span></a></li>
                            <li><a href="../../../app/ui.html"><i class="icon-eye-open"></i><span class="hidden-tablet"> Notificaciones</span></a></li>
                            <li><a href="../../../app/widgets.html"><i class="icon-dashboard"></i><span class="hidden-tablet"> Ayuda</span></a></li>
                            <li><a href="../../../app/widgets.html"><i class="icon-lock"></i><span class="hidden-tablet">Salir</span></a></li>
                        </ul>
                    </div>
                </div>
                    <!-- end: Main Menu -->

                <noscript>
                    <div class="alert alert-block span10">
                        <h4 class="alert-heading">Warning!</h4>
                        <p>You need to have <a href="http://en.wikipedia.org/wiki/JavaScript" target="_blank">JavaScript</a> enabled to use this site.</p>
                    </div>
                </noscript>

                 """),_display_(/*93.19*/content),format.raw/*93.26*/("""

                """),format.raw/*95.17*/("""<!-- end: Content -->
            </div><!--/#content.span10-->
        </div><!--/fluid-row-->

        <div class="modal hide fade" id="myModal">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">×</button>
                <h3>Settings</h3>
            </div>
            <div class="modal-body">
                <p>Here settings can be configured...</p>
            </div>
            <div class="modal-footer">
                <a href="#" class="btn" data-dismiss="modal">Close</a>
                <a href="#" class="btn btn-primary">Save changes</a>
            </div>
        </div>
        <div class="common-modal modal fade" id="common-Modal1" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-content">
                <ul class="list-inline item-details">
                    <li><a href="http://themifycloud.com">Admin templates</a></li>
                    <li><a href="http://themescloud.org">Bootstrap themes</a></li>
                </ul>
            </div>
        </div>
        <div class="clearfix"></div>

        <footer>

            <p>
                <span style="text-align:left;float:left">&copy; 2013 <a href="http://themifycloud.com/downloads/janux-free-responsive-admin-dashboard-template/" alt="Bootstrap_Metro_Dashboard">JANUX Responsive Dashboard</a></span>
            </p>

        </footer>

            <!-- start: JavaScript-->

        <script src=""""),_display_(/*132.23*/routes/*132.29*/.Assets.versioned("js2/jquery-1.9.1.min.js")),format.raw/*132.73*/(""""></script>
        <script src=""""),_display_(/*133.23*/routes/*133.29*/.Assets.versioned("js2/jquery-migrate-1.0.0.min.js")),format.raw/*133.81*/(""""></script>

        <script src=""""),_display_(/*135.23*/routes/*135.29*/.Assets.versioned("js2/jquery-ui-1.10.0.custom.min.js")),format.raw/*135.84*/(""""></script>

        <script src=""""),_display_(/*137.23*/routes/*137.29*/.Assets.versioned("js2/jquery.ui.touch-punch.js")),format.raw/*137.78*/(""""></script>

        <script src=""""),_display_(/*139.23*/routes/*139.29*/.Assets.versioned("js2/modernizr.js")),format.raw/*139.66*/(""""></script>

        <script src=""""),_display_(/*141.23*/routes/*141.29*/.Assets.versioned("js2/bootstrap.min.js")),format.raw/*141.70*/(""""></script>

        <script src=""""),_display_(/*143.23*/routes/*143.29*/.Assets.versioned("js2/jquery.cookie.js")),format.raw/*143.70*/(""""></script>

        <script src=""""),_display_(/*145.23*/routes/*145.29*/.Assets.versioned("js2/fullcalendar.min.js")),format.raw/*145.73*/(""""></script>

        <script src=""""),_display_(/*147.23*/routes/*147.29*/.Assets.versioned("js2/jquery.dataTables.min.js")),format.raw/*147.78*/(""""></script>

        <script src=""""),_display_(/*149.23*/routes/*149.29*/.Assets.versioned("js2/excanvas.js")),format.raw/*149.65*/(""""></script>
        <script src=""""),_display_(/*150.23*/routes/*150.29*/.Assets.versioned("js2/jquery.flot.js")),format.raw/*150.68*/(""""></script>
        <script src=""""),_display_(/*151.23*/routes/*151.29*/.Assets.versioned("js2/jquery.flot.pie.js")),format.raw/*151.72*/(""""></script>
        <script src=""""),_display_(/*152.23*/routes/*152.29*/.Assets.versioned("js2/jquery.flot.stack.js")),format.raw/*152.74*/(""""></script>
        <script src=""""),_display_(/*153.23*/routes/*153.29*/.Assets.versioned("js2/jquery.flot.resize.min.js")),format.raw/*153.79*/(""""></script>

        <script src=""""),_display_(/*155.23*/routes/*155.29*/.Assets.versioned("js2/jquery.chosen.min.js")),format.raw/*155.74*/(""""></script>

        <script src=""""),_display_(/*157.23*/routes/*157.29*/.Assets.versioned("js2/jquery.uniform.min.js")),format.raw/*157.75*/(""""></script>

        <script src=""""),_display_(/*159.23*/routes/*159.29*/.Assets.versioned("js2/jquery.cleditor.min.js")),format.raw/*159.76*/(""""></script>

        <script src=""""),_display_(/*161.23*/routes/*161.29*/.Assets.versioned("js2/jquery.noty.js")),format.raw/*161.68*/(""""></script>

        <script src=""""),_display_(/*163.23*/routes/*163.29*/.Assets.versioned("js2/jquery.elfinder.min.js")),format.raw/*163.76*/(""""></script>

        <script src=""""),_display_(/*165.23*/routes/*165.29*/.Assets.versioned("js2/jquery.raty.min.js")),format.raw/*165.72*/(""""></script>

        <script src=""""),_display_(/*167.23*/routes/*167.29*/.Assets.versioned("js2/jquery.iphone.toggle.js")),format.raw/*167.77*/(""""></script>

        <script src=""""),_display_(/*169.23*/routes/*169.29*/.Assets.versioned("js2/jquery.uploadify-3.1.min.js")),format.raw/*169.81*/(""""></script>

        <script src=""""),_display_(/*171.23*/routes/*171.29*/.Assets.versioned("js2/jquery.gritter.min.js")),format.raw/*171.75*/(""""></script>

        <script src=""""),_display_(/*173.23*/routes/*173.29*/.Assets.versioned("js2/jquery.imagesloaded.js")),format.raw/*173.76*/(""""></script>

        <script src=""""),_display_(/*175.23*/routes/*175.29*/.Assets.versioned("js2/jquery.masonry.min.js")),format.raw/*175.75*/(""""></script>

        <script src=""""),_display_(/*177.23*/routes/*177.29*/.Assets.versioned("js2/jquery.knob.modified.js")),format.raw/*177.77*/(""""></script>

        <script src=""""),_display_(/*179.23*/routes/*179.29*/.Assets.versioned("js2/jquery.sparkline.min.js")),format.raw/*179.77*/(""""></script>

        <script src=""""),_display_(/*181.23*/routes/*181.29*/.Assets.versioned("js2/counter.js")),format.raw/*181.64*/(""""></script>

        <script src=""""),_display_(/*183.23*/routes/*183.29*/.Assets.versioned("js2/retina.js")),format.raw/*183.63*/(""""></script>

        <script src=""""),_display_(/*185.23*/routes/*185.29*/.Assets.versioned("js2/custom.js")),format.raw/*185.63*/(""""></script>

        <script src=""""),_display_(/*187.23*/routes/*187.29*/.Assets.versioned("js2/medicAndes.js")),format.raw/*187.67*/(""""></script>
            <!-- end: JavaScript-->

    </body>
</html>
"""))
      }
    }
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

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
                  DATE: Mon May 01 19:03:54 COT 2017
                  SOURCE: C:/Temp/MedicAndes/app/views/index2.scala.html
                  HASH: 2fb96b5147a4bc86751c53ea567417b3582b4ce0
                  MATRIX: 834->96|944->111|975->309|1004->311|1709->989|1724->995|1788->1038|1857->1080|1872->1086|1947->1140|2032->1198|2047->1204|2103->1239|2199->1308|2214->1314|2282->1360|2656->1707|2671->1713|2729->1750|2818->1812|2833->1818|2892->1856|3517->2454|3532->2460|3588->2494|5681->4560|5709->4567|5757->4587|7302->6104|7318->6110|7384->6154|7447->6189|7463->6195|7537->6247|7602->6284|7618->6290|7695->6345|7760->6382|7776->6388|7847->6437|7912->6474|7928->6480|7987->6517|8052->6554|8068->6560|8131->6601|8196->6638|8212->6644|8275->6685|8340->6722|8356->6728|8422->6772|8487->6809|8503->6815|8574->6864|8639->6901|8655->6907|8713->6943|8776->6978|8792->6984|8853->7023|8916->7058|8932->7064|8997->7107|9060->7142|9076->7148|9143->7193|9206->7228|9222->7234|9294->7284|9359->7321|9375->7327|9442->7372|9507->7409|9523->7415|9591->7461|9656->7498|9672->7504|9741->7551|9806->7588|9822->7594|9883->7633|9948->7670|9964->7676|10033->7723|10098->7760|10114->7766|10179->7809|10244->7846|10260->7852|10330->7900|10395->7937|10411->7943|10485->7995|10550->8032|10566->8038|10634->8084|10699->8121|10715->8127|10784->8174|10849->8211|10865->8217|10933->8263|10998->8300|11014->8306|11084->8354|11149->8391|11165->8397|11235->8445|11300->8482|11316->8488|11373->8523|11438->8560|11454->8566|11510->8600|11575->8637|11591->8643|11647->8677|11712->8714|11728->8720|11788->8758
                  LINES: 30->5|35->5|37->11|38->12|55->29|55->29|55->29|56->30|56->30|56->30|57->31|57->31|57->31|58->32|58->32|58->32|65->39|65->39|65->39|68->42|68->42|68->42|83->57|83->57|83->57|119->93|119->93|121->95|158->132|158->132|158->132|159->133|159->133|159->133|161->135|161->135|161->135|163->137|163->137|163->137|165->139|165->139|165->139|167->141|167->141|167->141|169->143|169->143|169->143|171->145|171->145|171->145|173->147|173->147|173->147|175->149|175->149|175->149|176->150|176->150|176->150|177->151|177->151|177->151|178->152|178->152|178->152|179->153|179->153|179->153|181->155|181->155|181->155|183->157|183->157|183->157|185->159|185->159|185->159|187->161|187->161|187->161|189->163|189->163|189->163|191->165|191->165|191->165|193->167|193->167|193->167|195->169|195->169|195->169|197->171|197->171|197->171|199->173|199->173|199->173|201->175|201->175|201->175|203->177|203->177|203->177|205->179|205->179|205->179|207->181|207->181|207->181|209->183|209->183|209->183|211->185|211->185|211->185|213->187|213->187|213->187
                  -- GENERATED --
              */
          