package com.boot.controller;

import com.boot.model.Product;
import com.boot.model.ProductStub;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ProductController {

    @RequestMapping(value = "products", method = RequestMethod.GET)
    public List<Product> list() {
        return ProductStub.list();
    }
}
