package classes

import org.scalatest.FunSuite

class ClassesTestSuite extends FunSuite {
  test("Initial value of count is 0") {
    assert(new Counter().count == 0)
  }
  test("Increment called with default value on initial count 1 results in 2") {
    assert((new Counter(1).inc().count) == 2)
  }

  test("Increment called once on initial count 1 with parameter 5 results in 6") {
    assert((new Counter(1).inc(5).count) == 6)
  }

  test("Decrement called once with default value on initial count 3 results in 2") {
    assert((new Counter(3).dec().count) == 2)
  }

  test("Decrement called once on initial count 7 with parameter 6 results in 1") {
    assert((new Counter(7).dec(6).count) == 1)
  }

  test("Use returns the right result") {
    assert((new Counter(10).inc().dec().inc().inc().count) == 12)
  }

  test("Counter's adjust method returns the right result when it accepts an Adder of 3") {
    assert(new Counter(5).adjust(new Adder(4)) == new Counter(9))
  }

}
