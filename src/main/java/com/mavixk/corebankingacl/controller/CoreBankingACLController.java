package com.mavixk.corebankingacl.controller;

import com.mavixk.corebankingacl.model.CoreBankingResponseVO;
import com.mavixk.corebankingacl.model.CustomerOnboardRequestVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreBankingACLController {

  private static Logger logger =
      LoggerFactory.getLogger(CoreBankingACLController.class);

  @PostMapping("/customer/validate")
  public ResponseEntity<CoreBankingResponseVO> validateCustomer(@RequestBody
      CustomerOnboardRequestVO customerOnboardRequestVO) {

    logger.info("core banking service called for " + customerOnboardRequestVO.getCustomerBankId());
    return ResponseEntity.ok(CoreBankingResponseVO.builder()
        .customerBankId(customerOnboardRequestVO.getCustomerBankId()).build());
  }
}
