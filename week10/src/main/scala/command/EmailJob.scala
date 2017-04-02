package command

class EmailJob extends Job {
  var email: Email = null

  def setEmail(email: Email): Unit = this.email = email

  override def run(): Unit = {
    println("Job ID: " + Thread.currentThread().getId + " executing email jobs")
    email.sendEmail()
  }
}