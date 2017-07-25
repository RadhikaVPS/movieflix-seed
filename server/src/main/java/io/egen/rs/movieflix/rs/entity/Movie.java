package io.egen.rs.movieflix.rs.entity;

//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Movie")

@NamedQueries({
	@NamedQuery(name = "Movie.findTheMovie", query ="SELECT e FROM  Movie e WHERE e.title=: p.title"),
	@NamedQuery(name = "Movie.findByYear", query ="SELECT e FROM  Movie e WHERE e.year=: p.Year"),
	@NamedQuery(name = "Movie.findByType", query ="SELECT e FROM  Movie e WHERE e.type=: p.Type"),
	@NamedQuery(name = " findByGenre", query ="SELECT e FROM  Movie e WHERE e.genre=: p.Genre"),
	@NamedQuery(name = "Movie.findMovieDetails", query ="SELECT m FROM Movie m Where m.type = 'movie' order by m.imdbVotes desc"),
	@NamedQuery(name = "Movie.addMovie",query ="SELECT m FROM Movie m Where m.type = 'movie' "),
	@NamedQuery(name = "Movie.editMovie",query ="SELECT m FROM Movie m Where m.type = 'series' "),
	@NamedQuery(name = "Movie.deleteMovie",query ="SELECT m FROM Movie m Where m.type = 'series' ")
})
public class Movie {
	
	
	
	@Id
	@GenericGenerator(name = "customUUID", strategy = "uuid2")
	@GeneratedValue(generator = "customUUID")
	private String movieId;
	private String title;
	private String year;
	private String rated;
	private String genre;
	//private List<Actor> actor;
	//private List<Comments> comments;
	private String language;
	private String runtime;
	private String type;
	//private Review review;
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getRated() {
		return rated;
	}
	public void setRated(String rated) {
		this.rated = rated;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
//	public List<Actor> getActor() {
//		return actor;
//	}
//	public void setActor(List<Actor> actor) {
//		this.actor = actor;
//	}

	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	
//	public void setReview(Review review) {
//		this.review = review;
//	}
//	
//	public Review getReview() {
//		return review;	
//	}
//	public List<Comments> getComments() {
//		return comments;
//	}
//	public void setComments(List<Comments> comments) {
//		this.comments = comments;
//	}
	
	@Override
	public String toString() {
		return "Movie [movieId=" +movieId+ ", title= " +title+ ",year= " +year+ ", type= " +type+ ", "
				+ ", rated= " +rated+ ", genre= " +genre+ ", language " +language+ ", runtime ]";
	}
	
	
	

}
