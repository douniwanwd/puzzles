package dom;

public class MultiArray {
    public static void main(String[] args) {
        String air = "44sdf4=";
        int change = Integer.parseInt(air);
        int arr[][] = new int[3][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i+1; ++j)
                arr[i][j] = j + 1;

        for (int i = 0; i < 3; ++i)
            for (int j = 0; j < i+1; ++j)
                sum += arr[i][j];

        System.out.print(sum);
    }
}
