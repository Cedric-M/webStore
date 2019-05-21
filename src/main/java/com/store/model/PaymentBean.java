/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.model;

import com.store.business.logic.PaymentValidator;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author ced
 */
@Named(value = "paymentModel")
@RequestScoped
public class PaymentBean {

    @Inject
    private PaymentValidator paymentValidator;
    /**
     * Creates a new instance of PaymentBean
     */
    
    private String ccNumber;
    private Double amount;
    
    public String doPaymentWithSoap(){
        System.out.println("Le paiement commence");
        boolean isValid = paymentValidator.process(ccNumber, amount);
        
        if(isValid==10){
            return "valid";
        }else{
            return "invalid";
        }
    }
    
    //getters et setters pour ccNumber et amount
    public String getCcNumber() {
        return ccNumber;
    }
    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }
    
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    

    
}
