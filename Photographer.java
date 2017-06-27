import java.util.*;

public class Photographer{

  public String name;
  public ArrayList<Camera> cameras;

  public Photographer(String name){
    this.name = name;
    this.cameras = new ArrayList<Camera>();
  }

  public void addCamera(Camera cam) {
    cameras.add(cam);
  }


  public void removeCamera(Camera cam) {
    cameras.remove(cam);
  }



}