package org.mkhbeldi.dev.mpayments.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private Long orderId;

    private Long amount;

    private String cardNumber;

}
