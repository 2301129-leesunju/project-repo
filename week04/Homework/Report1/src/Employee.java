import java.lang.Class;

public class Employee extends Person {
    private Depart depart;
    private char grade;
    private char aClass;
    private int aid;
    private boolean special;

    public Employee(int personId, String name, Depart depart, boolean special, char grade, char aClass, int aid){
        super(name, personId);
        this.depart = depart;
        this.special = special;
        this.grade = grade;
        this.aClass = aClass;
        this.aid = aid;
    }

    public int gradeClassSel(){
        int result=0;
        if (grade=='1'){
            if (aClass=='1'){
                result=1250000;
            } else if (aClass=='2') {
                result=1200000;
            }else if (aClass=='3') {
                result=1150000;
            }else if (aClass=='4') {
                result=1100000;
            }else if (aClass=='5') {
                result=1050000;
            }
        }else if (grade=='2'){
            if (aClass=='1'){
                result=950000;
            } else if (aClass=='2') {
                result=925000;
            }else if (aClass=='3') {
                result=900000;
            }else if (aClass=='4') {
                result=875000;
            }else if (aClass=='5') {
                result=850000;
            }
        } else if (grade=='3'){
            if (aClass=='1'){
                result=750000;
            } else if (aClass=='2') {
                result=725000;
            }else if (aClass=='3') {
                result=700000;
            }else if (aClass=='4') {
                result=675000;
            }else if (aClass=='5') {
                result=650000;
            }
        }
        return result;
    }

    public int gradeSel(){
        int result=0;
        if (grade=='1'){
            result=300000;
        } else if (grade=='2') {
            result=200000;
        } else if (grade=='3') {
            result=100000;
        }
        return result;
    }

    public int departSel(){
        int result = 0;
        String getname = depart.getDepartmentName();
        if (getname == "경리과"||getname == "인사과" ){
            result = 250000;
        }else if (getname=="영업팀"||getname=="생산과"){
            result = 350000;
        } else if (getname=="A/S팀") {
            result = 300000;
        }
        return result;
    }

    public int aidSel(){
        int result= (int) (gradeClassSel()+gradeSel()+departSel()-aid);
        return result;
    }
    public int texSel(){
        int result=0;
        if (special==true){
            result= (int) (gradeClassSel()*0.03);
        } else if (special==false) {
            if (aidSel()<700000){
                result=0;
            } else if (aidSel()>=700000&&aidSel()<800000) {
                result = (int) (aidSel()*0.05);
            }else if (aidSel()>=800000&&aidSel()<1000000) {
                result = (int) (aidSel()*0.07);
            } else if (aidSel()>=1000000) {
                result= (int) (aidSel()*0.09);
            }
        }

        return result;
    }

    public int payment(){
        int result=aidSel()-texSel();
        return result;
    }

    public char specialOX(){
        char result=' ';
        if (special==true){
            result='O';
        } else if (special==false) {
            result='X';
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%4s  %5d   %3s   %1c   %1c-%1c %,10d %,10d %,10d %,10d %,10d %,10d",getName(),getPersonId(),depart.getDepartmentName(),specialOX(),grade,aClass,gradeClassSel(),departSel(),gradeSel(),aid,texSel(),payment());
    }
}
