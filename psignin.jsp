<%-- 
    Document   : psignin
    Created on : 16-Oct-2022, 2:37:08 pm
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
                background-image: url("https://img.freepik.com/free-vector/clean-medical-background_53876-116875.jpg?w=1380&t=st=1665745362~exp=1665745962~hmac=6a4eb9dadeecdd319200d03065e72593e1ec6da8ffdd9a70c824a618ad66170a");
                background-size: cover;
                font-family: helvetica;
                
            }
            #box{
                height: 300px;
                width: 500px;
                border-radius:12px;
                border: 2px solid black;
                padding-left: 80px;
                padding-top: 50px;
                margin-left: 30%;
                margin-top: 15%;
                
            }
            .align{
                float: right;
                margin-right: 100px;
            }
            .colon{
                float:right;
                margin-left: 20%;
            }
             #btn{
                width:160px;
                height:30px;
                
                font-weight: bolder;
                font-size: 12px;
                cursor: pointer;
                display: inline-block;
                margin-left: 120px;
            }
             p{
                margin-left: 120px;
            }
        </style>
    </head>
    <body>
        <form action="psignincontroller" method="get">
            <div id="box">
            <h2 style="text-align:center; margin-right: 80px;">PATIENT SIGNIN FORM</h2><hr style="margin-right: 100px;">
            <h3>Username<span class="align"><input type="text" name="name"></span></h3>
            <h3>Password<span class="align"><input type="password" name="pass"></span></h3>
            
            
 
            
            <input style="width: 100px; margin-left:150px;" value="Submit" type="submit"><br><br>
            <p>Don't have an account?</p>
            <input type="button" id="btn" onclick="window.location.href='psignup.jsp';" value="CREATE NEW ACCOUNT"/>   
            <input type="button" onclick="window.location.href='intro.jsp'" value="BACK TO HOME">
            </div>
        </form>
    </body>
</html>
