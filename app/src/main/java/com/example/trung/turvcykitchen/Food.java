package com.example.trung.turvcykitchen;

public class Food {
    private String name;
    private String desc;
    private int imageRes;

    public static final Food food[] = {
            new Food("Thit bo xao", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", R.drawable.thitboxao),
            new Food("Canh kho qua", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", R.drawable.canhkhoqua),
            new Food("Trung chien hanh", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", R.drawable.trungchienhanh),
            new Food("Vit nau chao" ,"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", R.drawable.vitnauchao),
    };

    private Food(String name, String desc, int imageRes){
        this.name = name;
        this.desc = desc;
        this.imageRes = imageRes;
    }

    public String getName(){
        return this.name;
    }

    public String getDesc(){
        return this.desc;
    }

    public int getImageRes(){
        return this.imageRes;
    }

}
