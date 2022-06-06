// package part3.chapter8_2;


// public class Main {



 
// public class Location{}
// public abstract class GPS{
//   public abstract Location findCurrentLocation();
// }

// public  class CheapGPS extends GPS{
//   public Location findCurrentLocation(){
//     System.out.println("Find current location with Cheap GPS");
//     return null;
//   }
// }

// public  class ExpensiveGPS extends GPS{
//   public Location findCurrentLocation(){
//     System.out.println("Find current location with Expensive GPS");
//     return null;
//   }
// }

// public abstract class Map{}
// public class SmallMap extends Map{}
// public class LargeMap extends Map{}

// public abstract class Screen{
//   public abstract void drawMap (Map map);
// }

// public class SDScreen extends Screen{
//   public void drawMap(Map map){
//     System.out.println("Draw map "+ map.getClass().getName()+" on SD screen");
//   }
// }
// public class HDScreen extends Screen{
//   public void drawMap(Map map){
//     System.out.println("Draw map "+ map.getClass().getName()+ " on HD screen");
//   }
// }
// public class Path{}

// public abstract class PathFinder{
//   public abstract Path findPath(Location from, Location to );
// }

// public class SlowPathFinder extends PathFinder{
//   public Path findPath(Location from, Location to ){
//     System.out.println("Slow Path Finder");
//     return null;
//   }
// }

// public class FastPathFinder extends PathFinder{
//   public Path findPath(Location from, Location to){
//     System.out.println("Fast Path Finder");
//     return null;
//   }
// }
// public static void main(String[] args){
//   GPS gps = new CheapGPS();
//   Screen mapScreen = new SDScreen();
//   PathFinder pathFinder = new SlowPathFinder();

//   Map map =new SmallMap();
//   mapScreen.drawMap(map);

//   Location l1 = gps.findCurrentLocation();
//   Location l2 = gps.findCurrentLocation();

//   pathFinder.findPath(l1, l2);
// }
  
// }