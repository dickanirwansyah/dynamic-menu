<%-- 
    Document   : index
    Created on : Oct 18, 2017, 3:54:11 PM
    Author     : java-spring
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>${title}</title>
    </head>
    <body>
        <!--navbar dropdown-->
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-header">
                <a href="#" class="navbar-brand">Home</a>
            </div>
            <ul class="nav navbar-nav">
               
                <c:forEach var="menu" items="${menuLevel1}">
                    <li>
                        <a data-toggle="dropdown" 
                           href="${menu.link}">
                            ${menu.nama}
                        </a>
                        <ul class="dropdown-menu">
                            <c:if test="${menu.subMenus.size() != 0}">
                                <c:forEach var="submenu" items="${menu.subMenus}">
                                    <li><a href="${submenu.link}">${submenu.nama}</a></li>
                                </c:forEach>
                            </c:if>
                        </ul>
                    </li>
                </c:forEach>
                <!--
                <li class="active"><a href="">Menu 0</a></li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        Menu 1
                        <span class="caret"></span>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Menu 1.1</a></li>
                        <li><a href="#">Menu 1.2</a></li>
                        <li><a href="#">Menu 1.3</a></li>
                    </ul>
                </li>
                <li><a href="#">Menu 2</a></li>
                <li><a href="#">Menu 3</a></li>
                -->
            </ul>
        </nav>
    </body>
</html>
