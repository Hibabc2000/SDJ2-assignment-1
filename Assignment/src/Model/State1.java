package Model;

public class State1 implements StateControl
{
  @Override public void turnUp(Radiator rad)
  {
    rad.setState(new State2());

  }

  @Override public void turnDown(Radiator rad)
  {
    rad.setState(new OffState());
  }
}
