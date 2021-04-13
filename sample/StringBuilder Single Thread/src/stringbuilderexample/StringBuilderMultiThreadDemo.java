package stringbuilderexample;

public class StringBuilderMultiThreadDemo implements Runnable{
	
	private static StringBuilder builder = new StringBuilder("");

	@Override
	public void run() {
		this.appending();
	}
	
	public void appending() {
		for (int i = 0; i < 2000; i++) {
			this.append(Integer.toString(i));
			this.append(", ");
			this.appendBeginning("-"+i);
		}
	}
	
	public void append(String str) {
		StringBuilderMultiThreadDemo.builder.append(str);
	}
	
	public void appendBeginning(String str) {
		StringBuilderMultiThreadDemo.builder.insert(0,str);
	}
	
	public String getStringBuilderContent() {
		return StringBuilderMultiThreadDemo.builder.toString();
	}
	
	public static void main(String[] args) {
		StringBuilderMultiThreadDemo sbMultThreadObj1 = new StringBuilderMultiThreadDemo();
		StringBuilderMultiThreadDemo sbMultThreadObj2 = new StringBuilderMultiThreadDemo();

        Thread threadOne = new Thread(sbMultThreadObj1, "Thread One");
        Thread threadTwo = new Thread(sbMultThreadObj2, "Thread Two");
        threadOne.start();
        threadTwo.start();
 
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final builder: " + StringBuilderMultiThreadDemo.builder.toString());
	}

}
