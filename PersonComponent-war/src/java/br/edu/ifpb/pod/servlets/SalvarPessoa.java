package br.edu.ifpb.pod.servlets;

import br.edu.ifpb.pod.dao.PessoaDAO;
import br.edu.ifpb.pod.entidades.Pessoa;
import java.io.File;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author filipe
 */
public class SalvarPessoa extends HttpServlet {

    @EJB
    private PessoaDAO pessoaDAO;
    
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Pessoa pessoa = new Pessoa();
        Long idPessoa = (Long) request.getSession().getAttribute("idPessoaL");
        System.out.println(idPessoa);
        
        if (idPessoa == null){
            pessoa.setId(null);
        } else {
            pessoa.setId(idPessoa);
        }
        

        pessoa.setNome(request.getParameter("nome"));
        pessoa.setCpf(request.getParameter("cpf"));
        pessoa.setEmail(request.getParameter("email"));


        File foto1 = new File(request.getParameter("foto1"));
        byte[] imagemArray1 = new byte[(int) foto1.length()];
        pessoa.setFoto1(imagemArray1);
        //        
        File foto2 = new File(request.getParameter("foto2"));
        byte[] imagemArray2 = new byte[(int) foto2.length()];
        pessoa.setFoto2(imagemArray2);
        //
        File foto3 = new File(request.getParameter("foto3"));
        byte[] imagemArray3 = new byte[(int)foto3.length()];
        pessoa.setFoto3(imagemArray3);
        //
        File foto4 = new File(request.getParameter("foto4"));
        byte[] imagemArray4 = new byte[(int)foto4.length()];
        pessoa.setFoto4(imagemArray4);

        pessoaDAO.cadastraPessoa(pessoa);

        request.getRequestDispatcher("/paginas/CadastroPessoa").forward(request, response);
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
