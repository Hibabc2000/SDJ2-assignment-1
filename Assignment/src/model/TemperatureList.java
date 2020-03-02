package model;

import java.util.ArrayList;

public class TemperatureList
{
  private ArrayList<Temperature> list;

  public TemperatureList()
  {
    this.list = new ArrayList<>();
  }

  public void addTemperature(Temperature temperature)
  {
    list.add(temperature);
  }

  public  ArrayList<Temperature> getList()
  {
    return list;
  }

  public void remove(Temperature temp)
  {
    list.remove(temp);
  }
}
