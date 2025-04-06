package day31;
class TNode{
	int data;
	TNode left;
	TNode right;
	TNode(int d){
		data=d;
		left=null;
		right=null;
	}
}
class BST {
 TNode root;

   TNode insert(int d,TNode root) {
	if(root==null)
		root=new TNode(d);
	else if(d<=root.data)
		root.left=insert(d,root.left);
	else
		root.right=insert(d,root.right);
	return root;
}
  TNode search(int d,TNode root) {
	if(root.data==d) 
	   return root;
	else if(d<=root.data)
		return search(d,root.left);
	else
		return search(d,root.right);
}
void inorder(TNode root) {
	if(root==null)
		return;
	inorder(root.left);
	System.out.println(root.data+"");
    inorder(root.right);
}
void rev_inorder(TNode root) {
	if(root==null)
		return;
	rev_inorder(root.right);
	System.out.println(root.data+"");
	rev_inorder(root.left);
}
TNode delete(TNode root,int data) {
	if(root==null)return root;
	if(data<root.data)
		root.left=delete(root.left,data);
	else if(data>root.data)
		root.right=delete(root.right,data);
	else {
		if(root.left==null)return root.right;
		else if(root.right==null) return root.left;
		root.data=maxValue(root.right);
		root.right=delete(root.right,root.data);
	}
	return root;
}
int countNodes(TNode root) {
	if(root==null) return 0;
	 return countNodes(root.left)+countNodes(root.right)+1;
		
}
int maxValue(TNode root) {
	int maxv=root.data;
	while(root.right!=null) {
		maxv=root.right.data;
		root=root.right;
		
	}
	return maxv;
}
public static void main(String[] args) {
	BST ob=new BST();
	ob.root=ob.insert(50,ob.root);
	ob.root=ob.insert(60,ob.root);
	ob.root=ob.insert(10,ob.root);
	ob.root=ob.insert(90,ob.root);
	ob.root=ob.insert(40,ob.root);
	ob.root=ob.insert(100,ob.root);
	ob.root=ob.insert(90,ob.root);
	System.out.println("BST inorder output");
	ob.inorder(ob.root);
	int max=ob.maxValue(ob.root);
	System.out.println("max " +max);
	 int m=ob.countNodes(ob.root);
	 System.out.println("no of nodes"+m);
}
	
}
