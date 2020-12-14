/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal_V2;

import java.io.Serializable;
import java.util.*;

/**@authors
 * Alessandra Siciliano Orlando
 * José Augusto Ramos Belmont 
 * Bruno Cipriani Cerqueira 
 */
public class Doacoes implements Serializable {
    
    private String data;
    private List <Item> itensDoados;
    private Beneficiarios beneficiario;
    
    public Doacoes (){
        
    }
    
    public Doacoes (String data, List itens){
        this.data = data;
        this.itensDoados = itens;
    }
    
    public Doacoes (String data, List itens, Beneficiarios beneficiario){
        this.data = data;
        this.itensDoados = itens;
        this.beneficiario = beneficiario;
    }
    
    public String getData (){
        return this.data;
    }
    
    public List getItensDoados(){
        return this.itensDoados;
    }
    
    public Beneficiarios getBeneficiario() {
        return beneficiario;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public void setItensDoados(List <Item> itensDoados) {
        this.itensDoados = itensDoados;
    }
    
    public void setBeneficiario(Beneficiarios beneficiario) {
        this.beneficiario = beneficiario;
    }
}
