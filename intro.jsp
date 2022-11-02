<%-- 
    Document   : intro
    Created on : 17-Oct-2022, 11:28:04 pm
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>DOCTOR APPOINTMENT BOOKING SYSTEM</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body{
                background-image: url(https://img.freepik.com/free-vector/clean-medical-background_53876-116875.jpg?w=1380&t=st=1665636311~exp=1665636911~hmac=8c8ebe58817b1878696487cf35cb9dee7d091dbf42a1971ed10a6219650ef45a);
                background-repeat: no-repeat;
                background-size: 100%;
                font-family: helvetica;
            }
            #box{
                height:200px;
                width:400px;
                padding-top: 70px;
                border:2px solid grey;
                margin-top: 200px;
                margin-left: 550px;
                border-radius: 15px;
            }
            #btn{
                width:100px;
                height:50px;
                
                font-weight: bolder;
                font-size: 17px;
                cursor: pointer;
                display: inline-block;
            }
            #txt{
                color:black;
                
            }
        </style>
    </head>
    <body>
    <center><h1 id="txt">DOCTOR APPOINTMENT BOOKING SYSTEM</h1></center><HR>
    
        <div id="box">
            <center>
                <button id="btn" onclick="window.location.href='dsignin.jsp';">DOCTOR</button><br><br><br>
                <button id="btn" onclick="window.location.href='psignin.jsp';">PATIENT</button>
            </center>
        </div>
    </body>
</html>
