<%-- 
    Document   : opcBody
    Created on : 15-abr-2017, 1:05:48
    Author     : Rafael Benavides
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <div class="row">
            <div class="col-lg-12">
                <h1>Página en construcción...</h1>
                <ul>
                    <li>Email: <c:out value="${email}" /></li>
                    <li>Seudónimo: <c:out value="${seudonimo}" /></li>
                    <li>Contraseña: <c:out value="${contrasena}" /></li>
                    <li>Cuenta: <c:out value="${cuenta}" /></li>
                </ul>
            </div>
        </div>
    </body>
</html>
