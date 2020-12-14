/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoFinal_V2;

import java.util.*;

/**@authors
 * Alessandra Siciliano Orlando
 * José Augusto Ramos Belmont 
 * Bruno Cipriani Cerqueira 
 */
public class InstituicaoFilantropica {
    EntraDados in = new EntraDados();
    private List <Produto> cadProdutos = new ArrayList <Produto>();
    private List <Beneficiarios> cadBeneficiario = new ArrayList <Beneficiarios>();
    private List <Item> cadItens;
    private List <EmpresaDoadora> cadEmpresa = new ArrayList <EmpresaDoadora>();
    private List <Item> cadEstoque = new ArrayList <Item>();
    private List <Doacoes> cadDoacoes = new ArrayList <Doacoes>();
    
    public void cadastraProduto(){
        boolean flag = false;
        do{
            Produto teste = new Produto ();
            String nome;
            String validade;
            String unidade;
            double preco;    
            System.out.println("NOME DO PRODUTO:");
            nome = in.entraString();
            teste= this.buscaProduto(nome);
            if (teste != null){
                System.out.println("PRODUTO JÁ CADASTRADO");
            }
            else{       
                System.out.println("VALIDADE DO PRODUTO (DD/MM/AAAA):");
                validade = in.entraString();
                System.out.println("UNIDADE DO PRODUTO:");
                unidade = in.entraString();
                System.out.println("PREÇO DO PRODUTO:");
                preco = in.entraDouble();
                Produto prod = new Produto(nome, validade, unidade, preco);
                cadProdutos.add(prod);
                System.out.println("PRODUTO INSERIDO COM SUCESSO");
                System.out.println("----------------------------");
                nome = in.entraString();
            }
            System.out.println("CADASTRAR OUTRO PRODUTO? (S/N)");
            flag = in.escolha();
        }while(flag);
    }
    
    public Produto buscaProduto(String nome){
        for (Produto obj : cadProdutos){
            if (nome.compareTo(obj.getNome())==0){
                return obj;
            }
        }
        return null;   
    }
           
    
    public void mostraProdutos(){
        System.out.println ("======= CADASTRO DE PRODUTOS ========");
        for (Produto obj : cadProdutos){
            System.out.println("Nome: "+obj.getNome()+"  validade: "+obj.getValidade()+
                    "  unidade: "+obj.getUnidade()+"  preço: "+obj.getPreco());
        }
        System.out.println ("=====================================");
    }
    
    
    public void cadastraBeneficiario (){
        boolean flag = false;
        do{
            Beneficiarios teste = new Beneficiarios();
            String nome;
            String endereco;
            String telefone;
            String email;
            String cpf;
            System.out.println("CADASTRA BENEFICÁRIO");
            System.out.println("--------------------");
            System.out.println("CPF DO BENEFICÁRIO:");
            cpf = in.entraString();
            teste = this.buscaBeneficiario(cpf);
            if (teste != null){
                System.out.println("BENEFICIÁRIO JÁ CADASTRADO");
            }
            else{
                System.out.println("NOME DO BENEFICÁRIO:");
                nome = in.entraString();
                System.out.println("ENDEREÇO DO BENEFICÁRIO:");
                endereco = in.entraString();
                System.out.println("TELEFONE DO BENEFICÁRIO:");
                telefone = in.entraString();
                System.out.println("EMAIL DO BENEFICÁRIO:");
                email = in.entraString();
                
                Beneficiarios benef = new Beneficiarios (nome,endereco,telefone,email,cpf);
                cadBeneficiario.add(benef);
                System.out.println("BENEFICIÁRIO INSERIDO COM SUCESSO");
                System.out.println("---------------------------------");
            }
            System.out.println("CADASTRAR OUTRO BENEFICIÁRIO? (S/N)");
            flag = in.escolha();
        }while (flag);
    }
    
    public Beneficiarios buscaBeneficiario(String cpf){
        for (Beneficiarios obj : cadBeneficiario){
            if (obj.getCpf().compareTo(cpf)==0){
                return obj;
            }
        }
        return null;
    }
    
    public void excluiBeneficiario (){
        String cpf;
        Beneficiarios aux = new Beneficiarios();
        System.out.println("CPF DO BENEFICIARIO A SER EXCLUÍDO:");
        cpf = in.entraString();
        aux = this.buscaBeneficiario(cpf);
        if (aux != null){
            cadBeneficiario.remove(aux);
            System.out.println("Beneficiário excluído com sucesso");
        }
        else{
            System.out.println("CPF NÃO ENCONTRADO");
        }
    }
    
    
    public void atualizaCadastroBeneficiario (){
        boolean ok;
        String teste, nome, endereco, telefone, email;
        Beneficiarios atualiza = new Beneficiarios();
        Beneficiarios aux = new Beneficiarios ();
        
        System.out.println("ATUALIZAÇÃO DE BENEFICIÁRIO");
        System.out.println("---------------------------");
        System.out.println("    CPF DO BENEFICÁRIO:");
        teste = in.entraString();
        aux = this.buscaBeneficiario(teste);
        if (aux!= null){
            atualiza.setCpf(teste);
            atualiza.setNome(aux.getNome());
            atualiza.setEndereco(aux.getEndereco());
            atualiza.setTelefone(aux.getTelefone());
            atualiza.setEmail(aux.getEmail());
            System.out.println("ATUALIZAR O NOME? (S/N)");
            if (in.escolha()){
                System.out.println("NOVO NOME DO BENEFICÁRIO:");
                nome = in.entraString();
                atualiza.setNome(nome);                
            }          
            System.out.println("ATUALIZAR O ENDEREÇO? (S/N)");
            if (in.escolha()){
                System.out.println("NOVO ENDEREÇO DO BENEFICÁRIO:");
                endereco = in.entraString();
                atualiza.setEndereco(endereco);                
            }
            System.out.println("ATUALIZAR O TELEFONE? (S/N)");
            if (in.escolha()){
                System.out.println("NOVO TELEFONE DO BENEFICÁRIO:");
                telefone = in.entraString();
                atualiza.setTelefone(telefone);                
            }
            System.out.println("ATUALIZAR O EMAIL? (S/N)");
            if (in.escolha()){
                System.out.println("NOVO EMAIL DO BENEFICÁRIO:");
                email = in.entraString();
                atualiza.setEmail(email);                
            }
            cadBeneficiario.add(atualiza);
            ok = cadBeneficiario.remove(aux);
            if (ok){
                System.out.println("ATUALIZAÇÃO COM SUCESSO");
            }
            else{
                System.out.println("ATUALIZAÇÃO FALHOU");
            }   
        }
        else{
            System.out.println("BENEFICIÁRIO NÃO ENCONTRADO");
        }       
    }
    
        
    public void mostraBeneficiarios(){
        System.out.println ("=========== CADASTRO DE BENEFICÁRIOS ============");
        for (Beneficiarios obj : cadBeneficiario){
            System.out.println("Nome: "+obj.getNome()+"  CPF: "+obj.getCpf()+"  email: "+obj.getEmail()+
                    "  Endereço: "+obj.getEndereco()+"  Telefone: "+obj.getTelefone());
        }
        System.out.println ("=================================================");
    }
    
    public void cadastraEmpresa (){
        boolean flag = false;
        do{
            EmpresaDoadora teste = new EmpresaDoadora();
            String nome, endereco, telefone, email, cnpj, representante;

            System.out.println("CADASTRA EMPRESA");
            System.out.println("--------------------");
            System.out.println("CNPJ DA EMPRESA:");
            cnpj = in.entraString();
            teste = this.buscaEmpresaDoadora(cnpj);
            if (teste != null){
                System.out.println("EMPRESA JÁ CADASTRADA");
            }
            else{
                System.out.println("NOME DA EMPRESA:");
                nome = in.entraString();
                System.out.println("ENDEREÇO DA EMPRESA:");
                endereco = in.entraString();
                System.out.println("TELEFONE DA EMPRESA:");
                telefone = in.entraString();
                System.out.println("EMAIL DA EMPRESA:");
                email = in.entraString();
                System.out.println("REPRESENTANTE DA EMPRESA: ");
                representante = in.entraString();
                
                
                EmpresaDoadora empresa = new EmpresaDoadora (nome,endereco,telefone,email,cnpj, representante);
                cadEmpresa.add(empresa);
                System.out.println("EMPRESA INSERIDA COM SUCESSO");
                System.out.println("---------------------------------");
            }
            System.out.println("CADASTRAR OUTRA EMPRESA? (S/N)");
            flag = in.escolha();
        }while (flag);
    }
    
    public EmpresaDoadora buscaEmpresaDoadora(String cnpj){
        for (EmpresaDoadora obj : cadEmpresa){
            if (cnpj.compareTo(obj.getCnpj())==0){
                return obj;
            }
        }
        return null;             
    }
    
    public void mostraEmpresas(boolean flag){   
        System.out.println ("============= CADASTRO DE EMPRESAS ==============");
        for (EmpresaDoadora obj : cadEmpresa){
            System.out.println("Nome: "+obj.getNome()+"  CNPJ: "+obj.getCnpj()+"  email: "+obj.getEmail()+
                    "  Endereço: "+obj.getEndereco()+"  Telefone: "+obj.getTelefone()+" Representante"+obj.getRepresentante());
            
            if (!flag){
                this.listaDoacoes(obj);
                System.out.println ("================================================");
            }
        }       
    }
    
           
    public void atualizaCadastroEmpresa (){
        boolean ok;
        String teste, nome, endereco, telefone, email, representante;
        EmpresaDoadora atualiza = new EmpresaDoadora();
        EmpresaDoadora aux = new EmpresaDoadora ();
        
        System.out.println("ATUALIZAÇÃO DE EMPRESAS");
        System.out.println("---------------------------");
        System.out.println("    CNPJ DA EMPRESA:");
        teste = in.entraString();
        aux = this.buscaEmpresaDoadora(teste);
        if (aux!= null){
            atualiza.setCnpj(teste);
            atualiza.setNome(aux.getNome());
            atualiza.setEndereco(aux.getEndereco());
            atualiza.setTelefone(aux.getTelefone());
            atualiza.setEmail(aux.getEmail());
            atualiza.setRepresentante(aux.representante);
            atualiza.setTodasDoacoes(aux.getDoacoes());
            System.out.println("ATUALIZAR O NOME? (S/N)");
            if (in.escolha()){
                System.out.println("NOVO NOME DA EMPRESA:");
                nome = in.entraString();
                atualiza.setNome(nome);                
            }          
            System.out.println("ATUALIZAR O ENDEREÇO? (S/N)");
            if (in.escolha()){
                System.out.println("NOVO ENDEREÇO DA EMPRESA:");
                endereco = in.entraString();
                atualiza.setEndereco(endereco);                
            }
            System.out.println("ATUALIZAR O TELEFONE? (S/N)");
            if (in.escolha()){
                System.out.println("NOVO TELEFONE DA EMPRESA:");
                telefone = in.entraString();
                atualiza.setTelefone(telefone);                
            }
            System.out.println("ATUALIZAR O EMAIL? (S/N)");
            if (in.escolha()){
                System.out.println("NOVO EMAIL DA EMPRESA:");
                email = in.entraString();
                atualiza.setEmail(email);                
            }
            System.out.println("ATUALIZAR O REPRESENTANTE? (S/N)");
            if (in.escolha()){
                System.out.println("NOVO REPRESNETANTE DA EMPRESA:");
                representante = in.entraString();
                atualiza.setRepresentante(representante);                
            }
            ok = cadEmpresa.remove(aux);
            cadEmpresa.add(atualiza);

            if (ok){
                System.out.println("ATUALIZAÇÃO COM SUCESSO");
            }
            else{
                System.out.println("ATUALIZAÇÃO FALHOU");
            }   
        }
        else{
            System.out.println("BENEFICIÁRIO NÃO ENCONTRADO");
        }       
    }
    
    
    public void doacoesPorCnpj (){
        String cnpj;
        EmpresaDoadora ed = new EmpresaDoadora();
        System.out.println("ENTRE O CNPJ DA EMPRESA: ");
        cnpj = in.entraString();
        ed = this.buscaEmpresaDoadora(cnpj);
        if (ed != null){
            System.out.println("Nome: "+ed.getNome()+"  CNPJ: "+ed.getCnpj()+"  Endereço: "+ed.getEndereco()
                    +"  Telefone: "+ed.getTelefone()+"  Email: "+ed.getEmail()+"  Representante: "+ed.getRepresentante());
            this.listaDoacoes(ed);
        }
        
    }
    
    public List cadastraItens (){
        cadItens = new ArrayList <Item>();
        double quant;
        String nome;
        Produto teste;
        
        do{
            System.out.println("ENTRE O NOME DO PRODUTO:");
            nome = in.entraString();
            teste = this.buscaProduto(nome);
            if (teste != null){
                System.out.println("ENTRE A QUANTIDADE DO PRODUTO:");
                quant = in.entraDouble();
                nome = in.entraString();
                Item item = new Item (teste, quant);
                cadItens.add(item);
                System.out.println("ITEM CADASTRADO COM SUCESSO");
                
            }
            else{
                System.out.println("PRODUTO NÃO CADASTRADOO AINDA, CADASTRE-O ANTES DE USÁ-LO:");
            }
            System.out.println("DESEJA CADASTRAR OUTRO ITEM? (S/N)");
            
        }while (in.escolha());
        return cadItens;
    }

      
    private void listaDoacoes(EmpresaDoadora emp){
        List <Item> itensAux = new ArrayList <Item>(); 
        for (Doacoes aux : emp.getDoacoes()){
            itensAux = aux.getItensDoados();
            System.out.println ("    ------    ");
            System.out.println ("DATA DA DOAÇÃO");
            System.out.println (aux.getData());
            System.out.println ("ITENS DOADOS");
            for (Item itens : itensAux){
                System.out.println ("nome "+itens.getProduto().getNome()+" "+itens.getQuantidade()+" "+itens.getProduto().getUnidade());
            }           
        }        
    }
        
  
    public void recebeItens (){
        String cnpj;
        EmpresaDoadora emp = new EmpresaDoadora();
        
        System.out.println("ENTRE O CNPJ DA EMPRESA DOADORA");
        cnpj = in.entraString();
        emp = this.buscaEmpresaDoadora(cnpj);
        if (emp != null){
            List <Item> doa = new ArrayList <Item>();
            String data;
            System.out.println("DOAÇÃO PARA ENTIDADE FILANTRÓPICA");
            System.out.println("---------------------------------");
            System.out.println("ENTRE A DATA DA DOAÇÃO");
            data = in.entraString();
            doa = this.cadastraItens();
            for (Item prod : doa){
                double soma = 0;
                boolean flag = false;
                for (Item est : cadEstoque){
                    if (prod.getProduto().getNome().compareTo(est.getProduto().getNome()) == 0){
                        System.out.println("prod "+est.getQuantidade());
                        soma = prod.getQuantidade()+est.getQuantidade();
                        flag = true;
                        est.setQuantidade(soma);
                    }
                }
                if (!flag){
                    cadEstoque.add(prod);
                }             
            }
            Doacoes doacao = new Doacoes (data, doa);
            emp.setDoacao(doacao);           

        }
        else{
            System.out.println("A EMPRESA NÃO ESTÁ CADASTRADA");
        }
    }
    
    public void mostraEstoque(){
        System.out.println ("=========== ESTOQUE DISPONÍVEL ==================");
        System.out.println ("------------------");
        for (Item est : cadEstoque){
            System.out.println("Produto: "+est.getProduto().getNome()+"  "+est.getQuantidade()+" "+est.getProduto().getUnidade());
        }
    } 

    
    public void doaItens(){
        
        String nome, data;
        boolean flag = false;
        boolean ok;
        Beneficiarios benf = new Beneficiarios();
        System.out.println("DOAR ITEMS");
        System.out.println("========================================================");
        System.out.println("INFORME O CPF DO BENEFICIÁRIO QUE RECEBERÁ ESTA DOAÇÃO: ");
        benf = this.buscaBeneficiario(in.entraString());
        if (benf != null){           
            List <Item> itensDoados = new ArrayList<>();
            System.out.println("DATA DA DOAÇÃO(DD/MM/AAAA): ");
            data = in.entraString();
            do{
                ok = false;
                System.out.println("ITEM A SER DOADO: ");
                String nomeItem = in.entraString();
                System.out.println("QUANTIDADE: ");
                double qtdItem = in.entraDouble();
                nome = in.entraString();
                for (Item item : cadEstoque){
                    if (item.getProduto().getNome().compareTo(nomeItem) == 0){
                        if(item.getQuantidade() >= qtdItem){
                            double novaQtd = item.getQuantidade() - qtdItem;
                            if(novaQtd > 0){
                                item.setQuantidade(novaQtd);
                                ok = true;
                            }
                            Item itemDoado = new Item (item.getProduto(),qtdItem);
                            itensDoados.add(itemDoado);
                        }
                        else
                            System.out.println("QUANTIDADE DO ITEM NÃO DISPONÍVEL");
                    }
                        
                }
                if (!ok){
                    System.out.println("OS ITENS NÃO ESTÃO DISPONÍVEIS NO ESTOQUE");
                }
                System.out.println("DESEJA DOAR MAIS ALGUM ITEM? [S/N] ");
            }while (in.escolha());
            System.out.println("ITENS DOADOS COM SUCESSO!");
            Doacoes doa = new Doacoes (data, itensDoados, benf);
            cadDoacoes.add(doa); 
        }
        else{
            System.out.println("O BENEFICIÁRIO NÃO ESTÁ CADASTRADO");
        }       
    }
    
    public void historicoDeDoacoes(){
        System.out.println("============= HISTÓRICO DE DOAÇOES ===============");
        List <Item> vetor = new ArrayList <Item>();
        for (Doacoes d : cadDoacoes){
            System.out.println("--------------------------------------------------");
            System.out.println("DATA: "+d.getData());
            System.out.println("BENEFICIÁRIO: "+d.getBeneficiario().getNome()+"  CPF: "+d.getBeneficiario().getCpf());
            vetor =  d.getItensDoados();
            for (Item itens : vetor){
                System.out.println(itens.getProduto().getNome()+" - "+itens.getQuantidade()+" "+itens.getProduto().getUnidade());
            }          
        }
    }
    
    public void buscaDoacaoPorCpf(){
        String cpf;
        Beneficiarios b = new Beneficiarios ();
        List <Item> vetor = new ArrayList <Item>();
        
        System.out.println("=============== DOAÇÕES POR CPF ==================");
        System.out.println("INFORME O CPF DO BENEFICIÁRIO A SER PESQUISADO: ");
        cpf = in.entraString();
        b = this.buscaBeneficiario(cpf);
        if (b != null){
            for (Doacoes d : cadDoacoes){
                if (d.getBeneficiario().getCpf().compareTo(cpf)==0){                    
                    System.out.println("Data: "+d.getData());
                    vetor = d.getItensDoados();
                    for (Item itens : vetor){
                        System.out.println("Produto: "+itens.getProduto().getNome()+" - "
                                +itens.getQuantidade()+" "+itens.getProduto().getUnidade());
                    }
                }
            }
        }
    }
    
    public List leDoacoes(){
        cadDoacoes = Arquivos.recuperaDoacoes();
        return cadDoacoes;
    }
           
    public void salvaProdutos(){
        Arquivos.gravaProdutos(cadProdutos);
    }
    
    public void leProdutos(){
        cadProdutos = Arquivos.recuperaProduto();
    }
           
    public List leEstoque(){
        cadEstoque = Arquivos.recuperaEstoque();
        return cadEstoque;
    }
          
    public void salvaEmpresa(){
        Arquivos.gravaEmpresa(cadEmpresa);
    }
    
    public void leEmpresa(){
        cadEmpresa = Arquivos.recuperaEmpresa();
    }   
        
    public void salvaBeneficiarios(){
        Arquivos.gravaBeneficiario(cadBeneficiario);
    }
    
    public void leBeneficiarios(){
        cadBeneficiario = Arquivos.recuperaBeneficiario();
    }
    
    
    public void encerra (){
        Arquivos.gravaBeneficiario(cadBeneficiario);
        Arquivos.gravaDoacoes(cadDoacoes);
        Arquivos.gravaEmpresa(cadEmpresa);
        Arquivos.gravaProdutos(cadProdutos);
        Arquivos.gravaEstoque(cadEstoque);
    }    
    
}
