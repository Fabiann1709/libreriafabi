/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;

import java.awt.print.Book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class objlibros {
        String title;
        String author;
        String genre;
        int datepub;
        String available;
        int quantity;
        int loantime;
        String user;
        int loandate;
        int returndate;
    private int loanTime;
    private String loanDate;
    private String returnDate;
        
        public objlibros(String title, String author, String genre,  int datepub, String available, int quantity, int loantime, String user, int loandate, int returndate){
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.datepub = datepub;
            this.available = available;
            this.quantity = quantity;
            this.loantime = loantime;
            this.user = user;
            this.loandate = loandate;
            this.returndate = returndate;
            
        }
        public objlibros(){};
        
        void entregar(){
            SimpleDateFormat fechaf = new SimpleDateFormat("dd/mm/yyyy");
               
               Date fecha = new Date();
              Calendar c1 = Calendar.getInstance();
             
              String fecha_H = String.valueOf(c1.get(Calendar.DATE))+"/"+String.valueOf(c1.get(Calendar.MONTH)+1)+"/"+String.valueOf(c1.get(Calendar.YEAR));
            try {

                Date fechaHoy = fechaf.parse(fecha_H);
               
                long sumaFecha = fechaHoy.getTime() + (this.loanTime*24*60*60*1000); //convierto loanTime en milisegundos
                 Instant instant = Instant.ofEpochMilli(sumaFecha);
                 Date myDate = Date.from(instant);
                 this.loanDate = fecha_H;
                 this.returnDate = fechaf.format(myDate);;

               
            } catch (ParseException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        void recibido(){
            System.out.println("recibido");
        }
        
        
        
    
}
