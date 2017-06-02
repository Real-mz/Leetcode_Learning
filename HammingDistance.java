
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int c = 0;
        int z,w;
        if(x>=y){
            z = x;
            w = y;
        }else{
            z= y;
            w= x;
        }
        while(z>0){
            int a = z &1;
            int b = w &1;
            if(a != b){
                c++;
            }
            w >>=1;
            z >>=1;
        }
        return c;        
    }

    public static void main(String[] args){
        HammingDistance hammi = new HammingDistance();
        int result;
        //result = hammi.hammingDistance(6,4);
        int N1 = Integer.parseInt(args[0]);
        int N2 = Integer.parseInt(args[1]);
        result = hammi.hammingDistance(N1,N2);
        System.out.println("The result is :"+result);
    }
}