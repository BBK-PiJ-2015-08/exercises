package bridge

case class BigWheel(product: Product, s: String) extends Car(product, s) {
  override def assemble: Unit = println("Assembling " + product.productName + " for BigWheel xz model")

  override def produceProduct: Unit = println("Producing " + product.productName + "\nModifying product" + product.productName + " according to BigWheel xz model")

  override def printDetails: Unit = println("Car: BigWheel xz model, Product:" + product.productName)
}
