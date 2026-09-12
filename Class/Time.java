import java.util.*;

class Time {
  double hours;
  double minutes;

  Time(){
    hours = 0;
    minutes = 0;
  }

  void getTime() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the hour: ");
    hours = sc.nextDouble();

    System.out.print("Enter the minute: ");
    minutes = sc.nextDouble();

    //sc.close();
  }

  void putTime() {
    System.out.println("Hour: "+hours+" Minutes: "+minutes);
  }

  void add(Time T) {
    Time result = new Time();

    result.hours = hours + T.hours;
    result.minutes = minutes + T.minutes;

    if(result.minutes > 60) {
      // result.hours = result.hours + result.minutes / 60;
      result.minutes = result.minutes % 60;
      result.hours++;
    }

    System.out.println("Total Time: "+result.hours+" Hours and "+result.minutes+" Minutes");
  }

  public static void main(String[] args) {
    Time t1 = new Time();
    Time t2 = new Time();
    //Time t = new Time();

    t1.getTime();
    t2.getTime();

    t1.putTime();
    t2.putTime();

    //t = t1.add(t2);

    t1.add(t2);

  }


}