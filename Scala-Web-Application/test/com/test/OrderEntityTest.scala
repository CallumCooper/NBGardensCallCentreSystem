package com.test

import model.OrderEntity
/**
  * Created by callum on 18/11/2015.
  */
class OrderEntityTest extends TestBase {

  /**
    * Test Order ID
    */
  def orderEntityIDTest(): Unit ={
    "By initialising the Order ID it" should "set an Order ID with a valid integer" in
    {
      // Create an object and run test
      val orderEntity : OrderEntity = new OrderEntity(1, null, false, 0.0, 0, null)
      orderEntity.orderID should be (1)
    }
  }

  /**
    * Test Order Date Created
    */
  def orderEntityDateCreatedTest(): Unit ={
    "By initialising the Order Date Created it" should "set a order date created with a valid string" in
    {
      // Create an object and run test
      val orderEntity : OrderEntity = new OrderEntity(0, "18/11/2015", false, 0.0, 0, null)
      orderEntity.orderDateCreated should be ("18/11/2015")
    }
  }

  /**
    * Test Order verified
    */
  def orderEntityVerifiedTest(): Unit ={
    "By initialising the Order Verified it" should "set an order verified status with a valid Boolean condition" in
    {
      // Create an object and run test
      val orderEntity : OrderEntity = new OrderEntity(0, null, true, 0.0, 0, null)
      orderEntity.orderVerified should be (true)
    }
  }

  /**
    * Test Order Total
    */
  def orderEntityTotalTest(): Unit ={
    "By initialising the Order Total it" should "set an order total with a valid double" in
    {
      // Create an object and run test
      val orderEntity : OrderEntity = new OrderEntity(0, null, false, 10.00, 0, null)
      orderEntity.orderTotal should be (10.00)
    }
  }

  /**
    * Test Product Quantity
    */
  def orderEntityProductQuantityTest(): Unit ={
    "By initialising the Product Quantity it" should "set a Product Quantity with a valid integer" in
    {
      // Create an object and run test
      val orderEntity : OrderEntity = new OrderEntity(0, null, false, 0.0, 5, null)
      orderEntity.productQuantity should be (5)
    }
  }

  /**
    * Test Order Status
    */
  def orderEntityOrderStatusTest(): Unit ={
    "By initialising the Order Status it" should "set an Order Status with a valid string" in
    {
      // Create an object and run test
      val orderEntity : OrderEntity = new OrderEntity(0, null, false, 0.0, 0, "DISPATCHED")
      orderEntity.orderStatus should be ("DISPATCHED")
    }
  }

  // run tests
  orderEntityIDTest
  orderEntityDateCreatedTest
  orderEntityVerifiedTest
  orderEntityTotalTest
  orderEntityProductQuantityTest
  orderEntityOrderStatusTest
}
