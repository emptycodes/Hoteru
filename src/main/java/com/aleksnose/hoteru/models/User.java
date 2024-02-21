package com.aleksnose.hoteru.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "User")
public class User {

    @Id
    @Column(name = "Id", nullable = false)
    private Integer id;

    @Size(max = 20)
    @NotNull
    @Column(name = "Name", nullable = false, length = 20)
    private String name;

    @Size(max = 50)
    @NotNull
    @Column(name = "Surname", nullable = false, length = 50)
    private String surname;

    @NotNull
    @Column(name = "IsWorker", nullable = false)
    private Boolean isWorker = false;

    @OneToMany(mappedBy = "idUser")
    private Set<Reservation> reservations = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idUser")
    private Set<WorkerInHotel> workerInHotels = new LinkedHashSet<>();

}
