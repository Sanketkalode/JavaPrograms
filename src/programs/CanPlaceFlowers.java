package programs;

/**
 * @author SanketKalode
 * @date 23-03-2024
 */
public class CanPlaceFlowers {

    static boolean canPlaceFlowers(int[] flowerbed, int n) {

        boolean previous = false;
        boolean forward;

        if (n == 0){
            return true;
        }

        for (int i=0;i<flowerbed.length;i++){

            if (i == flowerbed.length-1){
                forward = false;
            }else {
                forward = flowerbed[i + 1] == 1;
            }

            if (!previous && flowerbed[i] == 0 && !forward){
                previous = true;
                n--;
            }else if (!previous && flowerbed[i] == 1){
                previous = true;
            }
            else if (previous && flowerbed[i] == 0 && forward){
                previous = false;
            }
            else if (previous && flowerbed[i] == 0 && !forward){
                previous = false;
            }

            if (n == 0){
                break;
            }

        }
        return n == 0;
    }

    public static void main(String[] args) {

        int[] beds = new int[] {0,0,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(beds,0));
    }
}
