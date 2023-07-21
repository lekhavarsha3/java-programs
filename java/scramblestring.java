class scramblestring {
    public static void main(String args[])
     {
        
        int i,j;
        String s1="0";String s2="0";
        int n = s1.length();
        boolean dp[][][] = new boolean[n + 1][n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                dp[1][i][j] = s1.charAt(i) == s2.charAt(j);
            }
        }
        for (int length = 2; length <= n; length++) {
            for (i = 0; i < n + 1 - length; i++) {
                for (j = 0; j < n + 1 - length; j++) {
                    for (int newLength = 1; newLength < length; newLength++) {
                        boolean dp1[] = dp[newLength][i];
                        boolean dp2[] = dp[length - newLength][i + newLength];
                        dp[length][i][j] |= dp1[j] && dp2[j + newLength];
                        dp[length][i][j] |= dp1[j + length - newLength] && dp2[j];
                    }
                }
            }
        }
        
    }
}