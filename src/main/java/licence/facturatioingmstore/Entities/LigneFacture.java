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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idArticle", nullable = false)
    private ArticleService idarticle;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idFacture", referencedColumnName = "idFacture", nullable = false)
    private Facture facture;

}