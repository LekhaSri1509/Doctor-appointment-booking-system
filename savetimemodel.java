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
public class savetimemodel {
    
     Connection con1 = null;
    Statement st= null;
    
    public void connectionjdbc(String time, int docid, String text, String date){
        int id=0;
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorabs?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            st=con1.createStatement();
            String sql="select * from pcurrentuser;";
            
            ResultSet r=st.executeQuery(sql);
            while(r.next()){
                
                id=r.getInt("id");
            }
            
             Statement stmt31  = con1.createStatement();
	    stmt31.executeUpdate("UPDATE patient set docid = "+docid+", time='"+time+"', date='"+date+"',symptom='"+text+"' where patientid = "+id);
            
            
            }
            catch(Exception e){
                System.out.println(e);
}
            
    }
    }
    

