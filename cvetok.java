package shaffel1;
public class cvetok {
    private boolean polit;
    public boolean isPolit(boolean b) {
        return polit;
    }
    public void setPolit(boolean polit) {
        if (polit == false) {
            System.out.println(" Cvetok polivat nechem , idi rabotaj");
        } else if (polit != false) {
            System.out.println(" Cvetok polit, mozno otdahnut ");
        }
        this.polit = polit;
    }
}



