public abstract class Item {
  private String name;
  private float price;

  private int id;

  public Ingredients stock = Ingredients.getInstance();

  public Item(String name, float price) {
    this.name = name;
    this.price = price;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public float getPrice() {
    return this.price;
  }
}

class MealItem extends Item {

  public MealItem(String name, float price) {
    super(name, price);
  }
}

class DrinkItem extends Item {

  public DrinkItem(String name, float price) {
    super(name, price);
  }
}

class Burger extends MealItem {
  private String breadType;
  private String meatType;

  public Burger(String name, float price,
      String breadType, String meatType) {
    super(name, price);
    this.breadType = breadType;
    this.meatType = meatType;

    String[] ing = name.split(";");

    for (String string : ing) {
      if (string.equals("SingleBeef"))
        stock.decraseBy("Beef", 1);

      else if (string.equals("DoubleBeef"))
        stock.decraseBy("Beef", 2);

      else if (string.equals("SingleChicken"))
        stock.decraseBy("Chicken", 1);

      else if (string.equals("DoubleChicken"))
        stock.decraseBy("Chicken", 2);

      else if (string.equals("PlainBread"))
        stock.decraseBy("PlainBread", 1);

      else if (string.equals("SesameBread"))
        stock.decraseBy("SesameBread", 1);

    }
  }
}

class Pizza extends MealItem {
  private String doughType;
  private String volume;

  public Pizza(String name, float price,
      String doughType, String volume) {
    super(name, price);
    this.doughType = doughType;
    this.volume = volume;

    String[] ing = name.split(";");

    for (String string : ing) {
      if (string.equals("FlatBread"))
        stock.decraseBy("FlatBread", 1);

      else if (string.equals("YeastedBread"))
        stock.decraseBy("YeastedBread", 1);

      else if (string.equals("Small"))
        stock.decraseBy("PizzaDough", 1);

      else if (string.equals("Medium"))
        stock.decraseBy("PizzaDough", 2);

      else if (string.equals("Large"))
        stock.decraseBy("PizzaDough", 3);

    }
  }
}

class Pasta extends MealItem {
  private String sauceType;
  private String pastaType;

  public Pasta(String name, float price,
      String sauceType, String pastaType) {
    super(name, price);
    this.sauceType = sauceType;
    this.pastaType = pastaType;

    String[] ing = name.split(";");

    for (String string : ing) {
      if (string.equals("AlfredoSauce"))
        stock.decraseBy("AlfredoSauce", 1);

      else if (string.equals("TomatoSauce"))
        stock.decraseBy("TomatoSauce", 1);

      else if (string.equals("Farfalle"))
        stock.decraseBy("Farfalle", 1);

      else if (string.equals("Fusilli"))
        stock.decraseBy("Fusilli", 1);

      else if (string.equals("Spaghetti"))
        stock.decraseBy("Spaghetti", 1);

    }
  }
}

class Beer extends DrinkItem {
  private String brandType;
  private String bottleType;
  private double volume;

  public Beer(String name, float price,
      String brandType, String bottleType, double volume) {
    super(name, price);
    this.brandType = brandType;
    this.bottleType = bottleType;
    this.volume = volume;

    String[] ing = name.split(";");
    double amount = volume;

    for (String string : ing) {
      if (string.equals("Tuborug"))
        stock.decraseBy("Tuborug", amount);

      else if (string.equals("Efeys"))
        stock.decraseBy("Efeys", amount);

      else if (string.equals("Karlsberg"))
        stock.decraseBy("Karlsberg", amount);

      if (string.equals("Can")) {
        stock.decraseBy("Can", 1);        stock.decraseBy("Can", 1);

      }
    }
  }
}

class Cocktail extends DrinkItem {
  private String glassType;

  public Cocktail(String name, float price,
      String glassType) {
    super(name, price);
    this.glassType = glassType;

    String[] ing = name.split(";");
    double amount = 0.04;

    if (glassType.equals("LongGlass"))
      amount *= 2;

    for (String string : ing) {
      if (string.equals("Vodka"))
        stock.decraseBy("Vodka", amount);

      else if (string.equals("Gin"))
        stock.decraseBy("Gin", amount);

      else if (string.equals("Tequila"))
        stock.decraseBy("Tequila", amount);

      else if (string.equals("Rom"))
        stock.decraseBy("Rom", amount);

      else if (string.equals("Soda"))
        stock.decraseBy("Soda", amount);

      else if (string.equals("Lime"))
        stock.decraseBy("Lime", 0.5);

      else if (string.equals("Salt"))
        stock.decraseBy("Salt", 0.01);

    }
  }
}

class Wine extends DrinkItem {
  private String brandType;
  private String glassType;

  public Wine(String name, float price,
      String brandType, String glassType) {
    super(name, price);
    this.brandType = brandType;
    this.glassType = glassType;

    String[] ing = name.split(";");
    double amount = 0.5;

    if (glassType.equals("Bottle"))
      amount *= 2;

    for (String string : ing) {
      if (string.equals("DolucaRed"))
        stock.decraseBy("DolucaRed", amount);

      else if (string.equals("BuzbagRed"))
        stock.decraseBy("BuzbagRed", amount);

      else if (string.equals("BuzbagRose"))
        stock.decraseBy("BuzbagRose", amount);
    }
  }

  
}