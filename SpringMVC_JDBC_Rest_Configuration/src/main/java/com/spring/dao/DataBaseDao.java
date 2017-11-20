package com.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class DataBaseDao {
	/*Jdbc Connection Template*/
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
}
