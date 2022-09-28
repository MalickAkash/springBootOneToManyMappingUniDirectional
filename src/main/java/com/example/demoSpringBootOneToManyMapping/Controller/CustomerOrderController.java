package com.example.demoSpringBootOneToManyMapping.Controller;

import com.example.demoSpringBootOneToManyMapping.Entity.Customer;
import com.example.demoSpringBootOneToManyMapping.Entity.Product;
import com.example.demoSpringBootOneToManyMapping.Entity.Response;
import com.example.demoSpringBootOneToManyMapping.Repository.CustomerRepository;
import com.example.demoSpringBootOneToManyMapping.Repository.ProductRepository;
import com.example.demoSpringBootOneToManyMapping.UserException.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerOrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/orderRequest")
    public Response giveOrder(@RequestBody Customer customer){
        Customer customer1=customerRepository.save(customer);
        Response response=new Response();
        response.setStatus(HttpStatus.ACCEPTED);
        response.setMessage("Customer and Product details are saved inside Data Base.");
        response.setObject(customer1);
        return response;
    }

    @GetMapping("/orderResponses")
    public Response showOrder(){
        List<Customer> customer1=customerRepository.findAll();
        Response response=new Response();
        try {
            if (customer1.isEmpty()) {
                throw new CustomException("Customer and Product details tables are empty.");
            }
            response.setStatus(HttpStatus.FOUND);
            response.setMessage("All Customer and Product details are show here.");
            response.setObject(customer1);
            return response;
        }
        catch(CustomException e){
            response.setStatus(HttpStatus.NOT_FOUND);
            response.setMessage(e.toString());
            response.setObject(customer1);
            return response;
        }
    }


    //this method shows the specific product-details searched by productName
    //Here we use Runtime custom or user defined Exception for Errors solve
    @GetMapping("/showProductName/{productName}")
    public Response showProduct(@PathVariable String productName) {
        Response response=new Response();
        List<Product> product = productRepository.showProduct(productName);
        try {
            if (product.isEmpty()) {
                throw new CustomException("Product Details are not found into the dataBase.");

            }
            response.setStatus(HttpStatus.OK);
            response.setMessage("Product Details are found.");
            response.setObject(product);
            return response;
        }
        catch (CustomException e){
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setMessage(e.toString());
            response.setObject(product);
            return response;
        }


    }

}
