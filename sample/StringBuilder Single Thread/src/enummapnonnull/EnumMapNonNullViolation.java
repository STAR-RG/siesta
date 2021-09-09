package enummapnonnull;

import java.util.EnumMap;

public class EnumMapNonNullViolation{

    public enum BlahEnum {BLAH, BLAH_2};
    public static void main(String[] args) {
        EnumMap<BlahEnum, String> testMap = new EnumMap<BlahEnum, String>(BlahEnum.class);
        testMap.put(null, null);
    }
}
