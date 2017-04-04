package flyweight

import java.util
import java.util.Map

object PlatformFactory {

  private var map: Map[String, Platform] = new util.HashMap[String, Platform]()

  def getPlatformInstance(platformType: String): Platform = {
    platformType match {
      case "C" => new CPlatform();
      case "JAVA" => new JavaPlatform();
      case "RUBY" => new RubyPlatform();
      case "SCALA" => new ScalaPlatform();
    }
  }
  // this method will probably need to be synchronized

}
