<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : newjsf
    Created on : 23 may 2023, 19:45:10
    Author     : richa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Mostrar Resultados</title>
        </head>
        <body>


            <<h1>CACA</h1>
            <h:form>
                <h:dataTable value="#{playerManager.currentPlayers}" var="player" border="4" style="width:600px" rendered="#{playerManager.currentPlayers.size()>0}">
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Nombre"/>
                        </f:facet>
                        <h:outputLabel value="#{player.nombre}" style="color: green;"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Equipo"/>
                        </f:facet>
                        <h:outputLabel value="#{player.equipo}" style="color: green;"/>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputLabel value="Goles"/>
                        </f:facet>
                        <h:outputLabel value="#{player.goles}" style="color: green;"/>
                    </h:column>
                </h:dataTable>
                <h:commandButton value="Inicio" action="#{playerManager.reset()}"/>
            </h:form>
        </body>
    </html>
</f:view>
