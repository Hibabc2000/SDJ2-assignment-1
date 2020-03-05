package core;

import mediator.MainModel;
import mediator.MainModelImplementation;

public class ModelFactory
{
  MainModel model;

  MainModel getMainModel()
  {
    if(model == null)
      return new MainModelImplementation();
    return model;
  }
}
