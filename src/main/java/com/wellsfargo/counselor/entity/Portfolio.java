package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;

    public Portfolio(Customer customer) {
        this.customer = customer;
    }

    public Portfolio() {}

    public Long getPortfolioId() { return portfolioId; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }
}