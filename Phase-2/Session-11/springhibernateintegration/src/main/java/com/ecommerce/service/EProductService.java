package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.EProductDao;
import com.ecommerce.entity.EProductEntity;

@Service
public class EProductService {

	@Autowired
	private EProductDao eProductDao;
	
	public List<EProductEntity> getAllProducts(){
		return eProductDao.getAllProducts();
	}
}
