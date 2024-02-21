package com.aleksnose.hoteru.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="Reservation")
public class Reservation {

    @Id
    @Column(name = "Id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdUser", nullable = false)
    @JsonIgnore
    private User idUser;

    @NotNull
    @Column(name = "DateFrom", nullable = false)
    private LocalDate dateFrom;

    @NotNull
    @Column(name = "DateTo", nullable = false)
    private LocalDate dateTo;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "IdRoom", nullable = false)
    private Room idRoom;

}
