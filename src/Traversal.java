public class Traversal {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(10, null, null);
    
    root.left = new TreeNode(9, null, null);
    root.left.left = new TreeNode(5, null, null);
    root.left.right = new TreeNode(2, null, null);

    root.right = new TreeNode(15, null, null);
    root.right.left = new TreeNode(-3, null, null);
    
    root.right.right = new TreeNode(5, null, null);
    root.right.right.right = new TreeNode(22, null, null);

    // preOrder(root);
    // postOrder(root);
    inOrder(root);
  }

 // print a tree rooted at the given node in pre-order
  public static void preOrder(TreeNode node){
   
    // if null, return
    if(node == null){
      return;
    }
    // print value
    System.out.println(node.value);
    // taverse left
    preOrder(node.left);
    // traverse right 
    preOrder(node.right);
  }



  public static void postOrder(TreeNode node){
    // if null, return
    if(node == null){
      return;
    }
    // taverse left
    postOrder(node.left);
    // traverse right 
    postOrder(node.right);
    // print value
    System.out.println(node.value);
  }

  public static void inOrder(TreeNode node){
    // if null, return
    if(node == null){
      return;
    }
    // taverse left
    inOrder(node.left);
    // print value
    System.out.println(node.value);
  
    // traverse right 
    inOrder(node.right);
  }






}
