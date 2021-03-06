package com.porlity.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class portfolio implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long portfolioID;

	public long getPortfolioID() {
		return portfolioID;
	}

	public void setPortfolioID(long portfolioID) {
		this.portfolioID = portfolioID;
	}
	
	@ManyToOne
	private user user;
	public user getUser() {
		return user;
	}
	public void setUser(user user) {
		this.user = user;
	}
	@ManyToOne
	private school school;

	public school getSchool() {
		return school;
	}

	public void setSchool(school school) {
		this.school = school;
	}
	@OneToMany(mappedBy ="portfolio", cascade = { CascadeType.ALL })
	private List<portfolioDetail> portfolioDetail;

	public List<portfolioDetail> getPortfolioDetail() {
		return portfolioDetail;
	}

	public void setPortfolioDetail(List<portfolioDetail> portfolioDetail) {
		this.portfolioDetail = portfolioDetail;
	}
	
}
