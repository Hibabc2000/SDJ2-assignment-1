package mediator;

import model.Radiator;
import model.Temperature;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MainModelImplementation implements MainModel
{
  private PropertyChangeSupport support;
  private Radiator radiator;

  public MainModelImplementation()
  {
    support=new PropertyChangeSupport(this);
    radiator=new Radiator();
  }

  //  Use for VM
  public void turnUp(){
    radiator.turnUp();
  }
  public void turnDown(){
    radiator.turnDown();
  }

  //  Use for VM
  public void getPowerState(){
    radiator.getState();
  }
  //  Use for VM
  @Override public void updateTemperature(String id, double value){
    Temperature temperature = new Temperature(id, value);
    //       this.temperatureList.addTemperature(temperature);
    support.firePropertyChange("TemperatureUpdate",null,temperature);
    System.out.println("Temperature update: " +id+" "+value);

  }

  @Override public void addListener(PropertyChangeListener lstnr)
  {
    support.addPropertyChangeListener(lstnr);
  }

  @Override public void addPropertyChangeListener(String eventName,
      PropertyChangeListener lstnr)
  {
    if (eventName == null || eventName.equals(""))
    {
      support.addPropertyChangeListener(lstnr);
    }
    else
      support.addPropertyChangeListener(eventName, lstnr);
  }

  @Override public void removeListener(PropertyChangeListener lstnr)
  {
    support.removePropertyChangeListener(lstnr);
  }

  @Override public void removePropertyChangeListener(String eventName,
      PropertyChangeListener lstnr)
  {
    if (eventName == null || eventName.equals(""))
    {
      support.removePropertyChangeListener(lstnr);
    }
    else
      support.removePropertyChangeListener(eventName, lstnr);
  }
}
