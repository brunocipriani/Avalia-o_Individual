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
public class Item implements Serializable{
    private Produto prod;
    private double quant;
    
    public Item (){
        
    }
    
    public Item (Produto prod, double quant){
        this.prod = prod;
        this.quant = quant;
    }
    
    public double getQuantidade (){
        return this.quant;
    }
    
    public Produto getProduto (){
        return this.prod;
    }
    
    public void setQuantidade (double quant){
        this.quant = quant;
    }
}
