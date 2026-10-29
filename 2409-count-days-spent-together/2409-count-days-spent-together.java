class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] md = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days[] = new int[13];
        days[1] = 31;
        for(int i =2 ;i<=12;i++){
        days[i] = days[i-1]+md[i-1];
        }
        int ArriveAliceDay = FindDayofyear(arriveAlice ,days);
        int leaveAliceDay = FindDayofyear(leaveAlice,days);
        int arriveBobDay = FindDayofyear(arriveBob,days);
        int leavebobDay  = FindDayofyear(leaveBob,days);
        int togather = Math.min(leaveAliceDay , leavebobDay) - Math.max(ArriveAliceDay , arriveBobDay)+1;
        return togather < 0?0:togather;
    }
    int FindDayofyear(String date , int days[]) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));
return days[month - 1] + day;
    }
}