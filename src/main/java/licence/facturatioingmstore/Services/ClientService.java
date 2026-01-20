package licence.facturatioingmstore.Services;

import licence.facturatioingmstore.Entities.Client;
import licence.facturatioingmstore.Repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService   {
    private final ClientRepository clientRepository;
    public ClientService(ClientRepository clientRepository){
        this.clientRepository=clientRepository;
    }


    public List<Client> getClient(){
        return clientRepository.findAll();
    }


    Optional <Client> getClientByNumero(String  numeroTelClient){
        return clientRepository.findByNumeroTelClient(numeroTelClient);
    }

    public Client addClient(Client client){
        return clientRepository.save(client);
    }

    public Client deleteClient(String nomClient){
        return clientRepository.deleteClientByNomClient(nomClient);
    }

}
