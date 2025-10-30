package Diagrama1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author igore
 */
import java.util.ArrayList;
public class Cliente {
    int codigo;
    String nome;
    String endereco;
    String bairro;
    String cidade;
    String uf;
    String cep;
    String telefone;
    String cpf;
    String rg;
    
    static ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Venda> vendas = new ArrayList<>();

    public Cliente(int codigo, String nome, String endereco, String bairro, String cidade, String uf, String cep, String telefone, String cpf, String rg) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
    }
    
    public static void cadastrar(Cliente c){
        clientes.add(c);
        System.out.println("Cliente "+c.nome+" cadastrado com sucesso!");
    }
    
    public static void editar(String nome, String outro){
        for (Cliente c : clientes) {
            if(nome.equalsIgnoreCase(c.nome)){
                c.nome = outro;
                System.out.println("Nome de cliente alterado para: "+outro);
            }else{
                System.out.println("Nome de cliente não encontrado ou inexistente.");
            }
        }
    }
    
    public void addVenda(Venda v){
        vendas.add(v);
        v.setCodCli(this);
    }
}
