public class Explicacion { //una clase
    public static void tresSaludos(int veces) { //Mi primera funcion o metodo
        System.out.println("Te vamos a saludar "+ veces+" veces");
        for (int i = 0; i < veces; i++) {
            System.out.println("Hola");
        }
    }
    public static void main(String[] args) { //funcion o metodo
    //se llama las funciones o metodos que van a ejecutar
        tresSaludos(1); //se llama la función para que se ejecute
        tresSaludos(2); //se llama la función para que se ejecute
        tresSaludos(3); //se llama la función para que se ejecute
    }


    }

