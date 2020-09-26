class Volume{
    public static double findVolume(Box box){
        double area = box.width * box.height * box.depth;
        return area;
    }
}