package licence.facturatioingmstore.Services;

import licence.facturatioingmstore.Entities.Facture;
import licence.facturatioingmstore.Repository.FactureRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FactureService {
    private FactureRepository factureRepository;

    public FactureService(FactureRepository factureRepository){
        this.factureRepository=factureRepository;
    }

    public List<Facture> getAllFacture(){
        return factureRepository.findAll();
    }

    Optional<Facture> getFactureById(Integer id) {
        return factureRepository.findById(id);
    }
    public Facture addFacture(Facture facture){
        return factureRepository.save(facture);
    }

    public Facture deleteFacture(String numeroFacture){
        return factureRepository.deleteFactureByNumeroFacture(numeroFacture);
    }
}
