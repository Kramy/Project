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
        <footer>
            <nav class="navbar navbar-project footer-proyect">
                <div class="container-fluid">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="disabled">
                            <a class="text-center" href="#">
                                <small>
                                    <i class="fa fa-copyright" aria-hidden="true"></i> 2017 Project.
                                    <spring:message code="framework.footer.small.derechos" text="Todos los derechos reservados." />
                                </small>
                            </a>
                        </li>
                        <li class="dropup">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                                <i class="glyphicon glyphicon-globe" aria-hidden="true"></i>
                                <span><spring:message code="framework.footer.span.idioma" text="Idioma" /></span>
                                <span class="caret"></span>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="?lang=es">
                                        <spring:message code="framework.footer.a.español" text="Español (EU)" />
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
            </nav>
        </footer>
    </body>
</html>
