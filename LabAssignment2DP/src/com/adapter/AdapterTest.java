package com.adapter;

public class AdapterTest {
    public static void main(String[] args) {

                StandardAccount sa = new StandardAccount(2000);
                System.out.println("Account Balance= " + sa.getBalance());

                AccountAdapter adapter = new AccountAdapter(new OffshoreAccount(2000));
                System.out.println("Account Balance= " + adapter.getBalance());


    }
}
