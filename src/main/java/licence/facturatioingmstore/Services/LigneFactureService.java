package licence.facturatioingmstore.Services;

import licence.facturatioingmstore.Entities.ArticleService;
import licence.facturatioingmstore.Entities.Client;
import licence.facturatioingmstore.Entities.Facture;
import licence.facturatioingmstore.Entities.LigneFacture;
import licence.facturatioingmstore.Repository.LigneFactureRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LigneFactureService {


    private LigneFactureRepository ligneFactureRepository;
    public LigneFactureService(LigneFactureRepository ligneFactureRepository){
        this.ligneFactureRepository = ligneFactureRepository;
    }

    public List<LigneFacture>  getAllFacture(){
        return ligneFactureRepository.findAll();
    }

    public List<LigneFacture> getAllLigneFactureById(Integer idfacture){
        return ligneFactureRepository.findByFactureId(idfacture);
    }

    public LigneFacture addLigneFacture( LigneFacture ligneFacture){
        return ligneFactureRepository.save(ligneFacture);
    }

    public LigneFacture deleteLigneFacture(ArticleService idarticle){
        return ligneFactureRepository.deleteLigneFactureByIdarticle(idarticle);
    }

}
