/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.projetointegrador.entidades;

import java.sql.Date;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author lucas
 */
@Getter
@Setter

public class Venda {
    private int idVenda;
    private Date dataVenda;
    private Cliente cliente;
    private ArrayList<vendaProduto> carrinho;

 

    @Override
    public String toString() {
        return "Venda{" + "idVenda=" + idVenda + ", dataVenda=" + dataVenda + ", cliente=" + cliente + ", carrinho=" + carrinho + '}';
    }
   
    
}
