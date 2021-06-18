package com.company.dto;

import java.util.Date;

public class EventoDto {
    private Integer IdEvento;
    private String Descripcion;
    private Date Fecha;
    private float Costo;
    private Integer IdCiudad;
    private Integer IdEscenario;
    private Integer IdCantidadBoleteria;

    public EventoDto() {
    }

    public Integer getIdEvento() {
        return IdEvento;
    }

    public void setIdEvento(Integer idEvento) {
        IdEvento = idEvento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float costo) {
        Costo = costo;
    }

    public Integer getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        IdCiudad = idCiudad;
    }

    public Integer getIdEscenario() {
        return IdEscenario;
    }

    public void setIdEscenario(Integer idEscenario) {
        IdEscenario = idEscenario;
    }

    public Integer getIdCantidadBoleteria() {
        return IdCantidadBoleteria;
    }

    public void setIdCantidadBoleteria(Integer idCantidadBoleteria) {
        IdCantidadBoleteria = idCantidadBoleteria;
    }
}
