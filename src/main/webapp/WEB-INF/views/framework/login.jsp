<%-- 
    Document   : login
    Created on : 16-oct-2016, 3:01:24
    Author     : Rafael Benavides
--%>

<%@ page import="com.project.util.Control" %>
<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
    <head>
        <script src="<spring:url value="/resources/js/framework/login.js" />"></script>
    </head>
    <body>
        <div class="login">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <i class="glyphicon glyphicon-user" aria-hidden="true"></i>
                    <span>
                        <spring:message code="framework.login.span.cabecera" />
                    </span>
                </div>
                <div class="panel-body">
                    <f:form method="POST" action="${pageContext.request.contextPath}/framework.htm" modelAttribute="logon">
                        <fieldset>
                            <div class="form-group">
                                <f:label path="email" cssClass="control-label sr-only">
                                    <spring:message code="framework.login.label.usuario" />
                                </f:label>
                                <spring:message code='framework.login.input.usuario' var="placeholder" />
                                <f:input path="email" cssClass="form-control" placeholder="${placeholder}" autofocus="autofocus" />
                            </div>
                            <div class="form-group">
                                <f:label path="contrasena" cssClass="control-label sr-only">
                                    <spring:message code="framework.login.label.contrasena" />
                                </f:label>
                                <spring:message code="framework.login.input.contrasena" var="placeholder" />
                                <f:input path="contrasena" cssClass="form-control" type="password" placeholder="${placeholder}" />
                            </div>
                            <c:choose>
                                <c:when test="${Control.recordar}">
                                    <div class="form-group">
                                        <div class="checkbox">
                                            <div class="text-right">
                                                <input type="checkbox" id="chkRecordar" />
                                                <label for="chkRecordar">
                                                    <spring:message code="framework.login.label.recordar" />
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                </c:when>
                            </c:choose>
                            <div class="form-group">
                                <f:button type="submit" class="btn btn-primary btn-block">
                                    <spring:message code="framework.login.button.login" />
                                </f:button>
                            </div>
                            <c:choose>
                                <c:when test="${Control.recuperar}">
                                    <div class=" text-center">
                                        <a href="#" id="recuperar" class="">
                                            <spring:message code="framework.login.a.recuperar" />
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
                                        <spring:message code="framework.login.p.registro" />
                                    </p>
                                </div>
                                <div class="col-sm-4">
                                    <button type="button" id="registrar" class="btn btn-sm btn-primary btn-block">
                                        <spring:message code="framework.login.button.registro" />
                                    </button>
                                </div>
                            </div>
                        </c:when>
                    </c:choose>
                </div>
            </div>
            <div class="text-center">
                <p>
                    <spring:message code="framework.login.span.consulta" />
                    <a href="#">
                        <spring:message code="framework.login.a.consulta" />
                    </a>.
                </p>
            </div>
        </div>
    </body>
</html>
