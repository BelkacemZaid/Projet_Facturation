package licence.facturatioingmstore.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "client_")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient", nullable = false)
    private Integer id;

    @Column(name = "nomClient", length = 50)
    private String nomClient;

    @Column(name = "prenomClient", length = 50)
    private String prenomClient;

    @Column(name = "numeroTelClient")
    private String numeroTelClient;

}