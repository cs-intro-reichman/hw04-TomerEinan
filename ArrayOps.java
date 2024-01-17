public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        for (int k = 0 ; k < array.length; k++){
            boolean check = false;
            for (int i = 0; i < array.length; i++){
                if (array[i] == k){
                    check = true;
                }
            }
            if (!check){
                return k;
            }
        }
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int big = 0;
        int sec = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] >= big) {
                sec = big;
                big = array[i];
            }
            else if (array[i] >= sec){
                sec = array[i];
            } 
        }
        return sec;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0; i < array1.length; i++){
            boolean check = false;
            for (int k = 0; k < array2.length; k++){
                if (array1[i] == array2[k]){
                    check = true;
                }
                }
                if (!check){
                    return check;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean check = true;
        for (int i = 0; i < array.length - 1; i ++){
            if(array[i] < array[i + 1]){
                check = false;
            }
        }
        if (check){
            return check;
        }
        check = true;
        for (int i = 0; i < array.length - 1; i ++){
            if(array[i] > array[i + 1]){
                check = false;
            }
        }
        return check;
    }
}
