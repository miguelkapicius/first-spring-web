package com.miguelk.APIUsers.Users;

import com.miguelk.APIUsers.Cars.CarModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_register")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String email;

    @ManyToOne
    @JoinColumn(name = "cars_id")
    private CarModel cars;

    public UserModel() {
    }

    public UserModel(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
