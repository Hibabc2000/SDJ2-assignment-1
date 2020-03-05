package view.logs;

import core.ViewHandler;
import core.ViewModelFactory;

public class LogsController
{







  private LogsViewModel logsViewModel;

  public void init(ViewHandler viewHandler, ViewModelFactory viewModelFactory)
  {



    this.logsViewModel = viewModelFactory.getManageViewModel;
    this.viewHandler = viewHandler;
  }


}
