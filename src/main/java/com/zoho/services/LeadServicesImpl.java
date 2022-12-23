package com.zoho.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.zoho.repository.LeadRepository;

public class LeadServicesImpl implements LeadServices {
	@Autowired
	private LeadRepository leadRepo;
	@Override
	public void saveLeadInformation() {
	}

}
