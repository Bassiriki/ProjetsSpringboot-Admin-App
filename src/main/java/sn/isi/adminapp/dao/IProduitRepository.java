package sn.isi.adminapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.adminapp.entities.ProduitEntity;

public interface IProduitRepository extends JpaRepository<ProduitEntity,Integer> {
}
