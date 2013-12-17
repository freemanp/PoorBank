/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.cphbusiness.group11.poorbank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Paul
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoorLoanResponsee", namespace = "http://cphbusiness.dk")
public class PoorLoanResponse {
    public PoorLoanResponse(){}
    
    @XmlElement(name = "interestRate")
    protected double interestRate;
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @XmlElement(name = "ssn")
    protected String ssn;
    public String getSsn() {
        return ssn;
    }
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
