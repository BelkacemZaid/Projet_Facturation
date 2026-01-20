package licence.facturatioingmstore.Repository;

import licence.facturatioingmstore.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    @Override
    List<Client> findAll();

    @Override
    Optional<Client> findById(Integer id);


    Optional<Client> findByNumeroTelClient(String numeroTelClient);

    Client deleteClientByNomClient(String nomClient);
}
