package model

/**
  * Created by callum on 18/11/2015.
  */
class OrderEntity(val orderID : Int, val orderDateCreated : String,
                 val orderVerified : Boolean, val orderTotal : Double,
                 val productQuantity : Int, val orderStatus : String) {

}
