package com.corenetworks.pueba;

import com.corenetworks.modelo.Area;

public class PruebaArea {
    public static void main(String[] args) {
        Area rectangulo= new Area();
        Area circulo =new Area();
        System.out.println(rectangulo.calculaAreaRectangulo(8,6));
        System.out.println(circulo.calcularAreaCirculo(3));
    }
}
