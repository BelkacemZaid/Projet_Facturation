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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getNumeroTelClient() {
        return numeroTelClient;
    }

    public void setNumeroTelClient(String numeroTelClient) {
        this.numeroTelClient = numeroTelClient;
    }
}