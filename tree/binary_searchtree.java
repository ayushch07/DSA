package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.management.Query;
public class binary_searchtree {
    public class Node{
        int data;
        Node left;
        Node right;

    }
    private Node root;
    public binary_searchtree(int []in){
        this.root= createtree(in,0,in.length-1);

    }
    private Node createtree(int[] in, int i, int j) {
        if(i>j){
            return null;
        }
        int mid=(i+j)/2;
        Node nn=new Node();
        nn.data=in[mid];
        nn.left=createtree(in, i, mid-1);
        nn.left=createtree(in, mid+1, j);

        return nn;
    }
    public void levelorder(){
        Queue<Node> q=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int item=sc.nextInt();
        Node nn=new Node();
        nn.data=item;
        this.root=nn;
        q.add(nn);
        while(!q.isEmpty()){
            Node rv=q.remove();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1!=-1){
              Node n=new Node();
              n.data=c1;
              rv.left=n;
              q.add(n);
            }
            if(c2!=-1){
              Node n=new Node();
              n.data=c1;
              rv.right=n;
              q.add(n);
            }
        }
        //System.out.println();

    }

    
}
