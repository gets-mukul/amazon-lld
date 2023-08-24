package com.amazonlld.entity;

import com.amazonlld.constants.AccountStatus;

import java.util.List;

public class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private String name;
    private Address shippingAddress;
    private String email;
    private String phone;

    List<CreditCard> creditCards;
    List<ElectronicBankTransfer> bankAccounts;

    public boolean addProduct(Product product){
        return true;
    }

    public boolean addProductReview(ProductReview review){
        return true;
    }

    public boolean resetPassword(){
        return true;
    }



}
