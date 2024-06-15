package JavaInterViewProgram100VVI;

import javax.management.monitor.StringMonitor;

public class ConstructorParameters {
    int modelyear;
    String modelName;
    public ConstructorParameters(int modelyear , String modelName){
        this.modelName=modelName;
        this.modelyear=modelyear;
    }

    public static void main(String[] args) {
        ConstructorParameters constructor=new ConstructorParameters(2002,"ramlala");
        System.out.println(constructor.modelName+"    "+constructor.modelyear);
    }
}
