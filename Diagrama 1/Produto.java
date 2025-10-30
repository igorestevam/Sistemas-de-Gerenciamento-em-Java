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
public class Produto {
    int codigo;
    int fornecedor_codigo;
    String nome;
    double valor;
    int estoque;    

    static ArrayList<Produto> produtos = new ArrayList<>();
    ArrayList<Venda_Produto> vendaProdutos = new ArrayList<>();
    
    public Produto(int codigo, String nome, double valor, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }
    
    public static void cadastrar(Produto p){
        produtos.add(p);
    }
    
    public static void editar(String nome, String outro){
        for (Produto p : produtos) {
            if(nome.equalsIgnoreCase(p.nome)){
                p.nome = outro;
                System.out.println("Nome de produto alterado para: "+outro);
            }
        }
    }
    
    public void excluirEstoque(int qtd){
        estoque -= qtd;
    }
    
    public void setCodFornec(Fornecedor f){
        codigo = f.codigo;
    }
    
    public void addVendaProd(Venda_Produto vp){
        vendaProdutos.add(vp);
        vp.setCodProd(this);
    }
}
