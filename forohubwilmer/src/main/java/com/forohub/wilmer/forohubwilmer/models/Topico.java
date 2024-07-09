package com.forohub.wilmer.forohubwilmer.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "topico")
@EqualsAndHashCode(of = "id")
public class Topico implements Serializable {

    //Columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 55)
    private String titulo;

    @Column(nullable = false, length = 255)
    private String mensaje;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(nullable = false)
    private Boolean status;


    //Relaciones

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_curso_fk", nullable = false)
    private Curso idCursoFK;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_autor_fk", nullable = false)
    private Usuario idAutorFK;

    @OneToMany(mappedBy = "idTopicoFK", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Respuesta> respuestaList;



}
