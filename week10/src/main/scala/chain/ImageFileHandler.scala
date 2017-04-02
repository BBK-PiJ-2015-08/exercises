package chain

case class ImageFileHandler(s: String) extends Handler {
  var handler: Handler = null

  override def setHandler(handler: Handler): Unit = {
    this.handler = handler
  }

  override def process(file: File): Unit = {
    if (handler == null) {
      println("File not supported")
    } else {
      if (file.fileType == "image") {
        println("Process and saving " + file.fileType + "file... by " + getHandlerName())
      } else {
        println("File not supported")
      }
    }
  }

  override def getHandlerName(): String = s
}
