/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diagrama1;

/**
 *
 * @author igore
 */
public class main {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor(1,"Igor","Rua Sao Paulo", "Itapuã","Vila Velha","ES","29101-502","(27)99609-7861");
        Fornecedor.cadastrar(f1);
        Fornecedor.editar("Igor","Pinto");
        
        Produto p1 = new Produto(1,"Pininho",50,120);
        Produto.cadastrar(p1);
        Produto.editar("Pininho", "Pinão");
        p1.excluirEstoque(3);
        
        f1.addProd(p1);
    }
}
