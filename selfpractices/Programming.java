package selfpractices;

abstract class Programming {
    public  abstract void Developer();
}
class HTML extends Programming{
    @Override

    public  void Developer (){

        System.out.println("Tin Barnner Li");


    }
}
class JAVA extends Programming{
    @Override
    public void Developer(){
        System.out.println("James Gosling");
    }


}
class ppp {
    public static void main(String[] args) {
        HTML h=new HTML();
        h.Developer();
        JAVA j=new JAVA();
        j.Developer();

    }
}