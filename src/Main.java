import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        List<Mascota> MascotaList = new ArrayList<>();
        String nombreM;
        String especie;
        int edad;
        double peso;
        boolean saludable;
        int op;
        int op2;

        System.out.println("Binvenido ʕ•́ᴥ•̀ʔっ");

        do {

            System.out.println("Eliga una de estas opciones: ");
            System.out.println("1.Crear mascota \n2.Lista de mascotas \n3.Buscar mascota \n4.Salir ");
            op = teclado.nextInt();
            switch (op){
                case 1://crear mascota
                    System.out.println("Para crear tu mascota ingresa los siguientes datos ✍(◔◡◔): ");
                    System.out.println("Nombre: ");
                    nombreM = teclado.next();
                    System.out.println("Especie: ");
                    especie = teclado.next();
                    System.out.println("Edad: ");
                    edad = teclado.nextInt();
                    System.out.println("Peso: ");
                    peso = teclado.nextDouble();
                    System.out.println("Estado (saludable o no) escriba true para si false para no: ");
                    saludable = teclado.nextBoolean();

                    Mascota mascota1=new Mascota(nombreM, especie, edad, peso, saludable);
                    MascotaList.add(mascota1);
                    System.out.println("--Su mascota fue creada");
                case 2://lista
                    System.out.println("Lista de mascotas: \n");
                    for (Mascota M : MascotaList) {
                        System.out.println(M.mostrarFicha());
                    }
                    break;
                case 3://Buscar
                    System.out.println("Nombre de la mascota deseas buscar?:");
                    String buscar = teclado.next();
                    if (MascotaList.isEmpty()){
                        System.out.println("--La lista no tiene objetos");
                    }
                    Mascota mascota=null;
                    for (Mascota M : MascotaList) {
                        if (buscar.equalsIgnoreCase(M.getNombre())) {//equalsIgnoreCase:independiente de qeu el usuario escriva en minusculas o mayusculas pueda buscar el libro
                            mascota=M;
                            System.out.println(mascota);

                        } else {
                            System.out.println("--El mascota no se encontro o no esta bien escrito \n--Por favor intentelo de nuevo");
                            break;
                        }
                    }
                    //SUB MENU
                    do{
                        System.out.println("Ingrese una de las siguientes opciones: \n1.Cambiar edad \n2.Cmbiar peso \n3.Cambiar salud \n4.Salir: ");
                        op2= teclado.nextInt();

                        switch (op2){
                            case 1://edad
                                System.out.println("Edad nueva:");
                                int modificarEdad= teclado.nextInt();
                                mascota.cumplirAnos(modificarEdad);
                                break;
                            case 2://peso
                                System.out.println("Quiere que la mascota 1.engorde o 2.adelgaze:");
                                int modificarPeso= teclado.nextInt();
                                switch (modificarPeso){
                                    case 1://engordar
                                        System.out.println("Ingrese cuanto quiere que engorde");
                                        double modificarEngordar= teclado.nextDouble();
                                        mascota.engordar(modificarEngordar);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese cuanto quiere que adelgaze");
                                        double modificarAdelgazar= teclado.nextDouble();
                                        mascota.adelgazar(modificarAdelgazar);
                                        break;
                                }
                                System.out.println("--Su mascota: ");
                                break;
                            case 3://saludable
                                System.out.println("Estado nuevo:");
                                boolean modificarEstado= teclado.nextBoolean();
                                System.out.println("--Su mascota: ");
                                break;
                            case 4:
                                System.out.println("Saliendo...");
                                System.out.println("Que tenga buen día ʕ•́ᴥ•̀ʔっ ...");
                                break;
                            default:
                                System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");
                        }
                    }while (op2!=4);
                    //FIN SEGUNDO MENU

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