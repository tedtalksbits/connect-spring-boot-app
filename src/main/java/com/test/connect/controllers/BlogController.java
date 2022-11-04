package com.test.connect.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.connect.model.Article;
import com.test.connect.repository.ArticleRepository;


@Controller
public class BlogController {
	
	// auto injection
	@Autowired
	private ArticleRepository articleRepository;
	
	// In later versions of Spring 5^ you can avoid field injection by doing the following:
	
	//	private final ArticleRepository articleRepository;
	//	
	//	public BlogController(ArticleRepository articleRepository) {
	//		this.articleRepository = articleRepository;
	//	}
	
	
	
	
	@GetMapping("/blog")
	public String blog(@RequestParam("search") String searchTerm, Model model) {
		System.out.println("in blog controller");
		System.out.println("search term " + searchTerm);
		
		List<Article> articles = new ArrayList<>();
		articles = articleRepository.findByTitle(searchTerm);
		
		model.addAttribute("articles",articles);
		System.out.println("articles here: " + articles.toString());
		System.out.println(model);
		return "blogs";
	}
	
	/*
	 *  MODEL AND VIEW EXAMPLE
	 * @GetMapping("/blog") public ModelAndView blog() {
	 * System.out.println("in blog controller");
	 * 
	 * ModelAndView modelAndView = new ModelAndView();
	 * modelAndView.setViewName(null) }
	 */
	
}
