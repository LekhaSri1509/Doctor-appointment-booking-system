<%-- 
    Document   : pbook
    Created on : 16-Oct-2022, 9:16:14 pm
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
            button{
                margin-left: 150px;
                width: 100px;
                height: 30px;
                font-weight: bolder;
            }
            #box{
                height:650px;
                width:600px;
                padding-top: 50px;
                border:2px solid grey;
                margin-top: 100px;
                margin-left: 450px;
                border-radius: 15px;
            }
            h3{
                margin-top: -30px;
                margin-left: 15px;
            }
            textarea{
                resize: none;
                margin-top: -50px;
                padding-left: 5px;
                margin-left: 15px;
            }
            input{
                 margin-bottom: 10px;
                margin-left: 30px;
             
                font-weight: bolder;
                font-size: 17px;
                cursor: pointer;
                display: inline-block;
            }
            #dat1{
                
                margin-bottom: 60px;
                margin-left: 35%;
            }
            </style>
    </head>
    <body>
        <div id="box">
           <%@ page import="java.time.format.DateTimeFormatter" %>
            <%@ page import="java.time.LocalDateTime" %>
            
          
            <form action="pbookcontroller" method="get">
                <%
            
           String id=(String)request.getAttribute("id");%>
           <input type="hidden" name="docid" value="<%=id%>">
            <% String date=(String)request.getAttribute("date");%>  
            <input type="hidden" name="date" value="<%=date%>">
            <h3>BRIEFLY DESCRIBE YOUR SYMPTOM </h3><br><br>
            <textarea name="texta" cols="70" rows="10"></textarea><br><br>
            <center><input type="submit" value="SUBMIT"></center>
            </form>
        </div> 
    </body>
</html>
