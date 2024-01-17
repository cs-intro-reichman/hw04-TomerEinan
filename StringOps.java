public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) {
        String nstr = "";
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == 97 || string.charAt(i) == 101 || string.charAt(i) == 105 || string.charAt(i) == 111 ||
                string.charAt(i) == 117){
                char big = (char) (string.charAt(i) - 32);   
                string = string.substring(0,i) + big + string.substring(i + 1);        }
            if (string.charAt(i) < 91 && string.charAt(i) > 65){
                if (string.charAt(i) != 69 && string.charAt(i) != 73 && string.charAt(i) != 79&&
                 string.charAt(i) != 85)
                {
                    char small = (char) (string.charAt(i) + 32);
                    string = string.substring(0,i) + small + string.substring(i + 1); 
                }
            }
            nstr += string.charAt(i);
            }
        return nstr;
    }

    public static String camelCase (String string) {
        boolean space = false;
        int i = 0;
        String news = "";
        char big = 2;
        while (!space){
            if (string.charAt(i) != 32){
                    big = char (string.charAt(i));
                    if (string.charAt(i) < 91 && string.charAt (i) > 64){
                        big = (char) (string.charAt(i) + 32);
                    }
                    news += big;
            }
            if (string.charAt(i) == 32){
                space = true;
            }
            i ++;
        }
            for (int k = i ; k < string.length(); k ++){
                space = false;
                big = (char) (string.charAt(k));
                if (string.charAt(k) >96){
                big = (char) (string.charAt(k) - 32);
                }   
                news += big;   
                while (!space){
                    k ++;
                    if (string.charAt(k) == 32){
                    space = true;
                    }
                    else {
                        news += string.charAt(k);
                }
            }
        }
    return news;
}

    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++){
            if(string.charAt(i) == chr){
                counter ++;
            }
        }
        int[] array = new int [counter];
        int j = 0;
        for (int i = 0; i < string.length(); i++){
            if(string.charAt(i) == chr){
                array[j] = i;
                j++;
            }
        }
        return array;
    }
}
