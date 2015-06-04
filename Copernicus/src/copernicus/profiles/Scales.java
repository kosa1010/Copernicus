package copernicus.profiles;

//package profiles;
public abstract class Scales {

    public static final int L = 0;
    public static final int F = 1;
    public static final int K = 2;
    public static final int Hp = 3;
    public static final int D = 4;
    public static final int Hy = 5;
    public static final int Ps = 6;
    public static final int Mf = 7;
    public static final int Pa = 8;
    public static final int Pt = 9;
    public static final int Sc = 10;
    public static final int Ma = 11;
    public static final int It = 12;

    public static final int s1 = 3;
    public static final int s2 = 4;
    public static final int s3 = 5;
    public static final int s4 = 6;
    public static final int s5 = 7;
    public static final int s6 = 8;
    public static final int s7 = 9;
    public static final int s8 = 10;
    public static final int s9 = 11;
    public static final int s0 = 12;

    public static int getScaleID(String scale) {
        int id = -1;

        if (scale.equals("L")) {
            id = Scales.L;
        }
        if (scale.equals("F")) {
            id = Scales.F;
        }
        if (scale.equals("K")) {
            id = Scales.K;
        }
        if (scale.equals("1.Hp")) {
            id = Scales.Hp;
        }
        if (scale.equals("2.D")) {
            id = Scales.D;
        }
        if (scale.equals("3.Hy")) {
            id = Scales.Hy;
        }
        if (scale.equals("4.Ps")) {
            id = Scales.Ps;
        }
        if (scale.equals("5.Mf")) {
            id = Scales.Mf;
        }
        if (scale.equals("6.Pa")) {
            id = Scales.Pa;
        }
        if (scale.equals("7.Pt")) {
            id = Scales.Pt;
        }
        if (scale.equals("8.Sc")) {
            id = Scales.Sc;
        }
        if (scale.equals("9.Ma")) {
            id = Scales.Ma;
        }
        if (scale.equals("0.It")) {
            id = Scales.It;
        }

        return id;
    }

    public static int getScaleID2(String scale) {
        int id = -1;

        if (scale.contains("L")) {
            id = Scales.L;
        }
        if (scale.contains("F")) {
            id = Scales.F;
        }
        if (scale.contains("K")) {
            id = Scales.K;
        }
        if (scale.contains("1")) {
            id = Scales.Hp;
        }
        if (scale.contains("2")) {
            id = Scales.D;
        }
        if (scale.contains("3")) {
            id = Scales.Hy;
        }
        if (scale.contains("4")) {
            id = Scales.Ps;
        }
        if (scale.contains("5")) {
            id = Scales.Mf;
        }
        if (scale.contains("6")) {
            id = Scales.Pa;
        }
        if (scale.contains("7")) {
            id = Scales.Pt;
        }
        if (scale.contains("8")) {
            id = Scales.Sc;
        }
        if (scale.contains("9")) {
            id = Scales.Ma;
        }
        if (scale.contains("0")) {
            id = Scales.It;
        }

        return id;
    }

    public static String getDescr(int scale) {
        switch (scale) {
            case Scales.L: {
                return "L";
            }
            case Scales.F: {
                return "F";
            }
            case Scales.K: {
                return "K";
            }
            case Scales.Hp: {
                return "Hp";
            }
            case Scales.D: {
                return "D";
            }
            case Scales.Hy: {
                return "Hy";
            }
            case Scales.Ps: {
                return "Ps";
            }
            case Scales.Mf: {
                return "Mf";
            }
            case Scales.Pa: {
                return "Pa";
            }
            case Scales.Pt: {
                return "Pt";
            }
            case Scales.Sc: {
                return "Sc";
            }
            case Scales.Ma: {
                return "Ma";
            }
            case Scales.It: {
                return "It";
            }
            default: {
                return "";
            }
        }
    }

    public static String getDescr2(int scale) {
        switch (scale) {
            case Scales.L: {
                return "L";
            }
            case Scales.F: {
                return "F";
            }
            case Scales.K: {
                return "K";
            }
            case Scales.Hp: {
                return "1";
            }
            case Scales.D: {
                return "2";
            }
            case Scales.Hy: {
                return "3";
            }
            case Scales.Ps: {
                return "4";
            }
            case Scales.Mf: {
                return "5";
            }
            case Scales.Pa: {
                return "6";
            }
            case Scales.Pt: {
                return "7";
            }
            case Scales.Sc: {
                return "8";
            }
            case Scales.Ma: {
                return "9";
            }
            case Scales.It: {
                return "0";
            }
            default: {
                return "";
            }
        }
    }

    public static String getDescr3(int scale) {
        switch (scale) {
            case Scales.L: {
                return "L";
            }
            case Scales.F: {
                return "F";
            }
            case Scales.K: {
                return "K";
            }
            case Scales.Hp: {
                return "1.Hp";
            }
            case Scales.D: {
                return "2.D";
            }
            case Scales.Hy: {
                return "3.Hy";
            }
            case Scales.Ps: {
                return "4.Ps";
            }
            case Scales.Mf: {
                return "5.Mf";
            }
            case Scales.Pa: {
                return "6.Pa";
            }
            case Scales.Pt: {
                return "7.Pt";
            }
            case Scales.Sc: {
                return "8.Sc";
            }
            case Scales.Ma: {
                return "9.Ma";
            }
            case Scales.It: {
                return "0.It";
            }
            default: {
                return "";
            }
        }
    }
}
