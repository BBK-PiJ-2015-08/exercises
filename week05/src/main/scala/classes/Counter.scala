package classes

/**
  * Created by jade on 08/02/2017.
  */
class Counter(val count: Int) {

  def inc(defaultInc: Int = 1) = new Counter(count + defaultInc)

  def dec(defaultInc: Int = 1) = new Counter(count - defaultInc)
}
