<%-- 
    Document   : recuperar
    Created on : 13-oct-2016, 21:35:24
    Author     : Rafael Benavides
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <script src="<spring:url value="/resources/js/framework/recuperar.js" />"></script>
    </head>
    <body>
        <div class="panel panel-primary">
            <div class="panel-heading">
                <i class="glyphicon glyphicon-share" aria-hidden="true"></i>
                <span><spring:message code="framework.recuperar.span.cabecera" /></span>
            </div>
            <div class="panel-body">
                <f:form modelAttribute="recuperar">
                    <div class="row">
                        <div class="col-lg-12">
                            <fieldset>
                                <legend>Información de la cuenta</legend>
                                <p>Introduzca el nombre de usuario o email de la cuenta que desee recuperar. Se enviará un email a la dirección especificada con los pasos a seguir para recuperar la cuenta.</p>
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Nombre de usuario o Email" />
                                </div>
                            </fieldset>
                        </div>
                    </div>
                    <div class="row">
                        <hr>
                        <div class="col-lg-12">
                            <div class="row">
                                <div class="col-xs-6">
                                    <button type="button" class="btn btn-primary btn-block" id="volver">
                                        <i class="glyphicon glyphicon-arrow-left" aria-hidden="true"></i> Volver
                                    </button>
                                </div>
                                <div class="col-xs-6">
                                    <button type="button" class="btn btn-primary btn-block">
                                        Continuar <i class="glyphicon glyphicon-arrow-right" aria-hidden="true"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                    </div>
                </f:form>
            </div>
        </div> <!-- Recuperar Contraseña -->
    </body>
</html>
