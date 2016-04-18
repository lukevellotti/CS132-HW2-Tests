class Fact {
    public static void main(String[] a) {
	System.out.println(5);
    }
}

class foo extends bar {
    public bar m(int yes, foo no) {
	bar z;
	z = new bar();
	return z;
    }
}

class bar {
    public bar m(int k, foo x) {
	bar y;
	y = new bar();
	return y;
    }
}
