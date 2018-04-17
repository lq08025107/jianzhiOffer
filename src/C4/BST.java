package C4;

public class BST {
    public static boolean verifySequenceOfBST(int[] array, int start, int end){
        if(array == null && array.length <= 0)
            return false;
        int root = array[array.length - 1];
        //在二叉搜索树种左子树的节点小于根节点
        int i = 0;
        for(; i < array.length - 1; i++){
            if(array[i] > root)
                break;
        }
        //在二叉搜索树种右子树的节点大于根节点
        int j = i;
        for(; j < array.length - 1; j++){
            if(array[j] < root)
                break;
        }
        //判断左子树是不是二叉搜索树
        boolean left = true;
        if(i > 0)
            left = verifySequenceOfBST(array, 0, i);
        boolean right = true;
        if(j < array.length - 1)
            right = verifySequenceOfBST(array, j+1, array.length);
        return left && right;
    }
}
