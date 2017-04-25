<%-- 
    Document   : opcHeader
    Created on : 12-abr-2017, 21:24:36
    Author     : Rafael Benavides
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <ul class="nav navbar-nav navbar-right">
            <li class="disabled">
                <a href="#">
                    <i class="fa fa-envelope-o" aria-hidden="true"></i>
                </a>
            </li>
            
            <c:if test="${cuenta == 1}">
                <li class="disabled">
                    <a href="#">
                        <i class="glyphicon glyphicon-cog" aria-hidden="true"></i>
                    </a>
                </li>
            </c:if>
                
            <c:if test="${cuenta == 1}">
                <li class="">
                    <a href="${pageContext.request.contextPath}/logout.htm">
                        <i class="fa fa-sign-out" aria-hidden="true"></i>
                    </a>
                </li>
            </c:if>
        </ul>
    </body>
</html>
