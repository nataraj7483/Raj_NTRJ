package com.xworkz.copy.boot;

import com.xworkz.copy.code.Song;

public class SongRunner {

	public static void main(String[] args) {
		
		Song Song1=new Song();
		System.out.println(Song1.name);
		System.out.println(Song1.language);
		System.out.println(Song1.singer);
		System.out.println(Song1.type);
		System.out.println(Song1.lyrics);
		
		Song1.name="Savi savi nenapu";
		Song1.language="Kannada";
		Song1.singer="Hariharan";
		Song1.type="My autograph";
		Song1.lyrics="K Kalyan";
		System.out.println(Song1.name);
		System.out.println(Song1.language);
		System.out.println(Song1.singer);
		System.out.println(Song1.type);
		System.out.println(Song1.lyrics);
		
		
		
		
		
				

	}

}
