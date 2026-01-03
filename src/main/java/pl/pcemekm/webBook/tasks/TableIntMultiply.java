package pl.pcemekm.webBook.tasks;

public class TableIntMultiply {

    int[] i = {1,2,3,4};

     static int[] test(int[] input){
        int[] output = {0,0,0,0};
        int result;
        for(int i=0; i<input.length ; i++){
            result = 1;
            for(int j=0;j<input.length; j++){
                if(j!=i){result = result * input[j];}
            }
            output[i] = result;
        }
        return output;
    }
}
