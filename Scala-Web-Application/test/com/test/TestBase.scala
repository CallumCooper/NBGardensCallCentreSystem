package com.test

import org.scalatest.Inspectors
import org.scalatest._

/**
  * Created by callum on 17/11/2015.
  */
abstract class TestBase extends FlatSpec
with Matchers with OptionValues
with Inside with Inspectors{
}
