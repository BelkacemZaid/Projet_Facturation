package licence.facturatioingmstore.Repository;

import licence.facturatioingmstore.Entities.ArticleService;
import licence.facturatioingmstore.Entities.Facture;
import licence.facturatioingmstore.Entities.LigneFacture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LigneFactureRepository extends JpaRepository<LigneFacture, Integer> {
    @Override
    List<LigneFacture> findAll();

    @Override
    Optional<LigneFacture> findById(Integer id);

    //la requette selectionne tout se qu'il ya dans la ligneFacture surnomé lf par rapport a l'id selectioné de Facture
    @Query("SELECT lf FROM LigneFacture lf WHERE lf.idfacture.id = :id " )
    List<LigneFacture> findLigneFactureByFactureId(@Param("id") Integer idfacture); //methode recupere ligneFacture grace idFacture

    LigneFacture deleteLigneFactureByIdarticle(ArticleService idarticle);

    List<LigneFacture> id(Integer id);
}
