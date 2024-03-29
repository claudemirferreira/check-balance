package com.setebit.consultarsaldo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferDTO {

    private Integer valorSolicitado;
    private Long accountOrigem;
    private Long accountDestino;
}
