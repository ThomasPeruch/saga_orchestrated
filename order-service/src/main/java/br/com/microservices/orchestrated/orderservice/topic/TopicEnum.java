package br.com.microservices.orchestrated.orderservice.topic;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TopicEnum {
    START_SAGA("start-saga"),
    NOTIFY_ENDING("notify-ending"),
    BASE_ORCHESTRATOR("orchestrator"),
    PRODUCT_VALIDATION_SUCCESS("product-validation-success"),
    PRODUCT_VALIDATION_FAIL("product-validation-fail"),
    PAYMENT_SUCCESS("payment-success"),
    PAYMENT_FAIL("payment-fail"),
    INVENTORY_SUCCESS("inventory-success"),
    INVENTORY_FAIL("inventory-fail");
    private String topic;
}
