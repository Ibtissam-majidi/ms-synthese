package org.sid.TP2_IBTISSAM.MAJIDI_G4.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.TP2_IBTISSAM.MAJIDI_G4.enums.AccountType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankAccountRequestDTO {
    private Double balance;
    private String currency;

    private AccountType type;
}
