package com.swam.ecomm.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    @NonNull
    private String productId;
    @NonNull
    private String productname;
    @NonNull
    private String productprice;
    @NonNull
    private String productdesc;
    @NonNull
    private String productsize;

    private Integer ratings;

    private String producttype;
    private String productcolor;
    private String productimage;
    @NonNull
    private String quantity;

}


