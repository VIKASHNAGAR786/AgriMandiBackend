package com.example.AgriMandi.entity;





import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;


    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

