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
public class dappointmentmodel {
    public static int id=0;
         public static ArrayList<String> pid = new ArrayList<String>();
           public static ArrayList<String> name = new ArrayList<String>();
            ArrayList<String> age = new ArrayList<String>();
            ArrayList<String> gender = new ArrayList<String>();
            ArrayList<String> phno = new ArrayList<String>();
            ArrayList<String> date = new ArrayList<String>();
            ArrayList<String> symptom = new ArrayList<String>();
  
    public void connectionjdbc() {
        pid.clear();
        name.clear();
        age.clear();
        gender.clear();
        phno.clear();
        date.clear();
        symptom.clear();
        
        Connection con1 = null;
        String name1=null;
        Statement st= null;
        Statement st1=null; 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
           
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorabs?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            st=con1.createStatement();
            st1=con1.createStatement();
            
           String s="select * from dcurrentuser";
          
           ResultSet rs=st.executeQuery(s);
           while(rs.next()){
                id=rs.getInt("id");
                
            }
          
           String s1="select * from patient where docid="+id;
           
           ResultSet rs1=st1.executeQuery(s1);
           
           
             
           while(rs1.next()){
               pid.add(String.valueOf(rs1.getInt("patientid")));
               name.add(rs1.getString("patientname"));
               name1=rs1.getString("patientname");
               age.add(String.valueOf(rs1.getInt("age")));
               phno.add(String.valueOf(rs1.getLong("phno")));
               gender.add(rs1.getString("gender"));
               symptom.add(rs1.getString("symptom"));
               date.add(rs1.getString("date"));
           }
         
            
           
            
        }
            catch(Exception e){
                
                
            }
        
}
    
         public static int getId() {
        return id;
    }

    public static void setId(int id) {
        dappointmentmodel.id = id;
    }

   public ArrayList<String> getPid() {
       return pid;
    }
      public ArrayList<String> getName() {
       return name;
    }
   
       public ArrayList<String> getAge() {
       return age;
    }
   
    
    public ArrayList<String> getPhno() {
       return phno;
    }
   
    public ArrayList<String> getGender() {
        return gender;
    }

   public ArrayList<String> getSymptom() {
        return symptom;
    }

   
   public ArrayList<String> getDate() {
        return date;
    }

    public void setPid(ArrayList<String> pid) {
        this.pid = pid;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }

    public void setAge(ArrayList<String> age) {
        this.age = age;
    }

    public void setGender(ArrayList<String> gender) {
        this.gender = gender;
    }

    public void setPhno(ArrayList<String> phno) {
        this.phno = phno;
    }

    public void setDate(ArrayList<String> date) {
        this.date = date;
    }

    public void setSymptom(ArrayList<String> symptom) {
        this.symptom = symptom;
    }

}
