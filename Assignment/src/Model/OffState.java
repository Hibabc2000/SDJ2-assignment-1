package Model;

public class OffState implements StateControl
{
  @Override public void turnUp(Radiator rad)
  {

    rad.setState(new State1());
  }

  @Override public void turnDown(Radiator rad)
  {
    System.out.println("TURN OFF");
  }
}
