package utils;

import java.util.ArrayList;
import java.util.List;

public class Display {
    public static void showInt(int x){
        System.out.println(x);
    }
    public static void showArray(int[] x){
        for(int i: x){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void showString(String x){
        System.out.println(x);
    }

    public static void showDouble(Double x){
        System.out.println(x);
    }

    public static <T> void showList(List<T> list){
        for (T element : list)
            System.out.print(element + " ");
        System.out.println();
    }

    public static List<Integer> treePreTraversal(TreeNode node){
        List<Integer> result = new ArrayList<>();
        if(node == null) return result;
        result.add(node.val);
        if(node.left != null)
            result.addAll(treePreTraversal(node.left));
        if (node.right != null)
            result.addAll(treePreTraversal(node.right));
        return result;
    }

    public static void showTreePre(TreeNode node){
        List<Integer> res = treePreTraversal(node);
        showList(res);
    }

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        showList(list);

        String[] s = new String[]{"123", "abc"};

    }

}
