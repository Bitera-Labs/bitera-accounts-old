package com.biteraLabs.Account.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long AccountId;
    private Long NumCuenta;
    private Long Saldo;
    private Long Ingresos;
    private Long Gastos;
    private Long CuentaTypeId;
}
