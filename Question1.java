package basicprgs;

public class Question1 {

	public static void main(String[] args) {
		
		        byte byteVar = 10;
		        short shortVar = 1000;
		        int intVar = 100000;
		        long longVar = 10000000000L;
		        float floatVar = 10.5f;
		        double doubleVar = 123.456;
		        char charVar = 'A';
		        boolean booleanVar = true;

		        System.out.println("Primitive Data Types in Java:");
		        System.out.println("-----------------------------------");
		        System.out.println("byte    : " + byteVar + "   | Size: " + Byte.BYTES + " bytes");
		        System.out.println("short   : " + shortVar + " | Size: " + Short.BYTES + " bytes");
		        System.out.println("int     : " + intVar + "    | Size: " + Integer.BYTES + " bytes");
		        System.out.println("long    : " + longVar + "   | Size: " + Long.BYTES + " bytes");
		        System.out.println("float   : " + floatVar + "  | Size: " + Float.BYTES + " bytes");
		        System.out.println("double  : " + doubleVar + " | Size: " + Double.BYTES + " bytes");
		        System.out.println("char    : " + charVar + "   | Size: " + Character.BYTES + " bytes");
		        System.out.println("boolean : " + booleanVar + "| Size: JVM-dependent (not fixed)");
		    }
		}


	
