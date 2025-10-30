/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagrama1;

/**
 *
 * @author igore
 */
import java.util.ArrayList;
public class Fornecedor {
    int codigo;
    String nome;
    String endereco;
    String bairro;
    String cidade;
    String uf;
    String cep;
    String telefone;

    static ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    ArrayList<Produto> produtos = new ArrayList<>();
    
    public Fornecedor(int codigo, String nome, String endereco, String bairro, String cidade, String uf, String cep, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
    }
    
    public static void cadastrar(Fornecedor f){
        fornecedores.add(f);
        System.out.println("Fornecedor "+f.nome+" cadastrado com sucesso!");
    }
    
    public static void editar(String nome, String outro){
        for (Fornecedor f : fornecedores) {
            if(nome.equalsIgnoreCase(f.nome)){
                f.nome = outro;
                System.out.println("Nome de fornecedor alterado para: "+outro);
            }else{
                System.out.println("Nome de fornecedor não encontrado ou inexistente.");
            }
        }
    }
    
    public void addProd(Produto p){
        produtos.add(p);
        p.setCodFornec(this);
    }
    
}
