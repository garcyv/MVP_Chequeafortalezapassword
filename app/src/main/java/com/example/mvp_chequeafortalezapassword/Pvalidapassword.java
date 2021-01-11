package com.example.mvp_chequeafortalezapassword;

public class Pvalidapassword {

    private Mvalidapassword model;
    private Ivalidapassword view;

    public Pvalidapassword(Ivalidapassword view) {
        this.view = view;
        this.model = new Mvalidapassword();
    }

    public void validapassword(String password){
      String color=  model.validaFortaleza(password);
      String textocolor=  model.getTextocolor();
      view.showcolor(color);
      view.showtexto(textocolor);
    }
}
