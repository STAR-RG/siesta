package dictionaryobsolete;

import org.aspectjml.lang.annotation.siesta.Before;
import java.util.Dictionary;
import java.util.Map;

public class DictionaryObsoleteHandler {

	// Check for all methods usage (including constructors?)
    @Before("* java.util.Dictionary.*(..)")
    public static void vioDictionaryObsolete(String name, boolean isStatic, Object[] args) {
        Object sb = args[0];
        if (!(sb instanceof Map)) 
            throw new RuntimeException("Vio: extending dictionary is obsolete use the map interface instead.");
    }

}
