package org.sid.TP2_IBTISSAM.MAJIDI_G4.service;


import org.sid.TP2_IBTISSAM.MAJIDI_G4.dto.BankAccountRequestDTO;
import org.sid.TP2_IBTISSAM.MAJIDI_G4.dto.BankAccountResponseDTO;
import org.sid.TP2_IBTISSAM.MAJIDI_G4.entities.BankAccount;
import org.sid.TP2_IBTISSAM.MAJIDI_G4.mappers.AccountMapper;
import org.sid.TP2_IBTISSAM.MAJIDI_G4.repositories.BankAccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    private BankAccountRepository bankAccountRepository;
    private AccountMapper accountMapper;

    public AccountServiceImpl(BankAccountRepository bankAccountRepository, AccountMapper accountMapper) {
        this.bankAccountRepository = bankAccountRepository;
        this.accountMapper = accountMapper;
    }

    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount = BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .ceratedAt(new Date())
                .balance(bankAccountDTO.getBalance())
                .type(bankAccountDTO.getType())
                .currency((bankAccountDTO.getCurrency()))
                .build();
        BankAccount saveBankAccount = bankAccountRepository.save(bankAccount);
        BankAccountResponseDTO bankAccountResponseDTO = accountMapper.fromBankAccount(saveBankAccount);

        return bankAccountResponseDTO;

    }
}
