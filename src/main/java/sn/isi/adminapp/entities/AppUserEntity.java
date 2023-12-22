package sn.isi.adminapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true ,nullable = false, length=150)
    private String nom;
    @Column(unique = true ,nullable = false, length=150)
    private String prenom;
    @Column(unique = true ,nullable = false, length=150)
    private String Email;
    @Column(unique = true ,nullable = false, length=150)
    private String password;
    private int etat;
    @ManyToMany
    private List<AppRolesEntity> appRoles;
    @OneToMany (mappedBy = "appRoles")
    private List<ProduitEntity> produits;

}
