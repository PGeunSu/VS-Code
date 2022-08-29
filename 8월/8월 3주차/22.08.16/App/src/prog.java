import java.util.*;

public class prog {
    public static void main(String[] args) {
        LinkedList<String> linkList = new LinkedList<String>();

        linkList.add("넷");
        linkList.add("둘");
        linkList.add("셋");
        linkList.add("하나");

        for (int i = 0; i < linkList.size(); i++) {
            System.out.print(linkList.get(i) + " "); // 넷 둘 셋 하나
        }
        System.out.println("\n====================================");

        for (String e : linkList) { // for each문
            System.out.print(e + " ");
        }

        System.out.println("\n====================================");

    }
}
