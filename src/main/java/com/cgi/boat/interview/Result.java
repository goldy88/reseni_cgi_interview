package com.cgi.boat.interview;
//uklada nejcastesti itemy

public class Result {

    public Result() {
        for (int i = 0; i < 3; i++) {
            items[i] = new ResultItem("", 0);  //vytvořím pole prázdným s pratdným item
        }
    }

    private ResultItem[] items = new ResultItem[3];

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {                           //vsechny resultItemy jsem prosel a udelal znich stringy
            result.append(items[i].toString()).append("\n");
        }
        return result.toString();
    }

    public void newValue(ResultItem value){
        if (value.getCount() > items[0].getCount()){
            items[2] = items[1];
            items[1] = items[0];
            items[0] = value;
        }else if(value.getCount() > items[1].getCount()){
            items[2] = items[1];
            items[1] = value;
        }else if(value.getCount() > items[2].getCount()){
            items[2] = value;
        }
    }
}
