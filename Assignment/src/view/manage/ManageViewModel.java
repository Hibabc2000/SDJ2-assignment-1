package view.manage;
import java.lang.Math;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import mediator.MainModelImplementation;
import model.TemperatureList;

public class ManageViewModel
{



  private MainModelImplementation model;
  private StringProperty t0;
  private StringProperty t1;
  private StringProperty t2;
  private DoubleProperty radValue;
  private TemperatureList temperatureList;
  //**
  public ManageViewModel(MainModelImplementation mainModelImplementation)
  {
    this.model = mainModelImplementation;
    //
    temperatureList = mainModelImplementation.getTemperatureList();
  }














  public StringProperty t0Property()
  {
    t0.setValue(String.valueOf(temperatureList.getList().get(0).getValue()));
    return t0;
  }
  public StringProperty t1Property()
  {
    t0.setValue(String.valueOf(temperatureList.getList().get(1).getValue()));
    return t0;
  }
  public StringProperty t2Property()
  {
    t0.setValue(String.valueOf(temperatureList.getList().get(2).getValue()));
    return t0;
  }
  public DoubleProperty radPowerProperty()
  {
    return radValue;
  }
  public void setRadiatorValue()
  {
    model.setValue((int)Math.round(radValue.get()));
  }
}
