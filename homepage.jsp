<%-- 
    Document   : homepage
    Created on : 13-Oct-2022, 9:53:39 am
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doctor Appointment Booking System</title>
        <style>
         body{
                background-image: url("https://img.freepik.com/free-vector/clean-medical-background_53876-116875.jpg?w=1380&t=st=1665745362~exp=1665745962~hmac=6a4eb9dadeecdd319200d03065e72593e1ec6da8ffdd9a70c824a618ad66170a");
                background-size: cover;
                font-family: helvetica;
                
            }
            #box{
                height: 450px;
                width: 800px;
                border-radius:12px;
                border: 2px solid black;
                padding-left: 80px;
                padding-top: 30px;
                margin-left: 20%;
                margin-top: 10%;
                
            } 
            input{
                width: 300px;
                height: 50px;
                font-family: helvetica;
                margin-left: 20%;
            }
            button{
                width: 300px;
                height: 50px;
                font-family: helvetica;
                margin-left: 20%;
                margin-bottom: 100px;
            }
            h3{
                margin-left:30px; 
            }
            #box1{
                height: 100px;
                border: 2px solid black;
                width: 250px;
            }
            .align{
                float: right;
                margin-right: 30px;
                font-weight: normal;
            }
    </style>
    </head>
    
    <body>
        <% String id=(String)(request.getAttribute("id")); %>
        <form method="get">
    
        <div id="box">
            
            <input type="hidden" value="<%=id%>" name="id">
            <button type="submit" formaction="homepage">Book an Appointment</button>
            <button type="submit" formaction="viewdetails">View Appointment Details</button>
            <button type="submit" formaction="pdelete">Exit</button>
                
            </form>
        </div>
    </body>
</html>
