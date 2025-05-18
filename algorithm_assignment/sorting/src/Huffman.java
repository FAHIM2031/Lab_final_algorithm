package sorting.src;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Huffman {
    public  static void printsolution(HuffmanNode root,String str)
    {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            System.out.println(root.c + ":" + str);
            int sum = 0;
            sum += str.length();
            System.out.println("the length of "+ root.c +" is = " + sum);
            return;
        }
       

      printsolution(root.left , str + "0");
      printsolution(root.right , str + "1");
       
    }



    public static void main(String[] args) {
    int n = 7;
    char[] char_array = { 'a', 'b', 'c', 'd', 'e', 'f','h' };
    int[] int_array = { 5, 9, 12, 13, 16, 45 ,30};

    PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new Mycomparator());

    for(int i=0;i<n;i++)
    {
        HuffmanNode ho = new HuffmanNode();
        ho.c = char_array[i];
        ho.data = int_array[i];
        ho.left = null;
        ho.right = null;

        q.add(ho);

    }
     HuffmanNode root=null;
     while(q.size()>1)
     {
         HuffmanNode x = q.peek();
         q.poll();

         HuffmanNode y = q.peek();
         q.poll();

         HuffmanNode f = new HuffmanNode();
         f.data = x.data + y.data;
         f.c = '-';

         f.left = x;

         f.right = y;
         root = f;
         q.add(f);
     }

     printsolution(root, "");

    }
}
