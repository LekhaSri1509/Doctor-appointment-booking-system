<%-- 
    Document   : success1
    Created on : 14-Oct-2022, 5:37:55 pm
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
            #success{
                margin-left:35%;
                margin-top: 5%;
            }
            #tick{
                height: 70px;
                float: left;
            }
            #box1{
                height: 100px;
                width: 300px;
                border: 2px solid black;
                padding: 10px;
                
                margin-left: 150px;
            }
            .aligns1{
                float: right;
                margin-right: 30px;
            }
            </style>
    </head>
    <body>
        

        
        <div id="success">
            <img id="tick" src="https://cdn.pixabay.com/photo/2016/03/31/14/37/check-mark-1292787_960_720.png">
            <h1 style="padding-top: 10px;">Account Created Successfully</h1>
           
             <% String str[] = (String[]) request.getAttribute("arr"); %>
                <div id="box1"><h3>
                    ID:  <span class="aligns1"> <%= str[0] %></span><br>
                Name:   <span class="aligns1"> <%= str[1] %></span><br>
                Age:   <span class="aligns1"> <%= str[2] %></span><br>
                Gender:   <span class="aligns1"> <%= str[3] %></span><br>
                </h3>
                <button><a href="psignin.jsp">Back to home</a></button>
                </div>
                
                
                
           
            
            
            
        </div>
    </body>
</html>
