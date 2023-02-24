package TheObjectClass;

public class Main extends Object {

    //ctl+b
    public static void main(String[] args) {

        Student king = new Student(24, "king");
        // System.out.println(king.toString());
        System.out.println(king);
        // haseCode

        SecondaryStudent king2 = new SecondaryStudent(10,"King2","Baadshah");
        System.out.println(king2);
    }
}

    // only one class in a java source file could be public.
    class Student {
        private String name;
        private int age;

        Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return name + age;
        }
    }

    class SecondaryStudent extends Student {

        private String Pname;

        SecondaryStudent(int age, String name,String pname) {
            super(age, name);
            this.Pname=Pname;
        }

        @Override
        public String toString() {
            return "SecondaryStudent{" +
                    "Pname='" + Pname + '\'' +
                    "} " + super.toString();
        }
    }