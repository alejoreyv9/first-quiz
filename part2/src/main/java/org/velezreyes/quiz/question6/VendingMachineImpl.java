package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private int quarters = 0;

  @Override
  public void insertQuarter() {
    quarters++;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
    if ("ScottCola".equals(name)) {
      if (quarters < 3) {
        throw new NotEnoughMoneyException();
      }
      quarters -= 3;
      return new DrinkImpl("ScottCola", true);
    } else if ("KarenTea".equals(name)) {
      if (quarters < 4) {
        throw new NotEnoughMoneyException();
      }
      quarters -= 4;
      return new DrinkImpl("KarenTea", false);
    } else {
      throw new UnknownDrinkException();
    }
  }

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }
}
