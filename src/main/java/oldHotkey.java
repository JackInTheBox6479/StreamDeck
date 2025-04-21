public class oldHotkey {

    private String name;
    enum appType {
        WEBSITE,
        APP,
        GAME,
        WINDOWSCONTROL
    }
    private appType apptype;


    public oldHotkey(String name, String type) {
        this.name = name;

        switch (type){
            case "WEBSITE":
                apptype = appType.WEBSITE;
                break;
            case "APP":
                apptype = appType.APP;
                break;
            case "GAME":
                apptype = appType.GAME;
                break;
            case "WINDOWSCONTROL":
                apptype = appType.WINDOWSCONTROL;
                break;
        }
    }

    private void link(String link) {
        if(apptype == appType.WEBSITE) {

        }
    }

}
