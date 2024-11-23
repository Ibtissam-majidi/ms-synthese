package org.sid.TP2_IBTISSAM.MAJIDI_G4.service;

import org.sid.TP2_IBTISSAM.MAJIDI_G4.dto.BankAccountRequestDTO;
import org.sid.TP2_IBTISSAM.MAJIDI_G4.dto.BankAccountResponseDTO;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
