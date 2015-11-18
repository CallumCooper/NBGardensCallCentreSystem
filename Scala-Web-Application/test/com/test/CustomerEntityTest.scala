package com.test

import model.CustomerEntity

/**
  * Created by callum on 18/11/2015.
  */
class CustomerEntityTest extends TestBase{

  /**
    * Test Customer Name
    */
  def customerEntityCustomerNameTest(): Unit ={
    "By initialising the Customer Name it" should "set a Customer Name with a valid String" in
    {
      // Create an object and run test
      val customerEntity : CustomerEntity = new CustomerEntity("Callum Cooper", null, null,
      null, null, 0)
      customerEntity.customerName should be ("Callum Cooper")
    }
  }

  /**
    * Test Customer Address
    */
  def customerEntityCustomerAddressTest(): Unit ={
    "By initialising the Customer Address it" should "set a Customer Address with a valid String" in
    {
      // Create an object and run test
      val customerEntity : CustomerEntity = new CustomerEntity(null, "1 Achorage, Salford Quays, Manchester",
      null, null, null, 0)
      customerEntity.customerAddress should be ("1 Achorage, Salford Quays, Manchester")
    }
  }

  /**
    * Test Customer Card Type
    */
  def customerEntityCustomerCardTypeTest(): Unit ={
    "By initialising the Customer Card Type it" should "set a Customer Card Type with a valid String" in
    {
      // Create an object and run test
      val customerEntity : CustomerEntity = new CustomerEntity(null, null, "VisaDebit", null,
      null, 0)
      customerEntity.customerCardType should be ("VisaDebit")
    }
  }

  /**
    * Test Customer Card Number
    */
  def customerEntityCustomerCardNumberTest(): Unit ={
    "By initialising the Customer Card Number it" should "set a Customer Card Number with a valid String" in
    {
      // Create an object and run test
      val customerEntity : CustomerEntity = new CustomerEntity(null, null, null,
        "3543784534490652", null, 0)
      customerEntity.customerCardNumber should be ("3543784534490652")
    }
  }

  /**
    * Test Customer Expiry Date
    */
  def customerEntityCustomerExpiryDateTest(): Unit ={
    "By initialising the Customer expiry Date it" should "set a Customer Expiry date with a valid String" in
    {
      // Create an object and run test
      val customerEntity : CustomerEntity = new CustomerEntity(null, null, null,
      null, "11/16", 0)
      customerEntity.customerExpiryDate should be ("11/16")
    }
  }

  /**
    * Test Customer Security Code
    */
  def customerEntityCustomerSecurityCodeTest(): Unit ={
    "By initialising the Customer Security Code it" should "set a Customer Security Code with a valid String" in
    {
      // Create an object and run test
      val customerEntity : CustomerEntity = new CustomerEntity(null, null, null,
      null, null, 567)
      customerEntity.customerSecurityCode should be (567)
    }
  }

  // Run tests
  customerEntityCustomerNameTest
  customerEntityCustomerAddressTest
  customerEntityCustomerCardTypeTest
  customerEntityCustomerCardNumberTest
  customerEntityCustomerExpiryDateTest
  customerEntityCustomerSecurityCodeTest
}
