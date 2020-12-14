/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal_V2;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**@authors
 * Alessandra Siciliano Orlando
 * José Augusto Ramos Belmont 
 * Bruno Cipriani Cerqueira 
 */
public class Arquivos {
    
//====================== SALVAMENTO E RECUPERAÇÃO DE BENEFICIÁRIOS ======================================    
    
    public static void gravaBeneficiario (List<Beneficiarios> cadBeneficiario){
        ObjectOutputStream os = null;
        try {
            FileOutputStream fs = new FileOutputStream ("Beneficiario.file");
            os = new ObjectOutputStream (fs);
            
            for (Beneficiarios obj : cadBeneficiario){
                os.writeObject(obj);
            }            
            os.flush();
            os.close();
            fs.flush();
            fs.close();
            System.out.println ("Arquivo de beneficiarios salvo com sucesso");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static List recuperaBeneficiario (){
        List <Beneficiarios> cadBeneficiario = new ArrayList <Beneficiarios>();
        Beneficiarios aux = new Beneficiarios ();
        int i = 0;
        try{
            FileInputStream fs = new FileInputStream ("Beneficiario.file");
            ObjectInputStream  obj = new ObjectInputStream (fs);
            while(true){
                try{
                    aux = (Beneficiarios) obj.readObject();
                    cadBeneficiario.add(aux);
                    i++;
                } catch (EOFException ex) {
                    try {
                        obj.close();
                        fs.close();
                        System.out.println("fim do arquivo. Recueperado "+i+" Beneficiários");
                        return cadBeneficiario;
                    } catch (IOException ex1) {
                        Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                } catch (ClassNotFoundException ex) {
                    System.out.println("CLASSE NÃO ENCONTRADA");                    
                }
            }
        } catch (FileNotFoundException ex) {
            Arquivos.gravaBeneficiario(cadBeneficiario);
            return cadBeneficiario;
        } catch (IOException ex) {
            System.out.println("Erro na serialização ou desserialização do arquivo");
            System.out.println("erro "+ex.getMessage());
            return null;
        }
    } 
    
    
// =======================SALVAMENTO E RECUPERAÇÃO DE PRODUTOS =======================================
    
    public static void gravaProdutos (List<Produto> cadProdutos){
        ObjectOutputStream os = null;
        try {
            FileOutputStream fs = new FileOutputStream ("Produto.file");
            os = new ObjectOutputStream (fs);
            
            for (Produto obj : cadProdutos){
                os.writeObject(obj);
            }          
            os.flush();
            os.close();
            fs.flush();
            fs.close();
            System.out.println ("Arquivo de produtos salvo com sucesso");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static List recuperaProduto (){
        List <Produto> cadProduto = new ArrayList <Produto>();
        Produto aux = new Produto ();
        int i = 0;
        
        try{
            FileInputStream fs = new FileInputStream ("Produto.file");
            ObjectInputStream  obj = new ObjectInputStream (fs);
            while(true){
                try{
                    aux = (Produto) obj.readObject();
                    cadProduto.add(aux);
                    i++;
                } catch (EOFException ex) {
                    try {
                        obj.close();
                        fs.close();
                        System.out.println("fim do arquivo. Recueperado "+i+" Produtos");
                        return cadProduto;
                    } catch (IOException ex1) {
                        Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                } catch (ClassNotFoundException ex) {
                    System.out.println("CLASSE NÃO ENCONTRADA");                    
                }
            }
        } catch (FileNotFoundException ex) {
            Arquivos.gravaProdutos(cadProduto);
            return cadProduto;
        } catch (IOException ex) {
            System.out.println("Erro na serialização ou desserialização do arquivo");
            System.out.println("erro "+ex.getMessage());
            return null;
        }
    } 
    
    
// =======================  SALVAMENTO E RECUPERAÇÃO DE EMPRESAS ==============================================
    
    public static void gravaEmpresa (List<EmpresaDoadora> cadEmpresa){
        ObjectOutputStream os = null;
        try {
            FileOutputStream fs = new FileOutputStream ("Empresa.file");
            os = new ObjectOutputStream (fs);
            
            for (EmpresaDoadora obj : cadEmpresa){
                os.writeObject(obj);
            }            
            os.flush();
            os.close();
            fs.flush();
            fs.close();
            System.out.println ("Arquivo de empresas salvo com sucesso");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    public static List recuperaEmpresa (){
        List <EmpresaDoadora> cadEmpresa = new ArrayList <EmpresaDoadora>();
        EmpresaDoadora aux = new EmpresaDoadora ();
        int i = 0;
        
        try{
            FileInputStream fs = new FileInputStream ("Empresa.file");
            ObjectInputStream  obj = new ObjectInputStream (fs);
            while(true){
                try{
                    aux = (EmpresaDoadora) obj.readObject();
                    cadEmpresa.add(aux);
                    i++;
                } catch (EOFException ex) {
                    try {
                        obj.close();
                        fs.close();
                        System.out.println("fim do arquivo. Recueperado "+i+" Empresas");
                        return cadEmpresa;
                    } catch (IOException ex1) {
                        Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                } catch (ClassNotFoundException ex) {
                    System.out.println("CLASSE NÃO ENCONTRADA");                    
                }
            }
        } catch (FileNotFoundException ex) {
            Arquivos.gravaEmpresa(cadEmpresa);
            return cadEmpresa;
        } catch (IOException ex) {
            System.out.println("Erro na serialização ou desserialização do arquivo");
            System.out.println("erro "+ex.getMessage());
            return null;
        }
    } 
    
    
    // =======================  SALVAMENTO E RECUPERAÇÃO DE ESTOQUE ==============================================
    
    public static void gravaEstoque(List<Item> cadEstoque){
        ObjectOutputStream os = null;
        try {
            FileOutputStream fs = new FileOutputStream ("Estoque.file");
            os = new ObjectOutputStream (fs);
            
            for (Item obj : cadEstoque){
                os.writeObject(obj);
            }            
            os.flush();
            os.close();
            fs.flush();
            fs.close();
            System.out.println ("Arquivo de estoque salvo com sucesso");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    public static List recuperaEstoque (){
        List <Item> cadEstoque = new ArrayList <Item>();
        Item aux = new Item ();
        int i = 0;
        
        try{
            FileInputStream fs = new FileInputStream ("Estoque.file");
            ObjectInputStream  obj = new ObjectInputStream (fs);
            while(true){
                try{
                    aux = (Item) obj.readObject();
                    cadEstoque.add(aux);
                    i++;
                } catch (EOFException ex) {
                    try {
                        obj.close();
                        fs.close();
                        System.out.println("fim do arquivo. Recueperado "+i+" itens no estoque");
                        return cadEstoque;
                    } catch (IOException ex1) {
                        Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                } catch (ClassNotFoundException ex) {
                    System.out.println("CLASSE NÃO ENCONTRADA");                    
                }
            }
        } catch (FileNotFoundException ex) {
            Arquivos.gravaEstoque(cadEstoque);
            return cadEstoque;
        } catch (IOException ex) {
            System.out.println("Erro na serialização ou desserialização do arquivo");
            System.out.println("erro "+ex.getMessage());
            return null;
        }
    } 
    
    // =======================  SALVAMENTO E RECUPERAÇÃO DE DOAÇÕES ==============================================
    
    public static void gravaDoacoes(List<Doacoes> cadDoacoes){
        ObjectOutputStream os = null;
        try {
            FileOutputStream fs = new FileOutputStream ("Doacoes.file");
            os = new ObjectOutputStream (fs);
            
            for (Doacoes obj : cadDoacoes){
                os.writeObject(obj);
            }            
            os.flush();
            os.close();
            fs.flush();
            fs.close();
            System.out.println ("Arquivo de doações salvo com sucesso");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    public static List recuperaDoacoes(){
        List <Doacoes> cadDoacoes = new ArrayList <Doacoes>();
        Doacoes aux = new Doacoes ();
        int i = 0;
        
        try{
            FileInputStream fs = new FileInputStream ("Doacoes.file");
            ObjectInputStream  obj = new ObjectInputStream (fs);
            while(true){
                try{
                    aux = (Doacoes) obj.readObject();
                    cadDoacoes.add(aux);
                    i++;
                } catch (EOFException ex) {
                    try {
                        obj.close();
                        fs.close();
                        System.out.println("fim do arquivo. Recueperado "+i+" itens no estoque");
                        return cadDoacoes;
                    } catch (IOException ex1) {
                        Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                } catch (ClassNotFoundException ex) {
                    System.out.println("CLASSE NÃO ENCONTRADA");                    
                }
            }
        } catch (FileNotFoundException ex) {
            Arquivos.gravaDoacoes(cadDoacoes);
            return cadDoacoes;
        } catch (IOException ex) {
            System.out.println("Erro na serialização ou desserialização do arquivo");
            System.out.println("erro "+ex.getMessage());
            return null;
        }
    } 
  
}
