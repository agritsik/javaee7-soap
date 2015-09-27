package com.agritsik.samples.boundary;

import com.agritsik.samples.boundary.ws.Product;
import com.agritsik.samples.boundary.ws.ProductWSService;

import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

/**
 * Created by andrey on 9/27/15.
 */
@Stateless
public class WSClient {

    @WebServiceRef
    private ProductWSService service;

    public void createProduct(){

        Product product = new Product();
        product.setName("Test");

        service.getProductWSPort().create(product);
    }






}
