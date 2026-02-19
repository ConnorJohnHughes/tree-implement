import java.util.HashMap;
import java.util.Map;

public class Traversal {

  public static void main(String[] args) {
    TreeNode<Integer> root = new TreeNode<Integer>(10, null, null);
    
    root.left = new TreeNode<Integer>(9, null, null);
    root.left.left = new TreeNode<Integer>(5, null, null);
    root.left.right = new TreeNode<Integer>(2, null, null);

    root.right = new TreeNode<Integer>(15, null, null);
    root.right.left = new TreeNode<Integer>(-3, null, null);
    
    root.right.right = new TreeNode<Integer>(5, null, null);
    root.right.right.right = new TreeNode<Integer>(22, null, null);


    TreeNode<String> stringRoot =  new TreeNode<String>("Root", null, null);
    stringRoot.left = new TreeNode<String>("dog", null, null);
    stringRoot.left.left = new TreeNode<String>("dog", null, null);
    stringRoot.left.right = new TreeNode<String>("cat", null, null);

    stringRoot.right = new TreeNode<String>("house", null, null);
    stringRoot.right.left = new TreeNode<String>("hello", null, null);
    
    stringRoot.right.right = new TreeNode<String>("goodbye", null, null);
    stringRoot.right.right.right = new TreeNode<String>("bonito flakes", null, null);

    // preOrder(root);
    // postOrder(root);
    // inOrder(root);


    // inOrder(stringRoot);

    // printGreater(root, 4);


    // System.out.println(countNodes(root));

    

    System.out.println(toMap(stringRoot));
  }

 // print a tree rooted at the given node in pre-order
  public static void preOrder(TreeNode<?> node){
   
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



  public static <T> void postOrder(TreeNode<T> node){
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

  public static <E> void inOrder(TreeNode<E> node){
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

  public static void printGreater(TreeNode<Integer> node, int n){
    if(node == null){
      return;
    }
    if(node.value > n){
    System.out.println(node.value);
    }
    printGreater(node.left, n);
    printGreater(node.right, n);
  };

  

  public static int countNodes(TreeNode<?> node){
    //leftCount = count nodes on left
    //rightCount = count nodes on right
    //overallCount = leftCount + rightCount

    if(node == null) return 0;
    return countNodes(node.left) + countNodes(node.right) + 1;

    // return node == null ? 0 : countNodes(node.left) + countNodes(node.right) + 1;

  //  int leftCount = countNodes(node.left);
  //  int rightCount = countNodes(node.right);

  //  int overallCount = leftCount + rightCount + 1;

  //   return overallCount;
  }


  public static <T> Map<T, Integer> toMap(TreeNode<T> node){
    Map<T, Integer> counts = new HashMap<>();
    toMap(node,counts);
    return counts;
  }

  private static <T> void toMap(TreeNode <T> node, Map<T, Integer> counts){
   
   if(node == null) return;

   //fill up those counts
   counts.put(node.value , counts.getOrDefault(node.value, 0) + 1 );
   toMap(node.left, counts);
   toMap(node.right, counts);


  }

}
