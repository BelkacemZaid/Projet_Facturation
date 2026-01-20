package licence.facturatioingmstore.Controllers;

import licence.facturatioingmstore.Entities.Facture;
import licence.facturatioingmstore.Entities.LigneFacture;
import licence.facturatioingmstore.Services.FactureService;
import licence.facturatioingmstore.Services.LigneFactureService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
public class FactureController {
    private FactureService factureService;
    private LigneFactureService ligneFactureService;

    public FactureController(FactureService factureService){
        this.factureService = factureService;
    }

    @GetMapping("/facture")
    public String AllFacture(Model model){
        model.addAttribute("Factures", factureService.getAllFacture());
            return "facture";
    }


    @GetMapping("/facture/{idfacture}/ligneFacture")
    public String LigneByIdFacture(@PathVariable Integer idfacture, Model model){
        model.addAttribute("ligneFacture", ligneFactureService.getAllLigneFactureById(idfacture));
        return "facture";
    }

}
