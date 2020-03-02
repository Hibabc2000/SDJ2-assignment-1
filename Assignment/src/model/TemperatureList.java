package model;

import java.util.ArrayList;

public class TemperatureList
{
  private ArrayList<Temperature> tempList = new ArrayList<>();

  public  ArrayList getList()
  {
    return tempList;

  }
  public void add(Temperature temp)
  {
    tempList.add(temp);
  }
  public void remove(Temperature temp)
  {
    tempList.remove(temp);
  }
}
