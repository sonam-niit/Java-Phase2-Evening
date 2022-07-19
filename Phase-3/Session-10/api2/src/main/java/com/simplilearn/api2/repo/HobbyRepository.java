package com.simplilearn.api2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simplilearn.api2.entity.HobbyEntity;

@Repository
public interface HobbyRepository extends JpaRepository<HobbyEntity, Integer>{

	@Query("select h.hobbyName from HobbyEntity h where h.personId=:personId")
	public String findByPersonId(int personId);
}
