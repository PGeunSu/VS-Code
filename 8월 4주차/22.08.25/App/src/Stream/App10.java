import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class App10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Melon", "Grape", "Strawberry"));

        System.out.println(list); // [Apple, Banana, Melon, Grape, Strawberry]
        System.out.println(list.stream().map(s -> s.toUpperCase()).collect(Collectors.joining(" ")));
        // APPLE BANANA MELON GRAPE STRAWBERRY

        System.out.println(list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList()));
        // [APPLE, BANANA, MELON, GRAPE, STRAWBERRY]
        System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
        // [APPLE, BANANA, MELON, GRAPE, STRAWBERRY]

        list.stream().map(String::toUpperCase).forEach(s -> System.out.print(s + " "));
        // APPLE BANANA MELON GRAPE STRAWBERRY
    }
}