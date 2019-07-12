package com.unlimitedcoffee;

import java.util.ArrayList;

public class Conversation {
    String number;
    ArrayList<String> messages;
    ArrayList<String> timeStamp;
    ArrayList<String> readStat;

    public Conversation (String number, ArrayList<String>messages, ArrayList<String> timeStamp, ArrayList<String> readStat){
        this.number = number;
        this.messages= messages;
        this.timeStamp = timeStamp;
        this.readStat = readStat;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<String> getMessages() {
        return messages;
    }

    public String findLastMessage(){
        if (messages.size() > 0)
            return this.messages.get(0);
        else
            return "";
    }

    public String findLastTimeStamp(){
        if (this.timeStamp.size() > 0)
            return this.timeStamp.get(0);
        else
            return "";

    }

    public String findLastReadStat() {
        if (this.readStat.size() > 0)
            return this.readStat.get(0);
        else
            return "";


    }

}