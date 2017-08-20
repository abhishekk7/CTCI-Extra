package QuestionsImpl.C4_Trees_and_Graphs;

import Common.AssortedMethods;
import Common.TreeNode;

public class MiscQuestions {
    private static int pathLength = 0;
    private static int[] path = new int[10];
    private static int total = 0;

    public static void main(String[] args) {
        /*int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = AssortedMethods.createTreeFromArray(array);
        TreeNode root1 = TreeNode.createMinimalBST(array);
        System.out.println(identicalTrees(root, root1));
        System.out.println(treeSize(root));
        System.out.println(treeHeight(root));
        deleteTree(root);
        root.print();
        mirrorTree(root);
        root.print();
        printPathsToRoot(root, path, pathLength);
        TreeNode root1 = TreeNode.createMinimalBST(array);

        root.print();
        root1.print();
*/
        int[] arr = {4, 8, 10, 12, 14, 20, 22};
        TreeNode lcaRoot = TreeNode.createMinimalBST(arr);
        lcaRoot.print();
        /*System.out.println("---LCA---");
        System.out.println(lowestCommonAncestor(lcaRoot, 14, 22).data);
        System.out.println("---LCA Recursion---");
        System.out.println(lca(lcaRoot, 14, 22).data);*/
        System.out.println(sumOfRootToLeaf(lcaRoot, 54));
        System.out.println(countLeafNodes(lcaRoot));

    }

    public static boolean identicalTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 != null && root2 != null) {
            return (root1.data == root2.data
                    && identicalTrees(root1.left, root2.left)
                    && identicalTrees(root1.right, root2.right));
        }
        return false;
    }

    public static int treeSize(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return (treeSize(root.left) + 1 + treeSize(root.right));
    }

    public static int treeHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(treeHeight(root.left), treeHeight(root.right));
    }

    public static void deleteTree(TreeNode root) {
        if (root == null) {
            return;
        }
        deleteTree(root.left);
        deleteTree(root.right);
        System.out.println(root.data + " deleted.");
    }

    public static void mirrorTree(TreeNode root) {
        if (root == null) {
            return;
        }
        mirrorTree(root.left);
        mirrorTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void printPathsToRoot(TreeNode root, int[] path, int pathLength) {
        if (root == null) {
            return;
        }
        path[pathLength] = root.data;
        pathLength++;

        if (root.left == null && root.right == null) {
            System.out.println(AssortedMethods.arrayToString(path));
        } else {
            printPathsToRoot(root.left, path, pathLength);
            printPathsToRoot(root.right, path, pathLength);
        }

    }

    public static TreeNode lca(TreeNode root, int v1, int v2) {
        if (root == null)
            return null;
        int v = root.data;
        if (v1 > v && v2 > v)
            return lca(root.right, v1, v2);
        if (v1 < v && v2 < v)
            return lca(root.left, v1, v2);
        return root;
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

    public static boolean sumOfRootToLeaf(TreeNode root, int sum) {
        if (root == null) {
            return (sum == 0);
        }
        int subSum = sum - root.data;
        boolean res = false;
        if (subSum == 0 && root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null) {
            res = res || sumOfRootToLeaf(root.left, sum);
        }
        if (root.right != null) {
            res = res || sumOfRootToLeaf(root.right, sum);
        }
        return res;
    }

    public static int countLeafNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
}
