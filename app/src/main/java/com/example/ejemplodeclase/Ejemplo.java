package com.example.ejemplodeclase;

public class Ejemplo {
    String n;
    public void ejemplo() {
        n="";
    }
    String cambiar(String s){
        n=s;
        if (s.equals("hola")){
            n="cadena no permitida";
        }
        return n;
    }
}
