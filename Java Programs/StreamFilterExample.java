import java.util.*;
import java.util.stream.*;

public class StreamFilterExample {
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Vaibhav", "Vivek", "Ajay", "Ankit", "Vinay");
        // filter an names list that starts with V
       
        List<String> filteredNames = names.stream()               
                                          .filter(name -> name.startsWith("V")) 
                                          .collect(Collectors.toList());      

        System.out.println("Names starting with 'V': " + filteredNames);
    }
}
