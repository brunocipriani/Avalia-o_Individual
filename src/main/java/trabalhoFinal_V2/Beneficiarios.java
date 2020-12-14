/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal_V2;

import java.util.List;

/**@authors
 * Alessandra Siciliano Orlando
 * José Augusto Ramos Belmont 
 * Bruno Cipriani Cerqueira 
 */
public class Beneficiarios extends Pessoa {    
    private String cpf;
    
    public Beneficiarios (){
        
    }
    
    public Beneficiarios (String nome, String endereco, String telefone, String email, String cpf){
        super (nome, endereco, telefone, email);
        this.cpf = cpf;      
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    } 
}
