package com.vzw.prepaid.service;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class PrinterService implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("PRINTER SERVICE");
	}

}
