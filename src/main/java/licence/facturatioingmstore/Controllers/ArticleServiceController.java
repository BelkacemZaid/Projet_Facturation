package licence.facturatioingmstore.Controllers;

import licence.facturatioingmstore.Entities.ArticleService;
import licence.facturatioingmstore.Services.ArticleServiceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ArticleServiceController {
    private final ArticleServiceService articleServiceService;

    public ArticleServiceController(ArticleServiceService articleServiceService){
        this.articleServiceService = articleServiceService;
    }

    @GetMapping("/articleService")
    public String AllArticleService(Model model){
        model.addAttribute("ArticleService", articleServiceService.getAllArticleService());
        return "ArticleService";
    }

    @PostMapping("/create")
    public void addArticleService(@RequestBody ArticleService articleService){
        articleServiceService.Create(articleService);
    }






}
