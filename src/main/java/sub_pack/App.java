package sub_pack;

import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args){

        //(boolean isSomething, char ch, short shortNum, int intNum, long longNum, double doubNum, float floatNum, String strField) 
        TheClass theObj = new TheClass(true, 'M', (short)51, Integer.MAX_VALUE, 111_222_333, 123.456, 11.22f, "some text");
        try {
            System.out.print(Serializer.serialize(theObj));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
