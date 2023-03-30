package com.hedima.presentacion;

import java.time.*;
//import java.time.temporal.TemporalAmount;

public class ProbarJavaTime {
    public static void main(String[] args) {
        //primera forma de armar fechas
        LocalDate date=LocalDate.of(1992,8,30);
        System.out.println("fecha ->"+date);
        //Segunda forma de armar fechas
        LocalDate date2=LocalDate.of(1992, Month.AUGUST,30);
        System.out.println("fecha ->"+date2);
        //tercera forma de armar fechas
        LocalDate date3=LocalDate.parse("1992-08-30");
        System.out.println("fecha ->"+date3);

        System.out.println(date.plusDays(2));
        System.out.println(date.plusMonths(1));
        System.out.println(date.plusYears(1));

        System.out.println(date.minusDays(2));
        System.out.println(date.minusMonths(1));
        System.out.println(date.minusYears(1));
        LocalDate date4=LocalDate.of(2007,Month.JULY,7);
        System.out.println(date2.isBefore(date4));
        System.out.println(date2.isAfter(date4));
        System.out.println(LocalDate.now());

        System.out.println(Period.between(date2,LocalDate.now()).getYears());

        LocalTime horainicio=LocalTime.of(12,0);
        LocalTime horafinal=LocalTime.parse("12:00:00.001");
        System.out.println(horafinal);


        System.out.println(horainicio.plusHours(1));
        System.out.println(horainicio.minusMinutes(1));

        //Definir una fecha de fabricacion y una fecha de Expiracion
        //calcualr los dias, meses y años para que caduque
        System.out.println("------------------------------------------------");
        LocalDate fechaFabricacion=LocalDate.of(2015,01,01);
        LocalDate fechaExpiracion=LocalDate.of(2023,1,31);
        System.out.println(Period.between(fechaFabricacion,fechaExpiracion).getDays());
        System.out.println(Period.between(fechaFabricacion,fechaExpiracion).getMonths());
        System.out.println(Period.between(fechaFabricacion,fechaExpiracion).getYears());









    }
}
