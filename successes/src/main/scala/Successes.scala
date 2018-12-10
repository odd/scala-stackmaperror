class Successes {
  @org.openjdk.jmh.annotations.Param(scala.Array(""))
  var notUsed: String = _

  // Neither of the methods below will cause the error.

  def onEmpty()= {
    "x" match {
      case "y" => List.empty[Int]
      case _ => collection.mutable.ArraySeq.empty[Int]
    }
  }
  def onFrom()= {
    "x" match {
      case "y" => List.from(1 to 2)
      case _ => collection.mutable.ArraySeq.from(1 to 2)
    }
  }
}