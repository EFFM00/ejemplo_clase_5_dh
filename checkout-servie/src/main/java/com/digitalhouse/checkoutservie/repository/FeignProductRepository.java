package com.digitalhouse.checkoutservie.repository;

//import com.digitalhouse.checkoutservie.config.LoadBalancerConfiguration;
import com.digitalhouse.checkoutservie.model.dto.Product;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// @LoadBalancerClient(value = "products-service", configuration = LoadBalancerConfiguration.class)
// @FeignClient(name="another-products", url="http://localhost:8094")
@FeignClient(name="products-service")
public interface FeignProductRepository {

    @RequestMapping(method = RequestMethod.GET, value="/products")
    Product getProductById(@RequestParam String id);
}
