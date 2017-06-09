<%-- 
    Document   : registro
    Created on : 12-oct-2016, 13:04:46
    Author     : Rafael Benavides
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <script src="<spring:url value="/resources/js/framework/registro.js" />"></script>
    </head>
    <body>
        <div class="panel panel-primary">
            <div class="panel-heading">
                <i class="glyphicon glyphicon glyphicon-edit" aria-hidden="true"></i>
                <span><spring:message code="framework.registro.span.cabecera" /></span>
            </div>
            <div class="panel-body">
                <f:form modelAttribute="registro">
                    <div class="row">
                        <div class="col-lg-12">
                            <fieldset>
                                <legend>Información personal</legend>
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Nombre" />
                                </div>
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Apellidos" />
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
        </div> <!-- Registrar Usuario -->
    </body>
</html>