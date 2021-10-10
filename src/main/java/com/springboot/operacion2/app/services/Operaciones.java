package com.springboot.operacion2.app.services;


import java.text.DecimalFormat;

public class Operaciones {
    OperacionDatos datos =new OperacionDatos();
    public Integer suma(){
        int suma;
        datos.setNumero1(4);
        datos.setNumero2(5);
        suma= datos.getNumero1()+ datos.getNumero2();

        return suma;
    }

    public Integer resta(){
        int restas;
        datos.setNumero1(3);
        datos.setNumero2(6);
        restas= datos.getNumero1()-datos.getNumero2();
        return restas;

    }
    public  Integer multiplicacion(){

        int multi;
        datos.setNumero1(5);
        datos.setNumero2(7);
        multi= datos.getNumero1()* datos.getNumero2();
        return multi;
    }

    public String division() {
        double div;
         String resultado;
        datos.setNumero1(3);
        datos.setNumero2(0);
        if(datos.getNumero2()==0){
            resultado="no se puede dividir entre 0";
        }else {
            div = (Double.parseDouble(datos.getNumero1() + "") / Double.parseDouble(datos.getNumero2() + ""));
            DecimalFormat df = new DecimalFormat("#.00");
            resultado = df.format(div);

        }
        return resultado;
    }
}
