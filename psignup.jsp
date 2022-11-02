<%-- 
    Document   : psignup
    Created on : 14-Oct-2022, 4:48:07 pm
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Patient Signup</title>
        <style>
            body{
                background-image: url("https://img.freepik.com/free-vector/clean-medical-background_53876-116875.jpg?w=1380&t=st=1665745362~exp=1665745962~hmac=6a4eb9dadeecdd319200d03065e72593e1ec6da8ffdd9a70c824a618ad66170a");
                background-size: cover;
                font-family: helvetica;
                
            }
            #box{
                height: 450px;
                width: 500px;
                border-radius:12px;
                border: 2px solid black;
                padding-left: 80px;
                padding-top: 30px;
                margin-left: 30%;
                margin-top: 10%;
                
            }
            .align{
                float: right;
                margin-right: 100px;
            }
            .colon{
                float:right;
                margin-left: 20%;
            }
        </style>
    </head>
    <body>
        <form action="psignupcontroller" method="get">
        <div id="box">
            <h2 style="text-align:center; margin-right: 80px;">PATIENT SIGNUP FORM</h2><hr style="margin-right: 100px;">
            <h3>Username<span class="align"><input type="email" name="name"></span></h3>
            <h3>Password<span class="align"><input type="password" name="pass"></span></h3>
            <h3>Age<span class="align"><input type="number" min="1" max="100" name="age"></span></h3>
            <h3>Gender<span class="align"><input type="radio" name="male" value="Male">Male<input type="radio" name="male" value="Female">Female</span></h3>
            <h3>Phone Number<span class="align"><input type="text" name="phno"></span></h3>
            
 
            
            <input style="width: 100px; margin-left:150px;" type="submit" value="Submit">
        </div>
        </form>
    </body>
</html>


