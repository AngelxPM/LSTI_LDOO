/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import javax.servlet.RequestDispatcher;

import lab4.models.Authentication;
import lab4.models.User;
/**
 *
 * @author LSTI
 */
public class loginController extends HttpServlet {

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
        
            RequestDispatcher dispatcher = null;
            /*
           

            //Se recupera la información del request
            
            String txtUsername = request.getParameter("txt-username");
            String txtPassword = request.getParameter("txt-password");
            String txtemail = request.getParameter("txt-email");
            String txtname = request.getParameter("txt-name");
            String txtapell = request.getParameter("txt-apell");
            String txtocup = request.getParameter("txt-ocupacion");  

            User user = new User();
            
            if(txtUsername!="" || txtemail!="" || txtname!="" || txtapell!="" || txtocup!="")
            {
                    
                user.setApellido(txtapell);
                user.setName(txtname);
                user.setOcupacion(txtocup);
                user.setEmail(txtemail);
                user.setUsername(txtUsername);
            }
                
            */
            User user = new User();
            
            String txtUsername = request.getParameter("txt-username");
            String txtPassword = request.getParameter("txt-password");
            
            boolean isValidUser =  Authentication.authenticate(txtUsername, txtPassword);

            if(isValidUser) {
                
                request.setAttribute("username", user.getUsername());
                request.setAttribute("email", user.getEmail());
                request.setAttribute("name", user.getName());
                request.setAttribute("apellido", user.getApellido());
                request.setAttribute("ocupacion", user.getOcupacion());

                
                dispatcher = request.getRequestDispatcher("success.jsp");
                dispatcher.forward(request, response);
            }
            else {
                
                response.sendRedirect("error.jsp");
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
