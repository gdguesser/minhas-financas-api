package com.guesser.minhasfinancas.model;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "finances")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
