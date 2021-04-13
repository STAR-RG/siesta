package stringbuilderexample;

public class StringBuilderSingleThreadDemo {
	
	private static StringBuilder builder = new StringBuilder("");
	
	public void appending() {
		for (int i = 0; i < 2000; i++) {
			this.append(Integer.toString(i));
			this.append(", ");
			this.appendBeginning("-"+i);
		}
	}
	
	public void append(String str) {
		StringBuilderSingleThreadDemo.builder.append(str);
	}
	
	public void appendBeginning(String str) {
		StringBuilderSingleThreadDemo.builder.insert(0,str);
	}
	
	public String getStringBuilderContent() {
		return StringBuilderSingleThreadDemo.builder.toString();
	}
	
	public static void main(String[] args) {
		StringBuilderSingleThreadDemo sbSingleThreadObj1 = new StringBuilderSingleThreadDemo();
		StringBuilderSingleThreadDemo sbSingleThreadObj2 = new StringBuilderSingleThreadDemo();
		
		sbSingleThreadObj1.appending();
		sbSingleThreadObj2.appending();
		
        System.out.println("Finally builder: " + StringBuilderSingleThreadDemo.builder.toString());
	}

}
