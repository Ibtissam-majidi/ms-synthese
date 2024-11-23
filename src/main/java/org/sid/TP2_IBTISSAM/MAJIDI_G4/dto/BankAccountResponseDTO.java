package org.sid.TP2_IBTISSAM.MAJIDI_G4.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.TP2_IBTISSAM.MAJIDI_G4.enums.AccountType;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankAccountResponseDTO {

    private String id;
    private Date ceratedAt;
    private Double balance;
    private String currency;
    private AccountType type;
}
