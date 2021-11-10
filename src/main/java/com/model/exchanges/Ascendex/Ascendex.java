package com.model.exchanges.Ascendex;

import com.model.exchanges.BaseEntityExchange;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "ascendex")
@Data
public class Ascendex extends BaseEntityExchange {

    @Column(name = "apikey")
    private String apikey;

    @Column(name = "secret")
    private String secret;

    @Column(name = "exptime")
    private Integer exptime;

    @Column(name = "netcost")
    private BigDecimal netcost;

    @Column(name = "alltimeprofit")
    private BigDecimal alltimeprofit;

    @Column(name = "email_id")
    private long emailId;

}
