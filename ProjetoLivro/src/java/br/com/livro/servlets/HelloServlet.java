/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.livro.servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/hello")

/**
 *
 * @author lucas
 */
public class HelloServlet extends HttpServlet {
    
    private static final long serialVersion = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        res.getWriter().print("Ola mundo" + nome + " " + sobrenome);  
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        res.getWriter().print("Ola mundo POST" + nome + " " + sobrenome);
    }
    
}
