package com.sovereignpay.core;
@Entity
@Table(name = "wallets")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String userId;
    private BigDecimal balance;
    private String currency; // e.g., "USD"
}