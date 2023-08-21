class Result {

    // problem: https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
    // dificulty : easy
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long min = arr.get(0);
        long max = arr.get(arr.size()-1);
        long sum =0;
        for(long n: arr){
            sum+=n;
        }
        System.out.println((sum-max) +" " +(sum-min));

    }

}