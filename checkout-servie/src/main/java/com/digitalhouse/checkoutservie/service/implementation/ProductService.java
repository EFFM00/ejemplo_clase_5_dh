package com.digitalhouse.checkoutservie.service.implementation;

import com.digitalhouse.checkoutservie.model.dto.Product;
import com.digitalhouse.checkoutservie.repository.FeignProductRepository;
import com.digitalhouse.checkoutservie.service.IProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    private FeignProductRepository feignProductRepository;

    public ProductService(FeignProductRepository feignProductRepository) {
        this.feignProductRepository = feignProductRepository;
    }

    @Override
    public Product getProduct(String id) {
        return feignProductRepository.getProductById(id);
    }
}
