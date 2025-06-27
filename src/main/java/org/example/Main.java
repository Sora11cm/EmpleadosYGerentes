package org.example;

import Modelos.Trabajador1;
import Modelos.Trabajador2;
import Modelos.Trabajador3;
import Modelos.Trabajador4;

public class Main
{
    public static void main(String[] args)
    {
        Trabajador1 persona1 = new Trabajador1("Jorge Mejía",
                33000, "Jefe de la empresa", 7000);
        System.out.println(persona1.getDatos());

        Trabajador2 persona2 = new Trabajador2("Elizabeth Rivera",
                18000, "Contadora pública", 0);
        System.out.println(persona2.getDatos());

        Trabajador3 persona3 = new Trabajador3("Byron Nuñez",
                27000,"Gerente de logística", 5000);
        System.out.println(persona3.getDatos());

        Trabajador4 persona4 = new Trabajador4("Martha Estrada",
                15000,"Supervisora de inventario", 0);
        System.out.println(persona4.getDatos());
    }
}