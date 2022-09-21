
package convertdatatype;
/**
 *<h1>Convert Data Type</h1>
 * Usage of parsing or casting data type
 * 
 * @author  Hafizh
 * @version 1.0
 * @since   2022-08-29
 */
public class ConvertDataType {
    static short methodOne(long l){
        int i = (int) l;
        return (short) i;
    }
    public static void main(String[] args) {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}
