package com.capkloss.cucumber.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@RegTest")
	public void beforeRegTestValidation() {
		System.out.println("Before: RegTest before hook");
	}
	
	@After("@RegTest")
	public void afterRegTestValidation() {
		System.out.println("After: RegTest after hook");
	}
	
	@Before("@MobileTest")
	public void beforeMobileTestValidation() {
		System.out.println("Before: MobileTest before hook");
	}
	
	@After("@MobileTest")
	public void afterMobileTestValidation() {
		System.out.println("After: MobileTest after hook");
	}

}
