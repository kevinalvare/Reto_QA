package com.company.dto;

import java.sql.Date;
import java.util.ArrayList;

public class ActorDto {
     ArrayList<Integer>id_Actor= new ArrayList<Integer>();
    ArrayList<String>nombre = new ArrayList<>();
     ArrayList<String>apellido= new ArrayList<String>();
     ArrayList<Date>fecha_Actor= new ArrayList<Date>();

    public ArrayList<Integer> getId_Actor() {
        return id_Actor;
    }

    public void setId_Actor(ArrayList<Integer> id_Actor) {
        this.id_Actor = id_Actor;
    }

    public ArrayList<String> getNombre() {
        return nombre;
    }

    public void setNombre(ArrayList nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getApellido() {
        return apellido;
    }

    public void setApellido(ArrayList<String> apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Date> getFecha_Actor() {
        return fecha_Actor;
    }

    public void setFecha_Actor(ArrayList<Date> fecha_Actor) {
        this.fecha_Actor = fecha_Actor;
    }
}
