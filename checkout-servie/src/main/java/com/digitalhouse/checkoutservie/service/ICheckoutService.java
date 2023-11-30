package com.digitalhouse.checkoutservie.service;

import com.digitalhouse.checkoutservie.model.Checkout;

import java.util.List;

public interface ICheckoutService{

    Checkout buildCheckout(List<String> productIds);

}
