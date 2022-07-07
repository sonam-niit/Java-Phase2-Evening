package com.ecommerce.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EProductEntity;

@Repository
public class EProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<EProductEntity> getAllProducts() {

		return jdbcTemplate.query("select * from eproduct", new RowMapper<EProductEntity>() {

			public EProductEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

				EProductEntity obj = new EProductEntity();
				obj.setId(rs.getLong(1));
				obj.setName(rs.getString(2));
				obj.setPrice(rs.getBigDecimal(3));
				obj.setDateAdded(rs.getTimestamp(4));

				return obj;
			}
		});
	}

	public EProductEntity getProductById(long id) {
		return jdbcTemplate.query("select * from eproduct where id="+id, 
new ResultSetExtractor<EProductEntity>() {

	public EProductEntity extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		if(rs.next())
		{
			EProductEntity obj= new EProductEntity();
			obj.setId(rs.getLong(1));
			obj.setName(rs.getString(2));
			obj.setPrice(rs.getBigDecimal(3));
			obj.setDateAdded(rs.getTimestamp(4));
			return obj;
		}
		return null;
	}});
	}

	public void updateProduct(EProductEntity obj) {
		if(obj.getId()>0) {
			String sql= "update eproduct set name=?, price=?, date=? where id=?";
			jdbcTemplate.update(sql,obj.getName(),obj.getPrice(),obj.getDateAdded(),obj.getId());
		}
		else {
			String sql= "insert into eproduct (name,price,date) values (?,?,?)";
			jdbcTemplate.update(sql,obj.getName(),obj.getPrice(),obj.getDateAdded());
		}
	}
}
