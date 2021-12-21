package com.cg.aps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.VisitorEntity;


@Repository
public interface VisitorDAOInt extends JpaRepository<VisitorEntity,Integer> {

	public long add(VisitorEntity bean);
	
	public void update(VisitorEntity bean);
	
	public void delete(VisitorEntity bean);
	
	public VisitorEntity findByName(String name);
	
	public VisitorEntity findByPk(long id);
	
	public List<VisitorEntity> search(VisitorEntity bean, int pageNo, int pageSize);
	
	public List<VisitorEntity> search(VisitorEntity bean);
	
	
}
