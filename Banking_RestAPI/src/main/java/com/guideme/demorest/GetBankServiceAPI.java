package com.guideme.demorest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.guideme.restapi.banks.*;
import com.guideme.restapi.common.Bank;
import com.guideme.restapi.dtos.TransactionDTO;

@Path("bankingService")
public class GetBankServiceAPI {
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public TransactionDTO depositAmount() {
		TransactionDTO transactionDTO = new TransactionDTO();
		transactionDTO.setAccountNumber(123456);
		transactionDTO.setCustomerName("Arun");
		Bank cb = new CitiBank(transactionDTO);
		TransactionDTO response = null;
		try {
			response = cb.depositAmount(1503);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(response);
		return transactionDTO;
	}
}
