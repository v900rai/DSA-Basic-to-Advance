package DSA100Challenge;

public class staticvariable {

        int rollno;
        String name;
        static String college ="ITS";

       staticvariable(int r,String n){
            rollno = r;
            name = n;
        }
        void display (){System.out.println(rollno+" "+name+" "+college);}

        public static void main(String args[]){
            staticvariable s1 = new  staticvariable(111,"Karan");
            staticvariable s2 = new  staticvariable(222,"Aryan");


            s1.display();
            s2.display();
        }
    }

