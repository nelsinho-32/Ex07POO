public class Q5 {
    public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] B = new int[A.length];

    for(int i = 0; i < B.length; i++) {
        B[i] = A[i] * i;
        System.out.println(A[i]);
        System.out.println(B[i]);
        System.out.println("=========");
    }
    }
}
