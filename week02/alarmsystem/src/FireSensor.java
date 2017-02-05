import java.util.Random;

public class FireSensor implements Sensor {
  private double BatteryPercentage = 100;

  @Override
  public boolean isTriggered() {
    Random rand = new Random();
    int n = rand.nextInt(100) + 1;
    if (n <= 5) {
      return true;
    } else {
      // This is to stop BatteryPercentage's value going below zero.
      if (BatteryPercentage > 9) BatteryPercentage -= 10;
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
