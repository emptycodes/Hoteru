package com.aleksnose.hoteru.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "WorkerInHotel")
public class WorkerInHotel {
    @Id
    @Column(name = "IdWorkerInHotel", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "IsAdmin", nullable = false)
    private Boolean isAdmin = false;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "IdHotel", nullable = false)
    private Hotel idHotel;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "IdUser", nullable = false)
    @JsonIgnore
    private User idUser;

}
