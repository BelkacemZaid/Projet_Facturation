package licence.facturatioingmstore.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "facture")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFacture", nullable = false)
    private Integer id;

    @Column(name = "dateFacture")
    private LocalDate dateFacture;

    @Column(name = "numeroFacture")
    private  String numeroFacture;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idClient", nullable = false) // la cle etrangere va toujours dans le plusieur ici plusieurs facture appartienne a un client
    private Client idclient1;


    //“OneToMany = Une facture a plusieurs lignes, cascade = tout changement sur la facture impacte automatiquement les lignes,
    // orphanRemoval = toute ligne non rattachée disparaît de la base. On stocke les lignes dans un ensemble vide sans doublons.”
    @OneToMany(mappedBy = "idfacture", cascade = CascadeType.ALL, orphanRemoval = true)  //le mappedBy "facture" c'est pour que LigneFacture accede avec le meme nom
    private Set<LigneFacture> ligneFactures = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(LocalDate dateFacture) {
        this.dateFacture = dateFacture;
    }

    public String getNumeroFacture() {
        return numeroFacture;
    }

    public void setNumeroFacture(String numeroFacture) {
        this.numeroFacture = numeroFacture;
    }

    public Client getIdclient1() {
        return idclient1;
    }

    public void setIdclient1(Client idclient1) {
        this.idclient1 = idclient1;
    }

    public Set<LigneFacture> getLigneFactures() {
        return ligneFactures;
    }

    public void setLigneFactures(Set<LigneFacture> ligneFactures) {
        this.ligneFactures = ligneFactures;
    }
}