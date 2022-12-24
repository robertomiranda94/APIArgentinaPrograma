package com.portfolioRobertoMiranda.argentinaprograma.models;

import jakarta.persistence.*;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "id_edu")
    private Long idEdu;
    @Column(name= "titulo_edu", length = 100, nullable = false)
    private String tituloEdu;

    @Column(name= "fecha_edu", columnDefinition = "DATE", nullable = false)
    private int fechaEdu;



    @Column(name= "desc_edu", length = 200, nullable = false)
    private String descEdu;

    @Column(name= "imagen_edu", length = 100, nullable = false)
    private String imagenEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, int fechaEdu, String descEdu, String imagenEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public int getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(int fechaEdu) {
        this.fechaEdu = fechaEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }
}
