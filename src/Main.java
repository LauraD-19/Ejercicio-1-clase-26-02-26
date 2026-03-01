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
                    System.out.println("Edad (en meses): ");
                    edad = teclado.nextInt();
                    System.out.println("Peso (en kg): ");
                    peso = teclado.nextDouble();
                    System.out.println("Estado de salud, 'true' para bueno y 'false' para malo: ");
                    saludable = teclado.nextBoolean();

                    Mascota mascota1=new Mascota(nombreM, especie, edad, peso, saludable);
                    MascotaList.add(mascota1);
                    System.out.println("--ʕ•ᴥ•ʔ Su mascota fue creada ʕ•ᴥ•ʔ");
                case 2://lista
                    System.out.println("Lista de mascotas \n(˚▽˚)☞\n");
                    for (Mascota M : MascotaList) {
                        System.out.println(M.mostrarFicha());
                    }
                    System.out.println("\n☜(˚▽˚)\n");
                    break;
                case 3://Buscar
                    System.out.println("Nombre de la mascota deseas buscar?:");
                    String buscar = teclado.next();
                    if (MascotaList.isEmpty()){
                        System.out.println("--No tienes mascotas registradas");
                        break;
                    }
                    Mascota mascota=null;
                    for (Mascota M : MascotaList) {
                        if (buscar.equalsIgnoreCase(M.getNombre())) {//equalsIgnoreCase:independiente de qeu el usuario escriva en minusculas o mayusculas pueda buscar el libro
                            mascota=M;
                            System.out.println(mascota);
                            break;
                        } else {
                            System.out.println("--El mascota no se encontro o no esta bien escrito \n--Por favor intentelo de nuevo");
                            break;
                        }
                    }
                    //SUB MENU
                    do{
                        System.out.println("Ingrese una de las siguientes opciones: \n1.Cambiar edad \n2.Cambiar peso \n3.Cambiar salud \n4.Salir ");
                        op2= teclado.nextInt();

                        switch (op2){
                            case 1://edad
                                System.out.println("Digite '1' si desea agregarle o '2' para quitarle edad:");
                                while(true){
                                    int modificarEdad= teclado.nextInt();
                                    if(modificarEdad==1){
                                        System.out.println("Cuanto quiere sumarle: ");
                                        int sumarEdad= teclado.nextInt();
                                        mascota.sumarAnos(sumarEdad);
                                        break;
                                    }else  if (modificarEdad==2) {
                                        System.out.println("Cuanto quiere quitarle: ");
                                        int restarEdad= teclado.nextInt();
                                        mascota.quitarAnos(restarEdad);
                                        break;
                                    } else{
                                        System.out.println("Digite una opcion correcta");
                                    }
                                }
                                System.out.println("--Su mascota ☺: ");
                                System.out.println(mascota);
                                break;
                            case 2://peso
                                System.out.println("Digite '1' si quiere que engorde o '2' para adelgazar:");
                                int modificarPeso= teclado.nextInt();
                                switch (modificarPeso){
                                    case 1://engordar
                                        System.out.println("Ingrese cuanto quiere que engorde: ");
                                        double modificarEngordar= teclado.nextDouble();
                                        mascota.engordar(modificarEngordar);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese cuanto quiere que adelgaze: ");
                                        double modificarAdelgazar= teclado.nextDouble();
                                        mascota.adelgazar(modificarAdelgazar);
                                        break;
                                }
                                System.out.println("--Su mascota ☺: ");
                                System.out.println(mascota);
                                break;
                            case 3://saludable
                                System.out.println("Escriba 'true' para recuperar salud o 'false' para enfermar: ");
                                while(true){
                                    String modificarEstado= teclado.next();
                                    if(modificarEstado.equalsIgnoreCase("true")){
                                        mascota.recuperarSalud();
                                        break;
                                    }else  if (modificarEstado.equalsIgnoreCase("false")) {
                                        mascota.enfermar();
                                        break;
                                    } else{
                                        System.out.println("Digite una opcion correcta");
                                    }
                                }
                                System.out.println("--Su mascota ☺: ");
                                System.out.println(mascota);
                                break;
                            case 4:
                                System.out.println("Saliendo...");
                                System.out.println("Regresando al menú principal ʕ•́ᴥ•̀ʔっ ...\n");
                                break;
                            default:
                                System.out.println("Ingrese una opcion correcta (ㆆ_ㆆ)");
                        }
                    }while (op2!=4);
                    break;
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