package com.vzw.prepaid.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service
public class UserService implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("UserService Called");
	}

}
