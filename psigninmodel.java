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
public class psigninmodel {
     public int check=0;
    private static String name;
    private static String password;
    private static int flag;
    private static int id=0;
    private static String id1=null;
    
    Connection con1 = null;
    Statement st= null;
    Statement st1=null;
    
    public String getName() {
        flag=0;
        return name;
    }
     public void setName(String name) {
        this.name = name;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        psigninmodel.password = password;
    }
    public String getUsername(){
        return id1;
    }
    public int getUserid(){
        return id;
    }
    public void connectionjdbc(){
       
        
        String id2=null;
        
    
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorabs?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            st=con1.createStatement();
            st1=con1.createStatement();
            
           String s="select * from patient where patientname='"+name+"'";
           
            ResultSet r=st.executeQuery(s);
            while(r.next()){
                id1=r.getString("patientname");
                id=r.getInt("patientid");
                id2=r.getString("password");
                
               
            }
             if(id1.equals(name) && id2.equals(password)){
                    check=1;
                    String s1="insert into pcurrentuser(id) values("+id+");";
                    st1.executeUpdate(s1);

                }
            }
            
            catch(Exception e){
                System.out.println(e);

            }}
            public boolean validate(){
                if(check==1){
                    return true;
                }
                else{
                    return false;
                }
            }
    
}
