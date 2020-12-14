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
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 6026382878064054599L;
    //private static final long serialVersionUID = -8252479209298208406L;
    
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    
    public Pessoa (){
        
    }
    
    public Pessoa (String nome, String endereco, String telefone, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
            
    public String getEmail(){
        return this.email;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
}
