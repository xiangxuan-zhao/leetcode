package com.zxx.two;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal
 * @author Administrator
 * @date 2020/06/09
 */
public class BinaryTreeInorderTraversal {
    /**
     * 定一个二叉树，返回它的中序 遍历。
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        func(root,list);
        return list;
    }

    private void func(TreeNode root,List<Integer> list){
        if(root != null){
            if(root.left != null){
                func(root.left,list);
            }
            list.add(root.val);
            if(root.right != null){
                func(root.right,list);
            }
        }
    }
}


/**
 * Definition for a binary tree node.
 */
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
