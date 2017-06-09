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
        <nav class="navbar navbar-project navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <c:if test="${cuenta == 1}">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </c:if>
                    <a class="navbar-brand" href="${pageContext.request.contextPath}/framework.htm">PROJECT</a>
                </div>
                <c:if test="${cuenta == 1}">
                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav">
                                <li class="disabled">
                                    <a href="#">
                                        <i class="glyphicon glyphicon-cog" aria-hidden="true"></i>
                                    </a>
                                </li>
                        </ul>
                    
                        <ul class="nav navbar-nav navbar-right">
                            <li class="disabled">
                                <a href="#">
                                    <i class="fa fa-envelope-o" aria-hidden="true"></i>
                                </a>
                            </li>

                            <li class="">
                                <a href="${pageContext.request.contextPath}/logout.htm">
                                    <i class="fa fa-sign-out" aria-hidden="true"></i>
                                </a>
                            </li>
                        </ul>
                    </c:if>
                </div>
            </div>
        </nav>
    </body>
</html>
