package com.corenetworks.pueba;

import com.corenetworks.modelo.Campos;

public class PruebaCampos {
    public static void main(String[] args) {
        Campos c1 = new Campos(5);
        c1.incrementa();
        System.out.println("El valor de X  es: " + c1.muestra());

    }
}
