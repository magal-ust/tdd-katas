package org.katas.onbording;

import org.junit.Test;
import org.mockito.Mockito;


public class KataSixTest {

    AccountManager accountManager = Mockito.mock(AccountManager.class);

    @Test
    public void testAccount() {
        final Account account = new Account(accountManager);

        account.deposit(500);
        account.withdraw(300);
        account.printStatement();

        Mockito.verify(accountManager).register(500, 500);
        Mockito.verify(accountManager).register(-300, 200);

    }
}
