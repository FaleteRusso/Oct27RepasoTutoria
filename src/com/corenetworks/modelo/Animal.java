package com.corenetworks.modelo;

public class Animal {
    private boolean mamifero;
    private boolean carnivoro;
    private String colorPelaje;

public String emitirSonido(){
return "El animal está emitiendo un sonido";
}
public String comer(){
return "El animal está comiendo";
}

    @Override
    public String toString() {
        return "Animal{" +
                "mamifero=" + mamifero +
                ", carnivoro=" + carnivoro +
                ", colorPelaje='" + colorPelaje + '\'' +
                '}';
    }

    public Animal() {
    }

    public Animal(boolean mamifero, boolean carnivoro, String colorPelaje) {
        this.mamifero = mamifero;
        this.carnivoro = carnivoro;
        this.colorPelaje = colorPelaje;
    }

    public boolean isMamifero() {
        return mamifero;
    }

    public void setMamifero(boolean mamifero) {
        this.mamifero = mamifero;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
}



