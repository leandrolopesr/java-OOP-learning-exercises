package model.exception;

import model.entities.Account;

public class AccountException extends Exception{
    public AccountException(String msg){
        super(msg);
    }
}
