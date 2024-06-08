package Encapsulacion;

public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        if(saldo >= 0){
            this.saldo = saldo;
        }else{
            this.saldo = 0;
            System.out.println("El saldo inicial no puede ser negativo");
        }

    }

    // Getters and Setters
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }

    // Depositar
    public void depositar(double cantidad){
        if(cantidad > 0){
            //saldo = saldo+ cantidad;
            saldo += cantidad;
            System.out.println("Se ha depositado $"+cantidad+" . Nuevo Saldo: $"+saldo);
        }else{
            System.out.println("Cantidad invalida de deposito");
        }
    }

    // Retirar
    public void retirar(double cantidad){
        if(cantidad>0 && cantidad<=saldo){
            saldo -= cantidad; //saldo = saldo - cantidad;
            System.out.println("Se ha retirado $"+cantidad+" . Nuevo Saldo: $"+saldo);
        }else{
            System.out.println("Cantidad invalida de retiro");
        }
    }
}
