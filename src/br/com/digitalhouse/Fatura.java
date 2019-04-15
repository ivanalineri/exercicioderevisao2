package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Fatura {



    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Fatura(List<Item> items) {
        this.items = items;
    }

    public Fatura(){

    }

    public double getFaturaTotal(){

    double total = 0;

     for (Item item : items) {
                   double valor = item.getQuantidadeCompradaDoItem() * item.getPrecoUnitarioDoItem();
                   System.out.println(item.getDescricaoDoItem() + ": " + item.getQuantidadeCompradaDoItem() + " x " + item.getPrecoUnitarioDoItem() + " = " + valor);
                    total += valor;
        }


    return total;


    }
}
