package com.ecommerce.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.entity.EProductEntity;

@Transactional
@Repository
public class EProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<EProductEntity> getAllProducts(){
		return sessionFactory.openSession().createQuery("from EProductEntity").list();
	}
}
