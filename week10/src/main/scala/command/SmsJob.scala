package command

class SmsJob extends Job {
  var sms: Sms = null

  def setSms(sms: Sms): Unit = this.sms = sms

  override def run(): Unit = {
    println("Job ID: " + Thread.currentThread().getId + " executing sms jobs")
    sms.sendSms
  }
}