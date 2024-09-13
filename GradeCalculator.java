public class GradeCalculator
{
  public static void main(String[] args)
  {
    // kathleen has infiltrated and worked on this too
    String course = "AP Chemistry";
    int timeavgmin = 200;
    double timeavghr = timeavgmin/60;
    int hw1 = 50;
    int hw2 = 70;
    int hw3 = 90;
    int hw4 = 85;
    double hwavg = (hw1 + hw2 + hw3 + hw4) / 4;
    double quiz1 = 97.5;
    double quiz2 = 89.3;
    double qzavg = (quiz1 + quiz2) / 2;
    double finalgrade = 99.9;
    int overallgrade = (int)((hwavg * 0.35) + (qzavg * 0.15) + (finalgrade * 0.5) + 0.5);
    System.out.println("Course Name: " + course);
    System.out.println("Average time spent in a week for this course in minutes: " + timeavgmin);
    System.out.println("Average time spent in a week for this course in hours: " + timeavghr);
    System.out.println("The average homework grade received was: " + hwavg);
    System.out.println("The average quiz grade received was: " + qzavg);
    System.out.println("The final exam grade was: " + finalgrade);
    System.out.println("Overall Grade: " + overallgrade);

    
  }
}
