package chain

case class DocFileHandler(s: String) extends Handler {
  var handler: Handler = null

  override def setHandler(handler: Handler): Unit = {
    this.handler = handler
  }

  override def process(file: File): Unit = {
    if (handler == null) {
      println("File not supported")
    } else {
      if (file.fileType == "doc") {
        println("Process and saving " + file.fileType + " file... by " + getHandlerName())
      } else {
        println("Doc Handler forwards request to " + handler.getHandlerName())
        handler.process(file)
      }
    }
}

  override def getHandlerName(): String = s
}
