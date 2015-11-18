package com.test

import model.ProductEntity

/**
  * Created by callum on 18/11/2015.
  */
class ProductEntityTest extends TestBase{

  /**
    * Test Product ID
    */
  def productEntityProductIDTest(): Unit ={
    "By initialising a Product ID it" should "set a Product ID with a valid integer" in
    {
      // Create an object and run test
      val productEntity : ProductEntity = new ProductEntity(1, null, null)
      productEntity.productID should be (1)
    }
  }

  /**
    * Test Product Name
    */
  def productEntityProductNameTest(): Unit ={
    "By initialising a Product Name it" should "set a Product Name with a valid string" in
    {
      // Create an object and run test
      val productEntity : ProductEntity = new ProductEntity(0, "GardenGnome", null)
      productEntity.productName should be ("GardenGnome")
    }
  }

  /**
    * Test Product Description
    */
  def productEntityProductName(): Unit ={
    "By initialising a Product Description it" should "set a Product Description with a valid string" in
    {
      // Create an object and run test
      val productEntity : ProductEntity = new ProductEntity(0, null, "A small garden gnome")
      productEntity.productDescription should be ("A small garden gnome")
    }
  }

  // Run tests
  productEntityProductIDTest
  productEntityProductNameTest
  productEntityProductName
}
