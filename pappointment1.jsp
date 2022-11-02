<%-- 
    Document   : pappointment1
    Created on : 15-Oct-2022, 11:47:49 pm
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page1</title>
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
            select-selected{
                
                background-color: DodgerBlue;
            }
            tr{
                height: 50px;
                
            }
            td{
                padding-left: 50px;
            }
        </style>
    </head>
    <body>
        
        <div id="box">
            <form name="name1" action="homepage1" method="get">
            <table border="3">
                <tr>
                    <th>Sno</th>
                    <th>Doctor Name</th><!-- comment -->
                    
                    <%@page import="java.util.ArrayList" %>
                   
                    <% ArrayList<String> arrayList1= (ArrayList<String>) request.getAttribute("arrayList"); %>
                    <% ArrayList<String> name= (ArrayList<String>) request.getAttribute("name"); %>
                    <% ArrayList<String> specialist= (ArrayList<String>) request.getAttribute("specialist"); %>
                    <% ArrayList<String> fee= (ArrayList<String>) request.getAttribute("fee"); %>
                    <% ArrayList<String> id= (ArrayList<String>) request.getAttribute("id"); %>
                    
                    
                    
                   <% String day=(String)request.getAttribute("days");%>
                   <% String strdate=(String)request.getAttribute("date");%>
                   <%=day%>
                   <input type="hidden" value="<%=day%>" name="list">
                   <input type="hidden" value="<%=strdate%>" name="strdate">
                    
                    
                    <th><label>Specialist</label><!-- comment -->
                        <select name="specialist" onchange="javascript:document.name1.submit();">
                            <option value="none" selected disabled hidden><%=specialist.get(0)%></option>
                            <%int i=0;
                              while(i<arrayList1.size()){%>
                                <option value="<%= arrayList1.get(i) %>"><%= arrayList1.get(i) %> </option>  
                                 <% i=i+1;
                              }
                                
                                %>
                            
                        </select>
                    </th>
                    <th>Fee</th>
                    <th>Booking</th>
                </tr>
                
                <form name="name2" method="get">
                <% int j=0;
                while(j<name.size()){%>
                <tr>
                    <td><input type="hidden" name="name<%=j%>" value="<%= id.get(j)%>"><%= id.get(j) %></td>
                    <td><%= name.get(j) %></td>
                    <td><%= specialist.get(j) %></td>
                    <td><%= fee.get(j) %></td>
                    <td><button name="name14" formaction="calender" value="<%=j%>">Book Now</button></td>
                </tr>
                <%
                    j=j+1;
                    }%>
                   
                
            </table>
                </form>
            </form>
        </div>
    </body>
</html>
