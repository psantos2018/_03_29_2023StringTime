package com.hedima.presentacion;

public class ProbarEstructuraIf {
    public static void main(String[] args) {
       //En base a una variable decir si es mayor o menor de edad
        int edad=15;
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        //Declarar una variable y decir si es un número positivo o negativo
        int numero=-10;
        if(numero>0){
            System.out.println("Es positivo");
        }else{
            System.out.println("Es negativo");
        }

        //Declarar una variable y decir si es un número par o impar

        int numero1=9;
        if(numero1%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
