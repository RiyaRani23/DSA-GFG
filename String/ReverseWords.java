public class ReverseWords {
     public String reverseWords(String s) {
        // Code here
       
    String[] result = s.split("\\.");
    StringBuilder sb = new StringBuilder();
   
    for (int i = result.length - 1; i >= 0; i--) {
        if (!result[i].isEmpty()) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(result[i]);
        }
    }
    
    return sb.toString();
   }
}
