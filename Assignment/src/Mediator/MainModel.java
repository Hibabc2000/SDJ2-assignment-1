package Mediator;

import java.beans.PropertyChangeListener;

public interface MainModel
{void addListener(PropertyChangeListener listener);
void removeListener(PropertyChangeListener listener);
void addPropertyChangeListener(String eventName, PropertyChangeListener listener);
void removePropertyChangeListener(String eventName, PropertyChangeListener listener);
}
