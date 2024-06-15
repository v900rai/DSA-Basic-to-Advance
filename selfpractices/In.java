package selfpractices;

 interface Animal{
     public void animalSound();
     public void sleep();
}
class pig implements Animal{
     public void animalSound(){
         System.out.println("The pig says: wee wee");
     }
     public void sleep(){
         System.out.println("Zzz");
     }

}
class main{
    public static void main(String[] args) {
        pig p=new pig();
        p.animalSound();
        p.sleep();
    }
}