package command

class FileIOJob extends Job {
  var fileIO: FileIO = null

  def setFileIO(fileIO: FileIO): Unit = this.fileIO = fileIO

  override def run(): Unit = {
    println("Job ID: " + Thread.currentThread().getId + " executing fileIO jobs")
    fileIO.execute()
  }
}