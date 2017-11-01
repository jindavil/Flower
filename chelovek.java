package shaffel1;
public class chelovek {
    private boolean lejka;
    public boolean isLejka(boolean b) {
        return lejka;
    }
    public void setLejka(boolean lejka) {
        if (lejka == false) {
            cvetok nechem = new cvetok();
            nechem.setPolit(false);
        } else if (lejka != false) {
            cvetok estchem = new cvetok();
            estchem.setPolit(true);
            this.lejka = lejka;
        }
    }
}

