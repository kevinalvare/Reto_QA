package com.company.dto;

public class CiudadDto {
    private Integer IdCiudda;
    private String Nombre;
    private Integer IdPais;

    public CiudadDto() {
    }

    public Integer getIdCiudda() {
        return IdCiudda;
    }

    public void setIdCiudda(Integer idCiudda) {
        IdCiudda = idCiudda;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getIdPais() {
        return IdPais;
    }

    public void setIdPais(Integer idPais) {
        IdPais = idPais;
    }
}
