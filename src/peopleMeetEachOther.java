public class peopleMeetEachOther {
    static boolean willMeet(int p1,int p2,int s1,int s2){
        if(p1>p2 && s1>=s2){
            return false;
        }
        if(p2>p1 && s2>=s1){
            return false;
        }

        int distanceToBeCovered = p1 - p2;
        int speedDifference = s1 - s2;
        if(distanceToBeCovered % speedDifference == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int p1 = 4;
        int p2 = 9;
        int s1 = 10;
        int s2 = 15;
        boolean ans = willMeet(p1,p2,s1,s2);
        if(ans){
            System.out.println("They'll meet");
        }else {
            System.out.println("They wont meet");
        }
    }
}
