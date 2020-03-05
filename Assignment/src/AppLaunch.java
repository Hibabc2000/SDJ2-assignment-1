import core.ModelFactory;
import core.ViewHandler;
import core.ViewModelFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class AppLaunch extends Application
{
  @Override public void start(Stage stage)
  {
    ModelFactory mf = new ModelFactory();
    ViewModelFactory vmf = new ViewModelFactory(mf);
    ViewHandler handler = new ViewHandler(stage, vmf);
  }
}
