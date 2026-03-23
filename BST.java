import javax.swing.*;
import java.lang.classfile.instruction.IncrementInstruction;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BST {
    //creation of BST
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int data){
            this.val = data;
        }
    }
    public static Node Insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.val>val){
            root.left = Insert(root.left , val);
        }
        else {
            root.right = Insert(root.right , val);
        }
        return root;
    }
    //inorder traversal
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(" " +root.val);
        inorder(root.right);
    }
    static boolean search (Node root , int key){
        if(root == null) return false;
        if(root.val == key){
            return true;
        }
        if(root.val>key){
            return search(root.left , key);
        }
        else {
            return search(root.right,key);
        }
    }
    public static void PrintInRange(Node root , int k1 , int k2 ){
        int sum =0;
        if(root==null){
            return;
        }
        if(root.val>=k1 && root.val<=k2){
            PrintInRange(root.left , k1,k2);
            System.out.print(root.val+" ");
            PrintInRange(root.right ,k1,k2);
        }
        else if(root.val<k1){
            PrintInRange(root.left ,k1,k2);
        }
        else{
            PrintInRange(root.right,k1,k2);
        }

    }
    public static void printPath(ArrayList<Integer> path){
        for(int i = 0;i<path.size();i++){
            System.out.print(path.get(i)+"->" );
        }
        System.out.println("Null");
    }


    

public static Node  mirror(Node root){
        if(root == null){
            return null;
        }
        Node leftsubtree = mirror(root.left);
        Node rightsubtree = mirror(root.right);
        root.left = rightsubtree;
        root.right = leftsubtree;
        return root;
}
public static void PrintRoot2leaf(Node Root ,ArrayList<Integer> path){

}



public static void Getinorder(Node root  ,ArrayList<Integer> indorderT){
        if(root == null){
            return;
        }
        Getinorder(root.left,indorderT);
        indorderT.add(root.val);
        Getinorder(root.right,indorderT);

}
    public static Node CreatBst(ArrayList<Integer> inorder , int st , int end){
        if(st>end){
            return null;
        }
        int mid = (st+end);
        Node root = new Node(inorder.get(mid));
        root.left= CreatBst(inorder,st , mid-1);
        root.right = CreatBst(inorder,mid+1,end);
        return root;
    }

    public static Node BalancedBst(Node root){
        ArrayList<Integer> inorder = new ArrayList<>();
//->        inorder sequence
        Getinorder(root,inorder);
//->        creatw tree
        CreatBst(inorder,0,inorder.size()-1);
        return root;
    }
    public static void preorder(Node root){
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void MergeBST(Node root1 , Node root2){
 //-> step one
        ArrayList<Integer> arr1 = new ArrayList<>();
        Getinorder(root1,arr1);
//->step 2
    ArrayList<Integer>  arr2 = new ArrayList<>();
    Getinorder(root2, arr2);
//-> merge
        int i = 0 ,j = 0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while (i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                finalArr.add(arr1.get(i));
                i++;
            }
            else{
                finalArr.add(arr2.get(j));
                j++;
            }
        }
    }

    //search in BinarySearchTree
    public static void main(String args[]) {
        int values[] ={8,5,3,1,4,6,10,11,14};
        Node root = null;
        for(int i  = 0 ;i<values.length;i++){
            root = Insert(root,values[i]);
        }
//        ArrayList<Integer> path = new ArrayList<>();
//        PrintLeafPaths(root,path);
        //        inorder(root);
//        if(search(root,19)){
//            System.out.println("found");
//        }
//        else{
//            System.out.println("not found");
//        }
//        inorder(root);
//        System.out.println();
//        PrintInRange(root,3,10);
//        BalancedBst(root);

    }
}
