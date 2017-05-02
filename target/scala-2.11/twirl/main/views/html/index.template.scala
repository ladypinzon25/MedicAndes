
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[MedicoEntity,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(medico: MedicoEntity):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.24*/("""

"""),format.raw/*11.4*/("""
"""),format.raw/*12.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>MedicAndes - Responsive HTML &amp; Bootstrap Template</title>
        <link rel="stylesheet" href=""""),_display_(/*20.39*/routes/*20.45*/.Assets.versioned("css/font-awesome.min.css")),format.raw/*20.90*/("""">
        <link rel="stylesheet" href=""""),_display_(/*21.39*/routes/*21.45*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*21.87*/("""">
        <link rel="stylesheet" href=""""),_display_(/*22.39*/routes/*22.45*/.Assets.versioned("css/style.css")),format.raw/*22.79*/("""">
        <link rel="stylesheet" href=""""),_display_(/*23.39*/routes/*23.45*/.Assets.versioned("css/myStyles.css")),format.raw/*23.82*/("""">
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:600italic,400,800,700,300' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=BenchNine:300,400,700' rel='stylesheet' type='text/css'>
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.versioned("js/modernizr.js")),format.raw/*26.65*/(""""></script>
            <!--[if lt IE 9]>

    <![endif]-->

    </head>
    <body>

            <!-- ====================================================
	header section -->
        <header class="top-header">
            <div class="container">
                <div class="row">
                    <div class="col-xs-5 header-logo">
                        <br>
                        <a href="index.html"><img src=""""),_display_(/*41.57*/routes/*41.63*/.Assets.versioned("img/logo.png")),format.raw/*41.96*/("""" alt="logo" class="img-responsive logo myLogo"></a>
                    </div>

                    <div class="col-md-7">
                        <nav class="navbar navbar-default">
                            <div class="container-fluid nav-bar">
                                    <!-- Brand and toggle get grouped for better mobile display -->
                                <div class="navbar-header">
                                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                        <span class="sr-only">Toggle navigation</span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                        <span class="icon-bar"></span>
                                    </button>
                                </div>

                                    <!-- Collect the nav links, forms, and other content for toggling -->
                                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

                                    <ul class="nav navbar-nav navbar-right">
                                        <li><a class="menu active" href="#home" >Inicio</a></li>
                                        <li><a class="menu" href="#about">¿Quienes somos?</a></li>
                                        <li><a class="menu" href="#service">Nuestros servicios</a></li>
                                        <li><a class="menu" href="#team">Vinculate</a>
                                        <li><a class="menu" data-toggle="modal" href="#myModal">Log In</a>
                                    </ul>
                                </div><!-- /navbar-collapse -->
                            </div><!-- / .container-fluid -->
                        </nav>
                    </div>
                </div>
            </div>
        </header> <!-- end of header area -->

        <section class="slider" id="home">
            <div class="container-fluid">
                <div class="row">
                    <div id="carouselHacked" class="carousel slide carousel-fade" data-ride="carousel">
                        <div class="header-backup"></div>
                            <!-- Wrapper for slides -->
                        <div class="carousel-inner" role="listbox">
                            <div class="item active">
                                <img src=""""),_display_(/*83.44*/routes/*83.50*/.Assets.versioned("img/slide-one.jpg")),format.raw/*83.88*/("""" alt="">
                                <div class="carousel-caption">
                                    <h1>Brindando</h1>
                                    <p>Un servicio de alta calidad</p>
                                    <button>learn more</button>
                                </div>
                            </div>
                            <div class="item">
                                <img src=""""),_display_(/*91.44*/routes/*91.50*/.Assets.versioned("img/slide-two.jpg")),format.raw/*91.88*/("""" alt="">
                                <div class="carousel-caption">
                                    <h1>Brindando</h1>
                                    <p>Un servicio de alta calidad</p>
                                    <button>learn more</button>
                                </div>
                            </div>
                            <div class="item">
                                <img src=""""),_display_(/*99.44*/routes/*99.50*/.Assets.versioned("img/slide-three.jpg")),format.raw/*99.90*/("""" alt="">
                                <div class="carousel-caption">
                                    <h1>Brindando</h1>
                                    <p>Un servicio de alta calidad</p>
                                    <button>learn more</button>
                                </div>
                            </div>
                            <div class="item">
                                <img src=""""),_display_(/*107.44*/routes/*107.50*/.Assets.versioned("img/slide-four.jpg")),format.raw/*107.89*/("""" alt="">
                                <div class="carousel-caption">
                                    <h1>Brindando</h1>
                                    <p>Un servicio de alta calidad</p>
                                    <button>learn more</button>
                                </div>
                            </div>
                        </div>
                            <!-- Controls -->
                        <a class="left carousel-control" href="#carouselHacked" role="button" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#carouselHacked" role="button" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
            </div>
        </section><!-- end of slider section -->

        <!-- about section -->
        <section class="about text-center" id="about">
            <div class="container">
                <div class="row">
                    <h2>¿Quienes somos?</h2>
                    <h4>MedicAndes es una institución privada en Bogotá con más de 30 años de experiencia en el diagnóstico, cuidado y manejo de enfermedades cardiacas. El hospital es muy eficiente en el área de emergencias y cirugías, su equipo ha tratado cientos de casos complejos y es referente a nivel nacional en el área de cardiología.
                    </h4>
                    <div class="col-md-4 col-sm-6">
                        <div class="single-about-detail clearfix">
                            <div class="about-img">
                                <img class="img-responsive" src=""""),_display_(/*139.67*/routes/*139.73*/.Assets.versioned("img/item1.jpg")),format.raw/*139.107*/("""" alt="">
                            </div>
                            <div class="about-details">
                                <div class="pentagon-text">
                                    <h1>C</h1>
                                </div>
                                <h3>Children’s specialist</h3>
                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="single-about-detail">
                            <div class="about-img">
                                <img class="img-responsive" src=""""),_display_(/*153.67*/routes/*153.73*/.Assets.versioned("img/item2.jpg")),format.raw/*153.107*/("""" alt="">
                            </div>
                            <div class="about-details">
                                <div class="pentagon-text">
                                    <h1>W</h1>
                                </div>

                                <h3>Children’s specialist</h3>
                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-6">
                        <div class="single-about-detail">
                            <div class="about-img">
                                <img class="img-responsive" src=""""),_display_(/*168.67*/routes/*168.73*/.Assets.versioned("img/item3.jpg")),format.raw/*168.107*/("""" alt="">
                            </div>
                            <div class="about-details">
                                <div class="pentagon-text">
                                    <h1>M</h1>
                                </div>
                                <h3>Children’s specialist</h3>
                                <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section><!-- end of about section -->


        <!-- service section starts here -->
        <section class="service text-center" id="service">
            <div class="container">
                <div class="row">
                    <h2>Nuestros servicios</h2>
                    <h4></h4>
                    <div class="col-md-3 col-sm-6">
                        <div class="single-service">
                            <div class="single-service-img">
                                <div class="service-img">
                                    """),format.raw/*194.133*/("""
                                        """),format.raw/*195.41*/("""<!-- Generator: Adobe Illustrator 19.1.0, SVG Export Plug-In . SVG Version: 6.00 Build 0)  -->
                                    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"  version="1.1" id="DESIGNS" x="0px" y="0px" width="100px" height="100px" viewBox="0 0 32 32" style="enable-background:new 0 0 32 32;" xml:space="preserve">
                                        <title property="dc:title">to care</title><desc property="dc:description">An icon for "care" from the Puchi Puchi series on to [icon]. Downloaded from http://www.toicon.com/icons/puchi-puchi_care by 181.49.75.44 on 2017-04-28. Licensed CC-BY, see http://toicon.com/license/ for details.</desc>
                                        <path class="puchipuchi_een" d="M8,16c0,1.105-0.895,2-2,2s-2-0.895-2-2c0-1.105,0.895-2,2-2S8,14.895,8,16z M30.973,3.329  l-1.025,6.153c-0.546,3.273-2.512,6.096-5.393,7.742L21,19.272V24c0,4.411-3.589,8-8,8s-8-3.589-8-8v-4.141  C3.278,19.412,2,17.862,2,16c0-2.209,1.791-4,4-4c2.209,0,4,1.791,4,4c0,1.862-1.278,3.412-3,3.859V24  c0,1.796,0.797,3.406,2.051,4.506C9.03,28.339,9,28.173,9,28c0-2.206,1.794-4,4-4s4,1.794,4,4c0,0.173-0.03,0.339-0.051,0.506  C18.203,27.406,19,25.796,19,24v-4.76l-3.555-2.016c-2.881-1.646-4.847-4.469-5.393-7.742L9.027,3.329  C8.931,2.748,9.094,2.156,9.474,1.707C9.854,1.258,10.411,1,11,1h1.277C12.624,0.405,13.262,0,14,0c1.105,0,2,0.895,2,2  c0,1.105-0.895,2-2,2c-0.738,0-1.376-0.405-1.723-1H11.59c-0.309,0-0.544,0.277-0.493,0.582l0.929,5.571  c0.444,2.667,2.064,4.992,4.412,6.334l1.853,1.059C18.811,16.844,19.4,17,20,17s1.189-0.156,1.71-0.454l1.852-1.058  c2.348-1.342,3.969-3.668,4.413-6.336l0.928-5.57C28.954,3.277,28.719,3,28.41,3h-0.687C27.376,3.595,26.738,4,26,4  c-1.105,0-2-0.895-2-2c0-1.105,0.895-2,2-2c0.738,0,1.376,0.405,1.723,1H29c0.589,0,1.146,0.258,1.526,0.707  C30.906,2.156,31.069,2.748,30.973,3.329z M6,19c1.654,0,3-1.346,3-3c0-1.654-1.346-3-3-3c-1.654,0-3,1.346-3,3  C3,17.654,4.346,19,6,19z M15,28c0-1.103-0.897-2-2-2s-2,0.897-2,2s0.897,2,2,2S15,29.103,15,28z" style="fill: #111918;"/>
                                        <metadata><work rdf:about=""><format>image/svg+xml</format><type rdf:resource="http://purl.org/dc/dcmitype/StillImage"/><license rdf:resource="http://creativecommons.org/licenses/by/4.0/"/><attributionname>Shannon E Thomas</attributionname><attributionurl>http://www.toicon.com/icons/puchi-puchi_care</attributionurl></work></metadata></svg>

                                </div>
                            </div>
                            <h3>Diagnóstico</h3>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="single-service">
                            <div class="single-service-img">
                                <div class="service-img">
                                    """),format.raw/*210.133*/("""
                                    """),format.raw/*211.37*/("""<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"version="1.1" id="DESIGNS" x="0px" y="0px" width="100px" height="100px" viewBox="0 0 32 32" style="enable-background:new 0 0 32 32;" xml:space="preserve">
                                        <title property="dc:title">to like</title><desc property="dc:description">An icon for "like" from the Lines and Angles series on to [icon]. Downloaded from http://www.toicon.com/icons/lines-and-angles_like by 181.49.75.44 on 2017-04-28. Licensed CC-BY, see http://toicon.com/license/ for details.</desc>
                                        <path class="linesandangles_een" d="M10.5,8v2C9.122,10,8,11.121,8,12.5H6C6,10.019,8.019,8,10.5,8z" style="fill: #111918;"/>
                                        <path class="linesandangles_een" d="M21.5,5c-2.116,0-4.093,0.881-5.5,2.406C14.593,5.881,12.616,5,10.5,5C6.364,5,3,8.333,3,12.5  C3,21.542,16,27,16,27s13-5.458,13-14.5C29,8.333,25.636,5,21.5,5z M16,24.797C13.378,23.521,5,18.938,5,12.5  C5,9.467,7.467,7,10.5,7c1.55,0,2.982,0.626,4.03,1.762l0.735,0.797h1.47l0.735-0.797C18.518,7.626,19.95,7,21.5,7  c3.033,0,5.5,2.467,5.5,5.5C27,18.938,18.622,23.521,16,24.797z" style="fill: #111918;"/>
                                        <metadata><work rdf:about=""><format>image/svg+xml</format><type rdf:resource="http://purl.org/dc/dcmitype/StillImage"/><license rdf:resource="http://creativecommons.org/licenses/by/4.0/"/><attributionname>Shannon E Thomas</attributionname><attributionurl>http://www.toicon.com/icons/lines-and-angles_like</attributionurl></work></metadata></svg>
                                </div>
                            </div>
                            <h3>Problemas del corazón <br>(brazalete inteligente)</h3>
                        </div>

                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="single-service">
                            <div class="single-service-img">
                                <div class="service-img">
                                    """),format.raw/*226.132*/("""
                                    """),format.raw/*227.37*/("""<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"  version="1.1" id="DESIGNS" x="0px" y="0px" width="100px" height="100px" viewBox="0 0 32 32" style="enable-background:new 0 0 32 32;" xml:space="preserve">
                                        <title property="dc:title">to analyze</title><desc property="dc:description">An icon for "analyze" from the Puchi Puchi series on to [icon]. Downloaded from http://www.toicon.com/icons/puchi-puchi_analyze by 181.49.75.44 on 2017-04-28. Licensed CC-BY, see http://toicon.com/license/ for details.</desc>
                                        <path class="puchipuchi_een" d="M27,2H5C3.895,2,3,2.895,3,4v24c0,1.105,0.895,2,2,2h22c1.105,0,2-0.895,2-2V4  C29,2.895,28.105,2,27,2z M13,25h-0.82c-0.06,0-0.12-0.001-0.18-0.003V25c0,1.103-0.897,2-2,2s-2-0.897-2-2v-2  c0-0.347,0.18-0.668,0.474-0.851c0.294-0.182,0.663-0.198,0.973-0.044l0.944,0.472c0.261,0.13,0.536,0.232,0.819,0.303  c0.017,0.003,0.035,0.008,0.051,0.012C11.563,22.963,11.872,23,12.18,23H13c0.552,0,1,0.448,1,1S13.552,25,13,25z M13,21h-0.183  c-1.387,0-2.729-0.407-3.883-1.176l-1.488-0.992c-0.459-0.306-0.583-0.927-0.277-1.387c0.306-0.46,0.926-0.584,1.387-0.277  l1.488,0.992c0.824,0.549,1.783,0.84,2.774,0.84H13c0.552,0,1,0.448,1,1S13.552,21,13,21z M24,25c0,1.103-0.897,2-2,2s-2-0.897-2-2  v-0.003C19.94,24.999,19.88,25,19.82,25H19c-0.552,0-1-0.448-1-1s0.448-1,1-1h0.82c0.309,0,0.617-0.037,0.918-0.107  c0.017-0.004,0.034-0.009,0.051-0.012c0.283-0.071,0.559-0.172,0.819-0.303l0.944-0.472c0.31-0.154,0.678-0.138,0.973,0.044  C23.82,22.332,24,22.653,24,23V25z M24.555,18.832l-1.488,0.992C21.913,20.593,20.57,21,19.183,21H19c-0.552,0-1-0.448-1-1  s0.448-1,1-1h0.183c0.991,0,1.95-0.291,2.774-0.84l1.488-0.992c0.459-0.307,1.08-0.183,1.387,0.277  C25.138,17.905,25.014,18.526,24.555,18.832z M19.183,15c0.991,0,1.95-0.291,2.774-0.84l1.488-0.992  c0.459-0.308,1.08-0.183,1.387,0.277c0.306,0.459,0.182,1.081-0.277,1.387l-1.488,0.992C21.913,16.593,20.57,17,19.183,17H17v1  c0,0.552-0.448,1-1,1s-1-0.448-1-1v-1h-2.183c-1.387,0-2.729-0.407-3.883-1.176l-1.488-0.992c-0.459-0.306-0.583-0.927-0.277-1.387  c0.306-0.46,0.926-0.585,1.387-0.277l1.488,0.992c0.824,0.549,1.783,0.84,2.774,0.84H15v-2h-2.183c-1.387,0-2.729-0.407-3.883-1.176  l-1.488-0.992c-0.459-0.306-0.583-0.927-0.277-1.387c0.306-0.46,0.926-0.585,1.387-0.277l1.488,0.992  c0.824,0.549,1.783,0.84,2.774,0.84H15V6c0-0.552,0.448-1,1-1s1,0.448,1,1v5h2.183c0.991,0,1.95-0.291,2.774-0.84l1.488-0.992  c0.459-0.308,1.08-0.183,1.387,0.277c0.306,0.459,0.182,1.081-0.277,1.387l-1.488,0.992C21.913,12.593,20.57,13,19.183,13H17v2  H19.183z" style="fill: #111918;"/>
                                        <metadata><work rdf:about=""><format>image/svg+xml</format><type rdf:resource="http://purl.org/dc/dcmitype/StillImage"/><license rdf:resource="http://creativecommons.org/licenses/by/4.0/"/><attributionname>Shannon E Thomas</attributionname><attributionurl>http://www.toicon.com/icons/puchi-puchi_analyze</attributionurl></work></metadata></svg>
                                </div>
                            </div>
                            <h3>Cirugias</h3>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="single-service">
                            <div class="single-service-img">
                                <div class="service-img">
                                    """),format.raw/*240.132*/("""
                                    """),format.raw/*241.37*/("""<svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="DESIGNS" x="0px" y="0px" width="125px" height="125px" viewBox="0 0 32 32" style="enable-background:new 0 0 32 32;" xml:space="preserve">
                                        <title property="dc:title">to aid</title><desc property="dc:description">An icon for "aid" from the Duotone series on to [icon]. Downloaded from http://www.toicon.com/icons/duotone_aid by 181.49.75.44 on 2017-04-28. Licensed CC-BY, see http://toicon.com/license/ for details.</desc>
                                        <g>
                                            <g>
                                                <g>
                                                    <path class="duotone_een" d="M11,24c0,1.105-0.895,2-2,2s-2-0.895-2-2c0-1.105,0.895-2,2-2S11,22.895,11,24z M21,22     c-1.105,0-2,0.895-2,2c0,1.105,0.895,2,2,2s2-0.895,2-2C23,22.895,22.105,22,21,22z M26,10.5V18H4c0-1.398,0-2,1.896-7.637     C5.958,10.148,6.154,10,6.377,10H8V8.5C8,8.224,8.224,8,8.5,8h2C10.776,8,11,8.224,11,8.5V10h14.5C25.776,10,26,10.224,26,10.5z      M11,12.5c0-0.276-0.224-0.5-0.5-0.5H7.901c-0.225,0-0.422,0.15-0.482,0.367l-0.828,3C6.504,15.685,6.743,16,7.073,16H10.5     c0.276,0,0.5-0.224,0.5-0.5V12.5z M24,13.5c0-0.276-0.224-0.5-0.5-0.5H22v-1.5c0-0.276-0.224-0.5-0.5-0.5h-1     c-0.276,0-0.5,0.224-0.5,0.5V13h-1.5c-0.276,0-0.5,0.224-0.5,0.5v1c0,0.276,0.224,0.5,0.5,0.5H20v1.5c0,0.276,0.224,0.5,0.5,0.5     h1c0.276,0,0.5-0.224,0.5-0.5V15h1.5c0.276,0,0.5-0.224,0.5-0.5V13.5z" style="fill: #0B1719;"/>
                                                </g>
                                                <g>
                                                    <path class="duotone_een" d="M11,24c0,1.105-0.895,2-2,2s-2-0.895-2-2c0-1.105,0.895-2,2-2S11,22.895,11,24z M21,22     c-1.105,0-2,0.895-2,2c0,1.105,0.895,2,2,2s2-0.895,2-2C23,22.895,22.105,22,21,22z M26,10.5V18H4c0-1.398,0-2,1.896-7.637     C5.958,10.148,6.154,10,6.377,10H8V8.5C8,8.224,8.224,8,8.5,8h2C10.776,8,11,8.224,11,8.5V10h14.5C25.776,10,26,10.224,26,10.5z      M11,12.5c0-0.276-0.224-0.5-0.5-0.5H7.901c-0.225,0-0.422,0.15-0.482,0.367l-0.828,3C6.504,15.685,6.743,16,7.073,16H10.5     c0.276,0,0.5-0.224,0.5-0.5V12.5z M24,13.5c0-0.276-0.224-0.5-0.5-0.5H22v-1.5c0-0.276-0.224-0.5-0.5-0.5h-1     c-0.276,0-0.5,0.224-0.5,0.5V13h-1.5c-0.276,0-0.5,0.224-0.5,0.5v1c0,0.276,0.224,0.5,0.5,0.5H20v1.5c0,0.276,0.224,0.5,0.5,0.5     h1c0.276,0,0.5-0.224,0.5-0.5V15h1.5c0.276,0,0.5-0.224,0.5-0.5V13.5z" style="fill: #0B1719;"/>
                                                </g>
                                            </g>
                                            <path class="duotone_twee" d="M4,19v4.5C4,23.776,4.224,24,4.5,24H6c0-1.654,1.346-3,3-3c1.654,0,3,1.346,3,3h6   c0-1.654,1.346-3,3-3c1.654,0,3,1.346,3,3h1.5c0.276,0,0.5-0.224,0.5-0.5V19H4z" style="fill: #555D5E;"/>
                                        </g>
                                        <metadata><work rdf:about=""><format>image/svg+xml</format><type rdf:resource="http://purl.org/dc/dcmitype/StillImage"/><license rdf:resource="http://creativecommons.org/licenses/by/4.0/"/><attributionname>Carol Liao</attributionname><attributionurl>http://www.toicon.com/icons/duotone_aid</attributionurl></work></metadata></svg>

                                </div>
                            </div>
                            <h3>Emergencias</h3>
                        </div>
                    </div>
                </div>
            </div>
        </section><!-- end of service section -->


        <!-- team section -->
        <section class="team" id="team">
            <div class="container">
                <div class="row">
                    <div class="team-heading text-center">
                        <h2>Vinculate al brazalete <br> inteligente</h2>
                            <h4>El hospital, se ha aliado con Thing Worx S.A.S. para darle a sus pacientes en rehabilitación unos brazaletes inteligentes que recopilan información cardiaca relevante para las diferentes cardiopatías (i.e., frecuencia cardiaca, presión sanguínea, nivel de estrés). Desde un punto de vista operacional los componentes del sistema interactúan como sigue:
                            </h4>
                    </div>
                    <div class="col-md-2 single-member col-sm-4">
                        <div class="person">
                            <img class="img-responsive" src=""""),_display_(/*277.63*/routes/*277.69*/.Assets.versioned("img/member1.jpg")),format.raw/*277.105*/("""" alt="member-1">
                        </div>
                        <div class="person-detail">
                            <div class="arrow-bottom"></div>
                            <h3>Dr. M. Weiner, M.D.</h3>
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, </p>
                        </div>
                    </div>
                    <div class="col-md-2 single-member col-sm-4">
                        <div class="person-detail">
                            <div class="arrow-top"></div>
                            <h3>Dr. Danielle, M.D.</h3>
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, </p>
                        </div>
                        <div class="person">
                            <img class="img-responsive" src=""""),_display_(/*292.63*/routes/*292.69*/.Assets.versioned("img/member2.jpg")),format.raw/*292.105*/("""" alt="member-2">
                        </div>
                    </div>
                    <div class="col-md-2 single-member col-sm-4">
                        <div class="person">
                            <img class="img-responsive" src=""""),_display_(/*297.63*/routes/*297.69*/.Assets.versioned("img/member3.jpg")),format.raw/*297.105*/("""" alt="member-3">
                        </div>
                        <div class="person-detail">
                            <div class="arrow-bottom"></div>
                            <h3>Dr. Caitlin, M.D.</h3>
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, </p>
                        </div>
                    </div>
                    <div class="col-md-2 single-member col-sm-4">
                        <div class="person-detail">
                            <div class="arrow-top"></div>
                            <h3>Dr. Joseph, M.D.</h3>
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, </p>
                        </div>
                        <div class="person">
                            <img class="img-responsive" src=""""),_display_(/*312.63*/routes/*312.69*/.Assets.versioned("img/member4.jpg")),format.raw/*312.105*/("""" alt="member-4">
                        </div>
                    </div>
                    <div class="col-md-2 single-member col-sm-4">
                        <div class="person">
                            <img class="img-responsive" src=""""),_display_(/*317.63*/routes/*317.69*/.Assets.versioned("img/member5.jpg")),format.raw/*317.105*/("""" alt="member-5">
                        </div>
                        <div class="person-detail">
                            <div class="arrow-bottom"></div>
                            <h3>Dr. Michael, M.D.</h3>
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, </p>
                        </div>
                    </div>
                    <div class="col-md-2 single-member col-sm-4">
                        <div class="person-detail">
                            <div class="arrow-top"></div>
                            <h3>Dr. Hasina, M.D.</h3>
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, </p>
                        </div>
                        <div class="person">
                            <img class="img-responsive" src=""""),_display_(/*332.63*/routes/*332.69*/.Assets.versioned("img/member6.jpg")),format.raw/*332.105*/("""" alt="member-5">
                        </div>
                    </div>
                </div>
            </div>
        </section><!-- end of team section -->

        <!-- map section -->
        <div class="api-map" id="contact">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12 map" id="map"></div>
                </div>
            </div>
        </div><!-- end of map section -->

        <!-- footer starts here -->
        <footer class="footer clearfix">
            <div class="container">
                <div class="row">
                    <div class="col-xs-6 footer-para">
                        <p>&copy;Mostafizur All right reserved</p>
                    </div>
                    <div class="col-xs-6 text-right">
                        <a href=""><i class="fa fa-facebook"></i></a>
                        <a href=""><i class="fa fa-twitter"></i></a>
                        <a href=""><i class="fa fa-skype"></i></a>
                    </div>
                </div>
            </div>
        </footer>

            <!-- Modal -->
        <div id="myModal" class="modal fade" role="dialog">
            <div class="modal-dialog">


                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">x</button>
                        <h4 class="modal-title">LOGIN</h4>
                    </div>
                    <div class="modal-body">
                        <form class="row">
                            """),format.raw/*376.100*/("""
                            """),format.raw/*377.29*/("""<div class="col-md-12">
                                <input type="text" id="idUsuario" name="fname" placeholder="Ingrese su ID">
                            </div>
                            """),format.raw/*380.76*/("""
                            """),format.raw/*381.29*/("""<div class="col-md-12">
                                <input type="password" id="nClave" name="fname" placeholder="Ingrese su clave">
                            </div>

                        </form>
                        <div class="row">
                            <div class="col-md-4"></div>
                            <a href="http://localhost:9000/app/home" class="btn btn-default col-md-4">Ingresar a MedicAndes</a>
                            <div class="col-md-4"></div>
                        </div>
                    </div>
                    """),format.raw/*392.51*/("""
                        """),format.raw/*393.110*/("""
                    """),format.raw/*394.31*/("""
                """),format.raw/*395.17*/("""</div>

            </div>
        </div>

            <!-- script tags
	============================================================= -->
        <script src=""""),_display_(/*402.23*/routes/*402.29*/.Assets.versioned("js/jquery-2.1.1.js")),format.raw/*402.68*/(""""></script>
        <script src="http://maps.google.com/maps/api/js?sensor=true"></script>
        <script src=""""),_display_(/*404.23*/routes/*404.29*/.Assets.versioned("js/gmaps.js")),format.raw/*404.61*/(""""></script>
        <script src=""""),_display_(/*405.23*/routes/*405.29*/.Assets.versioned("js/smoothscroll.js")),format.raw/*405.68*/(""""></script>
        <script src=""""),_display_(/*406.23*/routes/*406.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*406.69*/(""""></script>
        <script src=""""),_display_(/*407.23*/routes/*407.29*/.Assets.versioned("js/custom.js")),format.raw/*407.62*/(""""></script>
    </body>

</html>
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon May 01 22:46:28 COT 2017
                  SOURCE: C:/Users/Camilo/Documents/GitHub/MedicAndes/app/views/index.scala.html
                  HASH: 3f61ffd346a269e905ac4e259474dda65e8e85b3
                  MATRIX: 843->99|960->121|991->323|1020->325|1409->687|1424->693|1490->738|1559->780|1574->786|1637->828|1706->870|1721->876|1776->910|1845->952|1860->958|1918->995|2219->1269|2234->1275|2291->1311|2754->1747|2769->1753|2823->1786|5446->4382|5461->4388|5520->4426|5982->4861|5997->4867|6056->4905|6518->5340|6533->5346|6594->5386|7057->5821|7073->5827|7134->5866|9152->7856|9168->7862|9225->7896|10115->8758|10131->8764|10188->8798|11080->9662|11096->9668|11153->9702|12433->11048|12504->11090|15446->14098|15513->14136|17645->16333|17712->16371|21217->19941|21284->19979|25850->24517|25866->24523|25925->24559|26993->25599|27009->25605|27068->25641|27350->25895|27366->25901|27425->25937|28489->26973|28505->26979|28564->27015|28846->27269|28862->27275|28921->27311|29985->28347|30001->28353|30060->28389|31753->30123|31812->30153|32039->30398|32098->30428|32704->31035|32760->31146|32811->31178|32858->31196|33054->31364|33070->31370|33131->31409|33274->31524|33290->31530|33344->31562|33407->31597|33423->31603|33484->31642|33547->31677|33563->31683|33625->31723|33688->31758|33704->31764|33759->31797
                  LINES: 30->5|35->5|37->11|38->12|46->20|46->20|46->20|47->21|47->21|47->21|48->22|48->22|48->22|49->23|49->23|49->23|52->26|52->26|52->26|67->41|67->41|67->41|109->83|109->83|109->83|117->91|117->91|117->91|125->99|125->99|125->99|133->107|133->107|133->107|165->139|165->139|165->139|179->153|179->153|179->153|194->168|194->168|194->168|220->194|221->195|236->210|237->211|252->226|253->227|266->240|267->241|303->277|303->277|303->277|318->292|318->292|318->292|323->297|323->297|323->297|338->312|338->312|338->312|343->317|343->317|343->317|358->332|358->332|358->332|402->376|403->377|406->380|407->381|418->392|419->393|420->394|421->395|428->402|428->402|428->402|430->404|430->404|430->404|431->405|431->405|431->405|432->406|432->406|432->406|433->407|433->407|433->407
                  -- GENERATED --
              */
          