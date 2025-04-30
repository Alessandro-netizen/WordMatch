public class Main {
    public static void main(String[] args) {
        WordMatch game = new WordMatch("aabbcc");

        System.out.println("Score for 'ab': " + game.scoreGuess("ab"));
        System.out.println("Score for 'bb': " + game.scoreGuess("bb"));
        System.out.println("Score for 'abc': " + game.scoreGuess("abc"));
        System.out.println("Score for 'bca': " + game.scoreGuess("bca"));
        System.out.println("Score for 'aabbcc': " + game.scoreGuess("aabbcc"));
        System.out.println("Score for 'aa': " + game.scoreGuess("aa"));
        System.out.println("Score for 'cc': " + game.scoreGuess("cc"));

        System.out.println("\nBetter guess between 'ab' and 'bb': " + game.findBetterGuess("ab", "bb"));
        System.out.println("Better guess between 'abc' and 'bca': " + game.findBetterGuess("abc", "bca"));
        System.out.println("Better guess between 'aa' and 'cc': " + game.findBetterGuess("aa", "cc"));
        System.out.println("Better guess between 'ab' and 'abc': " + game.findBetterGuess("ab", "abc"));
        System.out.println("Better guess between 'ba' and 'ab': " + game.findBetterGuess("ba", "ab"));
        System.out.println("Better guess between 'cc' and 'aa': " + game.findBetterGuess("cc", "aa"));

        WordMatch w = new WordMatch("mississippi");
        System.out.println("\nScore for 'i' in 'mississippi': " + w.scoreGuess("i"));
        System.out.println("Score for 'iss' in 'mississippi': " + w.scoreGuess("iss"));
        System.out.println("Score for 'issipp' in 'mississippi': " + w.scoreGuess("issipp"));
        System.out.println("Score for 'mississippi' in 'mississippi': " + w.scoreGuess("mississippi"));

        WordMatch game2 = new WordMatch("concatenation");
        System.out.println("Score for 'ten' in 'concatenation': " + game2.scoreGuess("ten"));
        System.out.println("Score for 'nation' in 'concatenation': " + game2.scoreGuess("nation"));
        System.out.println("Better guess between 'ten' and 'nation': " + game2.findBetterGuess("ten", "nation"));
        System.out.println("Score for 'con' in 'concatenation': " + game2.scoreGuess("con"));
        System.out.println("Score for 'cat' in 'concatenation': " + game2.scoreGuess("cat"));
        System.out.println("Better guess between 'con' and 'cat': " + game2.findBetterGuess("con", "cat"));
    }
}
