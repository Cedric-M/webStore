/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.model;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ced
 */
@Named(value = "paymentModel")
@RequestScoped
public class PaymentBean {

    /**
     * Creates a new instance of PaymentBean
     */
    
    private String ccNumber;
    private Double amount;
    
    
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
