/**
 * Что здесь не так? Объясните почему? Как можно поправить?
 */
public class BoxingPuzzle {

    public void puzzleMe() {
        Integer n = 6;
        Integer half = n / 2;
        Integer None = null;

        if (n == 6)
            System.out.println("Six little nigger boys playing with a hive;\n" +
                    "A bumble-bee stung one, and then there were five.");
        decrement(n);
        if (n == 5)
        System.out.println("Five little nigger boys going in for law;\n" +
                "One got in chancery, and then there were four.");
        decrement(n);

        if (n == 4)
        System.out.println("Four little nigger boys going out to sea;\n" +
                "A red herring swallowed one, and then there were three.");
        decrement(n);

        if (n == half)
            System.out.println("debug: Only half is left");

        if (n == 3)
            System.out.println("Three little nigger boys walking in the Zoo;\n" +
                    "A big bear hugged one, and then there were two.\n");
        decrement(n);

        if (n == 2)
        System.out.println("Two little nigger boys sitting in the sun; \n" +
                "One got frizzled up, and then there was one.");
        decrement(n);

        if (n == 1)
            System.out.println("One little nigger boy left all alone;\n" +
                    "He went out and hanged himself and then there were None.");
        decrement(n);

        if (n == 0)
            n = None;

        if (n == null)
            System.out.println("debug: Nothing left");
    }

    private Integer decrement(Integer i) {
        i--;
        return i;
    }
}
