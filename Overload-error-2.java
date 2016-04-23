// The classes are basically the same as the BinaryTree 
// file except the visitor classes and the accept method
// in the Tree class

class TreeVisitor{
    public static void main(String[] a){
	System.out.println(new B().n(true));
    }
}

class A {
    public int[] m() {
        int[] m;
        m = new int[2];
        m[0] = 1;
        m[1] = 2;
        return m;
    }
    public int n(boolean b) {
        return 2;
    }
}

class B extends A {
    int k;
}

class C extends B {
    public int m() { // TE
        return 5;
    }
}
