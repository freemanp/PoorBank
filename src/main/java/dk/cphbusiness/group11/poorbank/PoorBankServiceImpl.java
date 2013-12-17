/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.cphbusiness.group11.poorbank;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

/**
 *
 * @author Paul
 */
@WebService(serviceName = "PoorBankService", endpointInterface="dk.cphbusiness.group11.poorbank.PoorBankService")
public class PoorBankServiceImpl implements PoorBankService {

    /**
     * This is a sample web service operation
     */
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @Override
    @WebResult(name="PoorLoan")
    public PoorLoanResponse PoorLoan(@WebParam(name = "ssn") String ssn, @WebParam(name = "creditScore") int creditScore, @WebParam(name = "loanAmount") double loanAmount, @WebParam(name = "loanDurationInMonths") int loanDurationInMonths) throws PoorException {
        if (loanAmount > 1000)
            throw new PoorException("We are too poor to fulfill your loan request.");
        
        PoorLoanResponse response = new PoorLoanResponse();
        response.setSsn(ssn);
        double interestRate = 25 / ((double)creditScore / 800);
        response.setInterestRate(interestRate);
        
        return response;
    }
}
