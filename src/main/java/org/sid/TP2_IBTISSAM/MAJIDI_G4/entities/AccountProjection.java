package org.sid.TP2_IBTISSAM.MAJIDI_G4.entities;

import org.sid.TP2_IBTISSAM.MAJIDI_G4.enums.AccountType;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = BankAccount.class , name ="p1")
public interface AccountProjection {
    public String getId();
    public AccountType getType();
    public Double getBalance();
}

