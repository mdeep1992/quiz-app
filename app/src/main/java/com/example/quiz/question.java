package com.example.quiz;

public class question {
    private int ansid;
    private boolean ans;

    public int getAnsid() {
        return ansid;
    }

    public void setAnsid(int ansid) {
        this.ansid = ansid;
    }

    public boolean isAns() {
        return ans;
    }

    public void setAns(boolean ans) {
        this.ans = ans;
    }

    public question(int ansid, boolean ans) {
        this.ansid = ansid;
        this.ans = ans;
    }
}
