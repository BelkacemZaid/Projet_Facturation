package licence.facturatioingmstore.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class LigneFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLigne", nullable = false)
    private Integer id;

    @Column(name = "prixUnitaire")
    private Integer prixUnitaire;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idArticle", nullable = false)
    private ArticleService idarticle;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "idFacture", referencedColumnName = "idFacture", nullable = false)
    private Facture idfacture; // le nom de l'attribut est facture qui est referencer dans la classe facture

    public Integer getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Integer prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArticleService getIdarticle() {
        return idarticle;
    }

    public void setIdarticle(ArticleService idarticle) {
        this.idarticle = idarticle;
    }

    public Facture getFacture() {
        return idfacture;
    }

    public void setFacture(Facture facture) {
        this.idfacture = facture;
    }
}