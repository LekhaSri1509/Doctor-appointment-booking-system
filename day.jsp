<%-- 
    Document   : day
    Created on : 24-Oct-2022, 7:14:29 pm
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- 
    Document   : pbook
    Created on : 16-Oct-2022, 9:16:14 pm
    Author     : Lenovo
--%>


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
            
           <%
               DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
               DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
   LocalDateTime now = LocalDateTime.now(); 
    LocalDateTime day1=now.plusDays(1);
    LocalDateTime day2=now.plusDays(2);
    LocalDateTime day3=now.plusDays(3);
    LocalDateTime day4=now.plusDays(4);
    LocalDateTime day5=now.plusDays(5);
    LocalDateTime day6=now.plusDays(6);
    

       
               %>
            <form action="day" method="get">
                <%
            
           String id=(String)request.getAttribute("id");%>
           <input type="hidden" name="docid" value="<%=id%>">
                <div id="dat1">
                   
                <h5> <input type="radio" name="date" value="<%=dtf.format(now)%>"><%=dtf1.format(now)%></h5>
                <h5> <input type="radio" name="date" value="<%=dtf.format(day1)%>"><%=dtf1.format(day1)%></h5>
                <h5> <input type="radio" name="date" value="<%=dtf.format(day2)%>"><%=dtf1.format(day2)%></h5><!-- comment -->
                <h5> <input type="radio" name="date" value="<%=dtf.format(day3)%>"><%=dtf1.format(day3)%></h5><!-- comment -->
                <h5> <input type="radio" name="date" value="<%=dtf.format(day4)%>"><%=dtf1.format(day4)%></h5><!-- comment -->
                <h5> <input type="radio" name="date" value="<%=dtf.format(day5)%>"><%=dtf1.format(day5)%></h5>
                <h5> <input type="radio" name="date" value="<%=dtf.format(day6)%>"><%=dtf1.format(day6)%></h5>
                </div>
            <br><br>
            <center><input type="submit" value="SUBMIT"></center>
            </form>
        </div> 
    </body>
</html>

