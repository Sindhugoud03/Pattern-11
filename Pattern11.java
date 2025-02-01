public class Pattern11 {
    public static void main(String[] args) {
        int i;
        for(i=0; i<3; i++){
            for(int j=0; j<5 ;j++){
                if(i%2==0 && j%2==0){
                    System.out.print(' ');
                }else{
                    System.out.print('*');
                }
            }

        }
    }
}
