package restartEverythingDSA2026;

public class TypeConversionDemo {

    public static void main(String[] args) {

        // ==============================
        // 1️⃣ parseInt()  (String ➜ int)
        // ==============================

        String strNumber = "100";
        int num1 = Integer.parseInt(strNumber);
        System.out.println("parseInt result: " + num1);


        // ==============================
        // 2️⃣ valueOf()  (String ➜ Integer Object)
        // ==============================

        String str2 = "200";
        Integer num2 = Integer.valueOf(str2);
        System.out.println("valueOf result: " + num2);


        // ==============================
        // 3️⃣ toString()  (int ➜ String)
        // ==============================

        int number = 300;
        String str3 = Integer.toString(number);
        System.out.println("toString result: " + str3);


        // ==============================
        // 4️⃣ charAt()  (String ➜ char)
        // ==============================

        String name = "Vishal";
        char firstChar = name.charAt(0);
        System.out.println("charAt result: " + firstChar);


        // ==============================
        // 5️⃣ Type Casting
        // ==============================

        double d = 10.5;
        int castedInt = (int) d;   // Explicit Casting
        System.out.println("Type Casting result: " + castedInt);


        // ==============================
        // 6️⃣ Autoboxing
        // ==============================

        int primitiveInt = 50;
        Integer objectInt = primitiveInt;   // Autoboxing
        System.out.println("Autoboxing result: " + objectInt);


        // ==============================
        // 7️⃣ Unboxing
        // ==============================

        Integer objectValue = 60;
        int primitiveValue = objectValue;   // Unboxing
        System.out.println("Unboxing result: " + primitiveValue);
    }
}