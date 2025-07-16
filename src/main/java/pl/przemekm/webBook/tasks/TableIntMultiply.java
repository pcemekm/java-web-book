package pl.przemekm.webBook.tasks;

public class TableIntMultiply {

    //Product Of Array Except Self : Give an array of distinct integers n>1,
    //return an array output in such a way that a[i] is equals to the product of other elements except self i.e., a[i]
    //
    //Example:
    //input : [1,2,3,4]
    //output : [24,12,8,6]
    //Explanation :
    //at a[0] element is 1, it should become multiply of other elements except self i.e., 2*3*4 = 24
    //at a[1] element is 2, it should become multiply of other elements except select i.e., 1*3*4 = 12    so on...
    //
    //
    //

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
