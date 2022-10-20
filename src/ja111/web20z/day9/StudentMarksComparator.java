package ja111.web20z.day9;

import java.util.Comparator;

public class StudentMarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        if(s1.getMarks()>s2.getMarks())
            return 1;
        else if(s1.getMarks()<s2.getMarks())
            return -1;
        else
            return 0;
    }
}
//Comparable compareTo
//Comparator compare

//# You Problem:
//
//- Create a Employee Bean class with following 3 fields:
//
//    int empId, String name, int salary.
//
//- Implement the Comparable interface within the Employee class and define the sorting logic according to the salary,
// and if 2 Employee salary is same then sort them according to their name.
//- Create a Main class with main method and inside the main class create a TreeSet class object
// which can hold multiple Employee object.
//- Add 5 Employee object with some dummy data and print each Each Employee object one by one from the TreeSet object.
