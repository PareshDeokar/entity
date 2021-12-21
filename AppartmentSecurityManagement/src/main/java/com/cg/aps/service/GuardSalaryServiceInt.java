
package com.cg.aps.service;

import java.util.List;

import com.cg.aps.entities.GuardSalaryEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;



public interface GuardSalaryServiceInt {

	public long add(GuardSalaryEntity bean) throws DuplicateRecordException;
	
	public void update(GuardSalaryEntity bean)throws RecordNotFoundException;
	
	public void delete(GuardSalaryEntity bean)throws RecordNotFoundException;
	
	public GuardSalaryEntity findByName(String name)throws RecordNotFoundException;
	
	public GuardSalaryEntity findByPk(Integer id)throws RecordNotFoundException;
	
	public List<GuardSalaryEntity> search(GuardSalaryEntity bean, long pageNo, int pageSize);
	
	public List<GuardSalaryEntity> search(GuardSalaryEntity bean);
	
	
}