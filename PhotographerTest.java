import static org.junit.Assert.*;

import org.junit.*;


public class PhotographerTest{
  Photographer photographer;


  @Before 
  public void before(){
    photographer = new Photographer("sam");
  }

  @Test 
  public void testName(){
    assertEquals("sam", photographer.name);
  }


  @Test 
  public void testAddingCamera(){
    DigitalCamera cam = new DigitalCamera("Nikon 34T", "Noise reduction filter", "Hi-resolution");
    photographer.addCamera(cam);

    Camera getCam = photographer.cameras.get(0);
    assertEquals("Nikon 34T", getCam.name());
  }


  @Test 
  public void testRemoveCamera(){
    AnalogCamera cam = new AnalogCamera("Analog Nikon 34T", "Noise reduction filter", "Low-resolution");
    photographer.addCamera(cam);
    photographer.removeCamera(cam);

    assertEquals(0, photographer.cameras.size());
  }


}