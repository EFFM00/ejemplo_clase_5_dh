package com.digitalhouse.checkoutservie.controller;

import com.digitalhouse.checkoutservie.service.ICheckoutService;
import com.digitalhouse.checkoutservie.service.ICheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.digitalhouse.checkoutservie.model.Checkout;

import java.util.List;

@RestController
@RequestMapping(value="/checkout")
public class CheckoutRestController {
    private ICheckoutService checkoutService;

    public CheckoutRestController(ICheckoutService checkoutService) {
        super();
        this.checkoutService = checkoutService;
    }

    @GetMapping()
    public Checkout getCheckout(@RequestParam List<String> productIds, @RequestHeader("X-Request-red") String requestColor) {
        System.out.println("Enviado con el color " + requestColor);
        if(!requestColor.equals("blue")) {
            System.out.println("El header es null");
            return null;
        }
        return checkoutService.buildCheckout(productIds);
    }

}
