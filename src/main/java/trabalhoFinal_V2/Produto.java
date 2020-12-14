/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal_V2;

import java.io.Serializable;

/**@authors
 * Alessandra Siciliano Orlando
 * José Augusto Ramos Belmont 
 * Bruno Cipriani Cerqueira 
 */
public class Produto implements Serializable {
    private static final long serialVersionUID = 5830831255292090870L;
    
    private String nome;
    private String validade;
    private String unidade;
    private double preco;
    
   public Produto (){
       
   }
    
    public Produto (String nome, String validade, String unidade, double preco){
        this.nome = nome;
        this.validade = validade;
        this.unidade = unidade;
        this.preco = preco;
    }
    
    public String getNome (){
        return this.nome;
    }
    public String getValidade(){
        return this.validade;
    }
    public String getUnidade(){
        return this.unidade;
    }
    public double getPreco(){
        return this.preco;
    }
}
