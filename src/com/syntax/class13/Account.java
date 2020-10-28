package com.syntax.class13;

public class Account {
    String accountId;
    String userName;
    String password;
    double balance;
    String typeOfAccount;
    double limit;

    double amountTransfer(double amountToTransfer) {
        if (amountToTransfer < balance) {
            return balance = balance - amountToTransfer;
        } else {
            return 0;

        }
    }


    boolean login(String enteredUserName, String enteredpassword) {
        if (userName.equals(enteredUserName) &&
                password.equals(enteredpassword)) {
            return true;
        } else {
            return false;
        }
    }
}