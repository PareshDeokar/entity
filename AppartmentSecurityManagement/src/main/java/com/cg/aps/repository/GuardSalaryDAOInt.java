package com.cg.aps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.GuardSalaryEntity;



@Repository
public interface GuardSalaryDAOInt extends JpaRepository<GuardSalaryEntity, Integer>{

	public long add(GuardSalaryEntity bean);
	
	public void update(GuardSalaryEntity bean);
	
	public void delete(GuardSalaryEntity bean);
	
	public GuardSalaryEntity findByName(String name);
	
	public GuardSalaryEntity findByPk(long id);
	
	public List<GuardSalaryEntity> search(GuardSalaryEntity bean, long pageNo, int pageSize);
	
	public List<GuardSalaryEntity> search(GuardSalaryEntity bean);
	
	
}
