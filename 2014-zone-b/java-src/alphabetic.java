public class alphabetic implements ordering {
    public boolean compare(Object s, Object t){
        String s1 = "";
        String s2 = "";
        if(s instanceof String){
            s1 = (String) s;
        }
        if(t instanceof String){
            s2 = (String) t;
        }
        return s1.compareTo(s2) < 0;
    }
}
