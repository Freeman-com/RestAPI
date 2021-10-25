package com.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "erc20")
public class ERC20 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "ticker")
    private String ticker;

    @Column(name = "roi")
    private String roi;

    @Column(name = "users_id")
    private long usersId;

    @Column(name = "quantity")
    private double quantity;

    @Column(name = "marketprice")
    private double marketprice;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ERC20 erc20 = (ERC20) o;
        return Objects.equals(id, erc20.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
