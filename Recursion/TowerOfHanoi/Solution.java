class Hanoi {
    long count = 0;
    public long toh(int N, int from, int to, int aux) {
        // Your code here
        count++;
        if(N == 1){
            System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
            return count;
        }
        toh(N-1, from, aux, to);
        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
        toh(N-1, aux, to, from );
        return count;
    }
}
