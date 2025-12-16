package com.learning.strings;

public class ReplaceStringWithNextLine {

	public static void main(String[] args) {
		//String str = "abc xpx ank vib \"ank bir sdf\" trt uui dgf gdgj \"jhj sddf sfsf sfs\"";
		String str = "abc";
		String out = "" ;
		int count = 1 ;
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == ' ' && count == 1) {
				System.out.println(out);
				out = "" ;
			} else if(str.charAt(i) == '\"') {
				if(count > 1) {
					count = 1 ;
					out = out + str.charAt(i);
					System.out.println(out);
					if((i + 1) < str.length()) {
						if(str.charAt(i + 1) == ' ') {
							i++ ;
						}
					}
					out = "" ;
				} else {
					out = out + str.charAt(i);
					count++ ;
				}
			} else {
				out = out + str.charAt(i);
				if((i + 1) == str.length()) {
					System.out.println(out);
				}
			}
		}
		
		String input = "abc xpx ank vib \"ank bir sdf\" trt uui dgf gdgj \"jhj sddf sfsf sfs\"";
		String[] splits = input.split(" (?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		for (int i = 0; i < splits.length; i++) {
			System.out.println(splits[i].trim());
		}

	}

}
