package ja111.web20z.day8;

public class _1WeProblem {
    //Let’s Override the equals and hashCode method inside the Student class,
    // to make 2 student object equal logically if their roll, name and marks is same.
    // so that if we try to add 2 student objects inside a HashSet or
    // LinkedHashSet class, then it will ignore the duplicate student object.
}
    class Student {

        private int roll;
        private String name;
        private int marks;

        public Student() {
        }

        public Student(int roll, String name, int marks) {
            this.roll = roll;
            this.name = name;
            this.marks = marks;
        }
    }

