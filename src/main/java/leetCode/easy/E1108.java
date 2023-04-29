package leetCode.easy;

public class E1108 {

	public String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}
	public static void main (String[] args) {
		String test = "1.dwf.425.fef";
		System.out.println(new E1108().defangIPaddr(test));
	}
}
