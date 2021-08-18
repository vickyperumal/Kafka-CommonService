package com.kafka.common.model;


import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProcessLoanDetails {

	@NotEmpty
	private Integer creditScore;
	private List<LoanDetails> loanDetails;

	@Override
	public String toString() {
		return "ProcessLoanDetails [creditScore=" + creditScore + ", loanDetails=" + loanDetails + "]";
	}
}
