package S2day02;

import java.util.ArrayList;

import S2day01.Subject;

public class AL_Student {

private String stdNum;
private String stdName;
private String registerNum;
private String faculty;
private String major;
private ArrayList<AL_Subject> subjectList = new ArrayList<>();

public AL_Student() {}

public AL_Student(String stdNum, String stdName, String registerNum, String faculty, String major) {
this.stdNum = stdNum;
this.stdName = stdName;
this.registerNum = registerNum;
this.faculty = faculty;
this.major = major;
}

public void stdPrint() {
System.out.println("학생명(학번):"+stdName+"("+stdNum+")");
System.out.println("학부(학과):"+faculty+"("+major+")");
}

public void subPrint() {

if(subjectList.size()==0) {
System.out.println("수강중인 과목이 없습니다.");
}

for(int i=0; i<subjectList.size(); i++) {
System.out.println(subjectList.get(i)); 

}
}

public void insertSubject(AL_Subject subName) {

subjectList.add(subName);

}

public void deleteSubject(String subName) {
int index = -1; 
if(subName == null) {
return;
}

for(int i=0; i<subjectList.size(); i++) {
if(subjectList.get(i).getSubName().equals(subName)) {
index = i;
subjectList.remove(index);
break;
	}
}

if(index == -1) {
System.out.println("입력한 과목이 없습니다.");
	return;
}

}

public String getStdNum() {
return stdNum;
}
public void setStdNum(String stdNum) {
this.stdNum = stdNum;
}
public String getStdName() {
return stdName;
}
public void setStdName(String stdName) {
this.stdName = stdName;
}
public String getRegisterNum() {
return registerNum;
}
public void setRegisterNum(String registerNum) {
this.registerNum = registerNum;
}
public String getFaculty() {
return faculty;
}
public void setFaculty(String faculty) {
this.faculty = faculty;
}
public String getMajor() {
return major;
}
public void setMajor(String major) {
this.major = major;
}
public ArrayList<AL_Subject> getSubjectList() {
	return subjectList;
}
public void setSubjectList(ArrayList<AL_Subject> subjectList) {
	this.subjectList = subjectList;
}


}