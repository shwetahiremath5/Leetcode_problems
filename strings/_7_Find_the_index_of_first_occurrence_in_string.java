public class _7_Find_the_index_of_first_occurrence_in_string {
    public static int indexstring(String haystack,String needle){
        if(needle.equals(""))
        return 0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(indexstring(haystack, needle));
    }
}
