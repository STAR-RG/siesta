package enummapnonnull;

import java.util.EnumMap;
import org.aspectjml.lang.annotation.siesta.Before;

public class EnumMapNonNullHandler {

	@Before("* java.util.EnumMap.put(..)")
	public static void vioEnumMap_NonNull(String name, boolean isStatic, Object[] args) {
		Object em = args[1];
		if(em == null) {
            throw new RuntimeException("Vio: enumMap doesn't accept a null key.");
		}

	}
	
}
