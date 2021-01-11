package com.example.mvp_chequeafortalezapassword;

public class Mvalidapassword {

    private String color;
    private  String textocolor;

    public Mvalidapassword() {
            }

    public String getTextocolor() {
        return textocolor;
    }

    public String validaFortaleza(String p_password){
            int largo;
        largo = p_password.length();
        if(largo <5) {
            this.textocolor ="Débil";
            return "#FF0000";
        } else if (p_password.equals(p_password.toLowerCase())){
            this.textocolor= "Medio";
            return "#FFFF00";
        } else {
            this.textocolor = "Fuerte";
            return "#00FF00";}
    }
}
