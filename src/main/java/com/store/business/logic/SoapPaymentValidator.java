/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.business.logic;

import javax.ejb.Stateless;

/**
 *
 * @author ced
 */
@Stateless
public class SoapPaymentValidator implements PaymentValidator {

    @Override
    public Boolean process(String ccNumber, Double amount) {
        Boolean isValid= true;
        return isValid;
    }
}
