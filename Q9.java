public class Q9 {
    public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] B = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] C = new int[A.length];

    for(int i = 0; i < B.length; i++) {
        C[i] = A[i] / (B[i]);
        System.out.println(A[i]);
        System.out.println(B[i]);
        System.out.println(C[i]);
        System.out.println("=========");
    }
    }
}
