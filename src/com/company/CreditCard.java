package com.company;

//Create the CreditCard class in Java. It should have the following fields:
//1. owner - The owner field will hold the owner’s name.
//2. balance – The balance attribute will hold the current balance for the credit card. Its value should never be greater than the credit limit.
//3. creditLimit - The creditLimit attribute will hold the credit limit for the credit card. Its value should never be negative.
//
//The class should have accessor methods that returns the value of the fields and mutator methods that changes the value of the fields.

 class CreditCard {


    private String owner;
    private double balance;
    private double creditLimit;

     public CreditCard(String owner, int balance, int creditLimit) {

     }

     public void setOwner(String owner) {
         this.owner = owner;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }

     public void setCreditLimit(double creditLimit) {
         this.creditLimit = creditLimit;
     }

      String getOwner() {
         return owner;
     }

     double getBalance() {
         return balance;
     }

      double getCreditLimit() {
         return creditLimit;
     }
 }
