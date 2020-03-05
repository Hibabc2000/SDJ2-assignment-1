package model;

import java.beans.PropertyChangeSupport;

public class Radiator
{
  private StateControl currentState;

  public Radiator()
  {
    currentState = new OffState();
  }

  public void turnUp()
  {
    currentState.turnUp(this);
  }

  public void turnDown()
  {
    currentState.turnDown(this);
  }

  public void setState(StateControl state)
  {
    currentState = state;
  }
  public void setState(int stateNumber)
  {
    switch (stateNumber)
    {
      case 0:
        currentState = new OffState();
        break;
      case 1:
        currentState = new State1();
      case 2:
        currentState = new State2();
      case 3:
        currentState = new State3(this);
    }
  }

  public int getState()
  {
    if (currentState instanceof OffState)
    {
      return 0;
    }
    else if (currentState instanceof State1)
    {
      return 1;
    }
    else if (currentState instanceof State2)
    {
      return 2;
    }
    else if (currentState instanceof State3)
    {
      return 3;
    }
    else
      //     In case of error
      return -1;
  }
}
