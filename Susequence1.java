import java.util.*;
import java.lang.*;
public class Main
{
    static void Subsequence(int index,int arr[],ArrayList<Integer>List,int n){
        if(index>=arr.length){
            if(List.size()>0){
                System.out.println(List);
            }
            return;
        }
        List.add(arr[index]);
        Subsequence(index+1,arr,List,n);
        List.remove(List.size()-1);
        Subsequence(index+1,arr,List,n);
    }
	public static void main(String[] args) {
		int arr[]={1,1,2};
		int n=3;
		ArrayList<Integer> List=new ArrayList<> ();
		Subsequence(0,arr,List,n);
	}
}
