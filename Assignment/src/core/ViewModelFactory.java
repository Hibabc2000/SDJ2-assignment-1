package core;

import javafx.stage.Stage;
import mediator.MainModelImplementation;

public class ViewModelFactory
{
  private ModelFactory modelFactory;
  private ManageViewModel manageViewModel;
  private LogsViewModel logsViewModel;

  public ViewModelFactory(ModelFactory mf)
  {
    this.modelFactory = mf;
  }

  public ManageViewModel getManageViewModel()
  {
    if(manageViewModel == null)
      return new ManageViewModel(new MainModelImplementation());
    return manageViewModel;
  }

  public LogsViewModel getLogsViewModel()
  {
    if (logsViewModel == null)
      return new LogsViewModel(new MainModelImplementation());
    return logsViewModel;
  }
}
