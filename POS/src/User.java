public class User {
  private String ID;
  private String password;
  private String name;
  private String surname;
  private long phoneNumber;
  private int authoryLevel;

  public User(String iD, String password, String name, String surname, Long phoneNumber, int authoryLevel) {
    ID = iD;
    this.password = password;
    this.name = name;
    this.surname = surname;
    this.phoneNumber = phoneNumber;
    this.authoryLevel = authoryLevel;
  }

  public String getID() {
    return ID;
  }

  public void setID(String iD) {
    ID = iD;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public long getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public int getAuthoryLevel() {
    return authoryLevel;
  }

  public void setAuthoryLevel(int authoryLevel) {
    this.authoryLevel = authoryLevel;
  }

}
