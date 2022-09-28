package com.example.demoSpringBootOneToManyMapping.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Product {
    @Id
    private Integer productId; //here does't need auto generated Id
    private Integer productQuantity;
    private String productName;
    private Integer productPrice;


}
