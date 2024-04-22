package com.mycompany.libropoo;
import java.time.LocalDateTime;

public class Libro { // O1
private String titulo;
private String autor;
private int anioPublicacion;
private boolean leido;

public Libro (String titulo, String autor, int anioPublicacion){ // O1
this.titulo = titulo;
this.autor = autor;
this.anioPublicacion = anioPublicacion;
this.leido = false;
}

public String mostrarInformacion(){ // O1

return ("Título: " + titulo + ", Autor: " + autor + ", Año de Publicación: " + anioPublicacion);
}

public void marcarLeido (){ // O1

this.leido = true;
if (leido = true){
   System.out.println("El libro ha sido leído: Si");
}

}

public boolean esAntiguo(){ //O1
LocalDateTime now = LocalDateTime.now();
int anio = now.getYear();
return (anio - anioPublicacion) >= 50;

}
}