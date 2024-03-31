package jobsheet4;

public class vote {

    public String[] candidate;
    public int[][] votes;

    public vote(String[] candidate) { 
        this.candidate = candidate;
        this.votes = new int[candidate.length][candidate.length];
    }

    public int[] count(int[][] votes, int left, int right) {
        if (left == right) {
            int[] vote = votes[left];
            int[] result = new int[1];
            result[0] = sum(vote, 0, vote.length - 1);
            return result;
        } else {
            int mid = (left + right) / 2;
            int[] leftResult  = count(votes, left, mid);
            int[] rightResult = count(votes, mid+1, right);

            int leftLen = leftResult.length;
            int rightLen = rightResult.length;

            int[] result = new int[leftLen + rightLen];

            for (int i = 0; i < leftLen; i++) {
                result[i] = leftResult[i];
            }
            for (int i = leftLen; i < leftLen + rightLen; i++) {
                result[i] = rightResult[i - leftLen];
            }
            return result;
        }
    }

    public int sum(int[] vote, int left, int right) {
        int total = 0;
        for (int i = left; i <= right; i++) {
            total += vote[i];
        }
        return total;
    }

    public void display() {
        int[] voteCount = count(votes, 0, votes.length - 1);
        int highIdx = 0;
        int highNum = 0;
        for (int i = 0; i < voteCount.length; i++) {
            if (voteCount[i] > highNum) {
                highNum = voteCount[i];
                highIdx = i;
            }
        }
        System.out.printf("The elected president is %s with %d votes\n", candidate[highIdx], highNum);
    }
}