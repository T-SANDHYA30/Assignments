package com.project.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.project.config.*;

import com.project.beans.Movie;

@Repository
public class MovieDao {
	
	@Autowired
	JdbcTemplate namedJdbc;
	@Autowired
	JdbcTemplate jdbc;
	
	public List<Movie> findAll(){
		String query="select * from movie";
		return jdbc.query(query, new MovieRowMapper());
		
	}
	
	public void save(Movie m) {
		String query="insert into movie (mid,mname,lang,rating) values(?,?,?,?)";
		jdbc.update(query,m.getMid(),m.getMname(),m.getLang(),m.getRating());
		System.out.println("row inserted");
	}
//		
		public Movie findById(int id) {
			String query="select * from movie where mid=?";
			return jdbc.queryForObject(query, new MovieRowMapper(), id);		
		}
		
		public Movie update(Movie m) {
			//System.out.println(m);
			String query="update movie set rating=:r where mid=:id";
			namedJdbc.update(query,Map.of("r",m.getRating(),"id",m.getMid()));
			System.out.println("row updated");
			return m;
		}

}
