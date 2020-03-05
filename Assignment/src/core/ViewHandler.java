package core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.logs.LogsController;
import view.manage.ManageController;

import java.io.IOException;

public class ViewHandler
{
  private ViewModelFactory viewModelFactory;
  private Stage currentStage;
  private Scene logsView;
  private Scene manageView;

  public ViewHandler(Stage stage, ViewModelFactory viewModelFactory)
  {
    currentStage = stage;
    this.viewModelFactory = viewModelFactory;
  }

  public void start()
  {

  }

  public void openLogsView()
  {
    FXMLLoader loader = new FXMLLoader();
    if (logsView == null)
    {
      Parent root = getRootByPath("../view/logs/Logs.fxml", loader);
      LogsController controller = loader.getController();
      controller.init(this, viewModelFactory.getLogsViewModel());
      logsView = new Scene(root);
    }
    currentStage.setTitle("Logs");
    currentStage.setScene(logsView);
  }

  public void openManageView()
  {
    FXMLLoader loader = new FXMLLoader();
    if (manageView == null)
    {
      Parent root = getRootByPath("../view/manage/Manage.fxml", loader);
      ManageController controller = loader.getController();
      controller.init(this, viewModelFactory.getManageViewModel());
      manageView = new Scene(root);
    }
    currentStage.setTitle("Management");
    currentStage.setScene(manageView);
  }

  private Parent getRootByPath(String path, FXMLLoader loader)
  {
    loader.setLocation(getClass().getResource(path));
    Parent root = null;
    try
    {
      root = loader.load();
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    return root;
}
