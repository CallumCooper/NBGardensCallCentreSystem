package com.test

import model.EmployeeEntity

/**
  * Created by callum on 17/11/2015.
  */
class EmployeeEntityTest extends TestBase{

  /**
    * Test Employee ID
    */
  def employeeEntityIDTest(): Unit = {
    "By initialising the Employee ID it" should "set an Employee ID with a valid integer" in {
      // Create an object and run test
      val employeeEntity: EmployeeEntity = new EmployeeEntity(1, null, null)
      employeeEntity.employeeID should be(1)
    }
  }
    /**
      * Test employee Username
      */
    def employeeUsernameTest(): Unit ={
      "By initialising the Employee Username it" should  "set an Employee Username with a valid string" in
      {
        // Create an object and run test
        val employeeEntity : EmployeeEntity = new EmployeeEntity(0, "TarumaPatel", null)
        employeeEntity.employeeUsername should be ("TarumaPatel")
      }
    }

  /**
    * Test Employee Password
    */
  def employeePasswordTest() : Unit ={
    "By initialising the Employee Password it" should "set an Employee Password with a valid String" in
    {
      // Create an object and run test
      val employeeEntity : EmployeeEntity = new EmployeeEntity(0, null, "CallsAllDay")
      employeeEntity.employeePassword should be ("CallsAllDay")
    }
  }
    // Run Tests
    employeeEntityIDTest
    employeeUsernameTest
}
