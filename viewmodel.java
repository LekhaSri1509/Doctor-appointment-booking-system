/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class viewmodel {
    Connection con1 = null;
    Statement st= null;
    private static int did=0;
    private static String date=null;
    private static String time=null;
    private static String sym=null;
    private static String name=null;
    private static String dname=null;

    public static int getDid() {
        return did;
    }

    public static String getDate() {
        return date;
    }

    public static String getTime() {
        return time;
    }

    public static String getSym() {
        return sym;
    }

    public static String getName() {
        return name;
    }

    public static String getDname() {
        return dname;
    }
    
    public String connectionjdbc(){
        
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorabs?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            st=con1.createStatement();
           
             String sql="select * from pcurrentuser;";
            
            ResultSet r=st.executeQuery(sql);
            while(r.next()){
                
                did=r.getInt("id");
            }
            String sql2="select * from patient where patientid="+did;
            
            ResultSet r1=st.executeQuery(sql2);
            while(r1.next()){
                
               
                did=r1.getInt("docid");
                name=r1.getString("patientname");
                date=r1.getString("date");
                time=r1.getString("time");
                
            }
            String sql3="select * from doctor where docid="+did;
            ResultSet r2=st.executeQuery(sql3);
            while(r2.next()){
                dname=r2.getString("docname");
            }
             
            
            
            return dname;
            
            }
            catch(Exception e){
                System.out.println(e);
}
        return null;
            
    }
    
}
