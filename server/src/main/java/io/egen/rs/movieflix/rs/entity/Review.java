package io.egen.rs.movieflix.rs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Review")
@NamedQueries ({
	@NamedQuery(name = "Review.sortByIMDBRating", query ="SELECT e FROM Review e Where e.imdbRating =  p.imdbRating "),
	@NamedQuery(name = "Review.sortByIMDBVotes", query ="SELECT e FROM Review e Where e.imdbVotes =:  p.imdbVotes ")
	
})

public class Review {
	
	@Id
	@GenericGenerator(name = "customUUID", strategy = "uuid2")
	@GeneratedValue(generator = "customUUID")
	private String imdbId;
	private String award;
	private String poster;
	private String metaScore;
	private int imdbRating;
	private String imdbVotes;
	private String type;
	
	
	
	public String getImdbId() {
		return imdbId;
	}
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	public String getAward() {
		return award;
	}
	public void setAward(String award) {
		this.award = award;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getMetaScore() {
		return metaScore;
	}
	public void setMetaScore(String metaScore) {
		this.metaScore = metaScore;
	}
	public int getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(int imdbRating) {
		this.imdbRating = imdbRating;
	}
	public String getImdbvotes() {
		return imdbVotes;
	}
	public void setImdbvotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	
}
