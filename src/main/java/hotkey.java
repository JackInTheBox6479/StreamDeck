abstract class hotkey {

    private final String name;

    public hotkey(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void action(){
        System.out.println("action!");
    }

}
