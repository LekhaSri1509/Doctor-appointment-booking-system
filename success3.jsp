<%-- 
    Document   : success3
    Created on : 17-Oct-2022, 11:37:28 pm
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
                background-size: cover;
                font-family: helvetica;
            }
            .book{
                text-align: center;
            }
             #tick{
                
                height: 70px;
                width: 70px;
                position: relative;
                left: 500px;
                float: left;
            }
            .app{
                padding-top: 13px;
            }
            a{
                text-decoration: none;
                color: black;
            }
        </style>
    </head>
    <body>
        <div class="book">
            <img id="tick" src="https://cdn.pixabay.com/photo/2016/03/31/14/37/check-mark-1292787_960_720.png">
        <h1 class="app">Appointment booked</h1>
        <button><a href="homepage.jsp">Back to home</a></button>
        </div>
    </body>
</html>
