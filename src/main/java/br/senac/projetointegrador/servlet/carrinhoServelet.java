/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.projetointegrador.servlet;

import br.senac.projetointegrador.dao.ClienteDAO;
import br.senac.projetointegrador.entidades.Cliente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lucas
 */
public class carrinhoServelet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cpf = request.getParameter("cpf");

        Cliente cliente = ClienteDAO.getClientePorCpf(cpf);

        HttpSession sessao = request.getSession();
        List<Cliente> listaClientes;
        if (sessao.getAttribute("listaClientes") == null) {
            listaClientes = new ArrayList<>();
        } else {
            listaClientes = (List<Cliente>) sessao.getAttribute("listaClientes");
        }
        if (!listaClientes.contains(cliente)) {
            listaClientes.add(cliente);
        }
        
        sessao.setAttribute("listaClientes", listaClientes);
    }
}
