/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal_V2.Principal;

import trabalhoFinal_V2.Arquivos;
import trabalhoFinal_V2.EntraDados;
import trabalhoFinal_V2.InstituicaoFilantropica;
import trabalhoFinal_V2.Tela;

/**@authors
 * Alessandra Siciliano Orlando
 * José Augusto Ramos Belmont 
 * Bruno Cipriani Cerqueira 
 */

public class Teste {
    
    /*
    A)  Nossa aplicação não realiza gravações em todas as classes, ao invéz disto, ela possui uma única classe, "Arquivos", que possui todos os métodos responsáveis pelas gravações no Sistema. Por sua vez, ao finalizar a utilização do programa, esses métodos são chamados e as gravações são realizadas.
    Logo, acredito que a solução seria alterar esses métodos de gravação, a fim de que suas funcionalidades incluam gravações em outros tipos de meios de persistência de dados.
    A maneira como nosso programa está implementado favorece esta solicitação, pois só seria necessário fazer alterações em uma única classe já existente. 
    Existem diversas outras soluções, porém creio que a descrita anteriormente atenda bem a solicitação, pois, posteriormente, se for necessário realizar uma mudança no programa, o programador terá que se preocupar apenas com os métodos de uma única classe.
    */

    public static void main (String [] args){
        String esc;
        EntraDados in = new EntraDados();
        InstituicaoFilantropica cad = new InstituicaoFilantropica();
        boolean flag = true;
        
        
        cad.leProdutos();
        cad.leBeneficiarios();
        cad.leDoacoes();
        cad.leEmpresa();
        cad.leEstoque();
        
        while (flag){
            Tela.TelaInicial();
            esc = in.entraString();
            if (esc.compareTo("1")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("CADASTRA PRODUTO");
                cad.cadastraProduto();
            }
            if (esc.compareTo("2")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("CADASTRA BENEFICIÁRIO");
                cad.cadastraBeneficiario();
            }
            if (esc.compareTo("3")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("CADASTRA EMPRESA");
                cad.cadastraEmpresa();
            }
            if (esc.compareTo("4")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("ATUALIZA BENEFICIÁRIO");
                cad.atualizaCadastroBeneficiario();
            }
            if (esc.compareTo("5")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("ATUALIZA EMPRESA");
                cad.atualizaCadastroEmpresa();
            }
            if (esc.compareTo("6")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("RECEBE DOAÇÕES");
                cad.recebeItens();
            }
            if (esc.compareTo("7")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("ESTOQUE DISPONÍVEL");
                cad.mostraEstoque();
                System.out.println("Toque qualquer tecla para prosseguir");
                esc = in.entraString();
            }
            if (esc.compareTo("8")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("PRODUTOS CADASTRADOS");
                cad.mostraProdutos();
                System.out.println("Toque qualquer tecla para prosseguir");
                esc = in.entraString();
            }
            if (esc.compareTo("9")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("EMPRESAS CADASTRADAS");
                cad.mostraEmpresas(true);
                System.out.println("Toque qualquer tecla para prosseguir");
                esc = in.entraString();
            }
            if (esc.compareTo("10")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("BENEFICIÁRIOS CADASTRADOS");
                cad.mostraBeneficiarios();
                System.out.println("Toque qualquer tecla para prosseguir");
                esc = in.entraString();
            }
            if (esc.compareTo("11")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("HISTÓRICO DE DOCAÇÕES");
                cad.historicoDeDoacoes();
                System.out.println("Toque qualquer tecla para prosseguir");
                esc = in.entraString();
            }
            if (esc.compareTo("12")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("PRODUTOS CADASTRADOS");
                cad.buscaDoacaoPorCpf();
                System.out.println("Toque qualquer tecla para prosseguir");
                esc = in.entraString();
            }
            if (esc.compareTo("13")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("DOAÇÕES POR CNPJ");
                cad.doacoesPorCnpj();
                System.out.println("Toque qualquer tecla para prosseguir");
                esc = in.entraString();
            }
            if (esc.compareTo("14")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("DOAÇÕES POR CNPJ");
                cad.doaItens(); 
            }
            if (esc.compareTo("15")==0){
                Tela.Cls();
                cad.excluiBeneficiario(); 
                System.out.println("Toque qualquer tecla para prosseguir");
                esc = in.entraString();            
            }
            if (esc.compareTo("16")==0){
                Tela.Cls();
                Tela.posicaoH(60);
                System.out.println("OBRIGADO POR USAR NOSSO SISTEMA");
                Tela.posicaoV(15);
                cad.encerra();
                flag = false;
            } 
        }
    }
}


