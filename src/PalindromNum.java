public class PalindromNum {
    public int reverseNum(int number) {
        int temp = number;
        int reverseNum = 0;
        int lastNum;
        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;

            temp /= 10;
        }
        return reverseNum;
    }

    public boolean isPalindrom(int number) {
        if (number == reverseNum(number)) return true;

        return false;
    }
}
