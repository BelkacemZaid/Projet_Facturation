package licence.facturatioingmstore.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "Article_Service")
public class ArticleService {
    @Id
    @Column(name = "idArticle", nullable = false)
    private Integer id;

    @Column(name = "quantiteArticle")
    private Integer quantiteArticle;

    @Column(name = "nomArticle", length = 50)
    private String nomArticle;

    @Column(name = "prixArticle", precision = 15, scale = 2)
    private BigDecimal prixArticle;

}