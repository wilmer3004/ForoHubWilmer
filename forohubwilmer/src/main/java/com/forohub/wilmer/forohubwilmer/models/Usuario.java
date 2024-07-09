package com.forohub.wilmer.forohubwilmer.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
@EqualsAndHashCode(of = "id")
public class Usuario implements Serializable {

    //Columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 155)
    private String nombre;

    @Column(name = "correo_electronico", nullable = false, length = 255)
    private String correoElectronico;

    @Column(nullable = false, length = 55)
    private String contrasena;

    //Relaciones

    @OneToMany(mappedBy = "idAutorFK", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Topico> topicoList;

    @OneToMany(mappedBy = "idAutorFK", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Respuesta> respuestaList;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_perfil_fk", nullable = false)
    private Perfil idPerfilFK;


}
