package String;

import javax.sound.midi.Soundbank;

interface Lambda{
    public String say();
}

public class LambdaExpression {
    public static void main(String args[]){
        Lambda l=()->{
            return " I have nothing to say ";
        };
        System.out.println(l.say());
    }


}
