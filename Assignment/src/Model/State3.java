package Model;

public class State3 implements StateControl, Runnable
{
  private Radiator r;
  @Override public void turnUp(Radiator rad)
  {
    r=rad;
  }

  @Override public void turnDown(Radiator rad)
  {  Thread.interrupted();
    rad.setState(new State2());

  }

  @Override public void run()
  {
    try
    {
      Thread.sleep(40000);
      turnUp(r); r.setState(new OffState());
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
}
