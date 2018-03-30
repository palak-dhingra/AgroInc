package com.example.palakdhingra.agroinc;



public class SingleItemModel {
    private String header1, header2, header3,header4,header5,header6;
    private int mImageResourceId;
    public SingleItemModel(String h1data, String h2data, String h3data , String h4data ,String h5data, String h6data, int image) {
        header1 = h1data;
        header2 = h2data;
        header3 = h3data;
        header4 = h4data;
        header5 = h5data;
        header6 = h6data;
        mImageResourceId = image;
    }

    public SingleItemModel(String h1data, String h2data, String h3data , String h4data ,String h5data, String h6data) {
         header1 = h1data;
         header2 = h2data;
         header3 = h3data;
         header4 = h4data;
         header5 = h5data;
         header6 = h6data;
    }

    public String getHeader1() {
        return header1;
    }

    public void setHeader1(String name) {
        header1 = name;
    }

    public String getHeader2() {
        return header2;
    }

    public void setHeader2(String url) {
        header2 = url;
    }
    public String getHeader3() {
        return header3;
    }
    public String getHeader4() {
        return header4;
    }
    public String getHeader5() {
        return header5;
    }
    public String getHeader6() {
        return header6;
    }
    public int getImage() {
        return mImageResourceId;
    }
    public void setHeader3(String description) {
        this.header3 = description;
    }
}
