package org.mkhbeldi.dev.morders.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer productId;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

    private Integer quantity;

    private Boolean orderPaied;

}
