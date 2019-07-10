public class MasterMind {
    public static void main(String[] args) {
        int x, t;
        for (int i=1; i<10; i++)
            for (int j = 1; j < 10; j++)
                for (int k = 0; k < 10; k++) {
                    x = i * 100 + j * 10 + k;
                    t = k * 100 + k * 10 + k;
                    x = 3 * x;
                    if (x == t && i != j && j != k) {
                        System.out.println(i);
                        System.out.println(j);
                        System.out.println(k);
                	/*Hello, this is a new statement*/    
			}
                }
    }
}
