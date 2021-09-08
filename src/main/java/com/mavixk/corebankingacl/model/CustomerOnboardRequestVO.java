package com.mavixk.corebankingacl.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
Core banking customer id: String
Customer mobile number: String
Customer date of birth: Date
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerOnboardRequestVO {

  private String customerId;

  private String customerBankId;

  private String mobileNo;

  private LocalDate dob;
}
