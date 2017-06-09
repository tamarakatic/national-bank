package com.example.Company.service;

import java.awt.print.Pageable;
import org.springframework.data.domain.Page;
import com.example.Company.model.BusinessPartner;

public interface BusinessPartnerService {
	
	public BusinessPartner findById(Long id);
	
	public BusinessPartner add(BusinessPartner businessPartner);
	
	public void delete(Long id);
	
	public Page<BusinessPartner> findAll(Pageable pageable);

}