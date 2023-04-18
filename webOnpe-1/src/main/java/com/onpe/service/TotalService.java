package com.onpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onpe.model.Total;
import com.onpe.repository.ITotal;

@Service
public class TotalService implements ITotalService{

	
	@Autowired
	private ITotal itotal;
	
	@Override
	public Total getTotal() {		
		return itotal.getTotal();
	}

}
