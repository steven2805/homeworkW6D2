
public class DigitalCamera extends Camera implements Printable {
  private String name;
  private String filter;
  private String resolution;

  public DigitalCamera(String name,String filter,String resolution){
    this.name = name;
    this.filter = filter;
    this.resolution = resolution;
  }

  public void printDetails(){
    System.out.println( name + ","+filter + ","+ resolution);
  }

  public String name(){
    return name;
  }

}