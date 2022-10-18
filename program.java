/**
 * program
 */
public class program {

    public static void main(String[] args) {
        int[] array1={1,2,4,7,9,1,2,4};
        int[] array2={1,4,9,8,7,6,5,2,4};
        if (result(array1, array2)>=result(array2, array1)){
            System.out.println(result(array1, array1));
        }
        else {
            System.out.println(result(array2, array1));
        }

        }

    
    public static int result(int[] input_arr1, int[] input_arr2){
        int length_max=0;
        int pos1=0;
        int pos2=0;
        int last_founded_pos=0;

        
        while ((pos1 < input_arr1.length) && (pos2 < input_arr2.length)){
            System.out.println("comparing "+input_arr1[pos1]+"&"+input_arr2[pos2]);
            if (input_arr1[pos1]==input_arr2[pos2]){
                System.out.println("found"+input_arr1[pos1]+"="+input_arr2[pos2]);
                last_founded_pos=pos2+1;

                length_max++;
                pos1++;
                pos2++;
                
                }
            else
                pos2++;
            if (pos2==input_arr2.length){
    
                pos1++;
                pos2=last_founded_pos;
            }
        }
        return length_max;
            
        
    }
}