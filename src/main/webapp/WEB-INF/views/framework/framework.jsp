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
        <!-- Header -->
        <jsp:include page="${request.contextPath}/header.htm"></jsp:include>
        
        <!-- Body -->
        <div class="container-fluid cuerpo">
            <c:choose>
                <c:when test="${cuenta == null}">
                    <jsp:include page="${request.contextPath}/login.htm"></jsp:include>
                </c:when>
                
                <c:when test="${cuenta == 1}">
                    <jsp:include page="${request.contextPath}/body.htm"></jsp:include>
                </c:when>
            </c:choose>
        </div>
        
        <!-- Footer -->
        <jsp:include page="${request.contextPath}/footer.htm"></jsp:include>
    </body>
</html>

