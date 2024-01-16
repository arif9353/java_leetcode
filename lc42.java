class Solution42 {
    public static int[] leftMostMax(int auxleft[]){
    int answer[] = new int[auxleft.length];
    answer[0] = auxleft[0];
    for(int i=1;i<auxleft.length;i++){
        if(auxleft[i]<answer[i-1]){
            answer[i]=answer[i-1];
        }
        else{
            answer[i]=auxleft[i];
        }
    }
    /*for(int i=0;i<answer.length;i++){
        System.out.print(answer[i]+" ");
    }*/
    return answer;
}
public static int[] rightMostMax(int auxleft[]){
    int answer[] = new int[auxleft.length];
    answer[auxleft.length-1] = auxleft[auxleft.length-1];
    for(int i=auxleft.length-2;i>=0;i--){
        if(auxleft[i]<answer[i+1]){
            answer[i]=answer[i+1];
        }
        else{
            answer[i]=auxleft[i];
        }
    }
    /*for(int i=0;i<answer.length;i++){
        System.out.print(answer[i]+" ");
    }*/
    return answer;
}
public static int volumeStored(int[] height, int[] auxleft, int[] auxright){
    if(height.length<=2){
        return 0;
    }
    int sum=0;
    for(int i=0;i<height.length;i++){
        int minim = Math.min(auxleft[i], auxright[i]);
        int diff = minim-height[i];
        sum+=diff;
    }
    return sum;
}
public static int trap(int[] height) {
    int auxleft[] = new int[height.length];
    int auxright[] = new int[height.length];
    auxleft = leftMostMax(height);
    auxright = rightMostMax(height);
    int result = volumeStored(height, auxleft, auxright);
    return result;
}

public static void main(String args[]){
    int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
    int result = trap(height);
    System.out.println(result);
}
}
