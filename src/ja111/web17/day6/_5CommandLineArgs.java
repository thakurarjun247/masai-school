package ja111.web17.day6;

public class _5CommandLineArgs {
    public static void main(String[] args) {
        //String[] args = {"this", "is", "a", "line"};
        //						0, 1, 		2, 3

		/*
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			System.out.println(args[3]);
			*/

        String s0 = args[0];// "10"
        String s1 = args[1];// "20"

        //parse them
        int i0 = Integer.parseInt(s0); // "10" -> 10
        int i1 = Integer.parseInt(s1);
        System.out.println(i0 + i1);
    }
}
