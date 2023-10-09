public class Lock_Interaface {
    boolean isLocked = false;

    public void isLocked() {
        if (isLocked == false) this.isLocked = true;
        else if (isLocked == true) this.isLocked = false;
    }

    public void displayLockInterface() {
        if (isLocked == false) {
            System.out.println("3. Lock interface");
        } else if (isLocked == true) {
            System.out.println("3. Unlock interface");
        }
    }

    public boolean getIsLocked() {
        return this.isLocked;
    }
}
