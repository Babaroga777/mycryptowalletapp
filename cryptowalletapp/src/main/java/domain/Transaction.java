package domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.UUID;

public class Transaction implements Serializable {
    private final CryptoCurrency cryptoCurrency;
    private final UUID id;
    private final BigDecimal amount;
    private final BigDecimal priceAtTransactionDate;
    private final LocalDate date;
    private final BigDecimal total;

    public Transaction(CryptoCurrency cryptoCurrency, BigDecimal amount, BigDecimal priceAtTransactionDate) {
        this.id = UUID.randomUUID();
        this.cryptoCurrency = cryptoCurrency;
        this.amount = amount;
        this.priceAtTransactionDate = priceAtTransactionDate;
        this.date = LocalDate.now();
        this.total = this.amount.multiply(this.priceAtTransactionDate).setScale(6, RoundingMode.HALF_UP);
    }

    public CryptoCurrency getCryptoCurrency() {
        return cryptoCurrency;
    }

    public UUID getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getPriceAtTransactionDate() {
        return priceAtTransactionDate;
    }

    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "cryptoCurrency=" + cryptoCurrency +
                ", id=" + id +
                ", amount=" + amount +
                ", priceAtTransactionDate=" + priceAtTransactionDate +
                ", date=" + date +
                ", total=" + total +
                '}';
    }
}