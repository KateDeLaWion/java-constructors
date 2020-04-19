public class Main {

    public static class Student{
        int age;
        String name;
        String hobby;

        public Student(int age, String name, String hobby){
            this.age = age;
            this.name = name;
            this.hobby = hobby;
        }
    }


    public static void main(String[] args) {
        Student niecey = new Student( 99,  "Niecey", "tattoo" );
        System.out.println("Hi her name is " + niecey.name);
        System.out.println("Her age is " + niecey.age);
        System.out.println("Her hobby is " + niecey.hobby);
    }


}
