import java.io.File;

public class FileAttr {
	public static void main(String[] args) {
		File f1 = new File("f:\\");
		System.out.println("File Name:" + f1.getName());
		System.out.println("Path: " + f1.getAbsolutePath());
		System.out.println(f1.getParent());
		System.out.println(f1.exists());
		System.out.println(f1.canWrite());
		System.out.println(f1.canRead());
		System.out.println(f1.isDirectory());
		System.out.println(f1.lastModified());
		System.out.println(f1.length());

	}
}
