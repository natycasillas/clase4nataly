 import java.sql.SQLOutput;
 import java.util.Scanner;
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
       genero generorit=new genero("bachata","12hm",1999,"Cuba","Romeo Santos","Viña del mar");
       genero generooasillo=new genero("pasillo"," tamborito",1958,"Ecuador","Gullermos abadia","ecuatoriano");
       genero generopasacalle=new genero("pasacalle"," ritmos vivo",1564,"Peru","Alfredo Carpio","peruano");

        //System.out.println(generorock.getAnio());
        System.out.println( generorit.getAnio());
        System.out.println(generooasillo.getAnio());
        System.out.println(generopasacalle.getAnio());

        System.out.println( generorit.getAnio()+ generooasillo.getAnio()+ generopasacalle.getAnio());

        // ingreso de datos
        int anio1;
        int op;

  // preguntar al usuario de genero quiere cambiar

        System.out.println("MENU PRINCIPAL");
        System.out.println("que genero desea cambiar ");
        System.out.println("GENERO 1");
        System.out.println("GENERO 2");
        System.out.println("GENERO 3");
        op=entrada.nextInt();
        switch(op){
            case 1:
                System.out.println("GENERO RIT ");
                System.out.println("Ingrese el anio  ");
                anio1=entrada.nextInt();
                System.out.println("eL ANIO MODIFICADO ES"+anio1);
                break;
            case 2:
                System.out.println("GENERO PASILLO ");
                System.out.println("Ingrese el anio  ");
                anio1=entrada.nextInt();
                System.out.println("eL ANIO MODIFICADO ES"+anio1);
                break;
            case 3:
                System.out.println("GENERO PASACALLE ");
                System.out.println("Ingrese el anio  ");
                anio1=entrada.nextInt();
                System.out.println("eL ANIO MODIFICADO ES "+anio1);
                break;


        }

        System.out.println("Ingrese el anio del genero 1 ");
        anio1=entrada.nextInt();
        generorit.setAnio(anio1);
        System.out.println(anio1);


        //

        generorit.imprimirDatos();


    }
}