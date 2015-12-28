/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.util.ArrayList;
import java.util.List;
import models.Produto;

/**
 *
 * @author Heliomar
 */
public class ProdutoService {
    
    private static ProdutoService interno;

    private ProdutoService(){

    }

    public List<Produto> getListaCompleta(){
        List<Produto> produtos = new ArrayList<Produto>();
        for (int i = 0; i < 20; i++) {
            Produto produto = new Produto();
            produto.setCodigo("XYZ"+i);
            produto.setEstoque((i+3)*2);
            produto.setNome("Produto_"+i);
            produto.setVendedor("Vendedor_"+i);
            produto.setSetor("Setor_"+i);
            produtos.add(produto);
        }
        return produtos;
    }

    public static synchronized ProdutoService getInstance(){
        if(interno == null){
            interno = new ProdutoService();
        }
        return interno;
    }

}
