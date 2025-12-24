/*
 * @author Ravi
 */
public class NitStudentSisBooleanUtil_V1 {

	public static void main(String[] args) {
		boolean v1 = SisBooleanUtil.parseBoolean("true");
		boolean v2 = SisBooleanUtil.parseBoolean("ha");
		boolean v3 = SisBooleanUtil.parseBoolean("yes");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		boolean v4 = SisBooleanUtil.parseBoolean("false");
		boolean v5 = SisBooleanUtil.parseBoolean("na");
		boolean v6 = SisBooleanUtil.parseBoolean("no");
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
	}

}
