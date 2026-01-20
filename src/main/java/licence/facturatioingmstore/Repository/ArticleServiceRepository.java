package licence.facturatioingmstore.Repository;

import licence.facturatioingmstore.Entities.ArticleService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
//dans <> ArticleService = l'objet, Integer = le type de l'id
@Repository
public interface ArticleServiceRepository extends JpaRepository<ArticleService,Long> { // Jpa remplace les requettes sql
    @Override
    List<ArticleService> findAll(); // renvoie List d'article ou Service

    @Override
    Optional<ArticleService> findById(Long id); // renvoie si il trouve un Article avec l'id precis



}
