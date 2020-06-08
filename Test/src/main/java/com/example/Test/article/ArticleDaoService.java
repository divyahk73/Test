package com.example.Test.article;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ArticleDaoService {
	private static List<Article> articles = new ArrayList<>();

	private static int usersCount = 3;

	static {
		articles.add(new Article(1,"modestack-blog","this is blog body", "abinash", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9"));
		articles.add(new Article(2,"modestack-blog2","this is blog body", "divya", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9"));
		articles.add(new Article(3,"modestack-blog3","this is blog body", "deepak", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9"));
	}

	public List<Article> findAll() {
		return articles;
	}

	public Article save(Article article) {
		if (article.getId() == null) {
			article.setId(++usersCount);
		}
		articles.add(article);
		return article;
	}

	public Article findOne(int id) {
		for (Article article : articles) {
			if (article.getId() == id) {
				return article;
			}
		}
		return null;
	}
}
