package com.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "binance_account")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class BinanceAccount implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "users_id")
    private long usersId;

    @Column(name = "public_key")
    private String public_key;

    @Column(name = "secret")
    private String secret;

    @Column(name = "binance_email")
    private String binance_email;

    @Column(name = "balance")
    private double balance;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BinanceAccount that = (BinanceAccount) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
