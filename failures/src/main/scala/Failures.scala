class Failures {
  @org.openjdk.jmh.annotations.Param(scala.Array(""))
  var notUsed: String = _

  // Both of the methods below will (independently) cause the error.

  def onEmpty()= {
    "x" match {
      case "y" => List.empty[Int]
      case _ => collection.immutable.ArraySeq.empty[Int]
    }
  }

  def onFrom()= {
    "x" match {
      case "y" => List.from(1 to 2)
      case _ => collection.immutable.ArraySeq.from(1 to 2)
    }
  }
}