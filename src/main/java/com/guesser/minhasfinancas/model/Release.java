package com.guesser.minhasfinancas.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "release", schema = "finances")
public class Release {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer year;
    private Integer month;
    private BigDecimal value;
}
