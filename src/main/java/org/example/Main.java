package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Una empresa ha instalado una nueva máquina expendedora de snacks y bebidas en su oficina. Para mejorar la experiencia de los empleados, quieren que el sistema:
        Muestre los productos disponibles y sus precios.
•	Permita a los usuarios comprar varios productos en una sola sesión (Ingresar 5 productos).
•	Maneje pagos en efectivo y devuelva el cambio correctamente.
•	No permita compras si el usuario no tiene suficiente dinero.
•	Ofrezca la opción de salir cuando el usuario termine
        */




        Scanner scanner = new Scanner(System.in);


        String prod1 = "Gomitas Trululu";
        int prec1 = 3000;
        String prod2 = "Hatsu Morado";
        int prec2 = 3000;
        String prod3 = "Galletas Saladas";
        int prec3 = 4000;
        String prod4 = "Galletas Tosh";
        int prec4 = 5000;
        String prod5 = "Chokis";
        int prec5 = 6000;
        boolean comprando =true;



        int pago =0;

        while (comprando){
            double compra =0;
            int contador =0;
            int maxProductos =5;
            System.out.println("Bienvenido, escriba el numero del producto que desea consumir, Max 5 productos");
            System.out.println("""
                    1 -> Gomitas Trululu $3000
                    2 -> Hatsu Morado $3000               
                    3 -> Galletas Saladas $4000
                    4 -> Galletas Tosh $5000
                    5 -> Chokis $6000
                    """);
            while (contador<maxProductos){
                int opcion =scanner.nextInt();
                if (opcion==1){
                    compra+=prec1;
                } else if (opcion==2) {
                    compra+=prec2;
                } else if (opcion==3) {
                    compra+=prec3;
                } else if (opcion==4) {
                    compra+=prec4;
                } else if (opcion==5) {
                    compra+=prec5;
                }else {
                    System.out.println("Opcion Invalida :(");
                }
                contador +=1;

            }

            System.out.println("Total a Pagar $"+compra);
            System.out.println("Ingrese el pago ");

            pago = scanner.nextInt();
            if (pago>=compra){
                double vueltas = (pago -compra);
                System.out.println("Compra Exitosa, gracias por comprar ;), Su vueltas son $" + vueltas);
            }else{
                System.out.println("Dinero Insuficiente");
            }
            System.out.println("Desea continuar comprando? 1=si 0=No ");
            int continuar =scanner.nextInt();
            if (continuar==0){
                comprando = false;
            }
        }
    }
}