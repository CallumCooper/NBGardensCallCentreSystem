package com.test

import model.OrderLineEntity

/**
  * Created by callum on 18/11/2015.
  */
class OrderLineEntityTest extends TestBase{

  /**
    * Test OrderLine ID
    */
  def orderLineEntityIDTest(): Unit ={
    "By initialising the Order Line ID it" should "set an Order Line ID with a valid integer" in
    {
      // Create an object and run test
      val orderLine : OrderLineEntity = new OrderLineEntity(1, 0, 0, false, 0)
      orderLine.orderLineID should be (1)
    }
  }

  /**
    * Test Order ID
    */
  def orderLineEntityOrderIDTest(): Unit ={
    "By initialising the Order ID it" should "set an Order ID with a valid integer" in
    {
      // Create an object and run test
      val orderLine : OrderLineEntity = new OrderLineEntity(0, 5, 0, false, 0)
      orderLine.orderID should be (5)
    }
  }

  /**
    * Test Product ID
    */
  def orderLineEntityProductIDTest(): Unit ={
    "By initialising the Product ID it" should "set a Product ID with a valid integer" in
    {
      // Create an object and run test
      val orderLine : OrderLineEntity = new OrderLineEntity(0, 0, 5, false, 0)
      orderLine.productID should be (5)
    }
  }

  /**
    * Test Porousware
    */
  def orderLineEntitPorouswareTest(): Unit ={
    "By initialising the Porousware it" should "set the porousware with a valid Boolean" in
    {
      // Create an object and run test
      val orderLine : OrderLineEntity = new OrderLineEntity(0, 0, 0, true, 0)
      orderLine.porousware should be (true)
    }
  }

  /**
    * Test Product Quantity
    */
  def orderLineEntityProductQuantityTest(): Unit ={
    "By initialising the Product Quantity it" should "set the Product Quantity with a vali integer" in
    {
      // Create an object and run test
      val orderLine : OrderLineEntity = new OrderLineEntity(0, 0, 0, false, 100)
      orderLine.productQuantity should be (100)
    }
  }

  // Run tests
  orderLineEntityIDTest
  orderLineEntityOrderIDTest
  orderLineEntityProductIDTest
  orderLineEntitPorouswareTest
  orderLineEntityProductQuantityTest
}
