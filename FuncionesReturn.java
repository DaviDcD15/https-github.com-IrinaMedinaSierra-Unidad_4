import java.util.Scanner;

public class FuncionesReturn {
    public static void main(String[] args) {

//        String nombreUsuario=llamadaNombre();
//        System.out.println("Tu nombre es "+nombreUsuario);
//        int suma=funcionSumar(45,34);
//        System.out.println("El resultado de a + b = "+ suma);
//        suma=funcionSumar(85,42);
//        System.out.println("El resultado de a + b = "+ suma);
        int valor=Math.min(45,89); //API Java
        System.out.println(valor);

    }

    public static String llamadaNombre(){
        String nombre="";
        System.out.println("Indica el nombre");
        Scanner sn=new Scanner(System.in);
        nombre=sn.nextLine();
        return nombre; // envia a quien invoca la funcion el valor de nombre

    }

    public static int funcionSumar(int a, int b){
        return a+b;
    }


}
