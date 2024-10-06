package DSA100Challenge;

public class CopyConstructorInJava {

        int id;
        String name;
        //constructor to initialize integer and string
        CopyConstructorInJava (int i,String n){
            id = i;
            name = n;
        }
        //constructor to initialize another object
        CopyConstructorInJava(CopyConstructorInJava s){
            id = s.id;
            name =s.name;
        }
        void display(){System.out.println(id+" "+name);}

        public static void main(String args[]){
            CopyConstructorInJava s1 = new CopyConstructorInJava(111,"Karan");
            CopyConstructorInJava s2 = new CopyConstructorInJava(s1);
            s1.display();
            s2.display();
        }
    }

