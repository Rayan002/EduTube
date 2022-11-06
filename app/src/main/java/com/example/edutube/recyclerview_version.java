package com.example.edutube;

public class recyclerview_version {

    private static String top_text;
    private static String version;
    private static String apilevel;
    private static String description;
    private boolean expandable;

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public recyclerview_version(String top_text, String version, String apilevel, String description) {
        this.top_text = top_text;
        this.version = version;
        this.apilevel = apilevel;
        this.description = description;
        this.expandable = false;
    }

    public static String getTop_text() {
        return top_text;
    }

    public void setTop_text(String top_text) {
        this.top_text = top_text;
    }

    public static String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public static String getApilevel() {
        return apilevel;
    }

    public void setApilevel(String apilevel) {
        this.apilevel = apilevel;
    }

    public static String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "recyclerview_version{" +
                "top_text='" + top_text + '\'' +
                ", version='" + version + '\'' +
                ", apilevel='" + apilevel + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
