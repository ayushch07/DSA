package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.tree.TreeNode;

public class sum {
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private static  Node root;
    public sum(){
        root=createtree();
    }
    static Scanner sc=new Scanner(System.in);
    private  Node createtree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.data=item;
        boolean hlc=sc.nextBoolean();//has left child.
        if(hlc){
            nn.left=createtree();
        }
        boolean hrc=sc.nextBoolean();//has right child.
        if(hrc){
            nn.right=createtree();
        }
          return nn;

    }
    public static void main(String args[]){
        sum bt = new sum();
         int sum=sc.nextInt();
         solve(root,sum);
      
       System.out.println(li);
        // for(int i=0;i<li.size();i++)
        // {
        //     System.out.print(li.get(i)+" ");
        // }
    }
    static List<Integer> li=new ArrayList<>();
    static int f=0;
     public static void solve(Node root,int target){
         if(root==null)
         {
             return;
         }
         if(root.right==null && root.left==null){
             
             if(target-root.data==0){
                
                f=1;
             li.add(root.data);
            // System.out.println(li);
            
             }  
             return;
           
         }
         if(f==0)
         li.add(root.data);
         solve(root.left,target-root.data);
     
         solve(root.right,target-root.data);
       
          
       


    }


    
}
