package dk.cphbusiness.group11.poorbank;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface PoorBankService {
    @WebMethod
    PoorLoanResponse PoorLoan(@WebParam(name = "ssn") String ssn, @WebParam(name = "creditScore") int creditScore, @WebParam(name = "loanAmount") double loanAmount, @WebParam(name = "loanDurationInMonths") int loanDurationInMonths) throws PoorException;
}
