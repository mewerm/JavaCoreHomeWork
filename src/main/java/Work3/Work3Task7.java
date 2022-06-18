package Work3;

public class Work3Task7 extends MainForSevenTask {

    public boolean checkBalance(int[] array) {

        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++) {
                rightSum += (j > i) ? array[j] : 0;
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }


}
