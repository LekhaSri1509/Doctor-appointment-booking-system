/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static model.dsigninmodel.check;

/**
 *
 * @author Lenovo
 */

public class fieldmodel {
    Connection con1 = null;
    Statement st= null;
    String a=null;
     ArrayList<String> name = new ArrayList<String>();
     ArrayList<String> fee = new ArrayList<String>();
     ArrayList<String> specialist = new ArrayList<String>();
     ArrayList<String> id = new ArrayList<String>();
     public ArrayList<String> getSpecialist(){
         return specialist;
     }
     public ArrayList<String> getFee(){
         return fee;
     }
     public ArrayList<String> getId(){
         return id;
     }
     public ArrayList<String> connectionjdbc(String field) throws ClassNotFoundException, SQLException{
       
        String id1=null;
        String id2=null;
        
   
    
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorabs?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            st=con1.createStatement();
            //"select bookname from books where bookname like '"+name+"%' and Copies>0;";
           String s="select * from doctor where specialist = '"+field+"'";
           a="asdf";
           
            ResultSet r=st.executeQuery(s);
            try{
           
            while(r.next()){
               
                
                name.add(r.getString("docname"));
                specialist.add(r.getString("specialist"));
                fee.add(String.valueOf(r.getInt("fees")));
                id.add(String.valueOf(r.getInt("docid")));
                
                        }
            return name;
            }
            catch(Exception e){
                
            }
                      
            }
            
            
             
            
            
            catch(Exception e){
                
                    
            }
        return null;
      
    }
    
}
