package com.company.dto;

public class PagoDto {
    private Integer IdPago;
    private float pago;

    public PagoDto() {
    }

    public Integer getIdPago() {
        return IdPago;
    }

    public void setIdPago(Integer idPago) {
        IdPago = idPago;
    }

    public float getPago() {
        return pago;
    }

    public void setPago(float pago) {
        this.pago = pago;
    }
}
