<%-- 
    Document   : dsignup
    Created on : 13-Oct-2022, 10:25:53 am
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Doctor signin</title>
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
            #error{
                color: red;
                margin-left: 30%;
            }
        </style>
    </head>
    <body>
        <script>
            function validate(){
                var user=document.getElementById("name").value;
                var pass=document.getElementById("pass").value;
                boolean gender=false;
                var getSelectedValue = document.querySelector( 'input[name="male"]:checked');   
                    if(getSelectedValue != null) {   
                        gender=true; 
                    }
                 var phno=document.getElementById("phno").value;
                 var specialist=document.getElementById("specialist").value;
                 var fees=document.getElementById("fee").value;
                 if(user==null || pass==null || gender==false || phno==null || specialist==null || fees==null){
                     alert("field is wrong");
                     
                 }
            </script>
        <form action="dsignupcontroller" method="get">
        <div id="box">
            <h2 style="text-align:center; margin-right: 80px;">DOCTOR SIGNUP FORM</h2><hr style="margin-right: 100px;">
            <h3>Username<span class="align"><input type="email" id="name" name="name" value=""></span></h3>
            <h3>Password<span class="align"><input type="password" id="pass" name="pass" value=""></span></h3>
            <h3>Gender<span class="align"><input type="radio" name="male" value="Male" checked>Male<input type="radio" name="male" value="Female">Female</span></h3>
            <h3>Phone Number<span class="align"><input type="text" id="phno" name="phno" value=""></span></h3>
            <h3>Specialist<span class="align"><input type="text" id="specialist" name="specialist" value=""></span></h3>
            <h3>Choose a Day<span class="align"><label for="day"></label>
  <select name="day" id="day">
    <option value="Monday">Monday</option>
    <option value="Tuesday">Tuesday</option>
    <option value="Wednesday">Wednesday</option>
    <option value="Thursday">Thursday</option>
    <option value="Friday">Friday</option>
    <option value="Saturday">Saturday</option>
    <option value="Sunday">Sunday</option>
  </select></span></h3>
            <h3>Fees<span class="align"><input type="text" name="fee" value="" id="fee"></span></h3>
            <input style="width: 100px; margin-left:150px;" type="submit" value="Submit" >
            
            
            
           
        </div>
        </form>
    </body>
</html>

