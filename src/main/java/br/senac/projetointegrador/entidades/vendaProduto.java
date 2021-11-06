/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senac.projetointegrador.entidades;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author lucas
 */

@Getter
@Setter

public class vendaProduto {
    private long idVendaProduto;
    private int qtd;
    private double valorVendido;
    private Venda venda;
    private Produto produto;

    public vendaProduto(long idVendaProduto, int qtd, double valorVendido, Venda venda, Produto produto) {
        this.idVendaProduto = idVendaProduto;
        this.qtd = qtd;
        this.valorVendido = valorVendido;
        this.venda = venda;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "vendaProduto{" + "idVendaProduto=" + idVendaProduto + ", qtd=" + qtd + ", valorVendido=" + valorVendido + ", venda=" + venda + ", produto=" + produto + '}';
    }

    

}
