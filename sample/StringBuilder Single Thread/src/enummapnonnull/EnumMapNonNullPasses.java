package enummapnonnull;

import java.util.EnumMap;


public class EnumMapNonNullPasses {
    public enum BlahEnum {BLAH, BLAH_2};
    public static void main(String[] args) {
        EnumMap<BlahEnum, String> testMap = new EnumMap<BlahEnum, String>(BlahEnum.class);
        testMap.put(BlahEnum.BLAH, "blah");
        testMap.put(BlahEnum.BLAH_2, "blah_2");
    }
}
