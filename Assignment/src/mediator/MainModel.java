package mediator;

import java.beans.PropertyChangeListener;

public interface MainModel
{
  // Add in uml
  void updateExternalTemperature(String id, double temperature);
  void updateTemperature(String id, double temperature);
  void setValue(int powerState);

  void addListener(PropertyChangeListener lstnr);
  void addPropertyChangeListener(String eventName,
      PropertyChangeListener lstnr);
  void removeListener(PropertyChangeListener lstnr);
  void removePropertyChangeListener(String eventName,
      PropertyChangeListener lstnr);
}
