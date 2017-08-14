package QuestionsImpl.C4_Trees_and_Graphs;

import Common.AssortedMethods;
import Common.TreeNode;

public class MiscQuestions {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = AssortedMethods.createTreeFromArray(array);
        TreeNode root1 = TreeNode.createMinimalBST(array);

        System.out.println(treeHeight(root.left));
        System.out.println(root1.right.height());
        System.out.println(treeHeight(root1.left.left));
        System.out.println(root1.left.left.height());

        int[] arr = {4, 8, 10, 12, 14, 20, 22};
        TreeNode lcaRoot = TreeNode.createMinimalBST(arr);
        System.out.println("---LCA---");
        System.out.println(lowestCommonAncestor(lcaRoot, 14, 22).data);

    }

    public static int treeHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(treeHeight(node.left), treeHeight(node.right));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, int v1, int v2) {
        while (root != null) {
            int v = root.data;
            if (v > v1 && v > v2) {
                root = root.left;
            } else if (v < v1 && v < v2) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }
}
