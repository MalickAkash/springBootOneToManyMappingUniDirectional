package com.example.demoSpringBootOneToManyMapping.Entity;
import lombok.*;
import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Data
@ToString
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    private String customerName;
    private String customerEmail;
    private Integer customerAge;


    //it's for unidirectional

//    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
//                        // targetEntity tell that forgen key column is made into the specified table(product table)
//    @JoinColumn(name = "customer_id",referencedColumnName = "customerId")//referencedColumnName = "customerId"
//                    //customer table(customer_id) is set as a forgen key in the target table(product table)
//    private List<Product> products;

        //it's for unidirectional
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId",referencedColumnName = "customerId")
    private List<Product> products;

}
