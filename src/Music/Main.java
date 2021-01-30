package Music;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Guitar guitar = new Guitar();

        guitar.setTune();

        for(int item: guitar.getTension()){
            System.out.println(item);
        }

        guitar.printSong();

        for(int item: guitar.getTension()){
            System.out.println(item);
        }

    }
}
