package com.kafka.common.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanDetails {
	
	private String loanType;
	private Long loanAmount;
	
	private String loanDate;
	private Double rateOfInterest;
	private Integer loanDuration;
	@NotEmpty
	@NotNull
	private Long customerId;
	private Long monthlySalary;
	private Integer creditScore;

}
