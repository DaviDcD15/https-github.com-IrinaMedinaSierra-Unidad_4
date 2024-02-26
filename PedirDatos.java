import java.util.Scanner;

public class PedirDatos {
    public static void main(String[] args) {
    Scanner sn=new Scanner(System.in);
    String nombre;
    String apellido;
    byte edad;
        System.out.print("Indique el nombre->");
        nombre=sn.next();sn.nextLine();
        System.out.println("Indique el Apellido");
        apellido=sn.next();sn.nextLine();
        System.out.println("Edad: ");
        edad=sn.nextByte();
        incrementoEdad(nombre,apellido, edad);
        quitarEdad(nombre,apellido,edad);
    }
    public static void incrementoEdad(String nom,String ape, byte ed){
        ed+=10;
        System.out.println(nom+ " " +ape +" tendras dentro de 10 años " + ed + " años!");
    }
    public static void quitarEdad(String nombreUsuario,String apellidoUsuario,byte edadUsuario){ //ambito local
        int contador=0;//variable de ambito local
        edadUsuario-=10;
        System.out.println(nombreUsuario+ " " +apellidoUsuario +" tenias hace  10 años " + edadUsuario + " años!");
        for (int i=1;i<=edadUsuario;i++){ // la variable i tiene ambito de bloque....{ // }
            System.out.println(nombreUsuario + " " + apellidoUsuario + "->" + i);
        }



    }

}
