class CharToString{
	public static void main(String[] args) {
		char chr='a';
		//first method
		String str=Character.toString(chr);
                 //second method
                String str2=String.valueOf(chr);
		System.out.println(str);
		System.out.println(str2);
	}
}
