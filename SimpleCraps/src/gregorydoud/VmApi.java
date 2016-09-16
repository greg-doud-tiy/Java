package gregorydoud;
/* 
 * This is a virtual machine API. It is used to create compatibility
 * across .NET and Java
 */
public class VmApi {

	public static void WriteLine(String arg) {
		System.out.printf(arg);
	}
	public void WriteLine(String format, String... args) {
		
	}
}
