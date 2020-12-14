/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal_V2;

/**@authors
 * Alessandra Siciliano Orlando
 * José Augusto Ramos Belmont 
 * Bruno Cipriani Cerqueira 
 */
public class Tela {
    
    
    public static void Cls (){
        for (int i=0; i<35; i++){
            System.out.println("");
        }
    }
    
    public static void posicaoH (int posH){
        for (int i=0; i<posH; i++){
            System.out.print(" ");
        }
    }
    public static void posicaoV (int posV){
        for (int i=0; i<posV; i++){
            System.out.println(" ");
        }
    }
    
    public static void TelaInicial(){
        Tela.Cls();
        Tela.posicaoH(60);       
        System.out.println("MENU PRINCIPAL");
        System.out.println("");
        Tela.posicaoH(38);
        System.out.println("<1> CADASTRA PRODUTO                  <2> CADASTRA BENEFICIARIO");
        System.out.println("");
        Tela.posicaoH(38);
        System.out.println("<3> CADASTRA EMPRESA                  <4> ATUALIZA BENEFICIARIO");
        System.out.println("");
        Tela.posicaoH(38);
        System.out.println("<5> ATUALIZA EMPRESA                  <6> RECEBE DOAÇOES");
        System.out.println("");
        Tela.posicaoH(38);
        System.out.println("<7> MOSTRA ESTOQUE DISPONÍVEL         <8> CONSULTA PRODUTOS CADSTRADOS");
        System.out.println("");
        Tela.posicaoH(38);
        System.out.println("<9> CONSULTA EMPRESAS CASDASTRADAS    <10> CONSULTA BENEFICIÁRIOS CADASTRADOS ");
        System.out.println("");
        Tela.posicaoH(38);
        System.out.println("<11> HISTÓRICO DE DOAÇÕES             <12> CONSULTA DOAÇOES POR CPF DO BENEFICIARIO");
        System.out.println("");
        Tela.posicaoH(38);  
        System.out.println("<13> VER DOAÇÕES POR CNPJ             <14> DOAR PARA UM BENEFICIÁRIO");
        System.out.println("");
        Tela.posicaoH(38);
        System.out.println("<15> EXCLUIR BENEFICIÁRIO             <16> FIM");
        System.out.println("");
        Tela.posicaoH(38);
        System.out.print("SUA ESCOLHA -->");
        
        Tela.posicaoV(10);
    }
}
