package Encapsulation;
public class Printer {
    private int tonerLevel;
    private int pagersPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > -1 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel=-1;
        }
        this.duplex = duplex;
        this.pagersPrinted = 0;
    }
    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel=this.tonerLevel+tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }
    public int printPages(int pages) {
        int pagestoprint=pages;
        if(this.duplex) {
            pagestoprint = (pagestoprint/2) + (pagestoprint%2);
            System.out.println("Printing in duplex mode");
        }
        this.pagersPrinted=pagestoprint+pagestoprint;
        return pagestoprint;
    }

    public int getPagersPrinted() {
        return pagersPrinted;
    }
}
