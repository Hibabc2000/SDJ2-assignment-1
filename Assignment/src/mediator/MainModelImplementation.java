package mediator;

import model.Radiator;
import model.Temperature;
import model.TemperatureList;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MainModelImplementation implements MainModel
{
  private PropertyChangeSupport support;
  private Radiator radiator;
  private TemperatureList temperatureList;

  public MainModelImplementation()
  {
    support = new PropertyChangeSupport(this);
    radiator = new Radiator();
    temperatureList = new TemperatureList();
  }

  public TemperatureList getTemperatureList()
  {
    return temperatureList;
  }

  //  Use for VM
  public void turnUp()
  {
    radiator.turnUp();
    support.firePropertyChange("RadiatorState", null, radiator.getState());
  }

  public void turnDown()
  {
    radiator.turnDown();
    support.firePropertyChange("RadiatorState", null, radiator.getState());
  }

  ////  Use for VM
  //  public void getPowerState(){
  //    radiator.getState();
  //  }
  @Override public void setValue(int powerState)
  {
    radiator.setState(powerState);
    support.firePropertyChange("RadiatorState", null, radiator.getState());
  }

  @Override public void updateExternalTemperature(String id, double temperature)
  {
    Temperature temp = new Temperature(id, temperature);
    temperatureList.addTemperature(temp);
    support.firePropertyChange("ExternalTemperatureUpdate", null, temp);
    System.out
        .println("External Temperature update: " + id + " " + temperature);
  }

  //  Use for VM
  @Override public void updateTemperature(String id, double temperature)
  {
    Temperature temp = new Temperature(id, temperature);
    temperatureList.addTemperature(temp);
    support.firePropertyChange("TemperatureUpdate", null, temp);
    System.out.println("Temperature update: " + id + " " + temperature);

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
