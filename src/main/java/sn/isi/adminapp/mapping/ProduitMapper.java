package sn.isi.adminapp.mapping;

import org.mapstruct.Mapper;
import sn.isi.adminapp.dto.Produit;
import sn.isi.adminapp.entities.ProduitEntity;

@Mapper
public interface ProduitMapper {
    Produit toProduit(ProduitEntity produitEntity);
    ProduitEntity fromProduit(Produit produit);
}