package com.spring.jpa.api.storeapi.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Getter @Setter @ToString(exclude = "productName")
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Builder
@Entity
@Table(name = "product_detail")
public class ProductDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_content")
    private String productContent; // 물품 설명

    @Column(name = "product_price")
    private int price; //물품 가격

    // 생성자 추가
    public ProductDetail(String productName, String productContent, int price) {
        this.productName = productName;
        this.productContent = productContent;
        this.price = price;
    }

}
