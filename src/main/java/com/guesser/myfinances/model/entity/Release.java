package com.guesser.myfinances.model.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public LocalDate getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(LocalDate dateRegister) {
        this.dateRegister = dateRegister;
    }

    public ReleaseType getType() {
        return type;
    }

    public void setType(ReleaseType type) {
        this.type = type;
    }

    public ReleaseStatus getStatus() {
        return status;
    }

    public void setStatus(ReleaseStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Release release = (Release) o;
        return Objects.equals(id, release.id) && Objects.equals(description, release.description) && Objects.equals(year, release.year) && Objects.equals(month, release.month) && Objects.equals(user, release.user) && Objects.equals(value, release.value) && Objects.equals(dateRegister, release.dateRegister) && type == release.type && status == release.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, year, month, user, value, dateRegister, type, status);
    }

    @Override
    public String toString() {
        return "Release{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", user=" + user +
                ", value=" + value +
                ", dateRegister=" + dateRegister +
                ", type=" + type +
                ", status=" + status +
                '}';
    }
}
