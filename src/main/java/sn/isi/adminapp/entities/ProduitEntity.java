package sn.isi.adminapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProduitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true ,nullable = false, length=100)
    private String nom;
    private double qtStock;

    @ManyToOne
    private AppUserEntity appUser;
}
