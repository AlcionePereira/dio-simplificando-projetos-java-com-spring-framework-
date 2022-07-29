package com.springframework;

public class Moto implements Veiculo{

    @Override //método modificado
    public void acao(){
        System.out.println("È um moto.");
    }
}
