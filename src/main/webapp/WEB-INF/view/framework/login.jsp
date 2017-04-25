<%-- 
    Document   : login
    Created on : 16-oct-2016, 3:01:24
    Author     : Rafael Benavides
--%>

<%@ page import="com.project.misc.Control" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <head>
        <script src="<spring:url value="/resources/js/framework/login.js" />"></script>
    </head>
    <body>
        <div class="row">
            <div class="login">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <i class="glyphicon glyphicon-user" aria-hidden="true"></i>
                        <span>
                            <spring:message code="framework.login.span.cabecera" text="Identificación de Usuario" />
                        </span>
                    </div>
                    <div class="panel-body">
                        <f:form method="POST" action="${pageContext.request.contextPath}/framework.htm" modelAttribute="logon">
                            <fieldset>
                                <div class="form-group">
                                    <f:label path="email" cssClass="control-label sr-only">
                                        <spring:message code="framework.login.label.usuario" text="Nombre de Usuario o Email:" />
                                    </f:label>
                                    <spring:message code='framework.login.input.usuario' text='Nombre de usuario o Email' var="placeholder" />
                                    <f:input path="email" cssClass="form-control" placeholder="${placeholder}" autofocus="autofocus" />
                                </div>
                                <div class="form-group">
                                    <f:label path="contrasena" cssClass="control-label sr-only">
                                        <spring:message code="framework.login.label.contrasena" text="Contraseña:" />
                                    </f:label>
                                    <spring:message code='framework.login.input.contrasena' text='Contraseña' var="placeholder" />
                                    <f:input path="contrasena" cssClass="form-control" type="password" placeholder="${placeholder}" />
                                </div>
                                <c:choose>
                                    <c:when test="${Control.recordar}">
                                        <div class="form-group">
                                            <div class="checkbox">
                                                <div class="text-right">
                                                    <input type="checkbox" id="chkRecordar" />
                                                    <label for="chkRecordar">
                                                        <spring:message code="framework.login.label.recordar" text="Recordar mis datos" />
                                                    </label>
                                                </div>
                                            </div>
                                        </div>
                                    </c:when>
                                </c:choose>
                                <div class="form-group">
                                    <f:button type="submit" class="btn btn-primary btn-block">
                                        <spring:message code="framework.login.button.login" text="Iniciar sesión" />
                                    </f:button>
                                </div>
                                <c:choose>
                                    <c:when test="${Control.recuperar}">
                                        <div class=" text-center">
                                            <a href="#" id="recuperar" class="">
                                                <spring:message code="framework.login.a.recuperar" text="¿No puedes iniciar sesión?" />
                                            </a>
                                        </div>
                                    </c:when>
                                </c:choose>
                            </fieldset>
                        </f:form>
                        <c:choose>
                            <c:when test="${Control.registro}">
                                <div class="row">
                                    <hr>
                                    <div class="col-sm-8">
                                        <p class="text-center">
                                            <spring:message code="framework.login.p.registro" text="¿Todavía no tienes una cuenta?" />
                                        </p>
                                    </div>
                                    <div class="col-sm-4">
                                        <button type="button" id="registrar" class="btn btn-sm btn-primary btn-block">
                                            <spring:message code="framework.login.button.registro" text="Crear cuenta" />
                                        </button>
                                    </div>
                                </div>
                            </c:when>
                        </c:choose>
                    </div>
                </div> <!-- Login Usuario -->
                <div class="text-center">
                    <span>
                        <spring:message code="framework.login.span.consulta" text="Si tiene algún problema o duda puede consultar nuestras FAQs a través del siguiente" />
                        <a href="#">
                            <spring:message code="framework.login.a.consulta" text="enlace" />
                        </a>.
                    </span>
                </div> <!-- Pie Login -->
            </div>
        </div>
    </body>
</html>
