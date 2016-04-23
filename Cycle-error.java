// The classes are basically the same as the BinaryTree 
// file except the visitor classes and the accept method
// in the Tree class

class TreeVisitor{
    public static void main(String[] a){
	System.out.println(new B().f());
    }
}

class A {
    int m;
    int n;
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

class B extends D {
    public int[] m() {
        int[] m;
        m = new int[2];
        return m;
    }
}

class C extends B {
    public boolean r(){
        return true;
    }
}

class D extends C { // TE
    public int f() { return 0; }
}
