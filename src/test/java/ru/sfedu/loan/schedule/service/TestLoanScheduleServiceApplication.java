package ru.sfedu.loan.schedule.service;

import org.springframework.boot.SpringApplication;

public class TestLoanScheduleServiceApplication {
	public static void main(String[] args) {
		SpringApplication.from(LoanScheduleServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}
}
