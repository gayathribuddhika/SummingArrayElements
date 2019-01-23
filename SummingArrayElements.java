
package summingarrayelements;


public class SummingArrayElements {

    
    public static void main(String[] args) {
        int array[] = {35,42,92,18,76};
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            
        }
        System.out.println("The sum of the elements of the array is "+sum);
    }
    
}
