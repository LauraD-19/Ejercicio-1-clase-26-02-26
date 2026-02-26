import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        String nombreM;
        String especie;
        int edad;
        double peso;
        boolean saludable;
        int op;
        int opEdad;
        int modificarEdad;
        double modificarPeso;
        boolean modificarEstado;

        System.out.println("Binvenido ʕ•́ᴥ•̀ʔっ");
        System.out.println("Para crear tu mascota ingresa los siguientes datos ✍(◔◡◔): ");
        System.out.println("Nombre: ");
        nombreM = teclado.next();
        System.out.println("Especie: ");
        especie = teclado.next();
        System.out.println("Edad: ");
        edad = teclado.nextInt();
        System.out.println("Peso: ");
        peso = teclado.nextDouble();
        System.out.println("Estado (saludable o no) escriva true para si false para no: ");
        saludable = teclado.nextBoolean();

        Mascota mascota=new Mascota(nombreM, especie, edad, peso, saludable);
        System.out.println("--Su mascota fue creada: ");
        System.out.println(mascota);
        do {

            System.out.println("\n Desea modificar alguno de estos aspectos?: ");
            System.out.println("1. Edad \n2. Peso \n3. Estado de salud \n4.Salir ");
            op = teclado.nextInt();
            switch (op){
                case 1://edad
                    System.out.println("Edad nueva:");
                    modificarEdad= teclado.nextInt();
                    System.out.println("--Su mascota: ");
                    Mascota mascota1=new Mascota(nombreM, especie, modificarEdad, peso, saludable);
                    System.out.println(mascota1);
                    break;
                case 2://peso
                    System.out.println("Peso nueva:");
                    modificarPeso= teclado.nextDouble();
                    System.out.println("--Su mascota: ");
                    Mascota mascota2=new Mascota(nombreM, especie, edad, modificarPeso, saludable);
                    System.out.println(mascota2);
                    break;
                case 3://salud
                    System.out.println("Estado nuevo:");
                    modificarEstado= teclado.nextBoolean();
                    System.out.println("--Su mascota: ");
                    Mascota mascota3=new Mascota(nombreM, especie, edad, peso, modificarEstado);
                    System.out.println(mascota3);
                    break;
                case 4://salir
                    System.out.println("Saliendo...");
                    System.out.println("Que tenga buen día ʕ•́ᴥ•̀ʔっ ...");
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");
            }
        }while (op!=4);

    }
}