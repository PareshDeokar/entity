package com.cg.aps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.GuardTrainingEntity;


@Repository
public interface GuardTrainingDAOInt extends JpaRepository<GuardTrainingEntity, Integer> {

	public long add(GuardTrainingEntity bean);
	
	public void update(GuardTrainingEntity bean);
	
	public void delete(GuardTrainingEntity bean);
	
	public GuardTrainingEntity findByName(String name);
	
	public GuardTrainingEntity findByPk(long id);
	
	public List<GuardTrainingEntity> search(GuardTrainingEntity bean, long pageNo, int pageSize);
	
	public List<GuardTrainingEntity> search(GuardTrainingEntity bean);
	
	
}
