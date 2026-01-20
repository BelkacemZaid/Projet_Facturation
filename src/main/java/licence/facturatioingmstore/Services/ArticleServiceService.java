package licence.facturatioingmstore.Services;


import licence.facturatioingmstore.Entities.ArticleService;
import licence.facturatioingmstore.Repository.ArticleServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ArticleServiceService {
    private ArticleServiceRepository articleServiceRepository;

    public ArticleServiceService(ArticleServiceRepository articleServiceRepository){
        this.articleServiceRepository = articleServiceRepository ;
    }

    public List<ArticleService>  getAllArticleService() {
        return articleServiceRepository.findAll();
    }

     Optional<ArticleService> getArticleServiceById(Long id){
        return articleServiceRepository.findById(id);


    }

    public ArticleService Create(ArticleService articleService){ // premier ArticleService svd return un objet de type ArticleService
        return articleServiceRepository.save(articleService);
    }


//    public void addArticleService(ArticleService articleService){
//        return articleServiceRepository.save();
}
