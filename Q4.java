public class Q4 {
    public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    double[] B = new double[A.length];

    for(int i = 0; i < B.length; i++) {
        B[i] = Math.sqrt(A[i]);
        System.out.println(A[i]);
        System.out.println(B[i]);
        System.err.println("=========");
    }
    }
}
