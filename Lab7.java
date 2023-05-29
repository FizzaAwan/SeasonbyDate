/** 
   Write an algorithm yields the season (Spring, Summer, Fall, or Winter) 
   for a given month and day.
*/
import java.util.Scanner;
public class Lab7
{
public static void main(String[] args){
Scanner in = new Scanner(System.in);

System.out.print("Enter number of month ");
int month = in.nextInt();

System.out.println("Enter number for the day ");
int day = in.nextInt();
/*
  If month is 1, 2, or 3, season = "Winter"
  Else if month is 4, 5, or 6, season = "Spring"
  Else if month is 7, 8, or 9, season = "Summer"
  Else if month is 10, 11, or 12, season = "Fall"
  If month is divisible by 3 and day >= 21
              If season is "Winter", season = "Spring"
              Else if season is "Spring", season = "Summer"
              Else if season is "Summer", season = "Fall"
              Else season = "Winter"  
*/
String season="";
if(1 <=month && month <=3){
    season= "Winter";
}else if(4<=month && month <=6){
    season= "Spring";
}else if(7<=month && month<=9){
    season= "Summer";
}else if(10<=month && month<=12){
    season= "Fall";
}
if(month%3==0 && day>=21){
    if(season=="Winter"){
        season="Spring";
    }else if(season=="Spring"){
        season="Summer";
    }else if(season=="Summer"){
        season="Fall";
    }else{season= "Winter";}
}
System.out.println("The season is "+season);
}
}
