import java.util.Random;

public class SmokeSensor implements Sensor {
  private double BatteryPercentage = 100;

  @Override
  public boolean isTriggered() {
    Random rnd = new Random();
    int n = rnd.nextInt(100) + 1;
    if (n <= 10) {
      return true;
    } else {
      if (BatteryPercentage > 19) BatteryPercentage -= 20;
      return false;
    }
  }

  @Override
  public String getLocation() {
    return null;
  }

  @Override
  public String getSensorType() {
    return null;
  }

  @Override
  public double getBatteryPercentage() {
    return BatteryPercentage;
  }
}
