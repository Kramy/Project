<%-- 
    Document   : framework
    Created on : 06-abr-2017, 21:11:21
    Author     : Rafael Benavides
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
    <head>
        <!-- Information -->
        <meta charset="UTF-8">
        <title>Project - Framework</title>
        
        <!-- Favicon -->
        <link rel="icon" href="<spring:url value="/resources/img/favicon/favicon.ico" />">
        
        <!-- Styles -->
        <link rel="stylesheet" href="<spring:url value="/webjars/bootstrap/${initParam.bootstrapVersion}/css/bootstrap.min.css" />" />
        <link rel="stylesheet" href="<spring:url value="/webjars/bootstrap/${initParam.bootstrapVersion}/css/bootstrap-theme.min.css" />" />
        <link rel="stylesheet" href="<spring:url value="/webjars/font-awesome/${initParam.fontAwesomeVersion}/css/font-awesome.min.css" />" />
        <link rel="stylesheet" href="<spring:url value="/resources/scss/css/framework.css" />" />
        <link rel="stylesheet" href="<spring:url value="/resources/scss/css/awesome-bootstrap-checkbox.css" />" />
        
        <!-- Javascripts -->
        <script>
            var requestContextPath = '${pageContext.request.contextPath}';
        </script>
        <script src="<spring:url value="/webjars/jquery/${initParam.jqueryVersion}/jquery.min.js" />"></script>
        <script src="<spring:url value="/webjars/bootstrap/${initParam.bootstrapVersion}/js/bootstrap.min.js" />"></script>
        <script src="<spring:url value="/resources/js/scripts.js" />"></script>
        <script src="<spring:url value="/resources/js/framework/framework.js" />"></script>
    </head>

    <body>
        <nav class="navbar navbar-project navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="${pageContext.request.contextPath}/framework.htm">PROJECT</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <jsp:include page="${request.contextPath}/opcHeader.htm"></jsp:include>
                </div>
            </div>
        </nav>
        
        <div class="container-fluid cuerpo">
            <c:choose>
                <c:when test="${cuenta == null}">
                    <jsp:include page="${request.contextPath}/login.htm"></jsp:include>
                </c:when>
                
                <c:when test="${cuenta == 1}">
                    <jsp:include page="${request.contextPath}/opcBody.htm"></jsp:include>
                </c:when>
            </c:choose>
        </div>
                    
        <nav class="navbar navbar-project footer-proyect">
            <div class="container footer-module">
                <footer class="text-center">
                    <small>
                        <i class="fa fa-copyright" aria-hidden="true"></i> 2017 Project.
                        <spring:message code="framework.framework.small.derechos" text="Todos los derechos reservados." />
                    </small>
                </footer>
            </div>
        </nav>
    </body>
</html>

