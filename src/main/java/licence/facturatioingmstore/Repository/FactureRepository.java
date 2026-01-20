package licence.facturatioingmstore.Repository;

import licence.facturatioingmstore.Entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface FactureRepository extends JpaRepository<Facture, Integer> {
    @Override
    List<Facture> findAll();

    @Override
    Optional<Facture> findById(Integer id);

    Facture deleteFactureByNumeroFacture(String numeroFacture);
}
