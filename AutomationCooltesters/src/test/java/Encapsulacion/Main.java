package Encapsulacion;

import AccessModifiers.AccessModifier;

import java.awt.desktop.SystemEventListener;

public class Main {

    public static void main(String[] args){

        /*
        Mecanismo para envolver los datos(variables) y codigo que actua sobre los datos o variables

        Caracteristicas
        - Las variables son privada o se ocultan y solo se puede acceder a ellas por metodos
        publicos
        - Getters and Setters
         */

        CuentaBancaria cuenta001 = new CuentaBancaria("Ricardo Avalos", 5000);
        CuentaBancaria cuenta002 = new CuentaBancaria("Jose Pedraza", 1000000);
        CuentaBancaria cuenta003 = new CuentaBancaria("Genesis Garcia", 120000);
        //CuentaBancaria cuenta004 = new CuentaBancaria("Fulanito Fulanito", -2000);

        System.out.println("Titular: "+cuenta001.getTitular());
        System.out.println("Saldo Inicial $"+cuenta001.getSaldo());

        cuenta001.depositar(20000);

        System.out.println("Saldo Actual $"+cuenta001.getSaldo());

        cuenta001.retirar(9000);

        System.out.println("Saldo Actual $"+cuenta001.getSaldo());

        // Cuenta 002
        //cuenta002.saldo = 300000000;
        //cuenta002.titular = "Jose Pedaza";
        //System.out.println("Saldo Actual cuenta 002 $"+cuenta002.saldo);
        //System.out.println("La cuenta se ha modificado a : "+cuenta002.titular);

        cuenta001.setTitular("Ivan Avalos");
        System.out.println("Nuevo Titular: "+cuenta001.getTitular());

        AccessModifier object = new AccessModifier();
        object.helloWorld();
    }
}
