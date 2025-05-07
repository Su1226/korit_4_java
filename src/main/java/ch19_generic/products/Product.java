package ch19_generic.products;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product<T>{
    private String productName;
    private T prodictInfo;
}
