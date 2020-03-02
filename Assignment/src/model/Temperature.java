package model;

public class Temperature
{
  private double value;
  private String id;

  public Temperature(String id, double value)
  {
    this.value = value;
    this.id = id;
  }

  public double getValue()
  {
    return value;
  }

  public String getId()
  {
    return id;
  }

  public String toString()
  {
    return "Id: " + id + "\n Value: " + value;
  }
}
