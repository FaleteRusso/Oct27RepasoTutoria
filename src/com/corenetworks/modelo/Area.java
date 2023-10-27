package com.corenetworks.modelo;

public class Area {
    public double calculaAreaRectangulo(double base,double altura) {
        return base * altura;
    }

    public double calcularAreaCirculo(double radio){
        return Math.pow(radio,2)*Math.PI;
    }



}
