package core;

import mediator.MainModel;
import mediator.MainModelImplementation;

public class ModelFactory
{
  private MainModel model;

  public MainModel getMainModel()
  {
    if(model == null)
      return new MainModelImplementation();
    return model;
  }
}
