package QuestionsImpl.C4_Trees_and_Graphs;

import Common.TreeNode;

public class Q2_Minimal_Tree {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        TreeNode node = createMinimalBST(array, 0, array.length - 1);

        node.print();
        System.out.println(node.isBST());
    }

    public static TreeNode createMinimalBST(int[] array, int start, int end) {
        if (end < start) {
            return null;
        }

        int mid = (end + start) / 2;

        TreeNode n = new TreeNode(array[mid]);
        n.left = createMinimalBST(array, start, mid - 1);
        n.right = createMinimalBST(array, mid + 1, end);
        return n;
    }
}
