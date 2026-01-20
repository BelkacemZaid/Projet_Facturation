package licence.facturatioingmstore.Repository;

import licence.facturatioingmstore.Entities.ArticleService;
import licence.facturatioingmstore.Entities.Facture;
import licence.facturatioingmstore.Entities.LigneFacture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LigneFactureRepository extends JpaRepository<LigneFacture, Integer> {
    @Override
    List<LigneFacture> findAll();

    @Override
    Optional<LigneFacture> findById(Integer id);


    List<LigneFacture> findByFactureId(Integer idfacture);

    LigneFacture deleteLigneFactureByIdarticle(ArticleService idarticle);
}
