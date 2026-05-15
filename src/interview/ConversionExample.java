package interview;

public class ConversionExample {
    public static void main(String[] args) {
    	
    	numerics();
        String numberStr = "12345";
        String decimalStr = "12345.67";

        // === Integer ===
        int intPrimitive = Integer.parseInt(numberStr);         // primitive int
        Integer intWrapper = Integer.valueOf(numberStr);        // Integer wrapper

        // === Long ===
        long longPrimitive = Long.parseLong(numberStr);         // primitive long
        Long longWrapper = Long.valueOf(numberStr);             // Long wrapper

        // === Double ===
        double doublePrimitive = Double.parseDouble(decimalStr); // primitive double
        Double doubleWrapper = Double.valueOf(decimalStr);       // Double wrapper

        // === Float ===
        float floatPrimitive = Float.parseFloat(decimalStr);     // primitive float
        Float floatWrapper = Float.valueOf(decimalStr);          // Float wrapper

        // === Output all values ===
        System.out.println("int (primitive): " + intPrimitive);
        System.out.println("Integer (wrapper): " + intWrapper);
        System.out.println("long (primitive): " + longPrimitive);
        System.out.println("Long (wrapper): " + longWrapper);
        System.out.println("double (primitive): " + doublePrimitive);
        System.out.println("Double (wrapper): " + doubleWrapper);
        System.out.println("float (primitive): " + floatPrimitive);
        System.out.println("Float (wrapper): " + floatWrapper);
        
     // === long ===
        long longVal = 123456789L;             // 'L' is required for long literals
        Long longWrar = 123456789L;         // Auto-boxing into wrapper class

        // === float ===
        float floatVal = 12.34f;               // 'f' or 'F' is required
        Float floatWrer = 12.34f;           // Auto-boxing

        // === double ===
        double doubleVal = 56.78;              // Default decimal literal is double
        Double doubleWr = 56.78;          // Auto-boxing

        float f = 25.5f;
        double d = f;           // implicit widening conversion (float → double)
        float f2 = (float) d;   // explicit narrowing (double → float)
        int i = 100;
        long l = i;                 // int to long (implicit)
        double d2 = i;              // int to double (implicit)
        float f3 = i;               // int to float (implicit)

        long l2 = 9999L;
        float f4 = l2;              // long to float (implicit)
        double d3 = l2;             // long to double (implicit)

        double d4 = 123.456;
        long l3 = (long) d4;        // double to long (explicit)
        float f5 = (float) d4;      // double to float (explicit)

        // bsil fd
    }

	private static void numerics() {
		
		// remember below syntax
		// TODO Auto-generated method stub
		long l = 5000L;
        float f = l; // implicit long → float
        double d = f; // implicit float → double

        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);

        // Now convert back manually using casting
        float fBack = (float) d;
        long lBack = (long) fBack;

        System.out.println("Back to Float: " + fBack);
        System.out.println("Back to Long: " + lBack);
	}
}
