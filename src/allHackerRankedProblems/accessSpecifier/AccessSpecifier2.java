package allHackerRankedProblems.accessSpecifier;

import allJavaProblems.accessSpecifiers.AccessSpecifier;

public class AccessSpecifier2 {

    public static void main(String[] args) {

        // b variable is protected. So, we can access the b variable within the package only.

        // c variable is private. So, we can access the C variable within the Class only.

        // d variable is default. So , we can access the d variable within the Package only.

        // e variable is local Variable. we can acces a within the Method only.

        System.out.println(AccessSpecifier.a );
    }
}
