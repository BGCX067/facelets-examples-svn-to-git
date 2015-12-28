/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import java.util.ArrayList;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import models.Produto;
import service.ProdutoService;

/**
 *
 * @author Heliomar
 */
public class ProdutoBean {

    private DataModel tabelaProdutos;
    private ProdutoService produtoService = ProdutoService.getInstance();

    /**
     * @return the tabelaProdutos
     */
    public DataModel getTabelaProdutos() {
        if(tabelaProdutos == null){
           tabelaProdutos = new ListDataModel(produtoService.getListaCompleta());
        }
        return tabelaProdutos;
    }

    /**
     * @param tabelaProdutos the tabelaProdutos to set
     */
    public void setTabelaProdutos(DataModel tabelaProdutos) {
        this.tabelaProdutos = tabelaProdutos;
    }
    

}
