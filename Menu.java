import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Menu {

    private Autos listaAuto;
    private Motos listaMoto;
    private Camionetas listaCamioneta;
    private Camiones listaCamion;

    // *************** Seteo las listas de los rodados *******************

    public void setListaAuto(Autos listaAuto){
        this.listaAuto = listaAuto;
    }

    public void setListaMoto(Motos listaMoto){
        this.listaMoto = listaMoto;
    }

    public void setListaCamioneta(Camionetas listaCamioneta){
        this.listaCamioneta = listaCamioneta;
    }

    public void setListaCamion(Camiones listaCamion){
        this.listaCamion = listaCamion;
    }

    // ******************** TRATAMIENTO ABM AUTO **************************
    public void tratarAltaAuto(){
        Scanner sc = new Scanner(System.in);
        String texto;
        int continuar = 1;
        while (continuar == 1) {
            Auto auto = new Auto();
            System.out.print("Ingrese ID: ");
            texto = sc.next();
            auto.setId(Integer.parseInt(texto));
            System.out.print("Ingrese marca: ");
            texto = sc.next();
            auto.setMarca(texto);
            System.out.print("Modelo: ");
            texto = sc.next();
            auto.setModelo(texto);
            System.out.print("Año: " );
            texto = sc.next();
            auto.setAño(Integer.parseInt(texto));
            System.out.print("Color: " );
            texto = sc.next();
            auto.setColor(texto);
            System.out.print("Cantidad de km: " );
            texto = sc.next();
            auto.setCantkm(Integer.parseInt(texto));
            System.out.print("Precio: " );
            texto = sc.next();
            auto.setPrecio(Integer.parseInt(texto));
            System.out.print("Cantidad de puertas: " );
            texto = sc.next();
            auto.setCantpuertas(Integer.parseInt(texto));
            System.out.print("Motor: " );
            texto = sc.next();
            auto.setMotor(Integer.parseInt(texto));
            System.out.print("Cantidad de valvulas: " );
            texto = sc.next();
            auto.setCantvalvulas(Integer.parseInt(texto));
            System.out.print("Baul (litros): " );
            texto = sc.next();
            auto.setBaul(Integer.parseInt(texto));
            listaAuto.agregar(auto);
            System.out.println("Desea dar de alta otro auto? 1. Si / X. No");
            System.out.print("Opcion: ");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }
    }

    public void tratarBajaAuto() {
        Scanner sc = new Scanner(System.in);
        int id;
        int continuar = 1;
        String texto;
        while (continuar == 1) {
            listaAuto.listar();
            System.out.print("Ingrese el ID del Auto que desea ELIMINAR: ");
            id = sc.nextInt();
            listaAuto.buscar_borrar_Auto(id);
            System.out.println("\nLista actualizada");
            listaAuto.listar();
            System.out.println("\n");
            System.out.println("Desea dar de baja otro auto? 1. Si / X. No");
            System.out.print("Opcion: ");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
        if (continuar != 1) {
            mostrar();
            }
        }
    }

    public void tratarModAuto(){
        Scanner sc = new Scanner(System.in);
        int id;
        int continuar = 1;
        String texto;
        while (continuar == 1) {
        listaAuto.listar();
        System.out.println("\n");
        System.out.print("Ingrese el ID del Auto que desea MODIFICAR: ");
        id = sc.nextInt();
        listaAuto.buscar_modificar_Auto(id);
        System.out.println("\nLista actualizada");
        listaAuto.listar();
        System.out.println("\n");
            System.out.println("Desea modificar otra parte de un auto? 1. Si / X. No");
            System.out.print("Opcion: ");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }
    }

    // ********************************************************************

    //******************** TRATAMIENTO ABM MOTO ***************************

    public void tratarAltaMoto(){
        Scanner sc = new Scanner(System.in);
        String texto;
        int continuar = 1;
        while (continuar == 1) {
            Moto moto = new Moto();
            System.out.print("Ingrese ID: ");
            texto = sc.next();
            moto.setId(Integer.parseInt(texto));
            System.out.print("Ingrese marca: ");
            texto = sc.next();
            moto.setMarca(texto);
            System.out.print("Modelo: ");
            texto = sc.next();
            moto.setModelo(texto);
            System.out.print("Año: " );
            texto = sc.next();
            moto.setAño(Integer.parseInt(texto));
            System.out.print("Color: " );
            texto = sc.next();
            moto.setColor(texto);
            System.out.print("Cantidad de km: " );
            texto = sc.next();
            moto.setCantkm(Integer.parseInt(texto));
            System.out.print("Precio: " );
            texto = sc.next();
            moto.setPrecio(Integer.parseInt(texto));
            System.out.println("Cilindrada: ");
            texto = sc.next();
            moto.setCilindrada(Integer.parseInt(texto));
            listaMoto.agregar(moto);
            System.out.println("Desea dar de alta otra moto? 1. Si / X. No");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }

    }

    public void tratarBajaMoto(){
        Scanner sc = new Scanner(System.in);
        int id;
        int continuar = 1;
        String texto;
        while (continuar == 1) {
            listaMoto.listar();
            System.out.print("Ingrese el ID de la Moto que desea ELIMINAR: ");
            id = sc.nextInt();
            listaMoto.buscar_borrar_Moto(id);
            System.out.println("\nLista actualizada");
            listaMoto.listar();
            System.out.println("\n");
            System.out.println("Desea dar de baja otra moto? 1. Si / X. No");
            System.out.print("Opcion: ");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }
    }

    public void tratarModMoto(){
        Scanner sc = new Scanner(System.in);
        int id;
        int continuar = 1;
        String texto;
        while (continuar == 1) {
            listaMoto.listar();
            System.out.println("\n");
            System.out.print("Ingrese el ID de la moto que desea MODIFICAR: ");
            id = sc.nextInt();
            listaMoto.buscar_modificar_Moto(id);
            System.out.println("\nLista actualizada de motos");
            listaMoto.listar();
            System.out.println("\n");
            System.out.println("Desea modificar otra moto? 1. Si / X. No");
            System.out.print("Opcion: ");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }
    }

    // ********************************************************************

    //***************** TRATAMIENTO ABM CAMIONETA *************************

    public void tratarAltaCamioneta(){
        Scanner sc = new Scanner(System.in);
        String texto;
        int texto2;
        int continuar = 1;
        while (continuar == 1) {
            Camioneta camioneta = new Camioneta();
            System.out.print("Ingrese ID: ");
            texto = sc.next();
            camioneta.setId(Integer.parseInt(texto));
            System.out.print("Ingrese marca: ");
            texto = sc.next();
            camioneta.setMarca(texto);
            System.out.print("Modelo: ");
            texto = sc.next();
            camioneta.setModelo(texto);
            System.out.print("Año: " );
            texto = sc.next();
            camioneta.setAño(Integer.parseInt(texto));
            System.out.print("Color: " );
            texto = sc.next();
            camioneta.setColor(texto);
            System.out.print("Cantidad de km: " );
            texto = sc.next();
            camioneta.setCantkm(Integer.parseInt(texto));
            System.out.print("Precio: " );
            texto = sc.next();
            camioneta.setPrecio(Integer.parseInt(texto));
            System.out.println("4x4?: 1. Si / 2. No ");
            texto2 = sc.nextInt();
            if (texto2 == 1) camioneta.setTraccion(true); else camioneta.setTraccion(false);
            listaCamioneta.agregar(camioneta);
            System.out.println("Desea dar de alta otra camioneta? 1. Si / X. No");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }
    }

    public void tratarBajaCamioneta(){
        Scanner sc = new Scanner(System.in);
        int id;
        int continuar = 1;
        String texto;
        while (continuar == 1) {
            listaCamioneta.listar();
             System.out.print("Ingrese el ID de la Camioneta que desea ELIMINAR: ");
            id = sc.nextInt();
            listaCamioneta.buscar_borrar_Camioneta(id);
            System.out.println("\nLista actualizada");
            listaCamioneta.listar();
            System.out.println("\n");
            System.out.println("Desea dar de baja otra camioneta? 1. Si / X. No");
            System.out.print("Opcion: ");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }
    }

    public void tratarModCamioneta(){
        Scanner sc = new Scanner(System.in);
        int id;
        int continuar = 1;
        String texto;
        while (continuar == 1) {
            listaCamioneta.listar();
            System.out.println("\n");
            System.out.print("Ingrese el ID de la Camioneta que desea MODIFICAR: ");
            id = sc.nextInt();
            listaCamioneta.buscar_modificar_Camioneta(id);
            System.out.println("\nLista actualizada de camionetas");
            listaCamioneta.listar();
            System.out.println("\n");
            System.out.println("Desea modificar otra camioneta? 1. Si / X. No");
            System.out.print("Opcion: ");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }
    }

    // ********************************************************************

    //****************** TRATAMIENTO ABM CAMIONES *************************

    public void tratarAltaCamion(){
        Scanner sc = new Scanner(System.in);
        String texto;
        int texto2;
        int continuar = 1;
        while (continuar == 1) {
            Camion camion = new Camion();
            System.out.print("Ingrese ID: ");
            texto = sc.next();
            camion.setId(Integer.parseInt(texto));
            System.out.print("Ingrese marca: ");
            texto = sc.next();
            camion.setMarca(texto);
            System.out.print("Modelo: ");
            texto = sc.next();
            camion.setModelo(texto);
            System.out.print("Año: " );
            texto = sc.next();
            camion.setAño(Integer.parseInt(texto));
            System.out.print("Color: " );
            texto = sc.next();
            camion.setColor(texto);
            System.out.print("Cantidad de km: " );
            texto = sc.next();
            camion.setCantkm(Integer.parseInt(texto));
            System.out.print("Precio: " );
            texto = sc.next();
            camion.setPrecio(Integer.parseInt(texto));
            System.out.println("Potencia: ");
            texto2 = sc.nextInt();
            camion.setPotencia(texto2);
            listaCamion.agregar(camion);
            System.out.println("Desea dar de alta otro camion? 1. Si / X. No");
            System.out.print("Opcion: ");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }

    }

    public void tratarBajaCamion(){
        Scanner sc = new Scanner(System.in);
        int id;
        int continuar = 1;
        String texto;
        while (continuar == 1) {
            listaCamion.listar();
            System.out.print("Ingrese el ID del Camion que desea ELIMINAR: ");
            id = sc.nextInt();
            listaCamion.buscar_borrar_Camion(id);
            System.out.println("\nLista actualizada");
            listaCamion.listar();
            System.out.println("\n");
            System.out.println("Desea dar de baja otro camion? 1. Si / X. No");
            System.out.print("Opcion: ");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }
    }

    public void tratarModCamion(){
        Scanner sc = new Scanner(System.in);
        int id;
        int continuar = 1;
        String texto;
        while (continuar == 1) {
            listaCamion.listar();
            System.out.println("\n");
            System.out.print("Ingrese el ID del Camion que desea MODIFICAR: ");
            id = sc.nextInt();
            listaCamion.buscar_modificar_Camion(id);
            System.out.println("\nLista actualizada de camiones");
            listaCamion.listar();
            System.out.println("\n");
            System.out.println("Desea modificar otro camion? 1. Si / X. No");
            System.out.print("Opcion: ");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }
    }

    // ********************************************************************

    // Muestro el listado completo de los rodados

    public void listadoCompleto(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        listaAuto.listar();
        System.out.println("\n");
        listaMoto.listar();
        System.out.println("\n");
        listaCamioneta.listar();
        System.out.println("\n");
        listaCamion.listar();
        System.out.println("\n");
        System.out.println("Presione 1 para continuar");
        opcion = sc.nextInt();
        if (opcion == 1) {
            mostrar();
        }
    }

    public void mostrar() {
        Scanner sc = new Scanner(System.in);
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("/-/-/-/-/- MUCHUTTI AUTOS -/-/-/-/-/");
            System.out.println("MENU PRINCIPAL");
            System.out.println("Elija la operacion que desea realizar:");
            System.out.println("1. Alta");
            System.out.println("2. Baja");
            System.out.println("3. Modificacion");
            System.out.println("4. Listar rodados");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    while (opcion != 5) {
                        sc = new Scanner(System.in);
                        System.out.println("\n");
                        System.out.println("MENU DE ALTA");
                        System.out.println("Que desea dar de ALTA?");
                        System.out.println("1. Auto");
                        System.out.println("2. Moto");
                        System.out.println("3. Camioneta");
                        System.out.println("4. Camion");
                        System.out.println("5. Volver al menu principal");
                        System.out.print("Opcion: ");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1:
                                tratarAltaAuto();
                            case 2:
                                tratarAltaMoto();
                            case 3:
                                tratarAltaCamioneta();
                            case 4:
                                tratarAltaCamion();
                        }
                    }
                case 2:
                    while (opcion != 5) {
                        sc = new Scanner(System.in);
                        System.out.println("\n");
                        System.out.println("MENU DE BAJA");
                        System.out.println("Que desea dar de BAJA?");
                        System.out.println("1. Auto");
                        System.out.println("2. Moto");
                        System.out.println("3. Camioneta");
                        System.out.println("4. Camion");
                        System.out.println("5. Volver al menu principal");
                        System.out.print("Opcion: ");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1: tratarBajaAuto();
                            case 2: tratarBajaMoto();
                            case 3: tratarBajaCamioneta();
                            case 4: tratarBajaCamion();
                        }
                    }
                case 3:
                    while (opcion != 5) {
                        sc = new Scanner(System.in);
                        System.out.println("\n");
                        System.out.println("MENU DE MODIFICACION");
                        System.out.println("Que desea MODIFICAR?");
                        System.out.println("1. Auto");
                        System.out.println("2. Moto");
                        System.out.println("3. Camioneta");
                        System.out.println("4. Camion");
                        System.out.println("5. Volver al menu principal");
                        System.out.print("Opcion: ");
                        opcion = sc.nextInt();
                        switch (opcion) {
                            case 1: tratarModAuto();
                            case 2: tratarModMoto();
                            case 3: tratarModCamioneta();
                            case 4: tratarModCamion();
                        }
                    }

                case 4: listadoCompleto();
                case 5: System.exit(1);break;
            }
        }
    }
}