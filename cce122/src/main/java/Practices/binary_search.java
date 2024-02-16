/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practices;



public class binary_search {
    static void binarySearch(int arr[],int f,int l,int key){
        int m=(f+l)/2;
        while(f<=l){
            if (arr[m]>key) {
                l=m-1;
            }
            else if(arr[m]<key){
                f=m+1;
            }
            else if(arr[m]==key){
                System.out.println("Element found at index :"+m);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int last=arr.length-1;  
        binarySearch(arr,0,last,key);
    }
}
