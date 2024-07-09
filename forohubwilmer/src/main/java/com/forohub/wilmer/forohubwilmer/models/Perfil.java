package com.forohub.wilmer.forohubwilmer.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "perfil")
@EqualsAndHashCode(of = "id")
public class Perfil implements Serializable {

    //Columnas de la tabla
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 55)
    private String nombre;

    //Relaciones
    @OneToMany(mappedBy = "idPerfilFK",  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Usuario> usuarioList;


}
