package arr_str;

public class str_methods {
	public static void main(String[] args) {
		
		String name="Rajasekhar";
		
		System.out.println(name.length());
		System.out.println(name.charAt(01));
		System.out.println(name.codePointAt(1));
		System.out.println(name.compareTo("rajasekhar"));
		System.out.println(name.compareToIgnoreCase("RAJASEKHAR"));
		System.out.println(name.concat("india"));
		System.out.println(name.contains("har"));
		System.out.println(name.contentEquals("r"));
		System.out.println(name.contentEquals("null"));
		System.out.println(name.endsWith("har"));
		System.out.println(name.equals("raja"));
		System.out.println(name.equals("rajasekhar"));
		System.out.println(name.equalsIgnoreCase("rajasekhar"));
		System.out.println("--------------");
		System.out.println(name.hashCode());
		System.out.println(name.indexOf('a'));
		System.out.println(name.lastIndexOf("r"));
		System.out.println(name.indexOf("a", 2));
		System.out.println(name.isEmpty());
		System.out.println(name.replace("e", "a"));
		System.out.println(name.substring(2));
		System.out.println(name.substring(2, 7));
		System.out.println(name.toUpperCase());
		
		String nm="   ra  ja   ";
		String nm1=nm.trim();
		System.out.println(nm.length());
		System.out.println(nm1.length());
		
		
		
		
	}

}
