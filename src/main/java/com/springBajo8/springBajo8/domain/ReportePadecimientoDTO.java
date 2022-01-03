package com.springBajo8.springBajo8.domain;

import java.io.Serializable;

public class ReportePadecimientoDTO implements Serializable{
    private final String id;
    private final String idPaciente;
    private final String nombrePaciente;
    private final String padecimiento;

    public ReportePadecimientoDTO(String id, String idPaciente, String nombrePaciente, String padecimiento){
        this.id = id;
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.padecimiento = padecimiento;
    }

    public static ReportePadecimientoDTO of(String id, String idPaciente, String nombrePaciente, String padecimiento){
        return new ReportePadecimientoDTO(id, idPaciente, nombrePaciente, padecimiento);
    }

    public String getId() {
        return id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public String getIdPaciente() {
        return idPaciente;
    }
}
