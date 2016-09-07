
public class songLyricsOLF {

	public static void main(String[] args) {
//First verse
		mainLine();
		System.out.print("fly, \n");
		System.out.println("I don't know why she swallowed a fly,");
		dieLine();
		space();
//Second Verse
		mainLine();
		System.out.print("spider, \n");
		wriggle3Lines();
		space();
//Third Verse
		mainLine();
		System.out.print("bird, \n");
		System.out.println("How absurd! to swallow a bird.");
		birdLine();
		space();
//Fourth Verse
		mainLine();
		System.out.print("cat, \n");
		System.out.println("Imagine that! to swallow a cat.");
		catLine();
		space();
//Fifth Verse
		mainLine();
		System.out.print("dog, \n");
		System.out.println("What a hog! to swallow a dog");
		dogLine();
		space();
//Sixth Verse
		mainLine();
		System.out.print("goat, \n");
		System.out.println("Just opened her throat! to swallow a goat");
		goatLine();
		space();
//Seventh Verse
		mainLine();
		System.out.print("cow, \n");
		System.out.println("I don't know how she swallowed a cow!");
		System.out.println("She swallowed the cow to catch the goat,");
		goatLine();
		space();
//Eighth Verse
		mainLine();
		System.out.print("horse, \n");
		System.out.println("She's dead-of course!");
		space();
	}
	
	public static void mainLine() {
		System.out.print("There was an old woman who swallowed a ");
	}
	
	public static void dieLine() {
		System.out.println("Pheraphs she'll die.");
	}
	
	public static void wriggle3Lines() {
		System.out.println("That wriggled and jiggled and tickled inside her,");
		System.out.println("She swallowed the spider to catch the fly,");
		System.out.println("I don't know why she swallowed the fly,");
		dieLine();
	}
	
	public static void birdLine() {
		System.out.println("She swallowed the bird to catch the spider,");
		wriggle3Lines();
	}
	
	public static void catLine() {
		System.out.println("She swallowed the cat to catch the bird,");
		birdLine();
	}
	
	public static void dogLine() {
		System.out.println("She swallowed the dog to catch the cat,");
		catLine();
	}
	
	public static void goatLine() {
		System.out.println("She swallowed the goat to catch the dog,");
		dogLine();
	}
	
	public static void space() {
		System.out.println();
	}
	
}
