package Model;

public class OffState implements StateControl
{
  @Override public void turnUp(Radiator rad)
  {


  }

  @Override public void turnDown(Radiator rad)
  {
    System.out.println("?error?");
  }
}
