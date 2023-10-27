import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] palabras = new String[6];

        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Escriba la palabra de la posicion " + i);
            palabras[i] = teclado.nextLine();
        }
        //mostrar info del arrray
        //a bucle for
        for (int i = 0; i < palabras.length; i++){
            System.out.println(palabras[i]);
        }
        //mostrar a la inversa
        for (int i=palabras.length-1;i>=0;i--){
            System.out.println(palabras[i]);

        }


        //b for each
        for (String elemento:palabras){
            System.out.println(elemento);
        }
    }
}