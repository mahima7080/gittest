package Enum;

public enum color_hexa {
    red(123),pink(231);
private int val;
    color_hexa(int val) {
        this.val=val;
    }
    int getvalue()
    {
        return this.val;
    }
}
