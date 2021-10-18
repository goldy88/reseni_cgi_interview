package com.cgi.boat.interview;

public class Result {

    public Result() {
        for (int i = 0; i < 3; i++) {
            items[i] = new ResultItem("", 0);
        }
    }

    private ResultItem[] items = new ResultItem[3];

    @Override
    public String toString() {
        String result = new String();
        for (int i = 0; i < 3; i++) {
            result += items[i].toString() + "\n";
        }
        return result;
    }

    public void newValue(ResultItem value){
        if (value.getCount() > items[0].getCount()){
            items[2] = items[1];
            items[1] = items[0];
            items[0] = value;
        }
    }

}
