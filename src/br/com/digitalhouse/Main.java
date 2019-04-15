package br.com.digitalhouse;

public class Main {

    public static void main(String[] args) {

        Fatura fatura = new Fatura();
        fatura.getItems().add(new Item(2,"Cd Virgem Elgin",10,5));
        fatura.getItems().add(new Item(4,"Mouse sem fio",1,30));
        fatura.getItems().add(new Item(2,"Papel Cartão",8,12));


        System.out.println("Total" + fatura.getFaturaTotal());

    }
}
