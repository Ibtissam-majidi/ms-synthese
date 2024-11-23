package org.sid.TP2_IBTISSAM.MAJIDI_G4.mappers;

import org.sid.TP2_IBTISSAM.MAJIDI_G4.dto.BankAccountResponseDTO;
import org.sid.TP2_IBTISSAM.MAJIDI_G4.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount,bankAccountResponseDTO);
        return  bankAccountResponseDTO;
    }



}
