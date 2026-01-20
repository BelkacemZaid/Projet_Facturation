package licence.facturatioingmstore.Controllers;

import licence.facturatioingmstore.Entities.Client;
import licence.facturatioingmstore.Services.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ClientController {
    public ClientService clientService;

    public ClientController(ClientService clientService){
        this.clientService=clientService;
    }

    @GetMapping("/client")
    public String AllClient(Model model){
        model.addAttribute("Client", clientService.getClient());
        return "client";
    }

//    @PostMapping("/addClient")
//    public void AjouterClient(@RequestBody Client client){
//        return clientService.;
//    }





}
