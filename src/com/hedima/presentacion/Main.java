package com.hedima.presentacion;

public class Main {
    public static void main(String[] args) {
        //Metodos de la clase String
        String frase="La casa verde";
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        System.out.println("Logitud de la frase: " + frase.length());
        System.out.println("("+frase.substring(0,2)+")");
        System.out.println("("+frase.substring(3,7)+")");
        System.out.println("posision de la s:"+frase.indexOf("s"));
        System.out.println("posision de la a:"+frase.indexOf("a"));
        System.out.println("posision de la c:"+frase.lastIndexOf("a"));
        String frase2="La casa verde";
        System.out.println(frase.equals(frase2));

        String frase3="Nunca mates una mosca sobre la cabeza de un tigre.";
        System.out.println(frase3.toLowerCase());
        System.out.println(frase3.toUpperCase());
        System.out.println("Logitud de la frase: " + frase3.length());
        System.out.println("("+frase3.substring(0,5)+")");
        System.out.println("("+frase3.substring(16,21)+")");
        System.out.println("("+frase3.substring(31,37)+")");
        System.out.println("posision de la s:"+frase3.indexOf("m"));

    }
}