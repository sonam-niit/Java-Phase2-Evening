package com.ecommerce.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EProductEntity;

@Repository
public class EProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<EProductEntity> getAllProducts(){
		
		return jdbcTemplate.query("select * from eproduct", 
				new RowMapper<EProductEntity>() {

					public EProductEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

							EProductEntity obj= new EProductEntity();
							obj.setId(rs.getLong(1));
							obj.setName(rs.getString(2));
							obj.setPrice(rs.getBigDecimal(3));
							obj.setDateAdded(rs.getTimestamp(4));
							
							return obj;
					}});
	}
}
