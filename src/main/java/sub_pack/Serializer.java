package sub_pack;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

class Serializer {
    
    public static String serialize(Object theObj) throws IllegalAccessException {
        StringBuilder sb = new StringBuilder();
        
        sb.append("{\n");

        String objName = theObj.getClass().getSimpleName();

            sb.append("\"" + objName + "\": \n\t{\n");
            
            String comma = "";

            for ( Field field  : theObj.getClass().getDeclaredFields() ) {
                if(field.isAnnotationPresent(Transient.class)){
                    continue;
                }
                sb.append(comma);

                String fieldName = field.getName();            
                
                field.setAccessible(true);

                Object fieldValue = field.get(theObj);

                sb.append("\t\"").append(fieldName).append("\": ").append("\"").append(fieldValue).append("\"");            
                
                comma = ",\n";
            }

            sb.append("\n\t}");

        sb.append("\n}");
        //System.out.print(sb.toString());
        return sb.toString();
    }
}