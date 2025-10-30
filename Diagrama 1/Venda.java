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
import java.time.LocalDate;
public class Venda {
    int codigo;
    int cliente_codigo;
    LocalDate data_venda;
    
    static ArrayList<Venda> vendas = new ArrayList<>();
    ArrayList<Venda_Produto> vendaProdutos = new ArrayList<>();

    public Venda(int codigo) {
        this.codigo = codigo;
    }
    
    public static void cadastrar(Venda v){
        vendas.add(v);
    }
    
    public ArrayList<Venda> consultarVendaPeriodo(LocalDate inicio, LocalDate fim){
        ArrayList<Venda> listaVendas = new ArrayList<>();
        for (Venda v : vendas) {
            if(inicio.isBefore(v.data_venda) && fim.isAfter(v.data_venda)){
                listaVendas.add(v);
            }
        }
        return listaVendas;
    }
    
    public ArrayList<Venda> consultarVendaCliente(Cliente c){
        ArrayList<Venda> listaVendas = new ArrayList<>();
        for (Venda v : vendas) {
            if(c.codigo == cliente_codigo){
                listaVendas.add(v);
            }
        }
        return listaVendas;
    }
    
    public void setCodCli(Cliente c){
        cliente_codigo = c.codigo;
    }
    
    public void addVendaProd(Venda_Produto vp){
        vendaProdutos.add(vp);
        vp.setCodVenda(this);
    }
    
}
