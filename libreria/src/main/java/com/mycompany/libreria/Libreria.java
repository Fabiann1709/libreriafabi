/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libreria;

/**
 *
 * @author SCIS2PC10
 */
import com.mycompany.libreria.objlibros;
import java.util.Scanner;

public class Libreria {
    
   
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        
        System.out.println("1: los libros disponibles son: ");
        System.out.println("2: El extrangero ");
        System.out.println("3: Amor en los tiempos del colera ");
        System.out.println("4: El secreto ");
        System.out.println("5: El principito ");
        System.out.println("6: Habitos atomicos ");
        System.out.println("ingresa en libro que deseas");
        
        int t = entra.nextInt();
        
        
        switch(t){
            case 1:
                objlibros ElExtrangero = new objlibros("El Extrangero", "Albert Camus", "novela", 1854, "DISPONIBLE", 30, 12, "FABI", 12, 12);
                System.out.println("el nombre del libro es: " + ElExtrangero.title);
                System.out.println("el nombre del autor es: " + ElExtrangero.author);
                System.out.println("el genero es: " + ElExtrangero.genre);
                System.out.println("la fecha de publicacion es: " + ElExtrangero.datepub);
                System.out.println("el libro esta: " + ElExtrangero.available);
                System.out.println("Numero de libros disponibles: " + ElExtrangero.quantity);
                System.out.println("el nombre del autor es: " + ElExtrangero.loantime);
                System.out.println("el usuario es: " + ElExtrangero.user);
                System.out.println("numero de dias: " + ElExtrangero.loandate);
                System.out.println("el libro regresa el: " + ElExtrangero.returndate);
                break;
            case 2:
                objlibros AmorEnLosTiemposDelColera = new objlibros("Amor En Los Tiempos Del Colera", "Gabriel Garcia Marquez", "novela", 1970, "DISPONIBLE", 30, 12, "leo", 11, 9);
                System.out.println("el nombre del libro es: " + AmorEnLosTiemposDelColera.title);
                System.out.println("el nombre del autor es: " + AmorEnLosTiemposDelColera.author);
                System.out.println("el genero es: " + AmorEnLosTiemposDelColera.genre);
                System.out.println("la fecha de publicacion es: " + AmorEnLosTiemposDelColera.datepub);
                System.out.println("el libro esta: " + AmorEnLosTiemposDelColera.available);
                System.out.println("Numero de libros disponibles: " + AmorEnLosTiemposDelColera.quantity);
                System.out.println("el nombre del autor es: " + AmorEnLosTiemposDelColera.loantime);
                System.out.println("el usuario es: " + AmorEnLosTiemposDelColera.user);
                System.out.println("numero de dias: " + AmorEnLosTiemposDelColera.loandate);
                System.out.println("el libro regresa el: " + AmorEnLosTiemposDelColera.returndate);
                break;
            case 3:
                objlibros ElSecreto = new objlibros("El Secreto", "Rhonda Byrne", "auto ayuda", 2000, "DISPONIBLE", 30, 3, "caleb", 11, 9);
                System.out.println("el nombre del libro es: " + ElSecreto.title);
                System.out.println("el nombre del autor es: " + ElSecreto.author);
                System.out.println("el genero es: " + ElSecreto.genre);
                System.out.println("la fecha de publicacion es: " + ElSecreto.datepub);
                System.out.println("el libro esta: " + ElSecreto.available);
                System.out.println("Numero de libros disponibles: " + ElSecreto.quantity);
                System.out.println("el nombre del autor es: " + ElSecreto.loantime);
                System.out.println("el usuario es: " + ElSecreto.user);
                System.out.println("numero de dias: " + ElSecreto.loandate);
                System.out.println("el libro regresa el: " + ElSecreto.returndate);
                break;
            case 4:
                objlibros ElPrincipito = new objlibros("El Principito", "Fabian", "infantil", 1700, "DISPONIBLE", 30, 3, "Keiner", 11, 9);
                System.out.println("el nombre del libro es: " + ElPrincipito.title);
                System.out.println("el nombre del autor es: " + ElPrincipito.author);
                System.out.println("el genero es: " + ElPrincipito.genre);
                System.out.println("la fecha de publicacion es: " + ElPrincipito.datepub);
                System.out.println("el libro esta: " + ElPrincipito.available);
                System.out.println("Numero de libros disponibles: " + ElPrincipito.quantity);
                System.out.println("el nombre del autor es: " + ElPrincipito.loantime);
                System.out.println("el usuario es: " + ElPrincipito.user);
                System.out.println("numero de dias: " + ElPrincipito.loandate);
                System.out.println("el libro regresa el: " + ElPrincipito.returndate);
                break;
            case 5:
                objlibros HabitosAtomicos = new objlibros("Habitos Atomicos", "DaVinche", "novela", 2100, "DISPONIBLE", 30, 3, "Cristian", 11, 9);
                System.out.println("el nombre del libro es: " + HabitosAtomicos.title);
                System.out.println("el nombre del autor es: " + HabitosAtomicos.author);
                System.out.println("el genero es: " + HabitosAtomicos.genre);
                System.out.println("la fecha de publicacion es: " + HabitosAtomicos.datepub);
                System.out.println("el libro esta: " + HabitosAtomicos.available);
                System.out.println("Numero de libros disponibles: " + HabitosAtomicos.quantity);
                System.out.println("el nombre del autor es: " + HabitosAtomicos.loantime);
                System.out.println("el usuario es: " + HabitosAtomicos.user);
                System.out.println("numero de dias: " + HabitosAtomicos.loandate);
                System.out.println("el libro regresa el: " + HabitosAtomicos.returndate);
                break;
            default:
                System.out.println("ese libro no esta en nuestra libreria ");
        }
        
        
        
        
        
        
        
        

    }
    
}
