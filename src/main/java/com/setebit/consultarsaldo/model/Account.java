package com.setebit.consultarsaldo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account")
@Entity(name = "Account")
public class Account {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_ACCOUNT")
    @SequenceGenerator(sequenceName = "S_ACCOUNT", allocationSize = 1, name = "S_ACCOUNT")
    @Id
    private Long number;

    private Integer codigoUser;

    private Double balance;

}
