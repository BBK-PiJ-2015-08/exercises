package classes

import classes.Counter
import org.scalatest.FunSuite

class ClassesTestSuite extends FunSuite {
  test("Increment called with default value on initial count 1 results in 2") {
    assert((new Counter(1).inc().count) == 2)
  }

  test("Increment called once on initial count 1 with parameter 5 results in 6") {
    assert((new Counter(1).inc(5).count) == 6)
  }

  test("Decrement called once on initial count 3 results in 2") {
    assert((new Counter(3).dec.count) == 2)
  }

//  test("Use returns the right result") {
//    assert((new Counter(10).inc.dec.inc.inc.count) == 12)
//  }

}
