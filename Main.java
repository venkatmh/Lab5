import java.util.ArrayList;
class Main {
  public static void main(String[] args) {

    //Student 1

    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    //call to print method

    student1.print();

    //Student 2 - me

    Student student2 = new Student();

    student2.setName("Mahathi Venkatesh");
    student2.setGPA(4.3);
    student2.setMajor("Information Systems");

    student2.print();

    //average GPA loop through ArrayList

    ArrayList<Double> gpas = new ArrayList<Double>(); 
    gpas.add(student1.gpa);
    gpas.add(student2.gpa);

    double sum = 0;

    for(int i = 0; i < gpas.size(); i++){
      sum = sum + gpas.get(i);
      //test - System.out.println(sum);
    }

    double average = sum/gpas.size();
    System.out.println("The average GPA is " + average);

  }
}