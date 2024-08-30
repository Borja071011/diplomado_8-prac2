<%-- 
    Document   : saludos
    Created on : 24 ago 2024, 09:06:11
    Author     : Admin

la clase jsp tendra que venir en un contenedor para que asi pueda funcionar este metodo
llamara al strut con el metodo peporty
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saludos desde Struts2</title>
    </head>
    <body>
        <h1> <s:property value="saludosAtr"></s:property></h1>
    </body>
</html>
