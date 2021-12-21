package com.cg.aps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.GuardShiftEntity;



@Repository
public interface GuardShiftDAOInt extends JpaRepository<GuardShiftEntity, Integer> {

	public long add(GuardShiftEntity bean);
	
	public void update(GuardShiftEntity bean);
	
	public void delete(GuardShiftEntity bean);
	
	public GuardShiftEntity findByName(String name);
	
	public GuardShiftEntity findByPk(long id);
	
	public List<GuardShiftEntity> search(GuardShiftEntity bean, long pageNo, int pageSize);
	
	public List<GuardShiftEntity> search(GuardShiftEntity bean);
	
	
}
