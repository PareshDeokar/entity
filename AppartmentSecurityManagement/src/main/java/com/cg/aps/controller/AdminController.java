package com.cg.aps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.GuardSalaryEntity;
import com.cg.aps.entities.VehicleEntity;
import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.service.FlatServiceInt;
import com.cg.aps.service.GuardSalaryServiceInt;
import com.cg.aps.service.GuardShiftServiceInt;
import com.cg.aps.service.GuardTrainingServiceInt;
import com.cg.aps.service.SecurityServiceInt;
import com.cg.aps.service.VehicleServiceInt;
import com.cg.aps.service.VisitorServiceInt;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	VisitorServiceInt visitor;
	
	@PostMapping("/add")
	public long add(VisitorEntity bean) throws DuplicateRecordException {
		visitor.add(bean);
		return 0;
	}
	
	@PostMapping("/update")
	public void update(VisitorEntity bean) throws RecordNotFoundException
	{
		visitor.update(bean);
	}
	
	@DeleteMapping("/delete")
	public void delete(VisitorEntity bean) throws RecordNotFoundException
	{
		visitor.delete(bean);
	}
	
	@GetMapping("/findbyname")
	public VisitorEntity findByName(String name) throws RecordNotFoundException
	{
		return visitor.findByName(name);
		
	}
	
	@GetMapping("/findbypk")
	public VisitorEntity findByPk4(Integer id) throws RecordNotFoundException{
		return visitor.findByPk(id);
	}

	
	@Autowired
	VehicleServiceInt vehicle;
	@PostMapping("/add")
	public long add(VehicleEntity bean) throws DuplicateRecordException {
		vehicle.add(bean);
		return 0;
	}
	
	@PostMapping("/update")
	public void update(VehicleEntity bean) throws RecordNotFoundException {
		vehicle.update(bean);
		
	}
	
	@DeleteMapping("/delete")
	public void delete(VehicleEntity bean) throws RecordNotFoundException{
		vehicle.delete(bean);
	}
	
	@GetMapping("/findbyname")
	public void findByName1(String name) throws RecordNotFoundException {
		vehicle.findByName(name);		
	}
	
	@GetMapping("/findbypk")
	public VehicleEntity findByPk(String id) throws RecordNotFoundException {
		return vehicle.findByPk(id);
	}

	
	
	
	
	@Autowired
	SecurityServiceInt security;
	
	
//	@Autowired
//	DomesticHelpServiceInt domestic;
//
//	@PostMapping("/add")
//	public long add(DomesticHelpEntity bean) throws DuplicateRecordException {
//		domestic.add(bean);
//		return 0;
//	}
//	
//	@PostMapping("/update")
//	public void update(DomesticHelpEntity bean)throws RecordNotFoundException {
//		domestic.update(bean);
//	}
//	
//	@DeleteMapping("/delete")
//	public void delete(DomesticHelpEntity bean)throws RecordNotFoundException {
//		domestic.delete(bean);
//	}
//	
//	@GetMapping("/findbyname")
//	public DomesticHelpEntity findByName2(String name)throws RecordNotFoundException {
//		return domestic.findByName(name);
//	}
//	
//	@GetMapping("/findbypk")
//	public DomesticHelpEntity findByPk(Integer id) throws RecordNotFoundException {
//		return domestic.findByPk(id);
//	}

	
	@Autowired
	FlatServiceInt flat;
	
	@Autowired
	GuardSalaryServiceInt guardSalary;
	@PostMapping("/add")
	public long add(GuardSalaryEntity bean)throws DuplicateRecordException{
		guardSalary.add(bean);
		return 0;
	}
	
	@PostMapping("/update")
	public void update(GuardSalaryEntity bean)throws RecordNotFoundException {
		guardSalary.update(bean);
	}
	
	@DeleteMapping("/delete")
	public void delete(GuardSalaryEntity bean)throws RecordNotFoundException {
		guardSalary.delete(bean);
	}
	
	@GetMapping("/findbyname")
	public GuardSalaryEntity findByName3(String name) throws RecordNotFoundException {
		return guardSalary.findByName(name);
	}
	
	@GetMapping("/findbypk")
	public GuardSalaryEntity findByPk1(Integer id)throws RecordNotFoundException {
		return guardSalary.findByPk(id);
	}
	
	@Autowired
	GuardShiftServiceInt guardShift;
	
	@Autowired
	GuardTrainingServiceInt guardTraning;
	
	

	
	
	
	

}
