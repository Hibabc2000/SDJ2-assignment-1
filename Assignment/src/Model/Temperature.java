package Model;

public class Temperature
{ private double value;
private int id;

public Temperature(int id, double value)
{
  this.value=value;
  this.id= id;
}

public double getValue()
{
  return value;
}
public int getId()
{
  return id;
}
public String toString()
{
  return "Id: " + id + "\n Value: " + value;
}
}
