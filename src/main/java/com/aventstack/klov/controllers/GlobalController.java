package com.aventstack.klov.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ConfigurationProperties("application")
@ControllerAdvice
public class GlobalController {
	
	@Value("${report.title}")
	private String reportTitle = "Automation Test Report";

	@Value("${report.name}")
	private String reportName = "Test Report";
	
	@ModelAttribute
	public void reportConfig(Model model) {
		
		if(reportTitle.trim().isEmpty()) {
			reportTitle = "Automation Test Report";
		}
		model.addAttribute("reportTitle", reportTitle);
		
		if(reportName.trim().isEmpty()) {
			reportName = "Test Report";
		}
		model.addAttribute("reportName", reportName);
	}
}
