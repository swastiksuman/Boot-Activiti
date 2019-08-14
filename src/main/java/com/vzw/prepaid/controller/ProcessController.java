package com.vzw.prepaid.controller;

import java.util.List;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessController {

	@Autowired
	private RuntimeService runtimeService;
	/*
	 * Method will start the Activiti process engine and set employee to perform
	 * the task
	 */
	@RequestMapping(value = "/process")
	public void startProcessInstance(@RequestParam String assignee) {
		runtimeService.startProcessInstanceById("simple-process");
	}

}