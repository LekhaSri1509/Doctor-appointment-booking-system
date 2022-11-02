<%-- 
    Document   : timeslot
    Created on : 16-Oct-2022, 11:31:55 pm
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
            #box{
                height: 1000px;
                width: 300px;
                border: 2px solid black;
                margin-left: 25%;
                padding: 5%;
                
            }
            .button1{
                margin-left: 200px;
                height: 100px;
                width: 100px;
                
                
                
            }
            .but1{
                
                padding-left: 10px;
                height: 30px;
                float: left;
                width: 100px;
                border: 2px solid black;
            }
        </style>
    </head>
    <body>
        <form name="form" method="get">
        <div id="box">
            <h2>CHOOSE TIME SLOT</h2>
         <%@ page import="java.time.format.DateTimeFormatter" %>
            <%@ page import="java.time.LocalDateTime" %>
            <%@ page import="java.util.Date" %>
            <%@ page import="java.text.SimpleDateFormat" %>
            <%@ page import="java.text.DateFormat" %>
            <%@ page import="java.util.concurrent.TimeUnit" %>
            
        <%String date= (String)request.getAttribute("date");
        
          String text=(String)request.getAttribute("text");
          String doc=(String)request.getAttribute("doc");
          %>
          <input type="hidden" name="docid" value="<%=doc%>">
          <input type="hidden" name="sym" value="<%=text%>">
          <input type="hidden" name="date" value="<%=date%>">
          <%
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH"); 
        DateTimeFormatter cd = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter nd = DateTimeFormatter.ofPattern("dd/MM/yyyy 23:59:59");
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime next = now.plusDays(1);
        String cdate=(String)cd.format(now);
        String cdate1=(String)dtf1.format(now);
        
        
        String d1=(String)cd.format(now);
        String d2=(String)nd.format(next);
        
       String[] today=cdate.split(" ");
       String[] given=date.split(" ");
        
        

        Date start;
        Date end;
        
        long diffHours=0;
        try{
           
            start = sdf.parse(date);
           
            end=sdf.parse(d2);
             
            
            long diff = end.getTime() - start.getTime();
            diffHours= (diff/ (1000 * 60 * 60))% 24;
            
            
            
        }
        catch(Exception e){
            out.println(e);
        }
        
        if(today[0].equals(given[0])){
            
            int nowhr=Integer.parseInt(cdate1);
            if(nowhr==10){
                nowhr=nowhr+1;
            }
            if(nowhr<10){
                    nowhr=10;
            }
            
          
            while(nowhr<22){
               
                
                 %><br>
                 
                 <div class="but1">
                     
                <input type="radio" name="slott<%=nowhr%>" value="<%=nowhr%>:00"><%=nowhr%>:00
                 </div>
                <div >
                    <button style="height:35px; width: 50px; margin-bottom: 20px; margin-left: 20px;"  class="button1" formaction="savetime" name="time" value="<%=nowhr%>">Book</button>
                </div>
                
                <%
                    
               nowhr=nowhr+1; 
                
            }
                
        }
        else{
            
            int i=10;
            int endi=22;
            while(i<=endi){
             %><br>
             <div class="but1">
                <input type="radio" name="slot<%=i%>" value="<%=i%>:00"><%=i%>:00
             </div>
                <button style="height:35px; width: 50px; margin-bottom: 20px; margin-left: 20px;" formaction="savetime1" name="time1" value="<%=i%>">Book</button>
                <%
                i=i+1;
            }
            
            
        }
        %>
        </div>
        </form>
    </body>
</html>
