package com.model.exchanges;

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

    @Column(name = "ascendexemail")
    private String ascendexemail;

    @Column(name = "password")
    private String password;

    @Column(name = "exptime")
    private Integer exptime;

    @Column(name = "marketvalue")
    private BigDecimal marketvalue;

    @Column(name = "netcost")
    private BigDecimal netcost;

    @Column(name = "alltimeprofit")
    private BigDecimal alltimeprofit;

    @Column(name = "users_id")
    private long usersId;

}
