class Box {
    private float width;
    private float height;
    private float depth;

    public Box() {
        this.width = this.height = this.depth = 0;
    }

    public Box(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(Box other) {
        this.width = other.width;
        this.height = other.height;
        this.depth = other.depth;
    }

    public float getWidth() { return width; }
    public void setWidth(float width) { this.width = width; }

    public float getHeight() { return height; }
    public void setHeight(float height) { this.height = height; }

    public float getDepth() { return depth; }
    public void setDepth(float depth) { this.depth = depth; }

    public void displayVolume() {
        float volume = width * height * depth;
        System.out.println("Volume of Box = " + volume);
    }
}

class BoxWeight extends Box {
    private float weight;

    public BoxWeight() {
        super();
        this.weight = 0;
    }

    public BoxWeight(float width, float height, float depth, float weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other) {
        super(other);
        this.weight = other.weight;
    }

    public float getWeight() { return weight; }
    public void setWeight(float weight) { this.weight = weight; }

    public void displayWeight() {
        System.out.println("Weight of Box = " + weight);
    }
}

class BoxWeightDemo {
    public static void main(String[] args) {
        System.out.println("Priyal Singhal 24csu161");
        
        Box b1 = new Box();
        b1.setWidth(2);
        b1.setHeight(3);
        b1.setDepth(4);
        b1.displayVolume();

        BoxWeight bw1 = new BoxWeight(5, 6, 7, 10);
        bw1.displayVolume();
        bw1.displayWeight();

        BoxWeight bw2 = new BoxWeight(bw1);
        bw2.displayVolume();
        bw2.displayWeight();
    }
}
