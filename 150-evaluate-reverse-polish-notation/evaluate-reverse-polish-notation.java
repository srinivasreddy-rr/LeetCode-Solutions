class Solution {
    public int evalRPN(String[] tokens) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = tokens.length;
        int cal = 0;
        for (int i = 0; i < n; i++) {
            char s = tokens[i].charAt(0);
            if (tokens[i].equals("+")) {
                int a = ans.get(ans.size() - 1);
                int b = ans.get(ans.size() - 2);
                cal = b + a;
                ans.remove(ans.size() - 1);
                ans.remove(ans.size() - 1);
                ans.add(cal);
            } else if (tokens[i].equals("-")) {
                int a = ans.get(ans.size() - 1);
                int b = ans.get(ans.size() - 2);
                cal = b - a;
                ans.remove(ans.size() - 1);
                ans.remove(ans.size() - 1);
                ans.add(cal);
            } else if (tokens[i].equals("*")) {
                int a = ans.get(ans.size() - 1);
                int b = ans.get(ans.size() - 2);
                cal = b * a;
                ans.remove(ans.size() - 1);
                ans.remove(ans.size() - 1);
                ans.add(cal);
            } else if (tokens[i].equals("/")) {
                int a = ans.get(ans.size() - 1);
                int b = ans.get(ans.size() - 2);
                cal = b / a;
                ans.remove(ans.size() - 1);
                ans.remove(ans.size() - 1);
                ans.add(cal);
            } else {
                int m = Integer.parseInt(tokens[i]);
                ans.add(m);
            }
        }
       return ans.get(ans.size() - 1);
    }
}