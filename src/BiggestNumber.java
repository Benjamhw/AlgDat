public class BiggestNumber {

    public static void main(String[] args){
        int[] liste = {1,2,4,-2,43,121,-234,12};

        System.out.println(findMax(liste));
    }

    static int findMax(int[] values){
        int max_value = values[0];
        //Looper over tallene vi får inn
        for(int i = 0; i < values.length; i++){

            int value = values[i];

            if(value > max_value){
                max_value = value;
            }
        }
        return max_value;
    }

}
