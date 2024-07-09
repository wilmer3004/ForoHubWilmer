package com.forohub.wilmer.forohubwilmer.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "respuesta")
@EqualsAndHashCode(of = "id")

public class Respuesta implements Serializable {

    //Columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String mensaje;

    @Column(name = "fecha_creacion",nullable = false)
    private Date fechaCreacion;

    @Column(nullable = false)
    private String solucion;

    //Relaciones
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_topico_fk", nullable = false)
    private Topico idTopicoFK;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_autor_fk", nullable = false)
    private Usuario idAutorFK;


}
