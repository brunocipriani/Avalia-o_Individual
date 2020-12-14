/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal_V2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**@authors
 * Alessandra Siciliano Orlando
 * José Augusto Ramos Belmont 
 * Bruno Cipriani Cerqueira 
 */
public class EmpresaDoadora extends PessoaJuridica implements Serializable{
    private static final long serialVersionUID = 6192585415149670247L;
    
    private List<Doacoes> doacoes = new ArrayList<Doacoes>();
    
    public EmpresaDoadora(){
    }
    
    public EmpresaDoadora(String nome, String endereco, String telefone, String email, String cnpj, String representante){
        super(nome, endereco, telefone, email, cnpj, representante);
    }

    public void setDoacao(Doacoes doacoes) { 
        this.doacoes.add(doacoes);
    }

    
    public List<Doacoes> getDoacoes() {
        return this.doacoes;
    }
    
    public void setCnpj (String cnpj){
        this.cnpj = cnpj;
    }
    
    public void setRepresentante(String representante){
        this.representante = representante;
    }
    
    public void setTodasDoacoes (List doacoes){
        this.doacoes = doacoes;
    }
    
}
