<%-- 
    Document   : view
    Created on : 26-Oct-2022, 10:34:51 pm
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-image: url(https://img.freepik.com/free-vector/clean-medical-background_53876-116875.jpg?w=1380&t=st=1665636311~exp=1665636911~hmac=8c8ebe58817b1878696487cf35cb9dee7d091dbf42a1971ed10a6219650ef45a);
                background-repeat: no-repeat;
                background-size: 100%;
            }
            #box{
                height:300px;
                width:400px;
                padding-top: 10px;
                border:2px solid grey;
                margin-top: 200px;
                margin-left: 550px;
                border-radius: 15px;
            }
            </style>
    </head>
    <body>
        <% String name=(String)request.getAttribute("pname");
        String date=(String)request.getAttribute("pdate");
        String time=(String)request.getAttribute("ptime");
        String sym=(String)request.getAttribute("psym");
        %>
        <div id="box">
            <h2><center>Personal Info</center></h2>
            <h3>Name:<%=name%></h3>
            <h3>Date:<%=date%></h3><!-- comment -->
            <h3>Time:<%=time%></h3><!-- comment -->
            <h3>Symptoms:<%=sym%></h3>
             <button><a href="homepage.jsp">Back to home</a></button>
        </div>
    </body>
</html>
