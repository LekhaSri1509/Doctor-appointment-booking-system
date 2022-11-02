/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.dsignupmodel;
import model.psignup;

/**
 *
 * @author Lenovo
 */
public class psignupcontroller extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet dsignupcontroller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<script>");
            boolean gender1=false;
            out.println("var getSelectedValue = document.querySelector( 'input[name='male']:checked')");   
            out.println("if(getSelectedValue != null) { ");   
                        gender1=true; 
            out.println("}");
            out.println("</script>");
            if(gender1==false|| request.getParameter("name").isEmpty() || request.getParameter("pass").isEmpty() || request.getParameter("phno").isEmpty() || request.getParameter("age").isEmpty()){
                out.println("<script>");
                out.println("alert('Field is empty')");
                out.println("window.location='psignup.jsp'");
                out.println("</script>");
            }
            else{
            String name=request.getParameter("name");
            String password=request.getParameter("pass");
            String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(password);
            String gender=request.getParameter("male");
            long phone=Long.parseLong(request.getParameter("phno"));
            
            int age=Integer.parseInt(request.getParameter("age"));
            if(m.matches()==false){
                out.println("<script>");
                out.println("alert('password is wrong')");
                out.println("window.location='psignup.jsp'");
                out.println("</script>");
                
            }
            else{
            psignup mod1=new psignup();
            
            mod1.setName(name);
            mod1.setPassword(password);
            mod1.setGender(gender);
            mod1.setPhone(phone);
            
            mod1.setAge(age);
            
            int id=mod1.connectionjdbc();
            request.setAttribute("mod1",mod1);
            String age1=String.valueOf(age);
            String id1=String.valueOf(id);
            
            
            boolean status=mod1.validate();
            
            
            if(status){  
                String arr[] = {id1,name,age1,gender};
                request.setAttribute("arr",arr);
               RequestDispatcher dispatcher = request.getRequestDispatcher("success1.jsp");
               dispatcher.forward(request,response);
        }  
        else{  
            out.println("asdf");
        }  
            
            
            
            }
      
            
           
            
            }
            out.println("</body>");
            out.println("</html>");
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
