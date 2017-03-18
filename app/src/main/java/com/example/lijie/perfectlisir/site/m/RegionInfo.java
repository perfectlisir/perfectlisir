package com.example.lijie.perfectlisir.site.m;

import java.util.ArrayList;

public class RegionInfo
{

    public ArrayList<RegionData> data;

    public static class RegionData
    {
        public String id;
        public String name;
        public String pid;
        public String type;
        public ArrayList<RegionCityData> list;

        public String getPickerViewText()
        {
            //这里还可以判断文字超长截断再提供显示
            return name;
        }

    }

    public static class RegionCityData
    {

        public String id;
        public String name;
        public String pid;
        public String type;
        public ArrayList<RegionAreaData> list;

        public String getPickerViewText()
        {
            //这里还可以判断文字超长截断再提供显示
            return name;
        }


    }

    public static class RegionAreaData
    {

        public String id;
        public String name;
        public String pid;
        public String type;

        public String getPickerViewText()
        {
            //这里还可以判断文字超长截断再提供显示
            return name;
        }
    }


}
