package view.manage;

import core.ViewHandler;
import core.ViewModelFactory;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.awt.event.ActionEvent;

public class ManageController
{

  public Label t1Temp;
  public Label t2Temp;
  public Label t0Temp;
  public Slider radP;
  private IntegerProperty radValue;
  private ManageViewModel manageViewModel;
  private ViewHandler viewHandler;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {
    this.manageViewModel = viewModelFactory.getManageViewModel();
    this.viewHandler = viewHandler;
    t1Temp.textProperty().bindBidirectional(manageViewModel.t1Property());
    t2Temp.textProperty().bindBidirectional(manageViewModel.t2Property());
    t0Temp.textProperty().bindBidirectional(manageViewModel.t0Property());
    radP.valueProperty().bindBidirectional(manageViewModel.radPowerProperty());

  }
  public void onSetButton(ActionEvent actionEvent)
  {
    manageViewModel.setRadiatorValue();
  }
}
