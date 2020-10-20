package chats;

import java.util.*;

public class TypeTester {

  public static void main(String[] args) {

    String[][] test_str = new String[20][40];

    test_str[0] = new String[] { "H", "e", "y", "!" };
    test_str[1] = new String[] { "T", "e", "S", "t", "I", "n", "G" };
    test_str[2] = new String[] { "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "}", "{" };
    test_str[3] = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "<", ">", "?", "/" };
    test_str[4] = new String[] { ",", ".", "/", "\\", ";", ":", "\"", "\'", "\\|", "~", "`", ">", "\n", "/" };

    ChatTyper typetest = new ChatTyper();
    typetest.typeChats(test_str);

  }

}
