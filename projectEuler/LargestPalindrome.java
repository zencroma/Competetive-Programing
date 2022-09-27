
public class LargestPalindrome {
    public static void main(String[] args) {

        int result= 0;
        int resultA= 0;
        int resultB= 0;
        int [] digit = {-1,-1,-1,-1,-1,-1};
        int hasilPerkalian ,temp;
        boolean cek;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                //cari hasil perkalian 
                hasilPerkalian = i*j;
                temp = hasilPerkalian;
                //Ambil hasil perkalian 
                for (int j2 = 0; j2 < digit.length; j2++) {
                    digit[j2]=temp%10;
                    temp/=10;
                    if(temp==0){
                        break;
                    }
                }
                //cek polindrome 
                cek  = true;
                //untuk 5 digit
                if (digit[5]==-1) {
                    for (int j2 = 0; j2 < 2; j2++) {
                        if(digit[j2]!=digit[4-j2]){
                            cek = false;
                            break;
                        }
                        
                    }
                //untuk 6 digit
                }else{
                    for (int j2 = 0; j2 < 3; j2++) {
                        if (digit[j2]!=digit[5-j2]) {
                            cek = false;
                            break;
                        }
                    }
                }

                //palindrome terbesar 
                if (cek&&hasilPerkalian>result) {
                    result=hasilPerkalian;
                    resultA=i;
                    resultB=j;
                }
                //reset 
                for (int l = 0; l < digit.length; l++) {
                    digit[l]=-1;
                }
            }
        }
        System.out.println("the biggest Palindrome is: "+result+" From "+resultA+" x "+resultB+" ");
    }
}
