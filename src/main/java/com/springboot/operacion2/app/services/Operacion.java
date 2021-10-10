package com.springboot.operacion2.app.services;


import org.springframework.stereotype.Service;

@Service
public class Operacion implements IOperacion{
    @Override
    public Integer operacion() {
    Operaciones suma=new Operaciones();
    return suma.suma();
    }
    @Override
    public Integer operacion1() {
        Operaciones resta=new Operaciones();
        return resta.resta();

    }
    @Override
    public Integer operacion2() {
        Operaciones multip=new Operaciones();
        return multip.multiplicacion();

    }
    @Override
    public String operacion3() {
        Operaciones divisi=new Operaciones();
        return divisi.division();

    }
}
