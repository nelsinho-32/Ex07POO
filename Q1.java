public class Q1 {
    public static void main(String[] args) {
    int[] A = new int[5];
    int[] B = new int[A.length];
    A[0] = 1;

    for(int i = 0; i < B.length; i++) {
        B[i] = A[i];
        System.out.println(A[i]);
        System.out.println(B[i]);
    }
    }
}
