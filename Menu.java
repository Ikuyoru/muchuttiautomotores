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
            System.out.println("Ingrese marca: ");
            texto = sc.next();
            auto.setMarca(texto);
            System.out.println("Modelo: ");
            texto = sc.next();
            auto.setModelo(texto);
            System.out.println("Año: ");
            texto = sc.next();
            auto.setAño(Integer.parseInt(texto));
            listaAuto.agregar(auto);
            System.out.println("Desea dar de alta otro auto? 1. Si / X. No");
            texto = sc.next();
            continuar = (Integer.parseInt(texto));
            if (continuar != 1) {
                mostrar();
            }
        }
    }

    public void tratarBajaAuto(){
        Scanner sc = new Scanner(System.in);
        int id;
        listaAuto.listar();
        System.out.println("Ingrese el ID del Auto que desea ELIMINAR: ");
        id = sc.nextInt();
        //tratar excepcion si no ingresa un id listado
        listaAuto.buscar_borrar(id);
        System.out.println("Lista actualizada");
        listaAuto.listar();
    }

    public void tratarModAuto(){

    }

    // ********************************************************************

    //******************** TRATAMIENTO ABM MOTO ***************************

    public void tratarAltaMoto(){
        Scanner sc = new Scanner(System.in);
        String texto;
        int continuar = 1;
        while (continuar == 1) {
            Moto moto = new Moto();
            System.out.println("Ingrese marca: ");
            texto = sc.next();
            moto.setMarca(texto);
            System.out.println("Modelo: ");
            texto = sc.next();
            moto.setModelo(texto);
            System.out.println("Año: ");
            texto = sc.next();
            moto.setAño(Integer.parseInt(texto));
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

    }

    public void tratarModMoto(){

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
            System.out.println("Ingrese marca: ");
            texto = sc.next();
            camioneta.setMarca(texto);
            System.out.println("Modelo: ");
            texto = sc.next();
            camioneta.setModelo(texto);
            System.out.println("Año: ");
            texto = sc.next();
            camioneta.setAño(Integer.parseInt(texto));
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
    /*
    public void tratarBajaCamioneta(){

    }

    public void tratarModCamioneta(){

    }*/

    // ********************************************************************

    //****************** TRATAMIENTO ABM CAMIONES *************************

    public void tratarAltaCamion(){
            Scanner sc = new Scanner(System.in);
            String texto;
            int texto2;
            int continuar = 1;
            while (continuar == 1) {
                Camion camion = new Camion();
                System.out.println("Ingrese marca: ");
                texto = sc.next();
                camion.setMarca(texto);
                System.out.println("Modelo: ");
                texto = sc.next();
                camion.setModelo(texto);
                System.out.println("Año: ");
                texto = sc.next();
                camion.setAño(Integer.parseInt(texto));
                System.out.println("Potencia: ");
                texto2 = sc.nextInt();
                camion.setPotencia(texto2);
                listaCamion.agregar(camion);
                System.out.println("Desea dar de alta otro camion? 1. Si / X. No");
                texto = sc.next();
                continuar = (Integer.parseInt(texto));
                if (continuar != 1) {
                    mostrar();
                }
        }

    }
/*
    public void tratarBajaCamion(){

    }

    public void tratarModCamion(){

    }*/

    // ********************************************************************

    // Muestro el listado completo de los rodados

    public void listadoCompleto(){
        listaAuto.listar();
        listaMoto.listar();
        listaCamioneta.listar();
        listaCamion.listar();
        //volver al menu principal
    }

    public void mostrar(){
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("/-/-/-/-/- MUCHUTTI AUTOS -/-/-/-/-/");
        System.out.println("MENU PRINCIPAL");
        System.out.println("Elija la operacion que desea realizar:");
        System.out.println("1. Alta");
        System.out.println("2. Baja");
        System.out.println("3. Modificacion");
        System.out.println("4. Listar rodados");
        System.out.println("5. Salir");
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                while (opcion != 5) {
                    sc = new Scanner(System.in);
                    System.out.println("MENU DE ALTA");
                    System.out.println("Que desea dar de ALTA?");
                    System.out.println("1. Auto");
                    System.out.println("2. Moto");
                    System.out.println("3. Camioneta");
                    System.out.println("4. Camion");
                    System.out.println("5. Volver al menu principal");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1: tratarAltaAuto();
                        case 2: tratarAltaMoto();
                        case 3: tratarAltaCamioneta();
                        case 4: tratarAltaCamion(); //case 4: listaAuto.Listar();
                    }
                }
            case 2:
                while (opcion != 5) {
                    sc = new Scanner(System.in);
                    System.out.println("MENU DE BAJA");
                    System.out.println("Que desea dar de BAJA?");
                    System.out.println("1. Auto");
                    System.out.println("2. Moto");
                    System.out.println("3. Camioneta");
                    System.out.println("4. Camion");
                    System.out.println("5. Volver al menu principal");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1: tratarBajaAuto();
                        case 2: tratarBajaMoto();
                        //case 3: tratarBajaCamioneta();
                        //case 4: tratarBajaCamion();
                    }
                }
            case 3:
                while (opcion != 5) {
                    sc = new Scanner(System.in);
                    System.out.println("MENU DE MODIFICAR");
                    System.out.println("Que desea MODIFICAR?");
                    System.out.println("1. Auto");
                    System.out.println("2. Moto");
                    System.out.println("3. Camioneta");
                    System.out.println("4. Camion");
                    System.out.println("5. Volver al menu principal");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1: tratarModAuto();
                        case 2: tratarModMoto();
                        //case 3: tratarModCamioneta();
                        //case 4: tratarModCamion();
                    }
                }

            case 4: listadoCompleto();
            case 5: break;
        }
    }
}

