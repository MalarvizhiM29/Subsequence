import java.util.*;
import java.lang.*;
public class Main
{
    static void Subsequence(int index,int i,int arr[],ArrayList<Integer>List,int n,int sum){
        if(index==n){
            if(i==sum){
                System.out.println(List);
            }
            return;
        }
        List.add(arr[index]);
        i+=arr[index];
        Subsequence(index+1,i,arr,List,n,sum);
        i-=arr[index];
        List.remove(List.size()-1);
        Subsequence(index+1,i,arr,List,n,sum);
    }
	public static void main(String[] args) {
		int arr[]={1,1,2};
		int n=3;
		int sum=2;
		ArrayList<Integer> List=new ArrayList<> ();
		Subsequence(0,0,arr,List,n,sum);
	}
}
