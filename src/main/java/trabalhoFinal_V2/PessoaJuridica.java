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

public class PessoaJuridica extends Pessoa implements Serializable {
     String cnpj;
     String representante;
    
    
   public PessoaJuridica (){
       
   }
   
   public PessoaJuridica (String nome, String endereco, String telefone, String email, String cnpj, String representante){
       super (nome, endereco, telefone, email);
       this.cnpj = cnpj;
       this.representante = representante;
   }
   
   public String getCnpj (){
       return this.cnpj;
   }
           
   public String getRepresentante (){
       return this.representante;
   }
   
   
}
