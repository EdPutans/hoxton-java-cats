import java.util.ArrayList;

public class Cat {
  public Integer age;
  public String name;
  public Boolean likesCuddles;
  public String favouriteToy;
  public Owner owner;

  public static ArrayList<Cat> cats = new ArrayList<Cat>();

  public Cat(Integer age, String name, Boolean likesCuddles, String favouriteToy, Owner owner) {
    this.age = age;
    this.name = name;
    this.likesCuddles = likesCuddles;
    this.favouriteToy = favouriteToy;
    this.owner = owner;

    cats.add(this);
  }

  public void printData() {
    System.out.print(this.toString());
  }

  @Override
  public String toString() {
    String cuddlesSubString = this.name + (this.likesCuddles ? " likes cuddles" : " doesn't like cuddles");
    String catData = String.format(
        "This is %s, who is %s year(s) old. %s. This cat's favourite toy is %s. The cat's owner's name is %s, who is %s and lives on %s \n",
        this.name,
        this.age,
        cuddlesSubString,
        this.favouriteToy,
        this.owner.name,
        this.owner.age,
        this.owner.address);

    return catData;
  }
}
