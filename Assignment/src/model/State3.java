package model;

public class State3 implements StateControl
{
  private Thread thread;
  private Radiator radiator;

  public State3(Radiator radiator)
  {
    this.radiator = radiator;
    thread = new Thread(new innerClass());
    thread.start();
  }

  @Override public void turnUp(Radiator radiator)
  {
    System.out.println("Max state reached");
  }

  @Override public void turnDown(Radiator radiator)
  {
    thread.interrupt();
    radiator.setState(new State2());
    System.out.println("Radiator switched to state 2");
  }

  class innerClass implements Runnable
  {

    @Override public void run()
    {
      try
      {
        Thread.sleep(40000);
        turnDown(radiator);
      }
      catch (InterruptedException e)
      {

      }
    }
  }
}
