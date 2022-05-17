package swag.rest.bank_app_delivery.entity;

import org.springframework.stereotype.Component;


public class FixedAccount extends AccountDeposit{
    public FixedAccount(AccountType accountType, long id, String clientID, long bankID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, bankID, balance, withdrawAllowed);
    }

    public FixedAccount() {
        super();

    }

    @Override
    public String toString() {
        return String.format("Account{id='%03d%06d', clientID='%s', balance=%s, type='%s'}", super.getId(), super.getBankID(), super.getClientID(),super.getBalance(), super.getAccountType());
    }
}
