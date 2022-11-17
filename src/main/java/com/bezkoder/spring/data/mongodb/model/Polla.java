package com.bezkoder.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "polla")
public class Polla {

    @Id
    private String id;

    private String fechaCreacion;
    private String cedula;
    private String telefono;

    private String octavo1;
    private String octavo2;
    private String octavo3;
    private String octavo4;
    private String octavo5;
    private String octavo6;
    private String octavo7;
    private String octavo8;

    private String cuarto1;
    private String cuarto2;
    private String cuarto3;
    private String cuarto4;

    private String semifinal1;
    private String semifinal2;

    private String finalfinal;

    private boolean tc;

    public Polla(String fechaCreacion, String cedula, String telefono, String octavo1, String octavo2, String octavo3, String octavo4, String octavo5, String octavo6, String octavo7, String octavo8, String cuarto1, String cuarto2, String cuarto3, String cuarto4, String semifinal1, String semifinal2, String finalfinal, boolean tc) {
        this.fechaCreacion = fechaCreacion;
        this.cedula = cedula;
        this.telefono = telefono;
        this.octavo1 = octavo1;
        this.octavo2 = octavo2;
        this.octavo3 = octavo3;
        this.octavo4 = octavo4;
        this.octavo5 = octavo5;
        this.octavo6 = octavo6;
        this.octavo7 = octavo7;
        this.octavo8 = octavo8;
        this.cuarto1 = cuarto1;
        this.cuarto2 = cuarto2;
        this.cuarto3 = cuarto3;
        this.cuarto4 = cuarto4;
        this.semifinal1 = semifinal1;
        this.semifinal2 = semifinal2;
        this.finalfinal = finalfinal;
        this.tc = tc;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOctavo1() {
        return octavo1;
    }

    public void setOctavo1(String octavo1) {
        this.octavo1 = octavo1;
    }

    public String getOctavo2() {
        return octavo2;
    }

    public void setOctavo2(String octavo2) {
        this.octavo2 = octavo2;
    }

    public String getOctavo3() {
        return octavo3;
    }

    public void setOctavo3(String octavo3) {
        this.octavo3 = octavo3;
    }

    public String getOctavo4() {
        return octavo4;
    }

    public void setOctavo4(String octavo4) {
        this.octavo4 = octavo4;
    }

    public String getOctavo5() {
        return octavo5;
    }

    public void setOctavo5(String octavo5) {
        this.octavo5 = octavo5;
    }

    public String getOctavo6() {
        return octavo6;
    }

    public void setOctavo6(String octavo6) {
        this.octavo6 = octavo6;
    }

    public String getOctavo7() {
        return octavo7;
    }

    public void setOctavo7(String octavo7) {
        this.octavo7 = octavo7;
    }

    public String getOctavo8() {
        return octavo8;
    }

    public void setOctavo8(String octavo8) {
        this.octavo8 = octavo8;
    }

    public String getCuarto1() {
        return cuarto1;
    }

    public void setCuarto1(String cuarto1) {
        this.cuarto1 = cuarto1;
    }

    public String getCuarto2() {
        return cuarto2;
    }

    public void setCuarto2(String cuarto2) {
        this.cuarto2 = cuarto2;
    }

    public String getCuarto3() {
        return cuarto3;
    }

    public void setCuarto3(String cuarto3) {
        this.cuarto3 = cuarto3;
    }

    public String getCuarto4() {
        return cuarto4;
    }

    public void setCuarto4(String cuarto4) {
        this.cuarto4 = cuarto4;
    }

    public String getSemifinal1() {
        return semifinal1;
    }

    public void setSemifinal1(String semifinal1) {
        this.semifinal1 = semifinal1;
    }

    public String getSemifinal2() {
        return semifinal2;
    }

    public void setSemifinal2(String semifinal2) {
        this.semifinal2 = semifinal2;
    }

    public String getFinalfinal() {
        return finalfinal;
    }

    public void setFinalfinal(String finalfinal) {
        this.finalfinal = finalfinal;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isTc() {
        return tc;
    }

    public void setTc(boolean tc) {
        this.tc = tc;
    }

    @Override
    public String toString() {
        return "Polla{" +
                "id='" + id + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", octavo1='" + octavo1 + '\'' +
                ", octavo2='" + octavo2 + '\'' +
                ", octavo3='" + octavo3 + '\'' +
                ", octavo4='" + octavo4 + '\'' +
                ", octavo5='" + octavo5 + '\'' +
                ", octavo6='" + octavo6 + '\'' +
                ", octavo7='" + octavo7 + '\'' +
                ", octavo8='" + octavo8 + '\'' +
                ", cuarto1='" + cuarto1 + '\'' +
                ", cuarto2='" + cuarto2 + '\'' +
                ", cuarto3='" + cuarto3 + '\'' +
                ", cuarto4='" + cuarto4 + '\'' +
                ", semifinal1='" + semifinal1 + '\'' +
                ", semifinal2='" + semifinal2 + '\'' +
                ", finalfinal='" + finalfinal + '\'' +
                '}';
    }
}


