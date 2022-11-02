<%-- 
    Document   : pappointment
    Created on : 15-Oct-2022, 4:33:06 pm
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <style>
            body{
                background-image: url("https://img.freepik.com/free-vector/clean-medical-background_53876-116875.jpg?w=1380&t=st=1665745362~exp=1665745962~hmac=6a4eb9dadeecdd319200d03065e72593e1ec6da8ffdd9a70c824a618ad66170a");
                background-size: cover;
                font-family: helvetica;
                
            }
            #box{
                height: 450px;
                width: 900px;
                border-radius:12px;
                border: 2px solid black;
                padding-left: 80px;
                padding-top: 30px;
                margin-left: 20%;
                margin-top: 10%;
                
            }
            table{
                
                border-collapse: collapse;
                width: 100%;
                position: relative;
                right: 50px;
            }
            tr{
                height: 50px;
                
            }
            td{
                padding-left: 50px;
            }
            select-selected{
                
                background-color: DodgerBlue;
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
        <form name="name1" action="http://localhost:8081/mvcproject/homepage1" method="get">
           
       <% 
           
                String day1= (String)request.getAttribute("dayWeekText"); 
                String date=(String)request.getAttribute("date");
                
                
                
                
       %>
       
        <input type="hidden" name="list" value="<%=day1%>">
        <input type="hidden" name="strdate" value="<%=date%>">
       
        <div id="box">
            
                
                
            <table border="3">
                <tr>
                    <th>Sno</th>
                    <th>Doctor Name</th><!-- comment -->
                    
                    <%@page import="java.util.ArrayList" %>
                    
                    <% ArrayList<String> arrayList1= (ArrayList<String>) request.getAttribute("list"); %>
                    
                    
                
                    
                    
                    
                    <th><label>Specialist</label><!-- comment -->
                        <select name="specialist" onchange="javascript:document.name1.submit();">
                            <option value="none" selected disabled hidden>Select an Option</option>
                            <%int i=0;
                              while(i<arrayList1.size()){%>
                                <option value="<%= arrayList1.get(i)%>" ><%= arrayList1.get(i) %> </option>  
                                 <% i=i+1;
                              }
                                
                                %>
                            
                        </select>
                    </th>
                    <th>Booking</th>
                </tr>
                
            </table>
            </form>
        </div>
    </body>
</html>
