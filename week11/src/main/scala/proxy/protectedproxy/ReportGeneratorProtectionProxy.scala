package proxy.protectedproxy

class ReportGeneratorProtectionProxy(var staff: Staff)
  extends ReportGeneratorProxy {

  var reportGenerator: ReportGenerator = _

  override def generateDailyReport(): String =
    if (staff.isOwner) {
      "Location ID: 012\nToday’s Date: Sun Sep 14 13:28:12 IST 2014\nTotal Pizza Sell: 112\nTotal Sale: $2534\nNet Profit: $1985"
    } else {
      "Not Authorized to view report."
    }
}
