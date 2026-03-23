import org.w3c.dom.ls.LSLoadEvent;
import org.w3c.dom.ls.LSOutput;

import javax.lang.model.util.Elements;
import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.Queue;

import static javax.swing.Spring.height;

//import static sun.jvm.hotspot.gc.z.ZNUMA.count;

public class binarytrees {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] ==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
        public static void preorder(Node root){
            if(root == null) {
                  return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void postorder(Node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
        public static void levelorder(Node root){
            if(root==null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()){
                Node curr = q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else {
                    System.out.print(curr.data+" ");
                    if(curr.left!=null){
                        q.add(curr.left);
                    }
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }

            }
        }
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh= height(root.left);
            int rh = height(root.right);
            int height =Math.max(lh,rh)+1;
            return height;
        }
    }

    public static int countNode(Node root){
        if(root==root){
            return 0;
        }
        int lcount = countNode(root.left);
        int rcount = countNode(root.right);
        return lcount+rcount+1;
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        return leftsum+rightsum+root.data;
    }

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int ldia = diameter(root.left);
        int rdia = diameter(root.right);
        int rheight = BinaryTree.height(root.right);
        int lheight = BinaryTree.height(root.left);
        int self = rheight+lheight+1;
        return Math.max(self , Math.max(rdia,ldia));
    }
    public static boolean Isidentical(Node node , Node subroot){
         if(node==null && subroot==null){
             return true;
         }
         else if(node==null || subroot==null || node.data==subroot.data){
             return false;
         }
         if(!Isidentical(node.left , subroot)){
             return false;
         }
         if(!Isidentical(node.right , subroot)){
             return false;
         }
         return true;
    }
    public static boolean isSubstree(Node root , Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(Isidentical(root,subroot)){
                return true;
            }
        }
        return Isidentical(root.left , subroot)||Isidentical(root.right , subroot);
    }


    public static void topview (Node root){

    }

    public static void Kthlevel(Node root, int level , int n ){
        if(root==null) return;
        if(level == n){
            System.out.print(root.data+" ");
        }
        Kthlevel(root.left , level+1 , n);
        Kthlevel(root.right , level+1 , n);
    }




    public static void main() {
        int nodes[] = {1,2,4,-1,-1 ,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
//        System.out.println(root.data);
//        tree.preorder(root);
//        System.out.println();
//        tree.postorder(root);
//        tree.levelorder(root);
        System.out.println("the leftheight is : "+tree.height(root.left));
        System.out.println("the right height is : "+tree.height(root.right));
        System.out.println("THE DIAMETER IS "+ diameter(root));

        //        System.out.println("the number of nodes :"+countNode(root));
//        System.out.println(sum(root));
        Kthlevel(root,1 , 3);
    }
}
