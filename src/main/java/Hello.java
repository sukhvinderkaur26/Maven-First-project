import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hi");
        //Collection collection=new ArrayList();
        Collection<String > collection=new ArrayList();
        //collection.add(2);
        collection.add("Sukhi");
        for (String s:collection)
        {
            System.out.println(s.toUpperCase(Locale.ROOT));
        }
        List<String> list=new ArrayList<>();
        list.add("sukhi");
        list.add("kaur");
        list.add("Baajveer");
        list.add("Singh");
    }
}
