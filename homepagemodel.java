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
import java.util.ArrayList;


/**
 *
 * @author Lenovo
 */
public class homepagemodel {
    
   Connection con1 = null;
    Statement st= null;  
    public ArrayList<String> connectionjdbc(){
       
        String id1=null;
        String id2=null;
        
    ArrayList<String> arrayList = new ArrayList<String>();
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorabs?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            st=con1.createStatement();
           String s="select distinct(specialist) from doctor";
           
            ResultSet r=st.executeQuery(s);
            while(r.next()){
                id1=r.getString("specialist");
                arrayList.add(id1);
               
                
                
               
            }
            return arrayList;
            
             
            }
            
            catch(Exception e){
                

            }
       return null;
      
    }
           
    
}
