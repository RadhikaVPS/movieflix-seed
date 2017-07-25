package io.egen.rs.movieflix.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.rs.movieflix.rs.entity.Review;
import io.egen.rs.movieflix.rs.service.ReviewService;


@Controller
@RestController
@RequestMapping(path = "review")
public class ReviewController {

	@Autowired
	ReviewService service;
	
	
	
	@RequestMapping(method = RequestMethod.GET,path="sortbyimdbrating", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Review> sortByIMDBRatings(@PathVariable("sortbyimdbrating") int imdbRating){
		return service.sortByIMDBRating(imdbRating);
		
	}
	
	@RequestMapping(method = RequestMethod.GET,path="sortbyimdbvotes", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Review> sortByIMDBVotes(@PathVariable("sortbyimdbvotes") String imdbVotes){
		return service.sortByIMDBVotes(imdbVotes);

	}
	
//	@RequestMapping(method = RequestMethod.GET,path="/series/sortbyyear", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public List<Movie> sortByYear(){
//		
//		return service.sortByYear();
//	}
}
