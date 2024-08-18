package com.squad22podA.task_mgt.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreditAndDebitRequest {

	private String accountNumber;

	private String accountName;

	private BigDecimal amount;
}
