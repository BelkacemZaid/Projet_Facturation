package licence.facturatioingmstore.Controllers;

import licence.facturatioingmstore.Entities.LigneFacture;
import licence.facturatioingmstore.Services.LigneFactureService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LigneFactureController {
    private LigneFactureService ligneFactureService;

    public LigneFactureController(LigneFactureService ligneFactureService){
        this.ligneFactureService = ligneFactureService;
    }

    //@GetMapping("/")
}
