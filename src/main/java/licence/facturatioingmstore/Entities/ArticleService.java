package licence.facturatioingmstore.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "Article_Service")
public class ArticleService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idArticle", nullable = false)
    private Integer id;

    @Column(name = "quantiteArticle")
    private Integer quantiteArticle;

    @Column(name = "nomArticle", length = 50)
    private String nomArticle;

    @Column(name = "prixArticle", precision = 15, scale = 2)
    private BigDecimal prixArticle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantiteArticle() {
        return quantiteArticle;
    }

    public void setQuantiteArticle(Integer quantiteArticle) {
        this.quantiteArticle = quantiteArticle;
    }

    public String getNomArticle() {
        return nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public BigDecimal getPrixArticle() {
        return prixArticle;
    }

    public void setPrixArticle(BigDecimal prixArticle) {
        this.prixArticle = prixArticle;
    }
}