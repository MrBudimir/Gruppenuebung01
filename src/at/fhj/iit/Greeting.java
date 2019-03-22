package at.fhj.iit;

public class Greeting implements Greeter {
  // Member Variable
  private String name;

  @Override
  public void sayHello(){
    System.out.println("Hello, " + this.name + "!");
  }

  @Override
  public void sayGoodbye(){
    System.out.println("Good Bye, " + this.name + "!");
  }

  // Constructor
  public Greeting(String name){
    this.name = name;
  }


}
