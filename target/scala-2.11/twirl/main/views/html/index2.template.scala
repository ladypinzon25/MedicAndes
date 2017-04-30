
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
        <title>Bootstrap Metro Dashboard by Dennis Ji for ARM demo</title>
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
                    <div class="nav-no-collapse header-nav">
                        <ul class="nav pull-right">
                            <li class="dropdown hidden-phone">
                                <a class="btn dropdown-toggle navBarBtn" data-toggle="dropdown" href="#">
                                    <i class="icon-bell"></i>
                                    <span class="badge red">
                                        7 </span>
                                </a>
                                <ul class="dropdown-menu notifications">
                                    <li class="dropdown-menu-title">
                                        <span>You have 11 notifications</span>
                                        <a href="#refresh"><i class="icon-repeat"></i></a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon blue"><i class="icon-user"></i></span>
                                            <span class="message">New user registration</span>
                                            <span class="time">1 min</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon green"><i class="icon-comment-alt"></i></span>
                                            <span class="message">New comment</span>
                                            <span class="time">7 min</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon green"><i class="icon-comment-alt"></i></span>
                                            <span class="message">New comment</span>
                                            <span class="time">8 min</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon green"><i class="icon-comment-alt"></i></span>
                                            <span class="message">New comment</span>
                                            <span class="time">16 min</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon blue"><i class="icon-user"></i></span>
                                            <span class="message">New user registration</span>
                                            <span class="time">36 min</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon yellow"><i class="icon-shopping-cart"></i></span>
                                            <span class="message">2 items sold</span>
                                            <span class="time">1 hour</span>
                                        </a>
                                    </li>
                                    <li class="warning">
                                        <a href="#">
                                            <span class="icon red"><i class="icon-user"></i></span>
                                            <span class="message">User deleted account</span>
                                            <span class="time">2 hour</span>
                                        </a>
                                    </li>
                                    <li class="warning">
                                        <a href="#">
                                            <span class="icon red"><i class="icon-shopping-cart"></i></span>
                                            <span class="message">New comment</span>
                                            <span class="time">6 hour</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon green"><i class="icon-comment-alt"></i></span>
                                            <span class="message">New comment</span>
                                            <span class="time">yesterday</span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="icon blue"><i class="icon-user"></i></span>
                                            <span class="message">New user registration</span>
                                            <span class="time">yesterday</span>
                                        </a>
                                    </li>
                                    <li class="dropdown-menu-sub-footer">
                                        <a>View all notifications</a>
                                    </li>
                                </ul>
                            </li>
                                <!-- start: Notifications Dropdown -->
                            <li class="dropdown hidden-phone">
                                <a class="btn dropdown-toggle navBarBtn" data-toggle="dropdown" href="#">
                                    <i class="icon-calendar"></i>
                                    <span class="badge red">
                                        5 </span>
                                </a>
                                <ul class="dropdown-menu tasks">
                                    <li class="dropdown-menu-title">
                                        <span>You have 17 tasks in progress</span>
                                        <a href="#refresh"><i class="icon-repeat"></i></a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="header">
                                                <span class="title">iOS Development</span>
                                                <span class="percent"></span>
                                            </span>
                                            <div class="taskProgress progressSlim red">80</div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="header">
                                                <span class="title">Android Development</span>
                                                <span class="percent"></span>
                                            </span>
                                            <div class="taskProgress progressSlim green">47</div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="header">
                                                <span class="title">ARM Development</span>
                                                <span class="percent"></span>
                                            </span>
                                            <div class="taskProgress progressSlim yellow">32</div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="header">
                                                <span class="title">ARM Development</span>
                                                <span class="percent"></span>
                                            </span>
                                            <div class="taskProgress progressSlim greenLight">63</div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="header">
                                                <span class="title">ARM Development</span>
                                                <span class="percent"></span>
                                            </span>
                                            <div class="taskProgress progressSlim orange">80</div>
                                        </a>
                                    </li>
                                    <li>
                                        <a class="dropdown-menu-sub-footer">View all tasks</a>
                                    </li>
                                </ul>
                            </li>
                                <!-- end: Notifications Dropdown -->
                                <!-- start: Message Dropdown -->
                            <li class="dropdown hidden-phone">
                                <a class="btn dropdown-toggle navBarBtn" data-toggle="dropdown" href="#">
                                    <i class="icon-envelope"></i>
                                    <span class="badge red">
                                        4 </span>
                                </a>
                                <ul class="dropdown-menu messages">
                                    <li class="dropdown-menu-title">
                                        <span>You have 9 messages</span>
                                        <a href="#refresh"><i class="icon-repeat"></i></a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="avatar"><img src=""""),_display_(/*225.77*/routes/*225.83*/.Assets.versioned("img2/avatar.jpg")),format.raw/*225.119*/("""" alt="Avatar"></span>
                                            <span class="header">
                                                <span class="from">
                                                    Dennis Ji
                                                </span>
                                                <span class="time">
                                                    6 min
                                                </span>
                                            </span>
                                            <span class="message">
                                                Lorem ipsum dolor sit amet consectetur adipiscing elit, et al commore
                                            </span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="avatar"><img src=""""),_display_(/*241.77*/routes/*241.83*/.Assets.versioned("img2/avatar.jpg")),format.raw/*241.119*/("""" alt="Avatar"></span>
                                            <span class="header">
                                                <span class="from">
                                                    Dennis Ji
                                                </span>
                                                <span class="time">
                                                    56 min
                                                </span>
                                            </span>
                                            <span class="message">
                                                Lorem ipsum dolor sit amet consectetur adipiscing elit, et al commore
                                            </span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="avatar"><img src=""""),_display_(/*257.77*/routes/*257.83*/.Assets.versioned("img2/avatar.jpg")),format.raw/*257.119*/("""" alt="Avatar"></span>
                                            <span class="header">
                                                <span class="from">
                                                    Dennis Ji
                                                </span>
                                                <span class="time">
                                                    3 hours
                                                </span>
                                            </span>
                                            <span class="message">
                                                Lorem ipsum dolor sit amet consectetur adipiscing elit, et al commore
                                            </span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="avatar"><img src=""""),_display_(/*273.77*/routes/*273.83*/.Assets.versioned("img2/avatar.jpg")),format.raw/*273.119*/("""" alt="Avatar"></span>
                                            <span class="header">
                                                <span class="from">
                                                    Dennis Ji
                                                </span>
                                                <span class="time">
                                                    yesterday
                                                </span>
                                            </span>
                                            <span class="message">
                                                Lorem ipsum dolor sit amet consectetur adipiscing elit, et al commore
                                            </span>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <span class="avatar"><img src=""""),_display_(/*289.77*/routes/*289.83*/.Assets.versioned("img2/avatar.jpg")),format.raw/*289.119*/("""" alt="Avatar"></span>
                                            <span class="header">
                                                <span class="from">
                                                    Dennis Ji
                                                </span>
                                                <span class="time">
                                                    Jul 25, 2012
                                                </span>
                                            </span>
                                            <span class="message">
                                                Lorem ipsum dolor sit amet consectetur adipiscing elit, et al commore
                                            </span>
                                        </a>
                                    </li>
                                    <li>
                                        <a class="dropdown-menu-sub-footer">View all messages</a>
                                    </li>
                                </ul>
                            </li>

                                <!-- start: User Dropdown -->
                            <li class="dropdown">
                                <a class="btn dropdown-toggle navBarBtn" data-toggle="dropdown" href="#">
                                    <i class="halflings-icon white user"></i> Dennis Ji
                                    <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu">
                                    <li class="dropdown-menu-title">
                                        <span>Account Settings</span>
                                    </li>
                                    <li><a href="#"><i class="halflings-icon user"></i> Profile</a></li>
                                    <li><a href="login.html"><i class="halflings-icon off"></i> Logout</a></li>
                                </ul>
                            </li>
                                <!-- end: User Dropdown -->
                        </ul>
                    </div>
                        <!-- end: Header Menu -->

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
                            <li><a href="home"><i class="icon-edit"></i><span class="hidden-tablet"> Home</span></a></li>
                            <li><a href="index.html"><i class="icon-bar-chart"></i><span class="hidden-tablet"> Perfil</span></a></li>
                            <li><a href="messages.html"><i class="icon-envelope"></i><span class="hidden-tablet"> Citas</span></a></li>
                            <li><a href="pacientes"><i class="icon-tasks"></i><span class="hidden-tablet"> Pacientes</span></a></li>
                            <li><a href="ui.html"><i class="icon-eye-open"></i><span class="hidden-tablet"> Notificaciones</span></a></li>
                            <li><a href="widgets.html"><i class="icon-dashboard"></i><span class="hidden-tablet"> Ayuda</span></a></li>

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

                 """),_display_(/*359.19*/content),format.raw/*359.26*/("""

                """),format.raw/*361.17*/("""<!-- end: Content -->
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

        <script src=""""),_display_(/*398.23*/routes/*398.29*/.Assets.versioned("js2/jquery-1.9.1.min.js")),format.raw/*398.73*/(""""></script>
        <script src=""""),_display_(/*399.23*/routes/*399.29*/.Assets.versioned("js2/jquery-migrate-1.0.0.min.js")),format.raw/*399.81*/(""""></script>

        <script src=""""),_display_(/*401.23*/routes/*401.29*/.Assets.versioned("js2/jquery-ui-1.10.0.custom.min.js")),format.raw/*401.84*/(""""></script>

        <script src=""""),_display_(/*403.23*/routes/*403.29*/.Assets.versioned("js2/jquery.ui.touch-punch.js")),format.raw/*403.78*/(""""></script>

        <script src=""""),_display_(/*405.23*/routes/*405.29*/.Assets.versioned("js2/modernizr.js")),format.raw/*405.66*/(""""></script>

        <script src=""""),_display_(/*407.23*/routes/*407.29*/.Assets.versioned("js2/bootstrap.min.js")),format.raw/*407.70*/(""""></script>

        <script src=""""),_display_(/*409.23*/routes/*409.29*/.Assets.versioned("js2/jquery.cookie.js")),format.raw/*409.70*/(""""></script>

        <script src=""""),_display_(/*411.23*/routes/*411.29*/.Assets.versioned("js2/fullcalendar.min.js")),format.raw/*411.73*/(""""></script>

        <script src=""""),_display_(/*413.23*/routes/*413.29*/.Assets.versioned("js2/jquery.dataTables.min.js")),format.raw/*413.78*/(""""></script>

        <script src=""""),_display_(/*415.23*/routes/*415.29*/.Assets.versioned("js2/excanvas.js")),format.raw/*415.65*/(""""></script>
        <script src=""""),_display_(/*416.23*/routes/*416.29*/.Assets.versioned("js2/jquery.flot.js")),format.raw/*416.68*/(""""></script>
        <script src=""""),_display_(/*417.23*/routes/*417.29*/.Assets.versioned("js2/jquery.flot.pie.js")),format.raw/*417.72*/(""""></script>
        <script src=""""),_display_(/*418.23*/routes/*418.29*/.Assets.versioned("js2/jquery.flot.stack.js")),format.raw/*418.74*/(""""></script>
        <script src=""""),_display_(/*419.23*/routes/*419.29*/.Assets.versioned("js2/jquery.flot.resize.min.js")),format.raw/*419.79*/(""""></script>

        <script src=""""),_display_(/*421.23*/routes/*421.29*/.Assets.versioned("js2/jquery.chosen.min.js")),format.raw/*421.74*/(""""></script>

        <script src=""""),_display_(/*423.23*/routes/*423.29*/.Assets.versioned("js2/jquery.uniform.min.js")),format.raw/*423.75*/(""""></script>

        <script src=""""),_display_(/*425.23*/routes/*425.29*/.Assets.versioned("js2/jquery.cleditor.min.js")),format.raw/*425.76*/(""""></script>

        <script src=""""),_display_(/*427.23*/routes/*427.29*/.Assets.versioned("js2/jquery.noty.js")),format.raw/*427.68*/(""""></script>

        <script src=""""),_display_(/*429.23*/routes/*429.29*/.Assets.versioned("js2/jquery.elfinder.min.js")),format.raw/*429.76*/(""""></script>

        <script src=""""),_display_(/*431.23*/routes/*431.29*/.Assets.versioned("js2/jquery.raty.min.js")),format.raw/*431.72*/(""""></script>

        <script src=""""),_display_(/*433.23*/routes/*433.29*/.Assets.versioned("js2/jquery.iphone.toggle.js")),format.raw/*433.77*/(""""></script>

        <script src=""""),_display_(/*435.23*/routes/*435.29*/.Assets.versioned("js2/jquery.uploadify-3.1.min.js")),format.raw/*435.81*/(""""></script>

        <script src=""""),_display_(/*437.23*/routes/*437.29*/.Assets.versioned("js2/jquery.gritter.min.js")),format.raw/*437.75*/(""""></script>

        <script src=""""),_display_(/*439.23*/routes/*439.29*/.Assets.versioned("js2/jquery.imagesloaded.js")),format.raw/*439.76*/(""""></script>

        <script src=""""),_display_(/*441.23*/routes/*441.29*/.Assets.versioned("js2/jquery.masonry.min.js")),format.raw/*441.75*/(""""></script>

        <script src=""""),_display_(/*443.23*/routes/*443.29*/.Assets.versioned("js2/jquery.knob.modified.js")),format.raw/*443.77*/(""""></script>

        <script src=""""),_display_(/*445.23*/routes/*445.29*/.Assets.versioned("js2/jquery.sparkline.min.js")),format.raw/*445.77*/(""""></script>

        <script src=""""),_display_(/*447.23*/routes/*447.29*/.Assets.versioned("js2/counter.js")),format.raw/*447.64*/(""""></script>

        <script src=""""),_display_(/*449.23*/routes/*449.29*/.Assets.versioned("js2/retina.js")),format.raw/*449.63*/(""""></script>

        <script src=""""),_display_(/*451.23*/routes/*451.29*/.Assets.versioned("js2/custom.js")),format.raw/*451.63*/(""""></script>

        <script src=""""),_display_(/*453.23*/routes/*453.29*/.Assets.versioned("js2/medicAndes.js")),format.raw/*453.67*/(""""></script>
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
                  DATE: Sun Apr 30 17:52:23 COT 2017
                  SOURCE: C:/Temp/Nueva carpeta (2)/MedicAndes-master/app/views/index2.scala.html
                  HASH: 8f1ec19306d7f833ff38c32d6c6b786c9e32d0e8
                  MATRIX: 834->96|944->111|975->309|1004->311|1750->1030|1765->1036|1829->1079|1898->1121|1913->1127|1988->1181|2073->1239|2088->1245|2144->1280|2240->1349|2255->1355|2323->1401|2697->1748|2712->1754|2770->1791|2859->1853|2874->1859|2933->1897|3558->2495|3573->2501|3629->2535|14523->13401|14539->13407|14598->13443|15645->14462|15661->14468|15720->14504|16768->15524|16784->15530|16843->15566|17892->16587|17908->16593|17967->16629|19018->17652|19034->17658|19093->17694|23099->21672|23128->21679|23177->21699|24722->23216|24738->23222|24804->23266|24867->23301|24883->23307|24957->23359|25022->23396|25038->23402|25115->23457|25180->23494|25196->23500|25267->23549|25332->23586|25348->23592|25407->23629|25472->23666|25488->23672|25551->23713|25616->23750|25632->23756|25695->23797|25760->23834|25776->23840|25842->23884|25907->23921|25923->23927|25994->23976|26059->24013|26075->24019|26133->24055|26196->24090|26212->24096|26273->24135|26336->24170|26352->24176|26417->24219|26480->24254|26496->24260|26563->24305|26626->24340|26642->24346|26714->24396|26779->24433|26795->24439|26862->24484|26927->24521|26943->24527|27011->24573|27076->24610|27092->24616|27161->24663|27226->24700|27242->24706|27303->24745|27368->24782|27384->24788|27453->24835|27518->24872|27534->24878|27599->24921|27664->24958|27680->24964|27750->25012|27815->25049|27831->25055|27905->25107|27970->25144|27986->25150|28054->25196|28119->25233|28135->25239|28204->25286|28269->25323|28285->25329|28353->25375|28418->25412|28434->25418|28504->25466|28569->25503|28585->25509|28655->25557|28720->25594|28736->25600|28793->25635|28858->25672|28874->25678|28930->25712|28995->25749|29011->25755|29067->25789|29132->25826|29148->25832|29208->25870
                  LINES: 30->5|35->5|37->11|38->12|55->29|55->29|55->29|56->30|56->30|56->30|57->31|57->31|57->31|58->32|58->32|58->32|65->39|65->39|65->39|68->42|68->42|68->42|83->57|83->57|83->57|251->225|251->225|251->225|267->241|267->241|267->241|283->257|283->257|283->257|299->273|299->273|299->273|315->289|315->289|315->289|385->359|385->359|387->361|424->398|424->398|424->398|425->399|425->399|425->399|427->401|427->401|427->401|429->403|429->403|429->403|431->405|431->405|431->405|433->407|433->407|433->407|435->409|435->409|435->409|437->411|437->411|437->411|439->413|439->413|439->413|441->415|441->415|441->415|442->416|442->416|442->416|443->417|443->417|443->417|444->418|444->418|444->418|445->419|445->419|445->419|447->421|447->421|447->421|449->423|449->423|449->423|451->425|451->425|451->425|453->427|453->427|453->427|455->429|455->429|455->429|457->431|457->431|457->431|459->433|459->433|459->433|461->435|461->435|461->435|463->437|463->437|463->437|465->439|465->439|465->439|467->441|467->441|467->441|469->443|469->443|469->443|471->445|471->445|471->445|473->447|473->447|473->447|475->449|475->449|475->449|477->451|477->451|477->451|479->453|479->453|479->453
                  -- GENERATED --
              */
          