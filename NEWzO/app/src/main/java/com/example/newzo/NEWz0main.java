package com.example.newzo;

import java.util.ArrayList;

public class NEWz0main {

    private String status;
    private String totalResults;
    private ArrayList<Modalclass> articles;

    public NEWz0main(String status, String totalResults, ArrayList<Modalclass> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public ArrayList<Modalclass> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Modalclass> articles) {
        this.articles = articles;
    }
}