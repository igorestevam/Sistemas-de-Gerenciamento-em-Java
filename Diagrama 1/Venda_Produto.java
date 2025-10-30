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
public class Venda_Produto {
    int codigo;
    int codigo_venda;
    int codigo_produto;

    static ArrayList<Venda_Produto> vendaProdutos = new ArrayList<>();
    public Venda_Produto(int codigo) {
        this.codigo = codigo;
    }
    
    public static void cadastrar(Venda_Produto vp){
        vendaProdutos.add(vp);
    }
    
    public Venda_Produto consultar(int codigo){
        for (Venda_Produto vp : vendaProdutos) {
            if(codigo == vp.codigo){
                return vp;
            }
        }
        System.out.println("Código de produto não encontrado ou inexistente.");
        return null;
    }
    
    public void setCodVenda(Venda v){
        codigo_venda = v.codigo;
    }
    
    public void setCodProd(Produto p){
        codigo_produto = p.codigo;
    }
}
