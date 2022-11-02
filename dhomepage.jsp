<%-- 
    Document   : dhomepage
    Created on : 18-Oct-2022, 12:03:20 am
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
                height:200px;
                width:400px;
                padding-top: 70px;
                border:2px solid grey;
                margin-top: 200px;
                margin-left: 550px;
                border-radius: 15px;
            }
            .btn{
                width:150px;
                height:50px;
                font-family: sans-serif;
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
        <form method="get">
        
            <div id="box">
            <center>
                <button class="btn" type="submit" formaction="dappointments">VIEW APPOINTMENTS</button> <br><br>
                <button class="btn" type="submit" formaction="ddelete">Exit</button>
                
                
            </center>
            </div>
        </form>
    </body>
</html>
