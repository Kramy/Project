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
                                    <spring:message code="framework.footer.a.informacion" />
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <spring:message code="framework.footer.a.soporte" />
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <spring:message code="framework.footer.a.sugerencias" />
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <spring:message code="framework.footer.a.privacidad" />
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <spring:message code="framework.footer.a.condiciones" />
                                </a>
                            </li>
                            <li class="dropup">
                                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                    <spring:message code="framework.footer.a.idioma" />
                                </a>
                                <ul class="dropdown-menu pull-right" role="menu">
                                    <li class="dropdown-header">
                                        <spring:message code="framework.footer.a.europa" />
                                    </li>
                                    <li>
                                        <a href="?lang=es">
                                            <spring:message code="framework.footer.a.espanol" />
                                        </a>
                                    </li>
                                    <li>
                                        <a href="?lang=en">
                                            <spring:message code="framework.footer.a.ingles" />
                                        </a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="row footer-section">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 footer-module">
                        <p class="footer-copyright">
                            <i class="fa fa-copyright" aria-hidden="true"></i> 2017 Project.
                            <spring:message code="framework.footer.small.derechos" />
                        </p>
                    </div>
                </div>
            </footer>
        </div>
    </body>
</html>
