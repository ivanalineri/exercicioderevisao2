package br.com.digitalhouse;

public class Item {

    private int numeroDoItemFaturado;
    private String descricaoDoItem;
    private int quantidadeCompradaDoItem;
    private float precoUnitarioDoItem;

    public Item(int numeroDoItemFaturado, String descricaoDoItem, int quantidadeCompradaDoItem, float precoUnitarioDoItem) {
        this.numeroDoItemFaturado = numeroDoItemFaturado;
        this.descricaoDoItem = descricaoDoItem;
        this.quantidadeCompradaDoItem = (quantidadeCompradaDoItem > 0) ? quantidadeCompradaDoItem : 0;
        this.precoUnitarioDoItem = (precoUnitarioDoItem > 0) ? precoUnitarioDoItem : 0;
    }

    public int getNumeroDoItemFaturado() {
        return numeroDoItemFaturado;
    }

    public void setNumeroDoItemFaturado(int numeroDoItemFaturado) {
        this.numeroDoItemFaturado = numeroDoItemFaturado;
    }

    public String getDescricaoDoItem() {
        return descricaoDoItem;
    }

    public void setDescricaoDoItem(String descricaoDoItem) {
        this.descricaoDoItem = descricaoDoItem;
    }

    public int getQuantidadeCompradaDoItem() {
        return quantidadeCompradaDoItem;
    }

    public void setQuantidadeCompradaDoItem(int quantidadeCompradaDoItem) {
        this.quantidadeCompradaDoItem = quantidadeCompradaDoItem;
    }

    public float getPrecoUnitarioDoItem() {
        return precoUnitarioDoItem;
    }

    public void setPrecoUnitarioDoItem(float precoUnitarioDoItem) {
        this.precoUnitarioDoItem = precoUnitarioDoItem;
    }
}
