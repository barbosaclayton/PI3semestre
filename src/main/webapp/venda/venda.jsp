<%-- 
    Document   : venda
    Created on : 3 de nov de 2021, 08:55:24
    Author     : lucas
--%>

<%@page import="br.senac.projetointegrador.dao.ClienteDAO"%>
<%@page import="br.senac.projetointegrador.entidades.Cliente"%>
<%@page import="br.senac.projetointegrador.entidades.Venda"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastrar Venda</h1>
        
        <%
            Venda v = new Venda();
            Cliente c = new Cliente();
            
            try {
                    String acao = request.getParameter("acao");
                    ClienteDAO cDAO = new ClienteDAO();
                    if(acao.equals("novo")){
                        int idCliente = Integer.parseInt(request.getParameter("idCliente"));
                        c = cDAO.getClientePorId(id);
                    }
                } catch (Exception e) {
                out.print("Erro: "+e);
                }
        %>
    </body>
</html>
