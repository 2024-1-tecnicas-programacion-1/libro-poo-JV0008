package com.mycompany.libropoo;

import java.util.Scanner;
import java.time.LocalDateTime;

public class Principal { // O1
public static void main(String[] args) {
Scanner lect = new Scanner(System.in);
System.out.println("Ingrese título, autor, género y año de publicación:");
String titulo = lect.nextLine();
String autor = lect.nextLine();
String genero = lect.nextLine();
int anioPublicacion = lect.nextInt();
LocalDateTime now = LocalDateTime.now();
int anio = now.getYear();
if (anioPublicacion > anio){
    System.out.println("Ingrese un libro que exista");
}else {
  
Libro llamada = new Libro(titulo, autor, genero, anioPublicacion);
llamada.marcarLeido();
System.out.println(llamada.mostrarInformacion());
System.out.println("El libro es Antigüo: " + llamada.esAntiguo());
     
}
}
}




