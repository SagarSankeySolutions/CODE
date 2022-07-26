import javax.swing.plaf.SliderUI;

public class test {
    
    
    



    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int[] fList = new int[10];
        int[] sList = new int[10];
        int count =0,sum=0;

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){

            sum = array[i] + array[j];

            if(sum == 7 ){

                fList[count] = array[i];
                sList[count] = array[j];

                count++;
            }
            }
        }


        for(int i =0 ;i<count;i++){
            System.out.println(fList[i] + " " + sList[i]);

        }
    }
}
