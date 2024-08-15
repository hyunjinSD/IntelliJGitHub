package study.lotto;

public class Lottery {

    String randomNum = " ";
    String[] randomNumbers = new String[6];

    public static int random(int min, int max) {
        int num = (int)((Math.random() * (max - min + 1)) + min);
        return num;
    }

    public void randomLotteryNum() {

        for(int i = 0; i < 7; i++) {
            random(0,9);
        }
        this.randomNum = randomNum;
    }
}
