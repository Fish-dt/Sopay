package com.sovereignpay.core;
@Entity
@Table(name = "outbox_events")
public class OutboxEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String eventType;
    private String payload; // JSON representation of the transaction
    private LocalDateTime createdAt = LocalDateTime.now();
    private boolean processed = false;
}