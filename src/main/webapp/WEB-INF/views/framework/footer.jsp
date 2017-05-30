<%-- 
    Document   : footer
    Created on : 15-may-2017, 13:02:21
    Author     : Rafael Benavides
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <div class="navbar-project footer-proyect">
            <footer class="container-fluid">
                <div class="row footer-section">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 footer-module">
                        <ul class="list-inline">
                            <li>
                                <a href="#">
                                    <spring:message code="framework.footer.a.informacion" text="Información" />
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <spring:message code="framework.footer.a.soporte" text="Soporte" />
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <spring:message code="framework.footer.a.sugerencias" text="Sugerencias" />
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <spring:message code="framework.footer.a.privacidad" text="Privacidad" />
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <spring:message code="framework.footer.a.condiciones" text="Condiciones" />
                                </a>
                            </li>
                            <li class="dropup">
                                <a class="dropup-toggle" data-toggle="dropdown" href="#">
                                    <!--<i class="glyphicon glyphicon-globe" aria-hidden="true"></i>-->
                                    <spring:message code="framework.footer.a.idioma" text="Idioma" />
                                    <!--<span class="caret"></span>-->
                                </a>
                                <ul class="dropdown-menu pull-right" role="menu">
                                    <li>
                                        <a href="?lang=es">
                                            <spring:message code="framework.footer.a.espanol" text="Español (EU)" />
                                        </a>
                                    </li>
                                    <li>
                                        <a href="?lang=en">
                                            <spring:message code="framework.footer.a.ingles" text="Inglés (EU)." />
                                        </a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="row footer-section">
                    <p class="footer-copyright">
                        <i class="fa fa-copyright" aria-hidden="true"></i> 2017 Project.
                        <spring:message code="framework.footer.small.derechos" text="Todos los derechos reservados." />
                    </p>
                </div>
            </footer>
        </div>
    </body>
</html>
