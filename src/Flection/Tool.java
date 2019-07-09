package Flection;

import java.lang.reflect.Field;

public class Tool {
	public void tool(Object obj,String field,Object data) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class c = obj.getClass();
		Field Fieldname = c.getDeclaredField(field);
		Fieldname.setAccessible(true);
		Fieldname.set(obj, data);
		
		
	}
}
