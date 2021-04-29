package com.guesser.myfinances.model.entity;

import com.guesser.myfinances.model.enums.ReleaseStatus;
import com.guesser.myfinances.model.enums.ReleaseType;
import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "releases")
public class Release {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer year;
    private Integer month;

    @ManyToOne
    @JoinColumn(columnDefinition = "id")
    private User user;

    private BigDecimal value;
    private LocalDate dateRegister;

    @Enumerated(value = EnumType.STRING)
    private ReleaseType type;

    @Enumerated(value = EnumType.STRING)
    private ReleaseStatus status;
}
