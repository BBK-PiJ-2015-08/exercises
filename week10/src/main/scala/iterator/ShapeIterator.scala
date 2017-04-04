package iterator

import java.util.Iterator

class ShapeIterator(private var shapes: Array[Shape]) extends Iterator[Shape] {
  var current: Int = 0

  override def hasNext(): Boolean = if (shapes.length > current) true else false

  override def next(): Shape = {
    if (hasNext()) {
      val store = shapes(current)
      current = current + 1
      store
    } else {
      throw new IndexOutOfBoundsException
    }
  }

  override def remove(): Unit = ???
}