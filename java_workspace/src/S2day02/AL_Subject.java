package S2day02;

public class AL_Subject {

private String subCode; 
private String subName;
private double subCredite;
private int subTime;
private String subProfessor;
private String subSemester;
private String subCategory;
private String subScheduler;

public AL_Subject() {}  


public AL_Subject(String subName) {
this.subName = subName;
}

public AL_Subject(String subCode, String subName, double subCredite) {
this.subCode = subCode;
this.subName = subName;
this.subCredite = subCredite;
}

public AL_Subject(String subCode, String subName, double subCredite, int subTime, String subProfessor,
String subSemester, String subCategory, String subScheduler) {
this.subCode = subCode;
this.subName = subName;
this.subCredite = subCredite;
this.subTime = subTime;
this.subProfessor = subProfessor;
this.subSemester = subSemester;
this.subCategory = subCategory;
this.subScheduler = subScheduler;
}

public String getSubCode() {
return subCode;
}
public void setSubCode(String subCode) {
this.subCode = subCode;
}
public String getSubName() {
return subName;
}
public void setSubName(String subName) {
this.subName = subName;
}
public double getSubCredite() {
return subCredite;
}
public void setSubCredite(double subCredite) {
this.subCredite = subCredite;
}
public int getSubTime() {
return subTime;
}
public void setSubTime(int subTime) {
this.subTime = subTime;
}
public String getSubProfessor() {
return subProfessor;
}
public void setSubProfessor(String subProfessor) {
this.subProfessor = subProfessor;
}
public String getSubSemester() {
return subSemester;
}
public void setSubSemester(String subSemester) {
this.subSemester = subSemester;
}
public String getSubCategory() {
return subCategory;
}
public void setSubCategory(String subCategory) {
this.subCategory = subCategory;
}
public String getSubScheduler() {
return subScheduler;
}
public void setSubScheduler(String subScheduler) {
this.subScheduler = subScheduler;
}
@Override
public String toString() {
return "과목코드=" + subCode + ", 과목명=" + subName + ", 학점=" + subCredite + ", 시수="
+ subTime + ", 교수명=" + subProfessor + ", 학기=" + subSemester + ", 분류="
+ subCategory + ", 수업시간표=" + subScheduler + "]";
}

}
