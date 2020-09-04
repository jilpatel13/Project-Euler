import java.util.Scanner;

public class Largestprimefactor {

    public static void main(String[] args) {
	Long n = 600851475143L;
	for(int i=2;i<=Math.sqrt(n);i++){
	    if(n%i==0){
		n=n/i;
		i--;
	    }
	}
	if(n>=2){
		System.out.print(n);
	    }
    }
}
