public class ConversionExample {
    public static void main(String[] args) {
        // String -> StringBuffer
        String str = "Hello, World!";
        StringBuffer sbf = new StringBuffer(str);
        System.out.println("String to StringBuffer: " + sbf);

        // String -> StringBuilder
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String to StringBuilder: " + sb);

        // StringBuffer -> String
        String strFromSbf = sbf.toString();
        System.out.println("StringBuffer to String: " + strFromSbf);

        // StringBuilder -> String
        String strFromSb = sb.toString();
        System.out.println("StringBuilder to String: " + strFromSb);

        // StringBuffer -> StringBuilder
        StringBuilder sbFromSbf = new StringBuilder(sbf.toString());
        System.out.println("StringBuffer to StringBuilder: " + sbFromSbf);

        // StringBuilder -> StringBuffer
        StringBuffer sbfFromSb = new StringBuffer(sb.toString());
        System.out.println("StringBuilder to StringBuffer: " + sbfFromSb);
    }
}
