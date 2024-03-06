/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;


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
    
}
