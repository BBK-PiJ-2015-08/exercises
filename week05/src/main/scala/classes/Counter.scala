package classes

/**
  * Created by jade on 08/02/2017.
  */
case class Counter(val count: Int = 0) {

  def inc(defaultInc: Int = 1): Counter = new Counter(count + defaultInc)

  def dec(defaultInc: Int = 1): Counter = new Counter(count - defaultInc)

}
