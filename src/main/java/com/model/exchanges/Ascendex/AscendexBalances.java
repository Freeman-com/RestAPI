package com.model.exchanges.Ascendex;

import com.model.exchanges.BaseEntityExchange;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ascendex_db")
@Data
public class AscendexBalances extends BaseEntityExchange {

    @Column(name = "email_ascendex")
    private String email;

//    @Column(name = "eth")
//    private String eth;
//
//    @Column(name = "btc")
//    private String btc;
//
//    @Column(name = "bat")
//    private String bat;
//
//    @Column(name = "xrp")
//    private String xrp;
//
//    @Column(name = "ltc")
//    private String ltc;
//
//    @Column(name = "lto")
//    private String lto;
//
//    @Column(name = "usdt")
//    private String usdt;


}
