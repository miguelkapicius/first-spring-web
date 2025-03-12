package com.miguelk.APIUsers.Cars;

import com.miguelk.APIUsers.Users.UserModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cars")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String brand;

    @OneToMany(mappedBy = "cars")
    private UserModel user;
}
