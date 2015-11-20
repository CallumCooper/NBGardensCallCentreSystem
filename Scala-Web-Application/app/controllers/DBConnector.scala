package controllers

import java.sql.{ResultSet, Connection, SQLException}
import play.api.Play.current
import play.api.mvc._
import play.api.db._

/**
  * Created by callum on 20/11/2015.
  */
class DBConnector extends Controller{

  /**
    * Database attributes
    */
  val databaseDataSource = DB getDataSource()
  var conn : Connection = _

  /**
    * Make a connection to the database
    */
  def makeConection : Connection ={
    // Make the initial connection
    try {
          conn = DB getConnection()
    }
    catch {
      case e : Throwable => e printStackTrace // Error handling
    }
    conn // Return the connection
  }

  /**
    * Close the connection
    */
  def closeConnection: Unit = {
    // If a connection has been made, close it
    if (conn != null){
      conn close
    }
  }

  // Find all SQL Tables with a generic execute query
  def findAllSQLTables(query : String) : ResultSet = {

    try {
      // Assign DB attributes
      val conn : Connection = makeConection
      val statement = conn createStatement
      val resultSet = statement executeQuery(query)

      resultSet
    }
    catch {
      case e : SQLException => e printStackTrace() // error handling
        null
    }
  }

  /**
    * Connect to the database
    */
//  def connect() : String = {
//    var username  = ""
//
//    try {
//      val stmt = conn.createStatement
//      val rs = stmt.executeQuery("SELECT employeeUsername, employeePassword FROM employees")
//
//      // Loop through result set
//      while (rs next) {
//        username += rs getString ("employeeUsername")
//        println(username)
//      }
//    } finally {
//      // Close the connection
//      conn close
//    }
//    username
//  }
}
