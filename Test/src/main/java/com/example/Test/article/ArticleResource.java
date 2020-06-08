package com.example.Test.article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleResource {
	@Autowired
	private ArticleDaoService service;

	@GetMapping("/articles")
	public List<Article> retrieveAllArticles() {
		return service.findAll();
	}

	@GetMapping("/articles/{id}")
	public Article retrieveArticle(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@PostMapping("/articles")
	public void createArticles(@RequestBody Article article){
		Article savedArticle = service.save(article);
	}

}
