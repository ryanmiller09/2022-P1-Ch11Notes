package FirstArray;
public class Example {
    public static void main(String args[]){

        //Arrays store one datatype
        int numberOfChristmasGifts[];
        numberOfChristmasGifts = new int[200];
        int k = 0;
        for(k = 0; k < numberOfChristmasGifts.length; k++){
            numberOfChristmasGifts[k] = 6;
            System.out.println(numberOfChristmasGifts[k]);
        }


    }

}
